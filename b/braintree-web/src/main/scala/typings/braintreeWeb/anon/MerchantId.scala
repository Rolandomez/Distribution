package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantId extends StObject {
  
  var merchantId: String
}
object MerchantId {
  
  inline def apply(merchantId: String): MerchantId = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MerchantId] (val x: Self) extends AnyVal {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
  }
}
