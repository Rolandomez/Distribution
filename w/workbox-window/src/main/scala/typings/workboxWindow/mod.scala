package typings.workboxWindow

import typings.std.RegistrationOptions
import typings.std.ServiceWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-window", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def messageSW(sw: ServiceWorker, data: js.Any): js.Promise[_] = js.native
  
  @js.native
  class Workbox protected ()
    extends typings.workboxWindow.workboxMod.Workbox {
    def this(scriptURL: String) = this()
    def this(scriptURL: String, registerOptions: RegistrationOptions) = this()
  }
}
