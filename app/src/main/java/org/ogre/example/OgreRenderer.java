package org.ogre.example;

import android.content.res.AssetManager;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;

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

public class OgreRenderer {
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

    // Member vars from here onwards are *probably* only needed in the scene implementation
    SceneManager scnMgr = null;
    AnimationState animationState;
    long time;

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
        // TODO: can/should this be executed here rather than on the Handler?
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

    protected void setUpScene() {
        scnMgr = mOgreApp.getRoot().createSceneManager();
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

        Viewport vp = mOgreApp.getRenderWindow().addViewport(cam);
        vp.setBackgroundColour(new ColourValue(0.3f, 0.3f, 0.3f));
    }

    protected void updateScene() {
        long now = System.currentTimeMillis();
        float delta = (float)(now - time) / 1000f;
        //Log.d(LOG_TAG, "time: " + time + ", now: " + now + ", delta: " + delta);
        time = now;
        SceneNode fluff = scnMgr.getSceneNode("Sire");
        fluff.yaw(new Radian(delta*0.5f));
        SceneNode cube = scnMgr.getSceneNode("Plane");
        cube.yaw(new Radian(delta*0.5f));
        animationState.addTime(delta);
    }
}
