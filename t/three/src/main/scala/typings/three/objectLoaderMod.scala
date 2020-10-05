package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.HTMLImageElement
import typings.std.ProgressEvent
import typings.three.animationClipMod.AnimationClip
import typings.three.loaderMod.Loader
import typings.three.loadingManagerMod.LoadingManager
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/loaders/ObjectLoader", JSImport.Namespace)
@js.native
object objectLoaderMod extends js.Object {
  @js.native
  class ObjectLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String): Unit = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(url: String, onLoad: js.Function1[/* object */ Object3D, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Object3D, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Object3D, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Object3D, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ Error | ErrorEvent, Unit]
    ): Unit = js.native
    def parse[T /* <: Object3D */](json: js.Any): T = js.native
    def parse[T /* <: Object3D */](json: js.Any, onLoad: js.Function1[/* object */ Object3D, Unit]): T = js.native
     // Array of Classes that inherits from Matrial.
    def parseAnimations(json: js.Any): js.Array[AnimationClip] = js.native
    def parseGeometries(json: js.Any): js.Array[_] = js.native
    def parseImages(json: js.Any, onLoad: js.Function0[Unit]): StringDictionary[HTMLImageElement] = js.native
     // Array of BufferGeometry or Geometry or Geometry2.
    def parseMaterials(json: js.Any, textures: js.Array[Texture]): js.Array[Material] = js.native
    def parseObject[T /* <: Object3D */](data: js.Any, geometries: js.Array[_], materials: js.Array[Material]): T = js.native
    def parseTextures(json: js.Any, images: js.Any): js.Array[Texture] = js.native
  }
  
}

