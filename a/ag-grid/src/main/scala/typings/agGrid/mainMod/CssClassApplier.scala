package typings.agGrid.mainMod

import typings.agGrid.colDefMod.AbstractColDef
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "CssClassApplier")
@js.native
class CssClassApplier ()
  extends typings.agGrid.cssClassApplierMod.CssClassApplier
/* static members */
@JSImport("ag-grid/dist/lib/main", "CssClassApplier")
@js.native
object CssClassApplier extends js.Object {
  
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  
  def addHeaderClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.columnGroupMod.ColumnGroup
  ): Unit = js.native
  
  def addToolPanelClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
}
