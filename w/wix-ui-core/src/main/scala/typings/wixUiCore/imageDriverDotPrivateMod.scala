package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageDriverDotPrivateMod {
  
  @JSImport("wix-ui-core/src/components/image/image.driver.private", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imageDriverFactory(base: UniDriver[js.Any]): ImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("imageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ImageDriver]
  
  trait ImageDriver
    extends StObject
       with typings.wixUiCore.imageUniDotDriverMod.ImageDriver {
    
    def getResizeMode(): js.Promise[String | Boolean]
    
    def getSrcSet(): js.Promise[String]
  }
  object ImageDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getAlt: () => js.Promise[String],
      getLoadStatus: () => js.Promise[String],
      getResizeMode: () => js.Promise[String | Boolean],
      getSrc: () => js.Promise[String | Null],
      getSrcSet: () => js.Promise[String]
    ): ImageDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAlt = js.Any.fromFunction0(getAlt), getLoadStatus = js.Any.fromFunction0(getLoadStatus), getResizeMode = js.Any.fromFunction0(getResizeMode), getSrc = js.Any.fromFunction0(getSrc), getSrcSet = js.Any.fromFunction0(getSrcSet))
      __obj.asInstanceOf[ImageDriver]
    }
    
    extension [Self <: ImageDriver](x: Self) {
      
      inline def setGetResizeMode(value: () => js.Promise[String | Boolean]): Self = StObject.set(x, "getResizeMode", js.Any.fromFunction0(value))
      
      inline def setGetSrcSet(value: () => js.Promise[String]): Self = StObject.set(x, "getSrcSet", js.Any.fromFunction0(value))
    }
  }
}
