package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ProtectionSelectionMode")
@js.native
object ProtectionSelectionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ProtectionSelectionMode with String] = js.native
  
  /* "None" */ val none: typings.officeJs.Excel.ProtectionSelectionMode.none with String = js.native
  
  /* "Normal" */ val normal: typings.officeJs.Excel.ProtectionSelectionMode.normal with String = js.native
  
  /* "Unlocked" */ val unlocked: typings.officeJs.Excel.ProtectionSelectionMode.unlocked with String = js.native
}
