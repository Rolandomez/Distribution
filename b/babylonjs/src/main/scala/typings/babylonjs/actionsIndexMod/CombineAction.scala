package typings.babylonjs.actionsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Actions/index", "CombineAction")
@js.native
class CombineAction protected ()
  extends typings.babylonjs.directActionsMod.CombineAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param children defines the list of aggregated animations to run
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, children: js.Array[typings.babylonjs.actionMod.Action]) = this()
  def this(
    triggerOptions: js.Any,
    children: js.Array[typings.babylonjs.actionMod.Action],
    condition: typings.babylonjs.conditionMod.Condition
  ) = this()
}
