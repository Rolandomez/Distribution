package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.LAB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `89` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, CMYK_] = js.native
  def raw(from: LAB_): CMYK_ = js.native
}

