package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pinning {
  
  type columnPinHandler = js.Function2[
    /* colDef */ typings.uiGrid.mod.pinning.IColumnDef, 
    /* container */ java.lang.String, 
    scala.Unit
  ]
}
