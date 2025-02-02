package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the axis from which to get the PivotItems.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotAxis")
@js.native
object PivotAxis extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.PivotAxis & String] = js.native
  
  /* "Column" */ val column: typings.officeJsPreview.Excel.PivotAxis.column & String = js.native
  
  /* "Data" */ val data: typings.officeJsPreview.Excel.PivotAxis.data & String = js.native
  
  /* "Filter" */ val filter: typings.officeJsPreview.Excel.PivotAxis.filter & String = js.native
  
  /* "Row" */ val row: typings.officeJsPreview.Excel.PivotAxis.row & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.PivotAxis.unknown & String = js.native
}
