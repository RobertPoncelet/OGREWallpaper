package org.ogre.example;

import android.service.wallpaper.WallpaperService;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

import java.util.LinkedList;

public class OgreWallpaperService extends WallpaperService {
    private final String LOG_TAG = "OgreWallpaperEService";
    private OgreRenderer mRenderer;
    SurfaceList mSurfaceList;

    // Live wallpapers may have more than one instance (e.g. one for preview, one for the actual wallpaper).
    // However, we're only allowed one instance of the OGRE app at once.
    // This class handles this problem by closing and reopening OGRE when necessary, using the most recent Surface.
    private class SurfaceList {
        SurfaceList() {
            mSurfaces = new LinkedList<>();
        }

        public SurfaceHolder getCurrentSurface() {
            if (mSurfaces.isEmpty()) {
                return null;
            } else {
                return mSurfaces.getLast();
            }
        }

        public void addSurface(SurfaceHolder holder) {
            if (holder == getCurrentSurface()) {
                return;
            } else if (holder.getSurface() == null || !holder.getSurface().isValid()) {
                Log.e(LOG_TAG, "Invalid SurfaceHolder!");
                return;
            }

            // Remove first, because if it's already present, we'll want to move it to the front
            mSurfaces.remove(holder);
            mSurfaces.add(holder);
            onCurrentSurfaceChanged(holder);
        }

        public void removeSurface(SurfaceHolder holder) {
            SurfaceHolder prevSurface = getCurrentSurface();
            mSurfaces.remove(holder);
            if (prevSurface != getCurrentSurface()) {
                onCurrentSurfaceChanged(getCurrentSurface());
            }
        }

        private void onCurrentSurfaceChanged(SurfaceHolder holder) {
            mRenderer.shutDown();
            if (!mSurfaces.isEmpty()) {
                mRenderer.reInit(holder.getSurface());
            }
        }

        private LinkedList<SurfaceHolder> mSurfaces;
    }

    @Override
    public void onCreate() {
        Log.d(LOG_TAG, "onCreate");
        super.onCreate();
        mSurfaceList = new SurfaceList();
        mRenderer = new OgreRenderer(getResources().getAssets());
    }

    @Override
    public void onDestroy() {
        Log.d(LOG_TAG, "onDestroy");
        super.onDestroy();
        mRenderer.shutDown();
    }

    @Override
    public Engine onCreateEngine() {
        return new OgreWallpaperEngine();
    }

    private class OgreWallpaperEngine extends Engine {
        public final String LOG_TAG = "OgreWallpaperEngine";

        @Override
        public void onVisibilityChanged(boolean visible) {
            Log.d(LOG_TAG, "onVisibilityChanged(" + visible + ") " + this);
            super.onVisibilityChanged(visible);
            if (visible) {
                mSurfaceList.addSurface(getSurfaceHolder()); // This will bring the Surface to the front if it's already present
                mRenderer.onVisible();
            } else if (mSurfaceList.getCurrentSurface() == getSurfaceHolder()) {
                mRenderer.onHide();
            }
        }

        @Override
        public void onSurfaceDestroyed(SurfaceHolder holder) {
            Log.d(LOG_TAG, "onSurfaceDestroyed " + this);
            super.onSurfaceDestroyed(holder);
            mSurfaceList.removeSurface(holder);
        }

        @Override
        public void onSurfaceChanged(SurfaceHolder holder, int format,
                                     int width, int height) {
            Log.d(LOG_TAG, "onSurfaceChanged " + this);
            super.onSurfaceChanged(holder, format, width, height);
            mSurfaceList.addSurface(holder);
        }

        @Override
        public void onTouchEvent(MotionEvent event) {
            // TODO
            //if (mTouchEnabled) {
                super.onTouchEvent(event);
            //}
        }
    }

    static {
        System.loadLibrary("OgreJNI");
    }
}
