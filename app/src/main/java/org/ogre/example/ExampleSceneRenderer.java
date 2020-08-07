package org.ogre.example;

import android.content.res.AssetManager;

import org.ogre.AnimationState;
import org.ogre.AxisAlignedBox;
import org.ogre.Camera;
import org.ogre.ColourValue;
import org.ogre.Compositor;
import org.ogre.CompositorInstance;
import org.ogre.CompositorManager;
import org.ogre.Entity;
import org.ogre.FilterOptions;
import org.ogre.Light;
import org.ogre.MaterialManager;
import org.ogre.MaterialPtr;
import org.ogre.Node;
import org.ogre.OgreJNI;
import org.ogre.PixelFormat;
import org.ogre.Radian;
import org.ogre.Rectangle2D;
import org.ogre.RenderTarget;
import org.ogre.RenderTargetEvent;
import org.ogre.RenderTargetListener;
import org.ogre.ResourceGroupManager;
import org.ogre.SceneManager;
import org.ogre.SceneNode;
import org.ogre.ShaderGenerator;
import org.ogre.TextureFilterOptions;
import org.ogre.TextureManager;
import org.ogre.TexturePtr;
import org.ogre.TextureType;
import org.ogre.TextureUnitState;
import org.ogre.Vector3;
import org.ogre.Viewport;

import static java.lang.Math.sin;

public class ExampleSceneRenderer extends OgreRenderer {
    SceneManager scnMgr = null;
    AnimationState animationState;
    Rectangle2D miniScreen;
    SceneNode mBaseNode;
    SceneNode mCamNode;
    long time;

    final int PIXEL_SCALE = 6;

    ExampleSceneRenderer(AssetManager assetMgr) {
        super(assetMgr);
    }

    private class SireRenderTargetListener extends RenderTargetListener {
        @Override
        public void preRenderTargetUpdate(RenderTargetEvent evt) {
            super.preRenderTargetUpdate(evt);
            miniScreen.setVisible(false);
            mBaseNode.setVisible(true);
        }

        @Override
        public void postRenderTargetUpdate(RenderTargetEvent evt) {
            super.postRenderTargetUpdate(evt);
            miniScreen.setVisible(true);
            mBaseNode.setVisible(false);
        }
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

        mCamNode = scnMgr.getRootSceneNode().createChildSceneNode();
        mCamNode.attachObject(cam);
        mCamNode.setPosition(0f, 2f, 14);
        mCamNode.setDirection(0f, -2f, -14f);

        mBaseNode = scnMgr.getRootSceneNode().createChildSceneNode("base");

        Entity ent = scnMgr.createEntity("penguin.mesh");
        animationState = ent.getAnimationState("amuse");
        animationState.setLoop(true);
        animationState.setEnabled(true);
        time = System.currentTimeMillis();
        SceneNode node = mBaseNode.createChildSceneNode("Penguin");
        node.attachObject(ent);
        node.scale(0.1f, 0.1f, 0.1f);
        node.translate(0f, -4.2f, 0f);
        //node.rotate(new Vector3(1f, 0f, 0f), new Radian(-1.5f));
        //node.setVisible(false);

        Entity ent2 = scnMgr.createEntity("Plane.mesh");
        SceneNode node2 = mBaseNode.createChildSceneNode("Plane");
        node2.attachObject(ent2);
        node2.translate(0f, -4.4f, 0f);
        node2.scale(4f, 4f, 4f);
        //node2.setVisible(false);

        Entity ent3 = scnMgr.createEntity("cube.mesh");
        final MaterialPtr material = MaterialManager.getSingleton().getByName("sky");
        ent3.setMaterial(material);
        SceneNode node3 = mBaseNode.createChildSceneNode("cube");
        node3.scale(0.25f, 0.25f, 0.25f);
        node3.attachObject(ent3);

        Viewport vp2 = mOgreApp.getRenderWindow().addViewport(cam);
        //vp.setBackgroundColour(new ColourValue(0.4f, 0.7f, 0.9f));



        // Render target stuff
        TexturePtr rttTexture = TextureManager.getSingleton().createManual("RttTex",
                ResourceGroupManager.getDEFAULT_RESOURCE_GROUP_NAME(),
                TextureType.TEX_TYPE_2D,
                (long)getWidth() / PIXEL_SCALE, (long)getHeight() / PIXEL_SCALE, 1,
                0,
                PixelFormat.PF_R8G8B8,
                OgreJNI.TU_RENDERTARGET_get());

        RenderTarget renderTexture = rttTexture.getBuffer().getRenderTarget();
        Viewport vp = renderTexture.addViewport(cam);
        vp.setClearEveryFrame(true);
        vp.setBackgroundColour(new ColourValue(0.4f, 0.7f, 0.9f));
        vp.setOverlaysEnabled(false);

        miniScreen = new Rectangle2D(true);
        miniScreen.setCorners(-1f, 1f, 1f, -1f);
        miniScreen.setBoundingBox(AxisAlignedBox.getBOX_INFINITE());

        SceneNode miniScreenNode = scnMgr.getRootSceneNode().createChildSceneNode();
        miniScreenNode.attachObject(miniScreen);

        MaterialPtr renderMaterial =
                MaterialManager.getSingleton().create(
                "RttMat",
                ResourceGroupManager.getDEFAULT_RESOURCE_GROUP_NAME());
        renderMaterial.getTechnique(0).getPass(0).setLightingEnabled(false);
        TextureUnitState tex = renderMaterial.getTechnique(0).getPass(0).createTextureUnitState("RttTex");
        tex.setTextureFiltering(TextureFilterOptions.TFO_NONE);

        miniScreen.setMaterial(renderMaterial);

        renderTexture.addListener(new SireRenderTargetListener());

        /*final String compName = "Glass";
        CompositorInstance comp = CompositorManager.getSingleton().addCompositor(vp, compName);
        CompositorManager.getSingleton().setCompositorEnabled(vp, compName, true);*/
    }

    @Override
    protected void updateScene() {
        long now = System.currentTimeMillis();
        double dTime = (double)now / 1000.;
        float delta = (float)(now - time) / 1000f;
        //Log.d(LOG_TAG, "time: " + time + ", now: " + now + ", delta: " + delta);
        time = now;
        mBaseNode.yaw(new Radian(delta*0.25f));
        Vector3 pos = new Vector3(0f, (float)sin(dTime * .25f) * 2f, 0f);
        mBaseNode.setPosition(pos);
        mCamNode.lookAt(pos, Node.TransformSpace.TS_WORLD);
        animationState.addTime(delta);
    }
}
