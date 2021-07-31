package typings.agGrid.eventsMod

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellValueChangedEvent
  extends StObject
     with CellEvent {
  
  var newValue: js.Any
  
  var oldValue: js.Any
}
object CellValueChangedEvent {
  
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    newValue: js.Any,
    node: RowNode,
    oldValue: js.Any,
    rowIndex: Double,
    rowPinned: String,
    `type`: String,
    value: js.Any
  ): CellValueChangedEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowPinned = rowPinned.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellValueChangedEvent]
  }
  
  @scala.inline
  implicit class CellValueChangedEventMutableBuilder[Self <: CellValueChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
