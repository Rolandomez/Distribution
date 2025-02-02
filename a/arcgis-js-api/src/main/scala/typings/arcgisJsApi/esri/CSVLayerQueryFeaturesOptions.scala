package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSVLayerQueryFeaturesOptions extends StObject {
  
  /**
  		 * Signal object that can be used to abort the asynchronous task.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#queryFeatures)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object CSVLayerQueryFeaturesOptions {
  
  inline def apply(): CSVLayerQueryFeaturesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVLayerQueryFeaturesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSVLayerQueryFeaturesOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
