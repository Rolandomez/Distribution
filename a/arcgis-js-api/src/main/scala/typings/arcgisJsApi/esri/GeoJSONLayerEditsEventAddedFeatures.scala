package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerEditsEventAddedFeatures extends StObject {
  
  var objectId: Double
}
object GeoJSONLayerEditsEventAddedFeatures {
  
  inline def apply(objectId: Double): GeoJSONLayerEditsEventAddedFeatures = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerEditsEventAddedFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoJSONLayerEditsEventAddedFeatures] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
