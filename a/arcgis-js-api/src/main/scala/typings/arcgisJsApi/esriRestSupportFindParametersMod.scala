package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FindParameters
import typings.arcgisJsApi.esri.FindParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportFindParametersMod {
  
  @JSImport("esri/rest/support/FindParameters", JSImport.Namespace)
  @js.native
  /**
  		 * Input parameters for [find](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-find.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FindParameters.html)
  		 */
  open class ^ ()
    extends StObject
       with FindParameters {
    def this(properties: FindParametersProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/FindParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FindParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FindParameters]
}
