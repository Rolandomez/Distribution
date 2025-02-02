package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshCreateSphereParams extends StObject {
  
  /**
  		 * The additional number of subdivisions for generating the mesh representing a sphere.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
  		 */
  var densificationFactor: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Whether to georeference relative to the globe or the projected coordinate system (PCS).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
  		 */
  var geographic: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The material to be used for the mesh.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
  		 */
  var material: js.UndefOr[MeshMaterial] = js.undefined
  
  /**
  		 * A uniform size value or an object containing individual values width, height and depth.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
  		 */
  var size: js.UndefOr[Double | MeshCreateSphereParamsSize] = js.undefined
  
  /**
  		 * The unit of the size (defaults to the unit of the location's spatial reference).
  		 *
  		 * [Read more...](global.html#unit)
  		 */
  var unit: js.UndefOr[
    millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
}
object MeshCreateSphereParams {
  
  inline def apply(): MeshCreateSphereParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshCreateSphereParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshCreateSphereParams] (val x: Self) extends AnyVal {
    
    inline def setDensificationFactor(value: Double): Self = StObject.set(x, "densificationFactor", value.asInstanceOf[js.Any])
    
    inline def setDensificationFactorUndefined: Self = StObject.set(x, "densificationFactor", js.undefined)
    
    inline def setGeographic(value: Boolean): Self = StObject.set(x, "geographic", value.asInstanceOf[js.Any])
    
    inline def setGeographicUndefined: Self = StObject.set(x, "geographic", js.undefined)
    
    inline def setMaterial(value: MeshMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setSize(value: Double | MeshCreateSphereParamsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUnit(
      value: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
