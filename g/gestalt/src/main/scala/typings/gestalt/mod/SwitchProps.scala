package typings.gestalt.mod

import typings.gestalt.anon.ValueBoolean
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchProps extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var onChange: AbstractEventHandler[SyntheticEvent[HTMLInputElement, Event], ValueBoolean]
  
  var switched: js.UndefOr[Boolean] = js.undefined
}
object SwitchProps {
  
  inline def apply(
    id: String,
    onChange: /* arg */ ValueBoolean & (typings.gestalt.anon.Event[SyntheticEvent[HTMLInputElement, Event]]) => Unit
  ): SwitchProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[SwitchProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(
      value: /* arg */ ValueBoolean & (typings.gestalt.anon.Event[SyntheticEvent[HTMLInputElement, Event]]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setSwitched(value: Boolean): Self = StObject.set(x, "switched", value.asInstanceOf[js.Any])
    
    inline def setSwitchedUndefined: Self = StObject.set(x, "switched", js.undefined)
  }
}
