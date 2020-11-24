package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object paginationMod {
  
  type StateReducer = js.Function3[
    typings.baseui.baseuiStrings.change_, 
    /* changes */ typings.baseui.paginationMod.State, 
    /* currentState */ typings.baseui.paginationMod.State, 
    typings.baseui.paginationMod.State
  ]
}
