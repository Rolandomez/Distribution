package typings.vueRouter.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PositionResult extends js.Object

object _PositionResult {
  @scala.inline
  def Position(x: Double, y: Double): _PositionResult = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[_PositionResult]
  }
  @scala.inline
  def Offset(selector: String): _PositionResult = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[_PositionResult]
  }
}

