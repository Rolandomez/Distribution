package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Consent to activate, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}`. An INVALID_ARGUMENT error occurs if `revision_id` is specified in the name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaActivateConsentRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaActivateConsentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
