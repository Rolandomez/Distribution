package typings.graphqlToolsUrlLoader.mod

import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchFn extends js.Object {
  def apply(input: RequestInfo): js.Promise[Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
}

