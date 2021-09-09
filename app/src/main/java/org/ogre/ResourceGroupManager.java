/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class ResourceGroupManager {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ResourceGroupManager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ResourceGroupManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ResourceGroupManager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static String getDEFAULT_RESOURCE_GROUP_NAME() {
    return OgreJNI.ResourceGroupManager_DEFAULT_RESOURCE_GROUP_NAME_get();
  }

  public static String getINTERNAL_RESOURCE_GROUP_NAME() {
    return OgreJNI.ResourceGroupManager_INTERNAL_RESOURCE_GROUP_NAME_get();
  }

  public static String getAUTODETECT_RESOURCE_GROUP_NAME() {
    return OgreJNI.ResourceGroupManager_AUTODETECT_RESOURCE_GROUP_NAME_get();
  }

  public static int getRESOURCE_SYSTEM_NUM_REFERENCE_COUNTS() {
    return OgreJNI.ResourceGroupManager_RESOURCE_SYSTEM_NUM_REFERENCE_COUNTS_get();
  }

  static public class ResourceDeclaration {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected ResourceDeclaration(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ResourceDeclaration obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_ResourceGroupManager_ResourceDeclaration(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setResourceName(String value) {
      OgreJNI.ResourceGroupManager_ResourceDeclaration_resourceName_set(swigCPtr, this, value);
    }
  
    public String getResourceName() {
      return OgreJNI.ResourceGroupManager_ResourceDeclaration_resourceName_get(swigCPtr, this);
    }
  
    public void setResourceType(String value) {
      OgreJNI.ResourceGroupManager_ResourceDeclaration_resourceType_set(swigCPtr, this, value);
    }
  
    public String getResourceType() {
      return OgreJNI.ResourceGroupManager_ResourceDeclaration_resourceType_get(swigCPtr, this);
    }
  
    public void setLoader(ManualResourceLoader value) {
      OgreJNI.ResourceGroupManager_ResourceDeclaration_loader_set(swigCPtr, this, ManualResourceLoader.getCPtr(value), value);
    }
  
    public ManualResourceLoader getLoader() {
      long cPtr = OgreJNI.ResourceGroupManager_ResourceDeclaration_loader_get(swigCPtr, this);
      return (cPtr == 0) ? null : new ManualResourceLoader(cPtr, false);
    }
  
    public void setParameters(NameValuePairList value) {
      OgreJNI.ResourceGroupManager_ResourceDeclaration_parameters_set(swigCPtr, this, NameValuePairList.getCPtr(value), value);
    }
  
    public NameValuePairList getParameters() {
      long cPtr = OgreJNI.ResourceGroupManager_ResourceDeclaration_parameters_get(swigCPtr, this);
      return (cPtr == 0) ? null : new NameValuePairList(cPtr, false);
    }
  
    public ResourceDeclaration() {
      this(OgreJNI.new_ResourceGroupManager_ResourceDeclaration(), true);
    }
  
  }

  static public class ResourceLocation {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected ResourceLocation(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ResourceLocation obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_ResourceGroupManager_ResourceLocation(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setArchive(Archive value) {
      OgreJNI.ResourceGroupManager_ResourceLocation_archive_set(swigCPtr, this, Archive.getCPtr(value), value);
    }
  
    public Archive getArchive() {
      long cPtr = OgreJNI.ResourceGroupManager_ResourceLocation_archive_get(swigCPtr, this);
      return (cPtr == 0) ? null : new Archive(cPtr, false);
    }
  
    public void setRecursive(boolean value) {
      OgreJNI.ResourceGroupManager_ResourceLocation_recursive_set(swigCPtr, this, value);
    }
  
    public boolean getRecursive() {
      return OgreJNI.ResourceGroupManager_ResourceLocation_recursive_get(swigCPtr, this);
    }
  
    public ResourceLocation() {
      this(OgreJNI.new_ResourceGroupManager_ResourceLocation(), true);
    }
  
  }

  public ResourceGroupManager() {
    this(OgreJNI.new_ResourceGroupManager(), true);
  }

  public void createResourceGroup(String name, boolean inGlobalPool) {
    OgreJNI.ResourceGroupManager_createResourceGroup__SWIG_0(swigCPtr, this, name, inGlobalPool);
  }

  public void createResourceGroup(String name) {
    OgreJNI.ResourceGroupManager_createResourceGroup__SWIG_1(swigCPtr, this, name);
  }

  public void initialiseResourceGroup(String name) {
    OgreJNI.ResourceGroupManager_initialiseResourceGroup(swigCPtr, this, name);
  }

  public void initialiseAllResourceGroups() {
    OgreJNI.ResourceGroupManager_initialiseAllResourceGroups(swigCPtr, this);
  }

  public void prepareResourceGroup(String name, boolean prepareMainResources, boolean prepareWorldGeom) {
    OgreJNI.ResourceGroupManager_prepareResourceGroup__SWIG_0(swigCPtr, this, name, prepareMainResources, prepareWorldGeom);
  }

  public void prepareResourceGroup(String name, boolean prepareMainResources) {
    OgreJNI.ResourceGroupManager_prepareResourceGroup__SWIG_1(swigCPtr, this, name, prepareMainResources);
  }

  public void prepareResourceGroup(String name) {
    OgreJNI.ResourceGroupManager_prepareResourceGroup__SWIG_2(swigCPtr, this, name);
  }

  public void loadResourceGroup(String name, boolean loadMainResources, boolean loadWorldGeom) {
    OgreJNI.ResourceGroupManager_loadResourceGroup__SWIG_0(swigCPtr, this, name, loadMainResources, loadWorldGeom);
  }

  public void loadResourceGroup(String name, boolean loadMainResources) {
    OgreJNI.ResourceGroupManager_loadResourceGroup__SWIG_1(swigCPtr, this, name, loadMainResources);
  }

  public void loadResourceGroup(String name) {
    OgreJNI.ResourceGroupManager_loadResourceGroup__SWIG_2(swigCPtr, this, name);
  }

  public void unloadResourceGroup(String name, boolean reloadableOnly) {
    OgreJNI.ResourceGroupManager_unloadResourceGroup__SWIG_0(swigCPtr, this, name, reloadableOnly);
  }

  public void unloadResourceGroup(String name) {
    OgreJNI.ResourceGroupManager_unloadResourceGroup__SWIG_1(swigCPtr, this, name);
  }

  public void unloadUnreferencedResourcesInGroup(String name, boolean reloadableOnly) {
    OgreJNI.ResourceGroupManager_unloadUnreferencedResourcesInGroup__SWIG_0(swigCPtr, this, name, reloadableOnly);
  }

  public void unloadUnreferencedResourcesInGroup(String name) {
    OgreJNI.ResourceGroupManager_unloadUnreferencedResourcesInGroup__SWIG_1(swigCPtr, this, name);
  }

  public void clearResourceGroup(String name) {
    OgreJNI.ResourceGroupManager_clearResourceGroup(swigCPtr, this, name);
  }

  public void destroyResourceGroup(String name) {
    OgreJNI.ResourceGroupManager_destroyResourceGroup(swigCPtr, this, name);
  }

  public boolean isResourceGroupInitialised(String name) {
    return OgreJNI.ResourceGroupManager_isResourceGroupInitialised(swigCPtr, this, name);
  }

  public boolean isResourceGroupLoaded(String name) {
    return OgreJNI.ResourceGroupManager_isResourceGroupLoaded(swigCPtr, this, name);
  }

  public boolean resourceGroupExists(String name) {
    return OgreJNI.ResourceGroupManager_resourceGroupExists(swigCPtr, this, name);
  }

  public void addResourceLocation(String name, String locType, String resGroup, boolean recursive, boolean readOnly) {
    OgreJNI.ResourceGroupManager_addResourceLocation__SWIG_0(swigCPtr, this, name, locType, resGroup, recursive, readOnly);
  }

  public void addResourceLocation(String name, String locType, String resGroup, boolean recursive) {
    OgreJNI.ResourceGroupManager_addResourceLocation__SWIG_1(swigCPtr, this, name, locType, resGroup, recursive);
  }

  public void addResourceLocation(String name, String locType, String resGroup) {
    OgreJNI.ResourceGroupManager_addResourceLocation__SWIG_2(swigCPtr, this, name, locType, resGroup);
  }

  public void addResourceLocation(String name, String locType) {
    OgreJNI.ResourceGroupManager_addResourceLocation__SWIG_3(swigCPtr, this, name, locType);
  }

  public void removeResourceLocation(String name, String resGroup) {
    OgreJNI.ResourceGroupManager_removeResourceLocation__SWIG_0(swigCPtr, this, name, resGroup);
  }

  public void removeResourceLocation(String name) {
    OgreJNI.ResourceGroupManager_removeResourceLocation__SWIG_1(swigCPtr, this, name);
  }

  public boolean resourceLocationExists(String name, String resGroup) {
    return OgreJNI.ResourceGroupManager_resourceLocationExists__SWIG_0(swigCPtr, this, name, resGroup);
  }

  public boolean resourceLocationExists(String name) {
    return OgreJNI.ResourceGroupManager_resourceLocationExists__SWIG_1(swigCPtr, this, name);
  }

  public void declareResource(String name, String resourceType, String groupName, NameValuePairList loadParameters) {
    OgreJNI.ResourceGroupManager_declareResource__SWIG_0(swigCPtr, this, name, resourceType, groupName, NameValuePairList.getCPtr(loadParameters), loadParameters);
  }

  public void declareResource(String name, String resourceType, String groupName) {
    OgreJNI.ResourceGroupManager_declareResource__SWIG_1(swigCPtr, this, name, resourceType, groupName);
  }

  public void declareResource(String name, String resourceType) {
    OgreJNI.ResourceGroupManager_declareResource__SWIG_2(swigCPtr, this, name, resourceType);
  }

  public void declareResource(String name, String resourceType, String groupName, ManualResourceLoader loader, NameValuePairList loadParameters) {
    OgreJNI.ResourceGroupManager_declareResource__SWIG_3(swigCPtr, this, name, resourceType, groupName, ManualResourceLoader.getCPtr(loader), loader, NameValuePairList.getCPtr(loadParameters), loadParameters);
  }

  public void declareResource(String name, String resourceType, String groupName, ManualResourceLoader loader) {
    OgreJNI.ResourceGroupManager_declareResource__SWIG_4(swigCPtr, this, name, resourceType, groupName, ManualResourceLoader.getCPtr(loader), loader);
  }

  public void undeclareResource(String name, String groupName) {
    OgreJNI.ResourceGroupManager_undeclareResource(swigCPtr, this, name, groupName);
  }

  public DataStreamPtr openResource(String resourceName, String groupName, Resource resourceBeingLoaded, boolean throwOnFailure) {
    return new DataStreamPtr(OgreJNI.ResourceGroupManager_openResource__SWIG_0(swigCPtr, this, resourceName, groupName, Resource.getCPtr(resourceBeingLoaded), resourceBeingLoaded, throwOnFailure), true);
  }

  public DataStreamPtr openResource(String resourceName, String groupName, Resource resourceBeingLoaded) {
    return new DataStreamPtr(OgreJNI.ResourceGroupManager_openResource__SWIG_1(swigCPtr, this, resourceName, groupName, Resource.getCPtr(resourceBeingLoaded), resourceBeingLoaded), true);
  }

  public DataStreamPtr openResource(String resourceName, String groupName) {
    return new DataStreamPtr(OgreJNI.ResourceGroupManager_openResource__SWIG_2(swigCPtr, this, resourceName, groupName), true);
  }

  public DataStreamPtr openResource(String resourceName) {
    return new DataStreamPtr(OgreJNI.ResourceGroupManager_openResource__SWIG_3(swigCPtr, this, resourceName), true);
  }

  public SWIGTYPE_p_std__listT_Ogre__SharedPtrT_Ogre__DataStream_t_t openResources(String pattern, String groupName) {
    return new SWIGTYPE_p_std__listT_Ogre__SharedPtrT_Ogre__DataStream_t_t(OgreJNI.ResourceGroupManager_openResources__SWIG_0(swigCPtr, this, pattern, groupName), true);
  }

  public SWIGTYPE_p_std__listT_Ogre__SharedPtrT_Ogre__DataStream_t_t openResources(String pattern) {
    return new SWIGTYPE_p_std__listT_Ogre__SharedPtrT_Ogre__DataStream_t_t(OgreJNI.ResourceGroupManager_openResources__SWIG_1(swigCPtr, this, pattern), true);
  }

  public StringVectorPtr listResourceNames(String groupName, boolean dirs) {
    return new StringVectorPtr(OgreJNI.ResourceGroupManager_listResourceNames__SWIG_0(swigCPtr, this, groupName, dirs), true);
  }

  public StringVectorPtr listResourceNames(String groupName) {
    return new StringVectorPtr(OgreJNI.ResourceGroupManager_listResourceNames__SWIG_1(swigCPtr, this, groupName), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_std__vectorT_Ogre__FileInfo_t_t listResourceFileInfo(String groupName, boolean dirs) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_std__vectorT_Ogre__FileInfo_t_t(OgreJNI.ResourceGroupManager_listResourceFileInfo__SWIG_0(swigCPtr, this, groupName, dirs), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_std__vectorT_Ogre__FileInfo_t_t listResourceFileInfo(String groupName) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_std__vectorT_Ogre__FileInfo_t_t(OgreJNI.ResourceGroupManager_listResourceFileInfo__SWIG_1(swigCPtr, this, groupName), true);
  }

  public StringVectorPtr findResourceNames(String groupName, String pattern, boolean dirs) {
    return new StringVectorPtr(OgreJNI.ResourceGroupManager_findResourceNames__SWIG_0(swigCPtr, this, groupName, pattern, dirs), true);
  }

  public StringVectorPtr findResourceNames(String groupName, String pattern) {
    return new StringVectorPtr(OgreJNI.ResourceGroupManager_findResourceNames__SWIG_1(swigCPtr, this, groupName, pattern), true);
  }

  public boolean resourceExists(String group, String filename) {
    return OgreJNI.ResourceGroupManager_resourceExists(swigCPtr, this, group, filename);
  }

  public boolean resourceExistsInAnyGroup(String filename) {
    return OgreJNI.ResourceGroupManager_resourceExistsInAnyGroup(swigCPtr, this, filename);
  }

  public String findGroupContainingResource(String filename) {
    return OgreJNI.ResourceGroupManager_findGroupContainingResource(swigCPtr, this, filename);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_std__vectorT_Ogre__FileInfo_t_t findResourceFileInfo(String group, String pattern, boolean dirs) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_std__vectorT_Ogre__FileInfo_t_t(OgreJNI.ResourceGroupManager_findResourceFileInfo__SWIG_0(swigCPtr, this, group, pattern, dirs), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_std__vectorT_Ogre__FileInfo_t_t findResourceFileInfo(String group, String pattern) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_std__vectorT_Ogre__FileInfo_t_t(OgreJNI.ResourceGroupManager_findResourceFileInfo__SWIG_1(swigCPtr, this, group, pattern), true);
  }

  public SWIGTYPE_p_time_t resourceModifiedTime(String group, String filename) {
    return new SWIGTYPE_p_time_t(OgreJNI.ResourceGroupManager_resourceModifiedTime(swigCPtr, this, group, filename), true);
  }

  public StringVectorPtr listResourceLocations(String groupName) {
    return new StringVectorPtr(OgreJNI.ResourceGroupManager_listResourceLocations(swigCPtr, this, groupName), true);
  }

  public StringVectorPtr findResourceLocation(String groupName, String pattern) {
    return new StringVectorPtr(OgreJNI.ResourceGroupManager_findResourceLocation(swigCPtr, this, groupName, pattern), true);
  }

  public DataStreamPtr createResource(String filename, String groupName, boolean overwrite, String locationPattern) {
    return new DataStreamPtr(OgreJNI.ResourceGroupManager_createResource__SWIG_0(swigCPtr, this, filename, groupName, overwrite, locationPattern), true);
  }

  public DataStreamPtr createResource(String filename, String groupName, boolean overwrite) {
    return new DataStreamPtr(OgreJNI.ResourceGroupManager_createResource__SWIG_1(swigCPtr, this, filename, groupName, overwrite), true);
  }

  public DataStreamPtr createResource(String filename, String groupName) {
    return new DataStreamPtr(OgreJNI.ResourceGroupManager_createResource__SWIG_2(swigCPtr, this, filename, groupName), true);
  }

  public DataStreamPtr createResource(String filename) {
    return new DataStreamPtr(OgreJNI.ResourceGroupManager_createResource__SWIG_3(swigCPtr, this, filename), true);
  }

  public void deleteResource(String filename, String groupName, String locationPattern) {
    OgreJNI.ResourceGroupManager_deleteResource__SWIG_0(swigCPtr, this, filename, groupName, locationPattern);
  }

  public void deleteResource(String filename, String groupName) {
    OgreJNI.ResourceGroupManager_deleteResource__SWIG_1(swigCPtr, this, filename, groupName);
  }

  public void deleteResource(String filename) {
    OgreJNI.ResourceGroupManager_deleteResource__SWIG_2(swigCPtr, this, filename);
  }

  public void deleteMatchingResources(String filePattern, String groupName, String locationPattern) {
    OgreJNI.ResourceGroupManager_deleteMatchingResources__SWIG_0(swigCPtr, this, filePattern, groupName, locationPattern);
  }

  public void deleteMatchingResources(String filePattern, String groupName) {
    OgreJNI.ResourceGroupManager_deleteMatchingResources__SWIG_1(swigCPtr, this, filePattern, groupName);
  }

  public void deleteMatchingResources(String filePattern) {
    OgreJNI.ResourceGroupManager_deleteMatchingResources__SWIG_2(swigCPtr, this, filePattern);
  }

  public void addResourceGroupListener(ResourceGroupListener l) {
    OgreJNI.ResourceGroupManager_addResourceGroupListener(swigCPtr, this, ResourceGroupListener.getCPtr(l), l);
  }

  public void removeResourceGroupListener(ResourceGroupListener l) {
    OgreJNI.ResourceGroupManager_removeResourceGroupListener(swigCPtr, this, ResourceGroupListener.getCPtr(l), l);
  }

  public void setWorldResourceGroupName(String groupName) {
    OgreJNI.ResourceGroupManager_setWorldResourceGroupName(swigCPtr, this, groupName);
  }

  public String getWorldResourceGroupName() {
    return OgreJNI.ResourceGroupManager_getWorldResourceGroupName(swigCPtr, this);
  }

  public void linkWorldGeometryToResourceGroup(String group, String worldGeometry, SceneManager sceneManager) {
    OgreJNI.ResourceGroupManager_linkWorldGeometryToResourceGroup(swigCPtr, this, group, worldGeometry, SceneManager.getCPtr(sceneManager), sceneManager);
  }

  public void unlinkWorldGeometryFromResourceGroup(String group) {
    OgreJNI.ResourceGroupManager_unlinkWorldGeometryFromResourceGroup(swigCPtr, this, group);
  }

  public boolean isResourceGroupInGlobalPool(String name) {
    return OgreJNI.ResourceGroupManager_isResourceGroupInGlobalPool(swigCPtr, this, name);
  }

  public void shutdownAll() {
    OgreJNI.ResourceGroupManager_shutdownAll(swigCPtr, this);
  }

  public void _registerResourceManager(String resourceType, ResourceManager rm) {
    OgreJNI.ResourceGroupManager__registerResourceManager(swigCPtr, this, resourceType, ResourceManager.getCPtr(rm), rm);
  }

  public void _unregisterResourceManager(String resourceType) {
    OgreJNI.ResourceGroupManager__unregisterResourceManager(swigCPtr, this, resourceType);
  }

  public SWIGTYPE_p_std__mapT_std__string_Ogre__ResourceManager_p_t getResourceManagers() {
    return new SWIGTYPE_p_std__mapT_std__string_Ogre__ResourceManager_p_t(OgreJNI.ResourceGroupManager_getResourceManagers(swigCPtr, this), false);
  }

  public void _registerScriptLoader(ScriptLoader su) {
    OgreJNI.ResourceGroupManager__registerScriptLoader(swigCPtr, this, ScriptLoader.getCPtr(su), su);
  }

  public void _unregisterScriptLoader(ScriptLoader su) {
    OgreJNI.ResourceGroupManager__unregisterScriptLoader(swigCPtr, this, ScriptLoader.getCPtr(su), su);
  }

  public ScriptLoader _findScriptLoader(String pattern) {
    long cPtr = OgreJNI.ResourceGroupManager__findScriptLoader(swigCPtr, this, pattern);
    return (cPtr == 0) ? null : new ScriptLoader(cPtr, false);
  }

  public ResourceManager _getResourceManager(String resourceType) {
    long cPtr = OgreJNI.ResourceGroupManager__getResourceManager(swigCPtr, this, resourceType);
    return (cPtr == 0) ? null : new ResourceManager(cPtr, false);
  }

  public void _notifyResourceCreated(ResourcePtr res) {
    OgreJNI.ResourceGroupManager__notifyResourceCreated(swigCPtr, this, ResourcePtr.getCPtr(res), res);
  }

  public void _notifyResourceRemoved(ResourcePtr res) {
    OgreJNI.ResourceGroupManager__notifyResourceRemoved(swigCPtr, this, ResourcePtr.getCPtr(res), res);
  }

  public void _notifyResourceGroupChanged(String oldGroup, Resource res) {
    OgreJNI.ResourceGroupManager__notifyResourceGroupChanged(swigCPtr, this, oldGroup, Resource.getCPtr(res), res);
  }

  public void _notifyAllResourcesRemoved(ResourceManager manager) {
    OgreJNI.ResourceGroupManager__notifyAllResourcesRemoved(swigCPtr, this, ResourceManager.getCPtr(manager), manager);
  }

  public void _notifyWorldGeometryStageStarted(String description) {
    OgreJNI.ResourceGroupManager__notifyWorldGeometryStageStarted(swigCPtr, this, description);
  }

  public void _notifyWorldGeometryStageEnded() {
    OgreJNI.ResourceGroupManager__notifyWorldGeometryStageEnded(swigCPtr, this);
  }

  public StringVector getResourceGroups() {
    return new StringVector(OgreJNI.ResourceGroupManager_getResourceGroups(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__listT_Ogre__ResourceGroupManager__ResourceDeclaration_t getResourceDeclarationList(String groupName) {
    return new SWIGTYPE_p_std__listT_Ogre__ResourceGroupManager__ResourceDeclaration_t(OgreJNI.ResourceGroupManager_getResourceDeclarationList(swigCPtr, this, groupName), true);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__ResourceGroupManager__ResourceLocation_t getResourceLocationList(String groupName) {
    return new SWIGTYPE_p_std__vectorT_Ogre__ResourceGroupManager__ResourceLocation_t(OgreJNI.ResourceGroupManager_getResourceLocationList(swigCPtr, this, groupName), false);
  }

  public void setLoadingListener(ResourceLoadingListener listener) {
    OgreJNI.ResourceGroupManager_setLoadingListener(swigCPtr, this, ResourceLoadingListener.getCPtr(listener), listener);
  }

  public ResourceLoadingListener getLoadingListener() {
    long cPtr = OgreJNI.ResourceGroupManager_getLoadingListener(swigCPtr, this);
    return (cPtr == 0) ? null : new ResourceLoadingListener(cPtr, false);
  }

  public static ResourceGroupManager getSingleton() {
    return new ResourceGroupManager(OgreJNI.ResourceGroupManager_getSingleton(), false);
  }

}
