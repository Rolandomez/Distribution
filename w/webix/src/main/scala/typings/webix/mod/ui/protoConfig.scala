package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import typings.webix.mod.WebixProxy
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait protoConfig extends StObject {
  
  var animate: js.UndefOr[Boolean | obj] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var click: js.UndefOr[String | WebixCallback] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var css: js.UndefOr[String | obj] = js.undefined
  
  var data: js.UndefOr[String | js.Array[Any] | obj] = js.undefined
  
  var datathrottle: js.UndefOr[Double] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var item: js.UndefOr[obj] = js.undefined
  
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var pager: js.UndefOr[String | obj] = js.undefined
  
  var ready: js.UndefOr[WebixCallback] = js.undefined
  
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  
  var rules: js.UndefOr[obj] = js.undefined
  
  var save: js.UndefOr[String | obj | WebixCallback] = js.undefined
  
  var scheme: js.UndefOr[obj] = js.undefined
  
  var template: js.UndefOr[String | WebixCallback] = js.undefined
  
  var tooltip: js.UndefOr[String | Boolean | WebixCallback | obj] = js.undefined
  
  var `type`: js.UndefOr[obj | String] = js.undefined
  
  var url: js.UndefOr[String | WebixCallback | WebixProxy] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object protoConfig {
  
  inline def apply(): protoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[protoConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: protoConfig] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean | obj): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setClick(value: String | WebixCallback): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCss(value: String | obj): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setData(value: String | js.Array[Any] | obj): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDatathrottle(value: Double): Self = StObject.set(x, "datathrottle", value.asInstanceOf[js.Any])
    
    inline def setDatathrottleUndefined: Self = StObject.set(x, "datathrottle", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItem(value: obj): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setKeyPressTimeout(value: Double): Self = StObject.set(x, "keyPressTimeout", value.asInstanceOf[js.Any])
    
    inline def setKeyPressTimeoutUndefined: Self = StObject.set(x, "keyPressTimeout", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setPager(value: String | obj): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    inline def setReady(value: WebixCallback): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setRemoveMissed(value: Boolean): Self = StObject.set(x, "removeMissed", value.asInstanceOf[js.Any])
    
    inline def setRemoveMissedUndefined: Self = StObject.set(x, "removeMissed", js.undefined)
    
    inline def setRules(value: obj): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setSave(value: String | obj | WebixCallback): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setScheme(value: obj): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setTemplate(value: String | WebixCallback): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTooltip(value: String | Boolean | WebixCallback | obj): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: obj | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String | WebixCallback | WebixProxy): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
