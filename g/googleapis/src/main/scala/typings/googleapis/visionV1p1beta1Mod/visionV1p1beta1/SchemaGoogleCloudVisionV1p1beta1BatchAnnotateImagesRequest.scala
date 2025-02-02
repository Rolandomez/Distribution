package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest extends StObject {
  
  /**
    * Optional. Target project and location to make a call. Format: `projects/{project-id\}/locations/{location-id\}`. If no parent is specified, a region will be chosen automatically. Supported location-ids: `us`: USA country only, `asia`: East asia areas, like Japan, Taiwan, `eu`: The European Union. Example: `projects/project-A/locations/eu`.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Individual image annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest]] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequests(value: js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
