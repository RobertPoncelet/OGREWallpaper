package org.ogre.example;

import android.content.res.AssetManager;

import org.ogre.AnimationState;
import org.ogre.Camera;
import org.ogre.ColourValue;
import org.ogre.Entity;
import org.ogre.Light;
import org.ogre.Radian;
import org.ogre.SceneManager;
import org.ogre.SceneNode;
import org.ogre.ShaderGenerator;
import org.ogre.Viewport;

public class ExampleSceneRenderer extends OgreRenderer {
    SceneManager scnMgr = null;
    AnimationState animationState;
    long time;

    ExampleSceneRenderer(AssetManager assetMgr) {
        super(assetMgr);
    }

    @Override
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

        Entity ent = scnMgr.createEntity("Cube.001.mesh");
        animationState = ent.getAnimationState("idle");
        animationState.setLoop(true);
        animationState.setEnabled(true);
        time = System.currentTimeMillis();
        SceneNode node = scnMgr.getRootSceneNode().createChildSceneNode("Cube");
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

    @Override
    protected void updateScene() {
        long now = System.currentTimeMillis();
        float delta = (float)(now - time) / 1000f;
        //Log.d(LOG_TAG, "time: " + time + ", now: " + now + ", delta: " + delta);
        time = now;
        SceneNode node = scnMgr.getSceneNode("Cube");
        node.yaw(new Radian(delta*0.25f));
        SceneNode cube = scnMgr.getSceneNode("Plane");
        cube.yaw(new Radian(delta*0.25f));
        animationState.addTime(delta);
    }
}