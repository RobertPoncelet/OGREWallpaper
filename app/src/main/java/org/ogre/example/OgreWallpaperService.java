package org.ogre.example;

import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.service.wallpaper.WallpaperService;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;

import org.ogre.AnimationState;
import org.ogre.ApplicationContext;
import org.ogre.Camera;
import org.ogre.ColourValue;
import org.ogre.Entity;
import org.ogre.Light;
import org.ogre.Radian;
import org.ogre.SceneManager;
import org.ogre.SceneNode;
import org.ogre.ShaderGenerator;
import org.ogre.Viewport;

public class OgreWallpaperService extends WallpaperService {
    private final String LOG_TAG = "OgreWallpaperService";

    @Override
    public void onCreate() {
        Log.d(LOG_TAG, "onCreate");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.d(LOG_TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    public Engine onCreateEngine() {
        return new OgreWallpaperEngine();
    }

    // Has to be static so the singleton doesn't freak out if another Engine is created
    static ApplicationContext ogreApp = null;

    private class OgreWallpaperEngine extends Engine {
        public final String LOG_TAG = "OgreWallpaperEngine";
        private int width;
        int height;
        private boolean touchEnabled;

        public OgreWallpaperEngine() {
            Log.d(LOG_TAG, "Constructor");
            SharedPreferences prefs = PreferenceManager
                    .getDefaultSharedPreferences(OgreWallpaperService.this);
            touchEnabled = prefs.getBoolean("touch", false);
        }

        @Override
        public void onVisibilityChanged(boolean visible) {
            Log.d(LOG_TAG, "onVisibilityChanged");
            paused = !visible;
            if (visible) {
                handler.post(renderer);
            } else {
                handler.removeCallbacks(renderer);
            }
        }

        @Override
        public void onSurfaceDestroyed(SurfaceHolder holder) {
            Log.d(LOG_TAG, "onSurfaceDestroyed");
            super.onSurfaceDestroyed(holder);
            this.paused = true;
            handler.removeCallbacks(renderer);

            if (initOGRE && wndCreate) {
                wndCreate = false;
                mLastSurface = null;
                handler.post(new Runnable() {
                    public void run() {
                        ogreApp.getRenderWindow()._notifySurfaceDestroyed();
                        ogreApp.shutdown();
                    }
                });
            }
        }

        @Override
        public void onSurfaceChanged(SurfaceHolder holder, int format,
                                     int width, int height) {
            Log.d(LOG_TAG, "onSurfaceChanged");
            this.width = width;
            this.height = height;
            super.onSurfaceChanged(holder, format, width, height);
        }

        @Override
        public void onTouchEvent(MotionEvent event) {
            if (touchEnabled) {
                super.onTouchEvent(event);
            }
        }



        // End Vogella example wallpaper, start OGRE one

        protected Handler handler = null;
        protected Surface mLastSurface = null;
        private boolean paused = false;
        private boolean initOGRE = false;
        private AssetManager mAssetMgr = null;

        SceneManager scnMgr = null;

        AnimationState animationState;
        long time;

        private void createOgreApp(AssetManager assetMgr, Surface lastSurface) {
            ogreApp = new ApplicationContext();
            ogreApp.initAppForAndroid(assetMgr, lastSurface);

            scnMgr = ogreApp.getRoot().createSceneManager();
            ShaderGenerator.getSingleton().addSceneManager(scnMgr);

            scnMgr.setAmbientLight(new ColourValue(0.5f, 0.5f, 0.5f));

            Light light = scnMgr.createLight("MainLight");
            SceneNode lightnode = scnMgr.getRootSceneNode().createChildSceneNode();
            lightnode.setPosition(0, 10, 10);
            lightnode.attachObject(light);

            Camera cam = scnMgr.createCamera("myCam");
            cam.setNearClipDistance(0.5f);
            cam.setFOVy(new Radian(0.75f));
            cam.setAutoAspectRatio(true);

            SceneNode camnode = scnMgr.getRootSceneNode().createChildSceneNode();
            camnode.attachObject(cam);
            camnode.setPosition(0f, 2f, 14);
            camnode.setDirection(0f, -2f, -14f);

            Entity ent = scnMgr.createEntity("Cylinder.mesh");
            animationState = ent.getAnimationState("idle");
            animationState.setLoop(true);
            animationState.setEnabled(true);
            time = System.currentTimeMillis();
            SceneNode node = scnMgr.getRootSceneNode().createChildSceneNode("Sire");
            node.attachObject(ent);
            node.scale(0.1f, 0.1f, 0.1f);
            node.translate(0f, -4.2f, 0f);
            //node.rotate(new Vector3(1f, 0f, 0f), new Radian(-1.5f));
            //node.setVisible(false);

            Entity ent2 = scnMgr.createEntity("Plane.mesh");
            SceneNode node2 = scnMgr.getRootSceneNode().createChildSceneNode("Plane");
            node2.attachObject(ent2);
            node2.translate(0f, -4.4f, 0f);
            node2.scale(3f, 3f, 3f);
            //node2.setVisible(false);

            Viewport vp = ogreApp.getRenderWindow().addViewport(cam);
            vp.setBackgroundColour(new ColourValue(0.3f, 0.3f, 0.3f));
        }

        private void updateScene() {
            long now = System.currentTimeMillis();
            float delta = (float)(now - time) / 1000f;
            time = now;
            SceneNode fluff = scnMgr.getSceneNode("Sire");
            fluff.yaw(new Radian(delta*0.5f));
            SceneNode cube = scnMgr.getSceneNode("Plane");
            cube.yaw(new Radian(delta*0.5f));
            animationState.addTime(delta);
            //Log.d(LOG_TAG, "Rendering frame");
        }

        private Runnable renderer = new Runnable() {
            public void run() {

                if (paused)
                    return;

                if (!wndCreate && mLastSurface != null) {
                    wndCreate = true;

                    if(ogreApp == null) {
                        createOgreApp(mAssetMgr, mLastSurface);
                    } else {
                        ogreApp.getRenderWindow()._notifySurfaceCreated(mLastSurface);
                    }

                    handler.post(this);
                    return;
                }

                if (initOGRE && wndCreate) {
                    updateScene();
                    ogreApp.getRoot().renderOneFrame();
                }

                handler.post(this);
            }
        };

        @Override
        public void onCreate(SurfaceHolder holder) {
            Log.d(LOG_TAG, "onCreate");
            super.onCreate(holder);
            setTouchEventsEnabled(true);
            handler = new Handler();
            sysInit();
        }

        @Override
        public void onDestroy() {
            Log.d(LOG_TAG, "onDestroy");
            super.onDestroy();
        }

        private void sysInit() {
            Log.d(LOG_TAG, "sysInit");
            final Runnable initRunnable = new Runnable() {
                public void run() {
                    if (!initOGRE) {
                        initOGRE = true;

                        if(mAssetMgr == null) {
                            mAssetMgr = getResources().getAssets();
                        }

                        handler.post(renderer);
                    }
                }

            };

            getSurfaceHolder().addCallback(new SurfaceHolder.Callback() {
                public void surfaceCreated(SurfaceHolder holder) {
                    Log.d(LOG_TAG, "surfaceCreated");
                    if (holder.getSurface() != null
                            && holder.getSurface().isValid()) {
                        mLastSurface = holder.getSurface();
                        handler.post(initRunnable);
                    }
                }

                public void surfaceDestroyed(SurfaceHolder holder) {
                    Log.d(LOG_TAG, "surfaceDestroyed");
                    if (initOGRE && wndCreate) {
                        wndCreate = false;
                        mLastSurface = null;
                        handler.post(new Runnable() {
                            public void run() {
                                ogreApp.getRenderWindow()._notifySurfaceDestroyed();
                            }
                        });
                    }
                }

                public void surfaceChanged(SurfaceHolder holder, int format,
                                           int width, int height) {
                    Log.d(LOG_TAG, "surfaceChanged");
                }
            });
        }

        boolean wndCreate = false;
    }

    static {
        System.loadLibrary("OgreJNI");
    }
}
