package typings.expressBunyanLogger.mod

import typings.express.mod.ErrorRequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-bunyan-logger", "errorLogger")
@js.native
object errorLogger extends js.Object {
  
  def apply(): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: Options): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
}
