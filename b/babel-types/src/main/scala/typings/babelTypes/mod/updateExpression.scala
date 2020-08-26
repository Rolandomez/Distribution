package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PlussignPlussign
import typings.babelTypes.babelTypesStrings.`--`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "updateExpression")
@js.native
object updateExpression extends js.Object {
  def apply(): UpdateExpression_ = js.native
  def apply(operator: js.UndefOr[scala.Nothing], argument: js.UndefOr[scala.Nothing], prefix: Boolean): UpdateExpression_ = js.native
  def apply(operator: js.UndefOr[scala.Nothing], argument: Expression): UpdateExpression_ = js.native
  def apply(operator: js.UndefOr[scala.Nothing], argument: Expression, prefix: Boolean): UpdateExpression_ = js.native
  def apply(operator: PlussignPlussign): UpdateExpression_ = js.native
  def apply(operator: PlussignPlussign, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UpdateExpression_ = js.native
  def apply(operator: PlussignPlussign, argument: Expression): UpdateExpression_ = js.native
  def apply(operator: PlussignPlussign, argument: Expression, prefix: Boolean): UpdateExpression_ = js.native
  def apply(operator: `--`): UpdateExpression_ = js.native
  def apply(operator: `--`, argument: js.UndefOr[scala.Nothing], prefix: Boolean): UpdateExpression_ = js.native
  def apply(operator: `--`, argument: Expression): UpdateExpression_ = js.native
  def apply(operator: `--`, argument: Expression, prefix: Boolean): UpdateExpression_ = js.native
}

