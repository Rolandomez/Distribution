package typings.reduxApiMiddleware.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", "RequestError")
@js.native
class RequestError protected () extends Error {
  def this(message: String) = this()
  @JSName("name")
  var name_RequestError: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.RequestError = js.native
}

