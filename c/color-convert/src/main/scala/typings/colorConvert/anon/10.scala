package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `10` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, HSL_] = js.native
  def raw(from: RGB_): HSL_ = js.native
}

