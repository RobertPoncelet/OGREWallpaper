package org.ogre.example;

import android.content.res.AssetManager;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;

import org.ogre.ApplicationContext;

public abstract class OgreRenderer {
    private final String LOG_TAG = "OgreRenderer";

    // Top-level elements
    private Handler mHandler;
    private AssetManager mAssetMgr;
    private Runnable mRenderTask;
    private Runnable mInitTask;
    private Surface mSurface;
    private int mWidth;
    private int mHeight;

    // Used by Runnables
    private boolean mPaused = false;
    private boolean mInitOGRE = false;
    private boolean mWndCreate = false;
    private long mLastRenderTime;

    ApplicationContext mOgreApp = null;

    private final long FRAME_INTERVAL = 32;

    OgreRenderer(AssetManager assetMgr) {
        mHandler = new Handler();
        mAssetMgr = assetMgr;

        // Don't actually run this yet - mSurface hasn't been initialised
        mRenderTask = new Runnable() {
            public void run() {
                if (mPaused) {
                    Log.d(LOG_TAG, "Early return");
                    return;
                }

                if (!mWndCreate && mSurface != null) {
                    mWndCreate = true;

                    if(mOgreApp == null) {
                        mOgreApp = new ApplicationContext();
                        mOgreApp.initAppForAndroid(mAssetMgr, mSurface);
                        setUpScene();
                    } else {
                        mOgreApp.getRenderWindow()._notifySurfaceCreated(mSurface);
                    }

                    mHandler.post(this);
                    return;
                }

                if (mInitOGRE && mWndCreate) {
                    updateScene();
                    mLastRenderTime = SystemClock.uptimeMillis();
                    mOgreApp.getRoot().renderOneFrame();
                }

                mHandler.postAtTime(this, mLastRenderTime + FRAME_INTERVAL);
            }
        };

        mInitTask = new Runnable() {
            public void run() {
                Log.d(LOG_TAG, "initRunnable");
                if (!mInitOGRE) {
                    mInitOGRE = true;
                    mLastRenderTime = SystemClock.uptimeMillis();
                    mHandler.post(mRenderTask);
                }
            }
        };
    }

    public void reInit(SurfaceHolder holder) {
        if (holder == null || holder.getSurface() == null || !holder.getSurface().isValid()) {
            Log.e(LOG_TAG, "Surface is not valid!");
            return;
        }
        mSurface = holder.getSurface();
        mWidth = holder.getSurfaceFrame().width();
        mHeight = holder.getSurfaceFrame().height();

        if (mInitTask != null) {
            // Now we have a valid Surface and can start rendering!
            mHandler.post(mInitTask);
        } else {
            Log.e(LOG_TAG, "initRunnable is null!");
        }
    }

    public void shutDown() {
        mHandler.removeCallbacks(mRenderTask);
        mHandler.post(new Runnable() {
            public void run() {
                if (mOgreApp != null) {
                    mOgreApp.getRenderWindow()._notifySurfaceDestroyed();
                    mOgreApp.closeApp();
                }
                mOgreApp = null;
                mInitOGRE = false;
                mWndCreate = false;
            }
        });
    }

    public void onVisible() {
        mPaused = false;
        mHandler.postAtTime(mRenderTask, mLastRenderTime + FRAME_INTERVAL);
    }

    public void onHide() {
        mPaused = true;
        mHandler.removeCallbacks(mRenderTask);
    }

    protected abstract void setUpScene();

    protected abstract void updateScene();

    protected int getWidth() { return mWidth; }
    protected int getHeight() { return mHeight; }
}
