package typings.colorConvert.anon

import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.XYZ_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `35` extends js.Object {
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, XYZ_] = js.native
  def raw(from: HSV_): XYZ_ = js.native
}

