package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddDnsRecordSetRequest extends StObject {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project\}/global/networks/{network\} {project\} is the project number, as in '12345' {network\} is the network name.
    */
  var consumerNetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The DNS record set to add.
    */
  var dnsRecordSet: js.UndefOr[SchemaDnsRecordSet] = js.undefined
  
  /**
    * Required. The name of the private DNS zone in the shared producer host project to which the record set will be added.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddDnsRecordSetRequest {
  
  inline def apply(): SchemaAddDnsRecordSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddDnsRecordSetRequest]
  }
  
  extension [Self <: SchemaAddDnsRecordSetRequest](x: Self) {
    
    inline def setConsumerNetwork(value: String): Self = StObject.set(x, "consumerNetwork", value.asInstanceOf[js.Any])
    
    inline def setConsumerNetworkNull: Self = StObject.set(x, "consumerNetwork", null)
    
    inline def setConsumerNetworkUndefined: Self = StObject.set(x, "consumerNetwork", js.undefined)
    
    inline def setDnsRecordSet(value: SchemaDnsRecordSet): Self = StObject.set(x, "dnsRecordSet", value.asInstanceOf[js.Any])
    
    inline def setDnsRecordSetUndefined: Self = StObject.set(x, "dnsRecordSet", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
