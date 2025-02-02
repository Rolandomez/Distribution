package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProcessorsEnable
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The processor resource name to be enabled.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3EnableProcessorRequest] = js.undefined
}
object ParamsResourceProjectsLocationsProcessorsEnable {
  
  inline def apply(): ParamsResourceProjectsLocationsProcessorsEnable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProcessorsEnable]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProcessorsEnable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDocumentaiV1beta3EnableProcessorRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
