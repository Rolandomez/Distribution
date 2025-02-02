package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAssociationsParametersProperties extends StObject {
  
  /**
  		 * The [NetworkElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html) for which the association is queried.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html#elements)
  		 */
  var elements: js.UndefOr[js.Array[NetworkElementProperties]] = js.undefined
  
  /**
  		 * The geodatabase version to execute the function against.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html#gdbVersion)
  		 */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
  		 * The date/timestamp (in UTC) to execute the function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html#moment)
  		 */
  var moment: js.UndefOr[DateProperties] = js.undefined
  
  /**
  		 * Specifies whether to return logically deleted associations.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html#returnDeletes)
  		 */
  var returnDeletes: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies an array of [Association](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html) types to be queried.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html#types)
  		 */
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object QueryAssociationsParametersProperties {
  
  inline def apply(): QueryAssociationsParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAssociationsParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryAssociationsParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setElements(value: js.Array[NetworkElementProperties]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: NetworkElementProperties*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setMoment(value: DateProperties): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
    
    inline def setMomentUndefined: Self = StObject.set(x, "moment", js.undefined)
    
    inline def setReturnDeletes(value: Boolean): Self = StObject.set(x, "returnDeletes", value.asInstanceOf[js.Any])
    
    inline def setReturnDeletesUndefined: Self = StObject.set(x, "returnDeletes", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
