package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object checkboxMod {
  
  type StateReducer = js.Function4[
    /* stateType */ java.lang.String, 
    /* nextState */ typings.baseui.checkboxMod.CheckboxState, 
    /* currentState */ typings.baseui.checkboxMod.CheckboxState, 
    /* event */ typings.react.mod.SyntheticEvent[typings.std.HTMLInputElement, typings.std.Event], 
    typings.baseui.checkboxMod.CheckboxState
  ]
}
