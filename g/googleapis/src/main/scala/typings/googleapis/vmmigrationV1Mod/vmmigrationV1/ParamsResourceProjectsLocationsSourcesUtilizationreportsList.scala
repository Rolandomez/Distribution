package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSourcesUtilizationreportsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The filter request.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. the order by fields for the result.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The maximum number of reports to return. The service may return fewer than this value. If unspecified, at most 500 reports will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. A page token, received from a previous `ListUtilizationReports` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListUtilizationReports` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Utilization Reports parent.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The level of details of each report. Defaults to BASIC.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSourcesUtilizationreportsList {
  
  inline def apply(): ParamsResourceProjectsLocationsSourcesUtilizationreportsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSourcesUtilizationreportsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSourcesUtilizationreportsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
