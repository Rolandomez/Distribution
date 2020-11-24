package typings.easyXapi.mod

import typings.bunyan.mod.^
import typings.express.mod.Application_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("app")
  var app_Original: Application_ = js.native
  
  var express: js.Any = js.native
  
  def listen(): Unit = js.native
  
  var log: ^ = js.native
  
  var server: Server = js.native
}
