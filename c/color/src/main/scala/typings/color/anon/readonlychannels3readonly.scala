package typings.color.anon

import typings.color.colorNumbers.`3`
import typings.color.colorStrings.rgb
import typings.colorConvert.anon.Raw
import typings.colorConvert.anon.`0`
import typings.colorConvert.anon.`10`
import typings.colorConvert.anon.`11`
import typings.colorConvert.anon.`12`
import typings.colorConvert.anon.`1`
import typings.colorConvert.anon.`2`
import typings.colorConvert.anon.`4`
import typings.colorConvert.anon.`5`
import typings.colorConvert.anon.`6`
import typings.colorConvert.anon.`7`
import typings.colorConvert.anon.`8`
import typings.colorConvert.anon.`9`
import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.LCH_
import typings.colorConvert.conversionsMod.RGB_
import typings.colorConvert.conversionsMod.XYZ_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined { readonly channels :3,  readonly labels :'rgb', readonly hsl (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.HSL, readonly hsv (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.HSV, readonly hwb (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.HWB, readonly cmyk (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.CMYK, readonly keyword (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.KEYWORD, readonly xyz (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.XYZ, readonly lab (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.LAB, readonly ansi16 (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.ANSI16, readonly ansi256 (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.ANSI256, readonly hex (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.HEX, readonly hcg (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.HCG, readonly apple (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.APPLE, readonly gray (rgb : color-convert.color-convert/conversions.RGB): color-convert.color-convert/conversions.GRAY} & color-convert.color-convert/route.rgb & {[ F in keyof color-convert.color-convert/route.rgb ]: {  raw :color-convert.color-convert/route.rgb[F]}} */
@js.native
trait readonlychannels3readonly extends js.Object {
  var ansi16: `11` = js.native
  var ansi256: `2` = js.native
  var apple: Raw = js.native
  val channels: `3` = js.native
  var cmyk: `4` = js.native
  var gray: `1` = js.native
  var hcg: `5` = js.native
  var hex: `9` = js.native
  var hsl: `10` = js.native
  var hsv: `7` = js.native
  var hwb: typings.colorConvert.anon.`3` = js.native
  var keyword: `0` = js.native
  var lab: `12` = js.native
  val labels: rgb = js.native
  var lch: `8` = js.native
  var xyz: `6` = js.native
  def ansi16(rgb: RGB_): ANSI16_ = js.native
  def ansi256(rgb: RGB_): ANSI256_ = js.native
  def apple(rgb: RGB_): APPLE_ = js.native
  def cmyk(rgb: RGB_): CMYK_ = js.native
  def gray(rgb: RGB_): GRAY_ = js.native
  def hcg(rgb: RGB_): HCG_ = js.native
  def hex(rgb: RGB_): HEX_ = js.native
  def hsl(rgb: RGB_): HSL_ = js.native
  def hsv(rgb: RGB_): HSV_ = js.native
  def hwb(rgb: RGB_): HWB_ = js.native
  def keyword(rgb: RGB_): KEYWORD_ = js.native
  def lab(rgb: RGB_): LAB_ = js.native
  def lch(from: RGB_): LCH_ = js.native
  def xyz(rgb: RGB_): XYZ_ = js.native
}

