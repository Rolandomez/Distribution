package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerLayerviewCreateEvent extends StObject {
  
  var layerView: LayerView
  
  var view: View
}
object LayerLayerviewCreateEvent {
  
  inline def apply(layerView: LayerView, view: View): LayerLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerLayerviewCreateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerLayerviewCreateEvent] (val x: Self) extends AnyVal {
    
    inline def setLayerView(value: LayerView): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
