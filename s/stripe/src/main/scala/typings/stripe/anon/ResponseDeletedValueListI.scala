package typings.stripe.anon

import typings.stripe.stripeBooleans.`true`
import typings.stripe.stripeStrings.radarDotvalue_list_item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Radar.DeletedValueListItem> */
trait ResponseDeletedValueListI extends StObject {
  
  /**
    * Always true for a deleted object
    */
  var deleted: `true`
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: radarDotvalue_list_item
}
object ResponseDeletedValueListI {
  
  inline def apply(id: String, lastResponse: ApiVersion): ResponseDeletedValueListI = {
    val __obj = js.Dynamic.literal(deleted = true, id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("radar.value_list_item")
    __obj.asInstanceOf[ResponseDeletedValueListI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseDeletedValueListI] (val x: Self) extends AnyVal {
    
    inline def setDeleted(value: `true`): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setObject(value: radarDotvalue_list_item): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
