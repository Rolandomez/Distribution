package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWirelessDeviceWithFuotaTaskRequest extends StObject {
  
  var Id: FuotaTaskId
  
  var WirelessDeviceId: typings.awsSdk.clientsIotwirelessMod.WirelessDeviceId
}
object AssociateWirelessDeviceWithFuotaTaskRequest {
  
  inline def apply(Id: FuotaTaskId, WirelessDeviceId: WirelessDeviceId): AssociateWirelessDeviceWithFuotaTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], WirelessDeviceId = WirelessDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWirelessDeviceWithFuotaTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateWirelessDeviceWithFuotaTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceId(value: WirelessDeviceId): Self = StObject.set(x, "WirelessDeviceId", value.asInstanceOf[js.Any])
  }
}
