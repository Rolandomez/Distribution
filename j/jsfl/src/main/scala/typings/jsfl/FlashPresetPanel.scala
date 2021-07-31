package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashPresetPanel extends StObject {
  
  def addNewItem(): js.Any
  
  def applyPreset(): js.Any
  
  def deleteFolder(): js.Any
  
  def deleteItem(): js.Any
  
  def expandFolder(): js.Any
  
  def exportItem(): js.Any
  
  def findItemIndex(): js.Any
  
  def getSelectedItems(): js.Any
  
  def importItem(): js.Any
  
  def moveToFolder(): js.Any
  
  def newFolder(): js.Any
  
  def renameItem(): js.Any
  
  def selectItem(): js.Any
}
object FlashPresetPanel {
  
  @scala.inline
  def apply(
    addNewItem: () => js.Any,
    applyPreset: () => js.Any,
    deleteFolder: () => js.Any,
    deleteItem: () => js.Any,
    expandFolder: () => js.Any,
    exportItem: () => js.Any,
    findItemIndex: () => js.Any,
    getSelectedItems: () => js.Any,
    importItem: () => js.Any,
    moveToFolder: () => js.Any,
    newFolder: () => js.Any,
    renameItem: () => js.Any,
    selectItem: () => js.Any
  ): FlashPresetPanel = {
    val __obj = js.Dynamic.literal(addNewItem = js.Any.fromFunction0(addNewItem), applyPreset = js.Any.fromFunction0(applyPreset), deleteFolder = js.Any.fromFunction0(deleteFolder), deleteItem = js.Any.fromFunction0(deleteItem), expandFolder = js.Any.fromFunction0(expandFolder), exportItem = js.Any.fromFunction0(exportItem), findItemIndex = js.Any.fromFunction0(findItemIndex), getSelectedItems = js.Any.fromFunction0(getSelectedItems), importItem = js.Any.fromFunction0(importItem), moveToFolder = js.Any.fromFunction0(moveToFolder), newFolder = js.Any.fromFunction0(newFolder), renameItem = js.Any.fromFunction0(renameItem), selectItem = js.Any.fromFunction0(selectItem))
    __obj.asInstanceOf[FlashPresetPanel]
  }
  
  @scala.inline
  implicit class FlashPresetPanelMutableBuilder[Self <: FlashPresetPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddNewItem(value: () => js.Any): Self = StObject.set(x, "addNewItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyPreset(value: () => js.Any): Self = StObject.set(x, "applyPreset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteFolder(value: () => js.Any): Self = StObject.set(x, "deleteFolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteItem(value: () => js.Any): Self = StObject.set(x, "deleteItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandFolder(value: () => js.Any): Self = StObject.set(x, "expandFolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportItem(value: () => js.Any): Self = StObject.set(x, "exportItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindItemIndex(value: () => js.Any): Self = StObject.set(x, "findItemIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItems(value: () => js.Any): Self = StObject.set(x, "getSelectedItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImportItem(value: () => js.Any): Self = StObject.set(x, "importItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveToFolder(value: () => js.Any): Self = StObject.set(x, "moveToFolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFolder(value: () => js.Any): Self = StObject.set(x, "newFolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenameItem(value: () => js.Any): Self = StObject.set(x, "renameItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectItem(value: () => js.Any): Self = StObject.set(x, "selectItem", js.Any.fromFunction0(value))
  }
}
