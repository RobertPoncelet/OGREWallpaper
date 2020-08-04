package org.ogre.example;

import android.content.res.AssetManager;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;

import org.ogre.ApplicationContext;

public abstract class OgreRenderer {
    private final String LOG_TAG = "OgreRenderer";

    // Top-level elements
    private Handler mHandler;
    private AssetManager mAssetMgr;
    private Runnable mRenderTask;
    private Runnable mInitTask;
    private Surface mSurface;

    // Used by Runnables
    private boolean mPaused = false;
    private boolean mInitOGRE = false;
    private boolean mWndCreate = false;

    ApplicationContext mOgreApp = null;

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
                    mOgreApp.getRoot().renderOneFrame();
                }

                mHandler.post(this);
            }
        };

        mInitTask = new Runnable() {
            public void run() {
                Log.d(LOG_TAG, "initRunnable");
                if (!mInitOGRE) {
                    mInitOGRE = true;
                    mHandler.post(mRenderTask);
                }
            }
        };
    }

    public void reInit(Surface surface) {
        if (surface == null || !surface.isValid()) {
            Log.e(LOG_TAG, "Surface is not valid!");
            return;
        }
        mSurface = surface;

        if (mInitTask != null) {
            // Now we have a valid Surface and can start rendering!
            mHandler.post(mInitTask);
        } else {
            Log.e(LOG_TAG, "initRunnable is null!");
        }
    }

    public void shutDown() {
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
        mHandler.post(mRenderTask);
    }

    public void onHide() {
        mPaused = true;
        mHandler.removeCallbacks(mRenderTask);
    }

    protected abstract void setUpScene();

    protected abstract void updateScene();
}
