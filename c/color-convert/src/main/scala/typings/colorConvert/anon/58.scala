package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.GRAY_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `58` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, GRAY_] = js.native
  def raw(from: CMYK_): GRAY_ = js.native
}

