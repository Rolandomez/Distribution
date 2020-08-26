package typings.jqueryAjaxfile.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Should extends ShouldAssertion {
  var not: ShouldAssertion = js.native
  def fail(actual: js.Any, expected: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: String): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): Unit = js.native
}

