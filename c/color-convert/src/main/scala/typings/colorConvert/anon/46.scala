package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.HWB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `46` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, CMYK_] = js.native
  def raw(from: HWB_): CMYK_ = js.native
}

