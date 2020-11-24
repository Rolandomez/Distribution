package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the save behavior for Workbook.save API.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SaveBehavior")
@js.native
object SaveBehavior extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.SaveBehavior with String] = js.native
  
  /* "Prompt" */ val prompt: typings.officeJsPreview.Excel.SaveBehavior.prompt with String = js.native
  
  /* "Save" */ val save: typings.officeJsPreview.Excel.SaveBehavior.save with String = js.native
}
