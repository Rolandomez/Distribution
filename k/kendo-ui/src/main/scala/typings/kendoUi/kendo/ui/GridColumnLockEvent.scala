package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnLockEvent
  extends StObject
     with GridEvent {
  
  var column: js.UndefOr[Any] = js.undefined
}
object GridColumnLockEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridColumnLockEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnLockEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridColumnLockEvent] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
  }
}
