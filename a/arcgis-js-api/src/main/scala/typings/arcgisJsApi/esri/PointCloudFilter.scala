package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`return`
import typings.arcgisJsApi.arcgisJsApiStrings.bitfield
import typings.arcgisJsApi.arcgisJsApiStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudFilter
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The field used for applying the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html#field)
    */
  var field: String = js.native
  
  /**
    * The type of filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html#type)
    */
  val `type`: value | bitfield | `return` = js.native
}
