package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.SpreadsheetOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Spreadsheet")
@js.native
open class Spreadsheet protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Spreadsheet {
  def this(element: Element) = this()
  def this(element: Element, options: SpreadsheetOptions) = this()
}
object Spreadsheet {
  
  @JSGlobal("kendo.ui.Spreadsheet")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Spreadsheet = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Spreadsheet]
  
  /* static member */
  @JSGlobal("kendo.ui.Spreadsheet.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Spreadsheet = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Spreadsheet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
