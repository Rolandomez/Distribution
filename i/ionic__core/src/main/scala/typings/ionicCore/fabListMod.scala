package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonFabElement
import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.end
import typings.ionicCore.ionicCoreStrings.start
import typings.ionicCore.ionicCoreStrings.top
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabListMod {
  
  @JSImport("@ionic/core/dist/types/components/fab-list/fab-list", "FabList")
  @js.native
  class FabList ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, the fab list will show all fab buttons in the list.
      */
    var activated: Boolean = js.native
    
    /* protected */ def activatedChanged(activated: Boolean): Unit = js.native
    
    var el: HTMLIonFabElement = js.native
    
    @JSName("render")
    def render_MFabList(): js.Any = js.native
    
    /**
      * The side the fab list will show on relative to the main fab button.
      */
    var side: start | end | top | bottom = js.native
  }
}
