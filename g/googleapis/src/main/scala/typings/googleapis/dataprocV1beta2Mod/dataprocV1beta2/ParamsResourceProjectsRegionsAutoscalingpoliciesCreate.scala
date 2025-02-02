package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRegionsAutoscalingpoliciesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The "resource name" of the region or location, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies.create, the resource name has the following format: projects/{project_id\}/regions/{region\} For projects.locations.autoscalingPolicies.create, the resource name has the following format: projects/{project_id\}/locations/{location\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAutoscalingPolicy] = js.undefined
}
object ParamsResourceProjectsRegionsAutoscalingpoliciesCreate {
  
  inline def apply(): ParamsResourceProjectsRegionsAutoscalingpoliciesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsAutoscalingpoliciesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsRegionsAutoscalingpoliciesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAutoscalingPolicy): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
