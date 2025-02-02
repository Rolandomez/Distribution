package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrdersInstorerefundlineitem
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account that manages the order. This cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the order.
    */
  var orderId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaOrdersInStoreRefundLineItemRequest] = js.undefined
}
object ParamsResourceOrdersInstorerefundlineitem {
  
  inline def apply(): ParamsResourceOrdersInstorerefundlineitem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrdersInstorerefundlineitem]
  }
  
  extension [Self <: ParamsResourceOrdersInstorerefundlineitem](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setRequestBody(value: SchemaOrdersInStoreRefundLineItemRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
