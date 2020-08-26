package typings.xmlCore.errorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core/dist/types/error", "XmlError")
@js.native
class XmlError protected () extends Error {
  def this(code: XE, args: js.Any*) = this()
  var code: Double = js.native
  val prefix: /* "XMLJS" */ String = js.native
}

