package typings.cors.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: CorsOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: CorsOptionsDelegate): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
