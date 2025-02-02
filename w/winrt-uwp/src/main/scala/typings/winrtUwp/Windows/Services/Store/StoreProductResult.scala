package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides response data for a request to retrieve details about the current app. */
trait StoreProductResult extends StObject {
  
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError
  
  /** Gets info about the current app. */
  var product: StoreProduct
}
object StoreProductResult {
  
  inline def apply(extendedError: WinRTError, product: StoreProduct): StoreProductResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreProductResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreProductResult] (val x: Self) extends AnyVal {
    
    inline def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: StoreProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
  }
}
