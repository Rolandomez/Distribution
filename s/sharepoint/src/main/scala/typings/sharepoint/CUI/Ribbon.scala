package typings.sharepoint.CUI

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ribbon
  extends StObject
     with Root {
  
  def addChildAtIndex(child: Any, index: Double): scala.Unit
  
  def addContextualGroup(id: String, title: String, color: Any, command: String): Any
  
  def get_contextualGroupIds(): js.Array[String]
  
  def hideContextualGroup(id: String): scala.Unit
  
  def refresh(): scala.Unit
  
  def removeContextualGroup(id: String): scala.Unit
  
  def setFocus(): scala.Unit
  
  def setFocusOnCurrentTab(): scala.Unit
  
  def setFocusOnRibbon(): scala.Unit
  
  def showContextualGroup(id: String): scala.Unit
}
object Ribbon {
  
  inline def apply(
    _lastHeightUpdate: Double,
    _lastLeftUpdate: Double,
    _lastTopUpdate: Double,
    _lastWidthUpdate: Double,
    addChild: Component => scala.Unit,
    addChildAtIndex: (Any, Double) => scala.Unit,
    addContextualGroup: (String, String, Any, String) => Any,
    appendChildrenToElement: Element => scala.Unit,
    createChildArray: () => scala.Unit,
    dispose: () => scala.Unit,
    doDelayedInit: () => scala.Unit,
    ensureCorrectChildType: () => scala.Unit,
    ensureDOMElementAndEmpty: () => scala.Unit,
    getChild: String => Component,
    getChildByTitle: String => Component,
    getTextValue: () => String,
    get_contextualGroupIds: () => js.Array[String],
    get_cssClass: () => String,
    get_description: () => String,
    get_domElementTagName: () => String,
    get_enabled: () => Boolean,
    get_id: () => String,
    get_needsDelayIniting: () => Boolean,
    get_parent: () => Component,
    get_root: () => Component,
    get_title: () => String,
    get_visible: () => Boolean,
    get_visibleInDOM: () => Boolean,
    hideContextualGroup: String => scala.Unit,
    initRootMember: Component => Any,
    onEnabledChanged: Boolean => Any,
    onMenuClosed: () => scala.Unit,
    raiseCommandEvent: (String, CommandType, Any) => Any,
    receiveFocus: () => scala.Unit,
    refresh: () => scala.Unit,
    removeChild: String => scala.Unit,
    removeChildren: () => scala.Unit,
    removeContextualGroup: String => scala.Unit,
    setFocus: () => scala.Unit,
    setFocusOnCurrentTab: () => scala.Unit,
    setFocusOnRibbon: () => scala.Unit,
    set_description: String => String,
    set_enabled: Boolean => Boolean,
    set_id: String => scala.Unit,
    set_parent: Component => Component,
    set_title: String => String,
    set_visible: Boolean => Boolean,
    showContextualGroup: String => scala.Unit,
    valueIsDirty: Double => Boolean
  ): Ribbon = {
    val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1(addChild), addChildAtIndex = js.Any.fromFunction2(addChildAtIndex), addContextualGroup = js.Any.fromFunction4(addContextualGroup), appendChildrenToElement = js.Any.fromFunction1(appendChildrenToElement), createChildArray = js.Any.fromFunction0(createChildArray), dispose = js.Any.fromFunction0(dispose), doDelayedInit = js.Any.fromFunction0(doDelayedInit), ensureCorrectChildType = js.Any.fromFunction0(ensureCorrectChildType), ensureDOMElementAndEmpty = js.Any.fromFunction0(ensureDOMElementAndEmpty), getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getTextValue = js.Any.fromFunction0(getTextValue), get_contextualGroupIds = js.Any.fromFunction0(get_contextualGroupIds), get_cssClass = js.Any.fromFunction0(get_cssClass), get_description = js.Any.fromFunction0(get_description), get_domElementTagName = js.Any.fromFunction0(get_domElementTagName), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_needsDelayIniting = js.Any.fromFunction0(get_needsDelayIniting), get_parent = js.Any.fromFunction0(get_parent), get_root = js.Any.fromFunction0(get_root), get_title = js.Any.fromFunction0(get_title), get_visible = js.Any.fromFunction0(get_visible), get_visibleInDOM = js.Any.fromFunction0(get_visibleInDOM), hideContextualGroup = js.Any.fromFunction1(hideContextualGroup), initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = js.Any.fromFunction0(onMenuClosed), raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = js.Any.fromFunction0(receiveFocus), refresh = js.Any.fromFunction0(refresh), removeChild = js.Any.fromFunction1(removeChild), removeChildren = js.Any.fromFunction0(removeChildren), removeContextualGroup = js.Any.fromFunction1(removeContextualGroup), setFocus = js.Any.fromFunction0(setFocus), setFocusOnCurrentTab = js.Any.fromFunction0(setFocusOnCurrentTab), setFocusOnRibbon = js.Any.fromFunction0(setFocusOnRibbon), set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1(set_id), set_parent = js.Any.fromFunction1(set_parent), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), showContextualGroup = js.Any.fromFunction1(showContextualGroup), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
    __obj.asInstanceOf[Ribbon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ribbon] (val x: Self) extends AnyVal {
    
    inline def setAddChildAtIndex(value: (Any, Double) => scala.Unit): Self = StObject.set(x, "addChildAtIndex", js.Any.fromFunction2(value))
    
    inline def setAddContextualGroup(value: (String, String, Any, String) => Any): Self = StObject.set(x, "addContextualGroup", js.Any.fromFunction4(value))
    
    inline def setGet_contextualGroupIds(value: () => js.Array[String]): Self = StObject.set(x, "get_contextualGroupIds", js.Any.fromFunction0(value))
    
    inline def setHideContextualGroup(value: String => scala.Unit): Self = StObject.set(x, "hideContextualGroup", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: () => scala.Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setRemoveContextualGroup(value: String => scala.Unit): Self = StObject.set(x, "removeContextualGroup", js.Any.fromFunction1(value))
    
    inline def setSetFocus(value: () => scala.Unit): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
    
    inline def setSetFocusOnCurrentTab(value: () => scala.Unit): Self = StObject.set(x, "setFocusOnCurrentTab", js.Any.fromFunction0(value))
    
    inline def setSetFocusOnRibbon(value: () => scala.Unit): Self = StObject.set(x, "setFocusOnRibbon", js.Any.fromFunction0(value))
    
    inline def setShowContextualGroup(value: String => scala.Unit): Self = StObject.set(x, "showContextualGroup", js.Any.fromFunction1(value))
  }
}
