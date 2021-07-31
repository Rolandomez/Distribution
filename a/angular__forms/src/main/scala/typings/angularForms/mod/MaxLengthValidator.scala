package typings.angularForms.mod

import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.SimpleChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "MaxLengthValidator")
@js.native
class MaxLengthValidator ()
  extends StObject
     with Validator
     with OnChanges {
  
  var _createValidator: js.Any = js.native
  
  var _onChange: js.Any = js.native
  
  var _validator: js.Any = js.native
  
  /**
    * @description
    * Tracks changes to the the maximum length bound to this directive.
    */
  var maxlength: String | Double = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  
  /**
    * Registers a callback function to call when the validator inputs change.
    * @nodoc
    */
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MMaxLengthValidator(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * @description
    * Method that performs synchronous validation against the provided control.
    *
    * @param control The control to validate against.
    *
    * @returns A map of validation errors if validation fails,
    * otherwise null.
    */
  /* CompleteClass */
  override def validate(control: AbstractControl): ValidationErrors | Null = js.native
}
