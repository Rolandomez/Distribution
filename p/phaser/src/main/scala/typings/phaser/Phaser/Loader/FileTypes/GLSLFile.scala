package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Cache.BaseCache
import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Loader.MultiFile
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single GLSL File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#glsl method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#glsl.
  */
trait GLSLFile
  extends StObject
     with File {
  
  /**
    * Returns the name of the shader from the header block.
    * @param headerSource The header data.
    */
  def getShaderName(headerSource: js.Array[String]): String
  
  /**
    * Returns the type of the shader from the header block.
    * @param headerSource The header data.
    */
  def getShaderType(headerSource: js.Array[String]): String
  
  /**
    * Returns the shader uniforms from the header block.
    * @param headerSource The header data.
    */
  def getShaderUniforms(headerSource: js.Array[String]): js.Any
}
object GLSLFile {
  
  inline def apply(
    addToCache: () => Unit,
    bytesLoaded: Double,
    bytesTotal: Double,
    cache: BaseCache | TextureManager,
    config: js.Any,
    data: js.Any,
    destroy: () => Unit,
    getShaderName: js.Array[String] => String,
    getShaderType: js.Array[String] => String,
    getShaderUniforms: js.Array[String] => js.Any,
    hasCacheConflict: () => Boolean,
    key: String,
    linkFile: File,
    load: () => Unit,
    loader: LoaderPlugin,
    multiFile: MultiFile,
    onError: (XMLHttpRequest, ProgressEvent[EventTarget]) => Unit,
    onLoad: (XMLHttpRequest, ProgressEvent[EventTarget]) => Unit,
    onProcess: () => Unit,
    onProcessComplete: () => Unit,
    onProcessError: () => Unit,
    onProgress: ProgressEvent[EventTarget] => Unit,
    pendingDestroy: () => Unit,
    percentComplete: Double,
    resetXHR: () => Unit,
    setLink: File => Unit,
    src: String,
    state: integer,
    `type`: String,
    url: js.Object | String,
    xhrLoader: XMLHttpRequest,
    xhrSettings: XHRSettingsObject
  ): GLSLFile = {
    val __obj = js.Dynamic.literal(addToCache = js.Any.fromFunction0(addToCache), bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getShaderName = js.Any.fromFunction1(getShaderName), getShaderType = js.Any.fromFunction1(getShaderType), getShaderUniforms = js.Any.fromFunction1(getShaderUniforms), hasCacheConflict = js.Any.fromFunction0(hasCacheConflict), key = key.asInstanceOf[js.Any], linkFile = linkFile.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loader = loader.asInstanceOf[js.Any], multiFile = multiFile.asInstanceOf[js.Any], onError = js.Any.fromFunction2(onError), onLoad = js.Any.fromFunction2(onLoad), onProcess = js.Any.fromFunction0(onProcess), onProcessComplete = js.Any.fromFunction0(onProcessComplete), onProcessError = js.Any.fromFunction0(onProcessError), onProgress = js.Any.fromFunction1(onProgress), pendingDestroy = js.Any.fromFunction0(pendingDestroy), percentComplete = percentComplete.asInstanceOf[js.Any], resetXHR = js.Any.fromFunction0(resetXHR), setLink = js.Any.fromFunction1(setLink), src = src.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhrLoader = xhrLoader.asInstanceOf[js.Any], xhrSettings = xhrSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLSLFile]
  }
  
  extension [Self <: GLSLFile](x: Self) {
    
    inline def setGetShaderName(value: js.Array[String] => String): Self = StObject.set(x, "getShaderName", js.Any.fromFunction1(value))
    
    inline def setGetShaderType(value: js.Array[String] => String): Self = StObject.set(x, "getShaderType", js.Any.fromFunction1(value))
    
    inline def setGetShaderUniforms(value: js.Array[String] => js.Any): Self = StObject.set(x, "getShaderUniforms", js.Any.fromFunction1(value))
  }
}
