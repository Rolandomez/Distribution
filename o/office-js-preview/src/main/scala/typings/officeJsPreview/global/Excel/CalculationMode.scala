package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.CalculationMode")
@js.native
object CalculationMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.CalculationMode with String] = js.native
  
  /* "Automatic" */ val automatic: typings.officeJsPreview.Excel.CalculationMode.automatic with String = js.native
  
  /* "AutomaticExceptTables" */ val automaticExceptTables: typings.officeJsPreview.Excel.CalculationMode.automaticExceptTables with String = js.native
  
  /* "Manual" */ val manual: typings.officeJsPreview.Excel.CalculationMode.manual with String = js.native
}
