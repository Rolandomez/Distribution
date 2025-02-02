package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateNatGatewayAddressResult extends StObject {
  
  /**
    * Information about the NAT gateway IP addresses.
    */
  var NatGatewayAddresses: js.UndefOr[NatGatewayAddressList] = js.undefined
  
  /**
    * The NAT gateway ID.
    */
  var NatGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NatGatewayId] = js.undefined
}
object DisassociateNatGatewayAddressResult {
  
  inline def apply(): DisassociateNatGatewayAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateNatGatewayAddressResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateNatGatewayAddressResult] (val x: Self) extends AnyVal {
    
    inline def setNatGatewayAddresses(value: NatGatewayAddressList): Self = StObject.set(x, "NatGatewayAddresses", value.asInstanceOf[js.Any])
    
    inline def setNatGatewayAddressesUndefined: Self = StObject.set(x, "NatGatewayAddresses", js.undefined)
    
    inline def setNatGatewayAddressesVarargs(value: NatGatewayAddress*): Self = StObject.set(x, "NatGatewayAddresses", js.Array(value*))
    
    inline def setNatGatewayId(value: NatGatewayId): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
    
    inline def setNatGatewayIdUndefined: Self = StObject.set(x, "NatGatewayId", js.undefined)
  }
}
