package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.AlgorithmicColorRampProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.AlgorithmicColorRamp")
@js.native
/**
		 * Creates a color ramp for use in a raster renderer.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AlgorithmicColorRamp.html)
		 */
open class AlgorithmicColorRamp ()
  extends StObject
     with typings.arcgisJsApi.esri.AlgorithmicColorRamp {
  def this(properties: AlgorithmicColorRampProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object AlgorithmicColorRamp {
  
  @JSGlobal("__esri.AlgorithmicColorRamp")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.AlgorithmicColorRamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.AlgorithmicColorRamp]
}
