package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisPatch
  extends StObject
     with StandardParameters {
  
  /**
    * If set to true, and the api is not found, a new api will be created. In this situation, `update_mask` is ignored.
    */
  var allowMissing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Resource name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApi] = js.undefined
  
  /**
    * The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a "*" is specified, all fields are updated, including fields that are unspecified/default in the request.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsApisPatch {
  
  inline def apply(): ParamsResourceProjectsLocationsApisPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisPatch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisPatch](x: Self) {
    
    inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaApi): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
