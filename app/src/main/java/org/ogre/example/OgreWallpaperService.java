package org.ogre.example;

import android.content.res.AssetManager;
import android.os.Handler;
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

import java.util.LinkedList;

public class OgreWallpaperService extends WallpaperService {
    private final String LOG_TAG = "OgreWallpaperEService";
    protected Handler handler = null;

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
            sysShutDown();
            if (!mSurfaces.isEmpty()) {
                if (initRunnable != null) {
                    handler.post(initRunnable);
                } else {
                    Log.e(LOG_TAG, "initRunnable is null!");
                }
            }
        }

        private LinkedList<SurfaceHolder> mSurfaces;
    }
    SurfaceList mSurfaceList;

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
        Log.d(LOG_TAG, "onCreate");
        super.onCreate();
        handler = new Handler();
        mSurfaceList = new SurfaceList();
        sysInit();
    }

    @Override
    public void onDestroy() {
        Log.d(LOG_TAG, "onDestroy");
        super.onDestroy();

        sysShutDown();
    }

    private void sysInit() {
        Log.d(LOG_TAG, "sysInit");
        initRunnable = new Runnable() {
            public void run() {
                Log.d(LOG_TAG, "initRunnable");
                if (!initOGRE) {
                    initOGRE = true;

                    if(assetMgr == null) {
                        assetMgr = getResources().getAssets();
                    }

                    renderer = new Runnable() {
                        public void run() {
                            if (paused) {
                                Log.d(LOG_TAG, "Early return");
                                return;
                            }

                            Surface lastSurface;
                            assert(mSurfaceList.getCurrentSurface() != null);
                            lastSurface = mSurfaceList.getCurrentSurface().getSurface();
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
                                //Log.d(LOG_TAG, "time: " + time + ", now: " + now + ", delta: " + delta);
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
    }

    private void sysShutDown() {
        // TODO: can/should this be executed here rather than on the Handler?
        Runnable destroyer = new Runnable() {
            public void run() {
                if (ogreApp != null) {
                    ogreApp.getRenderWindow()._notifySurfaceDestroyed();
                    ogreApp.closeApp();
                }
                ogreApp = null;
                initOGRE = false;
                wndCreate = false;
            }
        };
        handler.post(destroyer);
    }

    @Override
    public Engine onCreateEngine() {
        return new OgreWallpaperEngine();
    }

    private class OgreWallpaperEngine extends Engine {
        public final String LOG_TAG = "OgreWallpaperEngine";
        private SurfaceHolder mSurfaceHolder;

        @Override
        public void onVisibilityChanged(boolean visible) {
            Log.d(LOG_TAG, "onVisibilityChanged(" + visible + ") " + this);
            if (visible) {
                mSurfaceList.addSurface(mSurfaceHolder); // This will bring the Surface to the front if it's already present
                paused = false;
                handler.post(renderer);
            } else if (mSurfaceList.getCurrentSurface() == mSurfaceHolder) {
                paused = true;
                handler.removeCallbacks(renderer);
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
            mSurfaceHolder = holder;
        }

        @Override
        public void onTouchEvent(MotionEvent event) {
            // TODO: is this needed?
            //if (touchEnabled) {
                super.onTouchEvent(event);
            //}
        }

        @Override
        public void onCreate(SurfaceHolder holder) {
            Log.d(LOG_TAG, "onCreate " + this);
            super.onCreate(holder);
            mSurfaceHolder = holder;
        }

        @Override
        public void onDestroy() {
            Log.d(LOG_TAG, "onDestroy " + this);
            super.onDestroy();
        }
    }

    static {
        System.loadLibrary("OgreJNI");
    }
}
