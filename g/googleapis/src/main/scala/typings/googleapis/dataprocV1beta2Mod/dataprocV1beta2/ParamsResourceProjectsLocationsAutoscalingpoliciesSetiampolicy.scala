package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSetIamPolicyRequest] = js.undefined
  
  /**
    * REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy {
  
  inline def apply(): ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy](x: Self) {
    
    inline def setRequestBody(value: SchemaSetIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
