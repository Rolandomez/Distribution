package typings.reactRelay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheConfig extends StObject {
  
  var cacheConfig: js.UndefOr[typings.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig | Null] = js.undefined
  
  var fetchPolicy: js.UndefOr[typings.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy] = js.undefined
}
object CacheConfig {
  
  inline def apply(): CacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheConfig] (val x: Self) extends AnyVal {
    
    inline def setCacheConfig(value: typings.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
    
    inline def setCacheConfigNull: Self = StObject.set(x, "cacheConfig", null)
    
    inline def setCacheConfigUndefined: Self = StObject.set(x, "cacheConfig", js.undefined)
    
    inline def setFetchPolicy(value: typings.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
  }
}
