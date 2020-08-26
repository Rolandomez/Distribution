package typings.mssql.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "ConnectionError")
@js.native
class ConnectionError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, code: js.Any) = this()
  var code: String = js.native
}

