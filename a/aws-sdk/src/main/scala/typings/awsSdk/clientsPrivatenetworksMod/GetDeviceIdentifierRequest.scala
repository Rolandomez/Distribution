package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceIdentifierRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the device identifier.
    */
  var deviceIdentifierArn: Arn
}
object GetDeviceIdentifierRequest {
  
  inline def apply(deviceIdentifierArn: Arn): GetDeviceIdentifierRequest = {
    val __obj = js.Dynamic.literal(deviceIdentifierArn = deviceIdentifierArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceIdentifierRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeviceIdentifierRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceIdentifierArn(value: Arn): Self = StObject.set(x, "deviceIdentifierArn", value.asInstanceOf[js.Any])
  }
}
