package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsWebappsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of Apps to return in the response. The server may return fewer than this value at its discretion. If no value is specified (or too large a value is specified), then the server will impose its own limit.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token returned from a previous call to `ListWebApps` indicating where in the set of Apps to resume listing.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the parent FirebaseProject for which to list each associated WebApp, in the format: projects/PROJECT_IDENTIFIER/webApps Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Controls whether Apps in the DELETED state should be returned. Defaults to false.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsWebappsList {
  
  inline def apply(): ParamsResourceProjectsWebappsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsWebappsList]
  }
  
  extension [Self <: ParamsResourceProjectsWebappsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
  }
}
