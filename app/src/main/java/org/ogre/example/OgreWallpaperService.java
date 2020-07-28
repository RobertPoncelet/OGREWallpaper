package org.ogre.example;

import android.annotation.TargetApi;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.service.wallpaper.WallpaperService;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

public class OgreWallpaperService extends WallpaperService {
    public OgreWallpaperService() {
    }

    private Renderer mRenderer;

    @Override
    public Engine onCreateEngine() {
        return new OgreEngine(getBaseContext(), mRenderer);
    }

    private class OgreEngine extends Engine {
        protected Context mContext;
        protected Renderer mRenderer;
        protected WallpaperSurfaceView mSurfaceView;
        protected float mDefaultPreviewOffsetX;

        class WallpaperSurfaceView extends GLSurfaceView {

            WallpaperSurfaceView(Context context) {
                super(context);
            }

            @Override
            public SurfaceHolder getHolder() {
                return getSurfaceHolder();
            }

            public void onDestroy() {
                super.onDetachedFromWindow();
            }
        }

        public OgreEngine(Context context, Renderer renderer) {
            mContext = context;
            mRenderer = renderer;
            mDefaultPreviewOffsetX = 0.5f;
        }

        @Override
        public void onOffsetsChanged(float xOffset, float yOffset, float xOffsetStep, float yOffsetStep,
                                     int xPixelOffset, int yPixelOffset) {
            super.onOffsetsChanged(xOffset, yOffset, xOffsetStep, yOffsetStep, xPixelOffset, yPixelOffset);
            if (mRenderer != null) {
                if (isPreview() && enableDefaultXOffsetInPreview())
                    xOffset = mDefaultPreviewOffsetX;

                mRenderer.onOffsetsChanged(xOffset, yOffset, xOffsetStep, yOffsetStep, xPixelOffset, yPixelOffset);
            }
        }

        public boolean enableDefaultXOffsetInPreview() {
            return true;
        }

        @Override
        public void onTouchEvent(MotionEvent event) {
            super.onTouchEvent(event);
            if (mRenderer != null)
                mRenderer.onTouchEvent(event);
        }

        @Override
        @TargetApi(15)
        public void setOffsetNotificationsEnabled(boolean enabled) {
            if (Build.VERSION.SDK_INT >= 15) {
                super.setOffsetNotificationsEnabled(enabled);
            }
        }

        @Override
        public void onCreate(SurfaceHolder holder) {
            super.onCreate(holder);
            mSurfaceView = new WallpaperSurfaceView(mContext);
            //mSurfaceView.setEGLContextClientVersion(Capabilities.getGLESMajorVersion());
            //mSurfaceView.setRenderMode(ISurface.RENDERMODE_WHEN_DIRTY);
            mSurfaceView.setSurfaceRenderer(mRenderer);
            setTouchEventsEnabled(true);
        }

        @Override
        public void onSurfaceDestroyed(SurfaceHolder holder) {
            super.onSurfaceDestroyed(holder);
        }

        @Override
        public void onDestroy() {
            setTouchEventsEnabled(false);
            mRenderer.onRenderSurfaceDestroyed(null);
            mRenderer = null;
            mSurfaceView.onDestroy();
            super.onDestroy();
        }

        @Override
        public void onVisibilityChanged(boolean visible) {
            super.onVisibilityChanged(visible);
            if (visible) {
                mSurfaceView.onResume();
            } else {
                mSurfaceView.onPause();
            }
        }
    }
}
