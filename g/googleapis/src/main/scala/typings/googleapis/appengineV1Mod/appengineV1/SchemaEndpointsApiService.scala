package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndpointsApiService extends StObject {
  
  /**
    * Endpoints service configuration ID as specified by the Service Management API. For example "2016-09-19r1".By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED. This means that Endpoints starts up with a particular configuration ID. When a new configuration is rolled out, Endpoints must be given the new configuration ID. The config_id field is used to give the configuration ID and is required in this case.Endpoints also has a rollout strategy called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest configuration and does not need the configuration ID. In this case, config_id must be omitted.
    */
  var configId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enable or disable trace sampling. By default, this is set to false for enabled.
    */
  var disableTraceSampling: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Endpoints service name which is the name of the "service" resource in the Service Management API. For example "myapi.endpoints.myproject.cloud.goog"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must be omitted.
    */
  var rolloutStrategy: js.UndefOr[String | Null] = js.undefined
}
object SchemaEndpointsApiService {
  
  inline def apply(): SchemaEndpointsApiService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpointsApiService]
  }
  
  extension [Self <: SchemaEndpointsApiService](x: Self) {
    
    inline def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigIdNull: Self = StObject.set(x, "configId", null)
    
    inline def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    inline def setDisableTraceSampling(value: Boolean): Self = StObject.set(x, "disableTraceSampling", value.asInstanceOf[js.Any])
    
    inline def setDisableTraceSamplingNull: Self = StObject.set(x, "disableTraceSampling", null)
    
    inline def setDisableTraceSamplingUndefined: Self = StObject.set(x, "disableTraceSampling", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRolloutStrategy(value: String): Self = StObject.set(x, "rolloutStrategy", value.asInstanceOf[js.Any])
    
    inline def setRolloutStrategyNull: Self = StObject.set(x, "rolloutStrategy", null)
    
    inline def setRolloutStrategyUndefined: Self = StObject.set(x, "rolloutStrategy", js.undefined)
  }
}
