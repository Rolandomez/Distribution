package typings.sshpk.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "KeyParseError")
@js.native
class KeyParseError protected () extends Error {
  def this(name: String, format: String, innerErr: js.Any) = this()
}

