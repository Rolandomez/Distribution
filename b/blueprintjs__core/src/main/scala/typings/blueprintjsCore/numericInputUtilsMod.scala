package typings.blueprintjsCore

import typings.react.mod.KeyboardEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", JSImport.Namespace)
@js.native
object numericInputUtilsMod extends js.Object {
  def clampValue(value: Double): Double = js.native
  def clampValue(value: Double, min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
  def clampValue(value: Double, min: Double): Double = js.native
  def clampValue(value: Double, min: Double, max: Double): Double = js.native
  def getValueOrEmptyValue(): String = js.native
  def getValueOrEmptyValue(value: String): String = js.native
  def getValueOrEmptyValue(value: Double): String = js.native
  def isValidNumericKeyboardEvent(e: KeyboardEvent[Element]): Boolean = js.native
  def isValueNumeric(value: String): Boolean = js.native
  def sanitizeNumericInput(value: String): String = js.native
  def toMaxPrecision(value: Double, maxPrecision: Double): Double = js.native
}

