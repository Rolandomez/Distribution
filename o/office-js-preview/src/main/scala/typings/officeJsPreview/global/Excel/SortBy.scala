package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the sort direction.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.SortBy")
@js.native
object SortBy extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.SortBy with String] = js.native
  
  /* "Ascending" */ val ascending: typings.officeJsPreview.Excel.SortBy.ascending with String = js.native
  
  /* "Descending" */ val descending: typings.officeJsPreview.Excel.SortBy.descending with String = js.native
}
