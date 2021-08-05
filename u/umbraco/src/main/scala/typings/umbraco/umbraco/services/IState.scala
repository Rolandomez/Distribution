package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*Tracks the parent object for complex editors by exposing it as an object reference via editorState.current.entity
  * it is possible to modify this object, so should be used with care */
trait IState extends StObject {
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getCurrent
    * @methodOf umbraco.services.editorState
    * @function
    *
    * @description
    * Returns an object reference to the current editor entity.
    * the entity is the root object of the editor.
    * EditorState is used by property/parameter editors that need
    * access to the entire entity being edited, not just the property/parameter
    *
    * editorState.current can not be overwritten, you should only read values from it
    * since modifying individual properties should be handled by the property editors
    */
  def getCurrent(): js.Any
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#reset
    * @methodOf umbraco.services.editorState
    * @function
    *
    * @description
    * Since the editorstate entity is read-only, you cannot set it to null
    * only through the reset() method
    */
  def reset(): Unit
  
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#set
    * @methodOf umbraco.services.editorState
    * @function
    *
    * @description
    * Sets the current entity object for the currently active editor
    * This is only used when implementing an editor with a complex model
    * like the content editor, where the model is modified by several
    * child controllers.
    */
  def set(entity: js.Object): Unit
}
object IState {
  
  inline def apply(getCurrent: () => js.Any, reset: () => Unit, set: js.Object => Unit): IState = {
    val __obj = js.Dynamic.literal(getCurrent = js.Any.fromFunction0(getCurrent), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IState]
  }
  
  extension [Self <: IState](x: Self) {
    
    inline def setGetCurrent(value: () => js.Any): Self = StObject.set(x, "getCurrent", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSet(value: js.Object => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
