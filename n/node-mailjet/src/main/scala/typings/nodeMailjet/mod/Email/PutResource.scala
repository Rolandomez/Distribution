package typings.nodeMailjet.mod.Email

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResource extends js.Object {
  
  def id(value: String): PutResource = js.native
  
  def request(params: js.Object): js.Promise[PutResponse] = js.native
  def request(params: js.Object, callback: js.Function2[/* error */ Error, /* res */ PutResponse, Unit]): js.Promise[PutResponse] = js.native
}
