package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendDefaultsClientPolicy extends StObject {
  
  /**
    * The Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[VirtualNodeSpecBackendDefaultsClientPolicyTls] = js.undefined
}
object VirtualNodeSpecBackendDefaultsClientPolicy {
  
  inline def apply(): VirtualNodeSpecBackendDefaultsClientPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicy]
  }
  
  extension [Self <: VirtualNodeSpecBackendDefaultsClientPolicy](x: Self) {
    
    inline def setTls(value: VirtualNodeSpecBackendDefaultsClientPolicyTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
