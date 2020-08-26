package typings.nodeFetch.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "FetchError")
@js.native
class FetchError protected () extends Error {
  def this(message: String, `type`: String) = this()
  def this(message: String, `type`: String, systemError: SystemError) = this()
  var code: js.UndefOr[String] = js.native
  var errno: js.UndefOr[String] = js.native
  @JSName("name")
  var name_FetchError: typings.nodeFetch.nodeFetchStrings.FetchError = js.native
  var `type`: String = js.native
}

