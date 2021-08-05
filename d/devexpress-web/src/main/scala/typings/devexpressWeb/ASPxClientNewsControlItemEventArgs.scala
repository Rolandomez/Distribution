package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern tail clicking within the control's items.
  */
trait ASPxClientNewsControlItemEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
  
  /**
    * Gets the name that uniquely identifies the processed item.
    */
  var name: js.Any
}
object ASPxClientNewsControlItemEventArgs {
  
  inline def apply(htmlElement: js.Any, htmlEvent: js.Any, name: js.Any, processOnServer: Boolean): ASPxClientNewsControlItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNewsControlItemEventArgs]
  }
  
  extension [Self <: ASPxClientNewsControlItemEventArgs](x: Self) {
    
    inline def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
