package org.ogre.example;

import android.service.wallpaper.WallpaperService;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

import java.util.LinkedList;

public class OgreWallpaperService extends WallpaperService {
    private final String LOG_TAG = "OgreWallpaperEService";
    private OgreRenderer mRenderer;

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

        // Cases:
        // holder is not present (add and onCurrentSurfaceChanged)
        // holder is already present but not current (remove, add, and onCurrentSurfaceChanged)
        // holder is current (do nothing)
        public void addSurface(SurfaceHolder holder) {
            if (holder == getCurrentSurface()) {
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
            mRenderer.sysShutDown();
            if (!mSurfaces.isEmpty()) {
                mRenderer.reInit(holder.getSurface());
            }
        }

        private LinkedList<SurfaceHolder> mSurfaces;
    }
    SurfaceList mSurfaceList;

    @Override
    public void onCreate() {
        Log.d(LOG_TAG, "onCreate");
        super.onCreate();
        mSurfaceList = new SurfaceList();
    }

    @Override
    public void onDestroy() {
        Log.d(LOG_TAG, "onDestroy");
        super.onDestroy();
        mRenderer.sysShutDown();
    }

    @Override
    public Engine onCreateEngine() {
        OgreWallpaperEngine engine = new OgreWallpaperEngine();
        if (mRenderer == null) {
            mRenderer = new OgreRenderer(getResources().getAssets(), engine.getSurfaceHolder().getSurface());
        }
        return engine;
    }

    private class OgreWallpaperEngine extends Engine {
        public final String LOG_TAG = "OgreWallpaperEngine";
        @Override
        public void onCreate(SurfaceHolder holder) {
            Log.d(LOG_TAG, "onCreate " + this);
            super.onCreate(holder);
        }

        @Override
        public void onDestroy() {
            Log.d(LOG_TAG, "onDestroy " + this);
            super.onDestroy();
        }

        @Override
        public void onVisibilityChanged(boolean visible) {
            Log.d(LOG_TAG, "onVisibilityChanged(" + visible + ") " + this);
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
            if (holder.getSurface() != null
                    && holder.getSurface().isValid()) {
                mSurfaceList.addSurface(holder);
            } else {
                Log.e(LOG_TAG, "No valid SurfaceHolder!");
            }
        }

        @Override
        public void onTouchEvent(MotionEvent event) {
            // TODO
            //if (touchEnabled) {
                super.onTouchEvent(event);
            //}
        }
    }

    static {
        System.loadLibrary("OgreJNI");
    }
}
