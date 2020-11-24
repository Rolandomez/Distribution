package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ConnectorType")
@js.native
object ConnectorType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ConnectorType with String] = js.native
  
  /* "Curve" */ val curve: typings.officeJs.Excel.ConnectorType.curve with String = js.native
  
  /* "Elbow" */ val elbow: typings.officeJs.Excel.ConnectorType.elbow with String = js.native
  
  /* "Straight" */ val straight: typings.officeJs.Excel.ConnectorType.straight with String = js.native
}
