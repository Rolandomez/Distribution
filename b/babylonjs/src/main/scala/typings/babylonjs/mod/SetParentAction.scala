package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SetParentAction")
@js.native
class SetParentAction protected ()
  extends typings.babylonjs.legacyMod.SetParentAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the target containing the parent property
    * @param parent defines from where the animation should start (animation frame)
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, target: js.Any, parent: js.Any) = this()
  def this(
    triggerOptions: js.Any,
    target: js.Any,
    parent: js.Any,
    condition: typings.babylonjs.conditionMod.Condition
  ) = this()
}
