package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[StackErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
}
object StackError {
  
  inline def apply(): StackError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: StackErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
