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
import android.view.SurfaceView;
import android.view.View;

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
    private final String LOG_TAG = "OgreWallpaperEService";
    protected Handler handler = null;
    protected Surface lastSurface = null;

    private Runnable renderer = null;
    private Runnable initRunnable = null;
    private boolean paused = false;
    private boolean initOGRE = false;
    private boolean wndCreate = false;
    private AssetManager assetMgr = null;

    ApplicationContext ogreApp = null;
    SceneManager scnMgr = null;

    AnimationState animationState;
    long time;

    @Override
    public void onCreate() {
        Log.d(LOG_TAG, "onCreate " + this);
        super.onCreate();
        handler = new Handler();
        sysInit();
    }

    @Override
    public void onDestroy() {
        Log.d(LOG_TAG, "onDestroy " + this);
        super.onDestroy();

        Runnable destroyer = new Runnable() {
            public void run() {
                ogreApp.shutdown();
            }
        };
        handler.post(destroyer);
    }

    private void sysInit() {
        Log.d(LOG_TAG, "sysInit");
        /*final Runnable*/ initRunnable = new Runnable() {
            public void run() {
                Log.d(LOG_TAG, "initRunnable");
                if (!initOGRE) {
                    initOGRE = true;

                    if(assetMgr == null) {
                        assetMgr = getResources().getAssets();
                    }

                    renderer = new Runnable() {
                        public void run() {

                            if (paused)
                                return;

                            if (!wndCreate && lastSurface != null) {
                                wndCreate = true;

                                if(ogreApp == null) {
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
                                } else {
                                    ogreApp.getRenderWindow()._notifySurfaceCreated(lastSurface);
                                }

                                handler.post(this);
                                return;
                            }

                            if (initOGRE && wndCreate) {
                                long now = System.currentTimeMillis();
                                float delta = (float)(now - time) / 1000f;
                                time = now;
                                SceneNode fluff = scnMgr.getSceneNode("Sire");
                                fluff.yaw(new Radian(delta*0.5f));
                                SceneNode cube = scnMgr.getSceneNode("Plane");
                                cube.yaw(new Radian(delta*0.5f));
                                animationState.addTime(delta);
                                ogreApp.getRoot().renderOneFrame();
                            }

                            handler.post(this);
                        }
                    };

                    handler.post(renderer);
                }
            }

        };

        /*SurfaceHolder holder = null;// TODO

        holder.addCallback(new SurfaceHolder.Callback() {
            public void surfaceCreated(SurfaceHolder holder) {
                if (holder.getSurface() != null
                        && holder.getSurface().isValid()) {
                    lastSurface = holder.getSurface();
                    handler.post(initRunnable);
                }
            }

            public void surfaceDestroyed(SurfaceHolder holder) {
                if (initOGRE && wndCreate) {
                    wndCreate = false;
                    lastSurface = null;
                    handler.post(new Runnable() {
                        public void run() {
                            ogreApp.getRenderWindow()._notifySurfaceDestroyed();
                        }
                    });
                }
            }

            public void surfaceChanged(SurfaceHolder holder, int format,
                                       int width, int height) {

            }
        });*/
    }

    @Override
    public Engine onCreateEngine() {
        return new OgreWallpaperEngine();
    }

    private class OgreWallpaperEngine extends Engine {
        public final String LOG_TAG = "OgreWallpaperEngine";

        @Override
        public void onVisibilityChanged(boolean visible) {
            Log.d(LOG_TAG, "onVisibilityChanged(" + visible + ")");
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
            if (initOGRE && wndCreate) {
                wndCreate = false;
                lastSurface = null;
                handler.post(new Runnable() {
                    public void run() {
                        ogreApp.getRenderWindow()._notifySurfaceDestroyed();
                    }
                });
            }
        }

        @Override
        public void onSurfaceChanged(SurfaceHolder holder, int format,
                                     int width, int height) {
            Log.d(LOG_TAG, "onSurfaceChanged");
            //this.width = width;
            //this.height = height;
            super.onSurfaceChanged(holder, format, width, height);
            if (lastSurface == null) {
                // copied from onCreate
                if (holder.getSurface() != null
                        && holder.getSurface().isValid()) {
                    lastSurface = holder.getSurface();
                    if (initRunnable != null) {
                        handler.post(initRunnable);
                    } else {
                        Log.e(LOG_TAG, "initRunnable is null!");
                    }
                } else {
                    Log.e(LOG_TAG, "No valid SurfaceHolder!");
                }
            } /*else {
                ogreApp.getRenderWindow()._notifySurfaceCreated(lastSurface);
            }*/
        }

        @Override
        public void onTouchEvent(MotionEvent event) {
            //if (touchEnabled) {
                super.onTouchEvent(event);
            //}
        }

        @Override
        public void onCreate(SurfaceHolder holder) {
            Log.d(LOG_TAG, "onCreate");
            super.onCreate(holder);
            if (holder.getSurface() != null
                    && holder.getSurface().isValid()) {
                lastSurface = holder.getSurface();
                if (initRunnable != null) {
                    handler.post(initRunnable);
                } else {
                    Log.e(LOG_TAG, "initRunnable is null!");
                }
            } else {
                Log.e(LOG_TAG, "No valid SurfaceHolder!");
            }
        }

        @Override
        public void onDestroy() {
            Log.d(LOG_TAG, "onDestroy");
            super.onDestroy();
        }
    }

    static {
        System.loadLibrary("OgreJNI");
    }
}
