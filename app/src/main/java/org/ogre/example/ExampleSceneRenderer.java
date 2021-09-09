package org.ogre.example;

import android.content.res.AssetManager;

import org.ogre.AnimationState;
import org.ogre.Camera;
import org.ogre.ColourValue;
import org.ogre.CompositorInstance;
import org.ogre.CompositorManager;
import org.ogre.Entity;
import org.ogre.MaterialManager;
import org.ogre.MaterialPtr;
import org.ogre.Radian;
import org.ogre.SceneManager;
import org.ogre.SceneNode;
import org.ogre.ShaderGenerator;
import org.ogre.Vector3;
import org.ogre.Viewport;

import static java.lang.Math.sin;

public class ExampleSceneRenderer extends OgreRenderer {
    SceneManager mSceneManager = null;
    AnimationState mAnimationState;
    long mTime;

    ExampleSceneRenderer(AssetManager assetMgr) {
        super(assetMgr);
    }

    @Override
    protected void setUpScene() {
        mSceneManager = mOgreApp.getRoot().createSceneManager();
        ShaderGenerator.getSingleton().addSceneManager(mSceneManager);

        Camera cam = mSceneManager.createCamera("cam");
        cam.setNearClipDistance(0.5f);
        cam.setFOVy(new Radian(0.75f));
        cam.setAutoAspectRatio(true);

        SceneNode camNode = mSceneManager.getRootSceneNode().createChildSceneNode();
        camNode.attachObject(cam);
        camNode.setPosition(0f, 5f, 14f);
        camNode.setDirection(0f, -5f, -14f);

        SceneNode baseNode = mSceneManager.getRootSceneNode().createChildSceneNode("base");

        // Create an Entity with the penguin model and attach it to a scene node
        Entity penguin = mSceneManager.createEntity("penguin.mesh");
        penguin.setMaterial(MaterialManager.getSingleton().getByName("psxtest"));
        mAnimationState = penguin.getAnimationState("amuse");
        mAnimationState.setLoop(true);
        mAnimationState.setEnabled(true);
        mTime = System.currentTimeMillis();
        SceneNode penguinNode = baseNode.createChildSceneNode("Penguin");
        penguinNode.attachObject(penguin);
        penguinNode.scale(0.1f, 0.1f, 0.1f);

        // Do the same for the ground plane
        Entity plane = mSceneManager.createEntity("Plane.mesh");
        SceneNode planeNode = baseNode.createChildSceneNode("Plane");
        planeNode.attachObject(plane);
        planeNode.translate(0f, -2.3f, 0f);
        planeNode.scale(3f, 3f, 3f);

        // Do the same for the background skybox
        Entity cube = mSceneManager.createEntity("cube.mesh");
        final MaterialPtr material = MaterialManager.getSingleton().getByName("sky");
        cube.setMaterial(material);
        SceneNode cubeNode = baseNode.createChildSceneNode("cube");
        cubeNode.scale(0.25f, 0.25f, 0.25f);
        cubeNode.attachObject(cube);

        Viewport vp = mOgreApp.getRenderWindow().addViewport(cam);
        vp.setBackgroundColour(new ColourValue(0.4f, 0.7f, 0.9f));

        final String compName = "CRT";
        CompositorInstance comp = CompositorManager.getSingleton().addCompositor(vp, compName);
        CompositorManager.getSingleton().setCompositorEnabled(vp, compName, true);
    }

    @Override
    protected void updateScene() {
        long now = System.currentTimeMillis();
        double dTime = (double)now / 1000.;
        float delta = (float)(now - mTime) / 1000f;
        mTime = now;

        SceneNode baseNode = mSceneManager.getSceneNode("base");
        baseNode.yaw(new Radian(delta*0.25f));
        Vector3 pos = new Vector3(0f, (float)sin(dTime * .25f) * .5f, 0f);
        mAnimationState.addTime(delta);
    }
}
