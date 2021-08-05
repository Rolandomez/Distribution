package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for Html Editor dialogs operated with its elements.
  */
trait ASPxClientHtmlEditorEditElementDialog
  extends StObject
     with ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the client object of the "Border color" color editor in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderColorColorEdit(): ASPxClientColorEdit
  
  /**
    * Provides access to the client object of the "Border style" combo box in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderStyleComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Border width" spin editor in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderWidthSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client object of the "Bottom margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetBottomMarginTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "CSS class" combo box in the Html Editor's dialogs (Style Settings).
    */
  def GetCssClassNameComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Left margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetLeftMarginTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "Right margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetRightMarginTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "Top margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetTopMarginTextBox(): ASPxClientTextBox
}
object ASPxClientHtmlEditorEditElementDialog {
  
  inline def apply(
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderStyleComboBox: () => ASPxClientComboBox,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetBottomMarginTextBox: () => ASPxClientTextBox,
    GetCancelButton: () => ASPxClientButton,
    GetCssClassNameComboBox: () => ASPxClientComboBox,
    GetFormLayout: () => ASPxClientFormLayout,
    GetLeftMarginTextBox: () => ASPxClientTextBox,
    GetOkButton: () => ASPxClientButton,
    GetRightMarginTextBox: () => ASPxClientTextBox,
    GetTopMarginTextBox: () => ASPxClientTextBox
  ): ASPxClientHtmlEditorEditElementDialog = {
    val __obj = js.Dynamic.literal(GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderStyleComboBox = js.Any.fromFunction0(GetBorderStyleComboBox), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetBottomMarginTextBox = js.Any.fromFunction0(GetBottomMarginTextBox), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCssClassNameComboBox = js.Any.fromFunction0(GetCssClassNameComboBox), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetLeftMarginTextBox = js.Any.fromFunction0(GetLeftMarginTextBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetRightMarginTextBox = js.Any.fromFunction0(GetRightMarginTextBox), GetTopMarginTextBox = js.Any.fromFunction0(GetTopMarginTextBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorEditElementDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorEditElementDialog](x: Self) {
    
    inline def setGetBorderColorColorEdit(value: () => ASPxClientColorEdit): Self = StObject.set(x, "GetBorderColorColorEdit", js.Any.fromFunction0(value))
    
    inline def setGetBorderStyleComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetBorderStyleComboBox", js.Any.fromFunction0(value))
    
    inline def setGetBorderWidthSpinEdit(value: () => ASPxClientSpinEdit): Self = StObject.set(x, "GetBorderWidthSpinEdit", js.Any.fromFunction0(value))
    
    inline def setGetBottomMarginTextBox(value: () => ASPxClientTextBox): Self = StObject.set(x, "GetBottomMarginTextBox", js.Any.fromFunction0(value))
    
    inline def setGetCssClassNameComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetCssClassNameComboBox", js.Any.fromFunction0(value))
    
    inline def setGetLeftMarginTextBox(value: () => ASPxClientTextBox): Self = StObject.set(x, "GetLeftMarginTextBox", js.Any.fromFunction0(value))
    
    inline def setGetRightMarginTextBox(value: () => ASPxClientTextBox): Self = StObject.set(x, "GetRightMarginTextBox", js.Any.fromFunction0(value))
    
    inline def setGetTopMarginTextBox(value: () => ASPxClientTextBox): Self = StObject.set(x, "GetTopMarginTextBox", js.Any.fromFunction0(value))
  }
}
