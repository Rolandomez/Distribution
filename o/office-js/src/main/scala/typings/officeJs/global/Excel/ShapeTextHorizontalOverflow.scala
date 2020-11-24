package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the horizontal overflow for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextHorizontalOverflow")
@js.native
object ShapeTextHorizontalOverflow extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeTextHorizontalOverflow with String] = js.native
  
  /* "Clip" */ val clip: typings.officeJs.Excel.ShapeTextHorizontalOverflow.clip with String = js.native
  
  /* "Overflow" */ val overflow: typings.officeJs.Excel.ShapeTextHorizontalOverflow.overflow with String = js.native
}
