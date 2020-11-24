package typings.appBuilderLib

import typings.appBuilderLib.appXOptionsMod.AppXOptions
import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.winPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/AppxTarget", JSImport.Namespace)
@js.native
object appxTargetMod extends js.Object {
  
  @js.native
  trait AppXTarget extends Target {
    
    var computePublisherName: js.Any = js.native
    
    var getExtensions: js.Any = js.native
    
    @JSName("options")
    val options_AppXTarget: AppXOptions = js.native
    
    val packager: js.Any = js.native
    
    var writeManifest: js.Any = js.native
  }
  
  @js.native
  class default protected () extends AppXTarget {
    def this(packager: WinPackager, outDir: String) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var computeUserAssets: js.Any = js.native
  }
}
