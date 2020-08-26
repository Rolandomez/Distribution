package typings.formatjsIntlRelativetimeformat.mod

import typings.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.literal
import typings.std.Intl.NumberFormatPartTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.formatjsIntlRelativetimeformat.mod.LiteralPart
  - typings.formatjsIntlRelativetimeformat.mod.RelativeTimeFormatNumberPart
*/
trait Part extends js.Object

object Part {
  @scala.inline
  def LiteralPart(`type`: literal, value: String): Part = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
  @scala.inline
  def RelativeTimeFormatNumberPart(`type`: NumberFormatPartTypes, unit: Unit, value: String): Part = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
}

