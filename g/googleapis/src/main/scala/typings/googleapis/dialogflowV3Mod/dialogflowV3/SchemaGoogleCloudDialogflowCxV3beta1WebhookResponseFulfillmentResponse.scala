package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse extends StObject {
  
  /**
    * Merge behavior for `messages`.
    */
  var mergeBehavior: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of rich message responses to present to the user.
    */
  var messages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1ResponseMessage]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse](x: Self) {
    
    inline def setMergeBehavior(value: String): Self = StObject.set(x, "mergeBehavior", value.asInstanceOf[js.Any])
    
    inline def setMergeBehaviorNull: Self = StObject.set(x, "mergeBehavior", null)
    
    inline def setMergeBehaviorUndefined: Self = StObject.set(x, "mergeBehavior", js.undefined)
    
    inline def setMessages(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1ResponseMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1ResponseMessage*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
