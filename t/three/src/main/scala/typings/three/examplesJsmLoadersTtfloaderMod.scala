package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersTtfloaderMod {
  
  @JSImport("three/examples/jsm/loaders/TTFLoader", "TTFLoader")
  @js.native
  open class TTFLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* json */ js.Object, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* json */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* json */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* json */ js.Object, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadAsync(url: String): js.Promise[js.Object] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[js.Object] = js.native
    
    def parse(arraybuffer: js.typedarray.ArrayBuffer): js.Object = js.native
    
    var reversed: Boolean = js.native
  }
}
