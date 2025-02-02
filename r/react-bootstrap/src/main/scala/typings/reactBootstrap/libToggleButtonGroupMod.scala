package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.libButtonGroupMod.ButtonGroupProps
import typings.reactBootstrap.mod.Omit
import typings.reactBootstrap.reactBootstrapStrings.`type`
import typings.reactBootstrap.reactBootstrapStrings.checkbox
import typings.reactBootstrap.reactBootstrapStrings.defaultValue
import typings.reactBootstrap.reactBootstrapStrings.onChange
import typings.reactBootstrap.reactBootstrapStrings.radio
import typings.reactBootstrap.reactBootstrapStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToggleButtonGroupMod {
  
  @JSImport("react-bootstrap/lib/ToggleButtonGroup", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ToggleButtonGroupProps, js.Object, Any]
  
  trait BaseProps extends StObject {
    
    /**
      * You'll usually want to use string|number|string[]|number[] here,
      * but you can technically use any|any[].
      */
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    /**
      * You'll usually want to use string|number|string[]|number[] here,
      * but you can technically use any|any[].
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object BaseProps {
    
    inline def apply(): BaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CheckboxProps extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Any], Unit]] = js.undefined
    
    var `type`: checkbox
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("checkbox")
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* values */ js.Array[Any] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setType(value: checkbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioProps extends StObject {
    
    /** Required if `type` is set to "radio" */
    var name: String
    
    var onChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var `type`: radio
  }
  object RadioProps {
    
    inline def apply(name: String): RadioProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("radio")
      __obj.asInstanceOf[RadioProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadioProps] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setType(value: radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ToggleButtonGroup = Component[ToggleButtonGroupProps, js.Object, Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ToggleButtonGroupProps = react-bootstrap.react-bootstrap/lib/ToggleButtonGroup.RadioProps & react-bootstrap.react-bootstrap/lib/ToggleButtonGroup.BaseProps & react-bootstrap.react-bootstrap.Omit<react-bootstrap.react-bootstrap/lib/ButtonGroup.ButtonGroupProps, 'onChange'> & react-bootstrap.react-bootstrap.Omit<react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/ToggleButtonGroup.ToggleButtonGroup>, 'defaultValue' | 'type' | 'value' | 'onChange'> | react-bootstrap.react-bootstrap/lib/ToggleButtonGroup.CheckboxProps & react-bootstrap.react-bootstrap/lib/ToggleButtonGroup.BaseProps & react-bootstrap.react-bootstrap.Omit<react-bootstrap.react-bootstrap/lib/ButtonGroup.ButtonGroupProps, 'onChange'> & react-bootstrap.react-bootstrap.Omit<react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/ToggleButtonGroup.ToggleButtonGroup>, 'defaultValue' | 'type' | 'value' | 'onChange'>
  }}}
  to avoid circular code involving: 
  - react-bootstrap.react-bootstrap/lib/ToggleButtonGroup.ToggleButtonGroup
  - react-bootstrap.react-bootstrap/lib/ToggleButtonGroup.ToggleButtonGroupProps
  */
  type ToggleButtonGroupProps = (RadioProps & BaseProps & (Omit[ButtonGroupProps, onChange]) & (Omit[HTMLProps[Any], defaultValue | `type` | value | onChange])) | (CheckboxProps & BaseProps & (Omit[ButtonGroupProps, onChange]) & (Omit[HTMLProps[Any], defaultValue | `type` | value | onChange]))
}
