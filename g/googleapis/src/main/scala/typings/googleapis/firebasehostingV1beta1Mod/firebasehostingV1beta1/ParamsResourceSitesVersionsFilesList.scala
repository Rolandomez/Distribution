package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitesVersionsFilesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of version files to return. The service may return a lower number if fewer version files exist than this maximum number. If unspecified, defaults to 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token from a previous call to `ListVersionFiles` that tells the server where to resume listing.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The version for which to list files, in the format: sites/SITE_ID /versions/VERSION_ID
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    *  The type of files that should be listed for the specified version.
    */
  var status: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitesVersionsFilesList {
  
  inline def apply(): ParamsResourceSitesVersionsFilesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesVersionsFilesList]
  }
  
  extension [Self <: ParamsResourceSitesVersionsFilesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
