package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var item: js.UndefOr[typings.devextreme.mod.DevExpress.viz.dxFunnel.Item] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object Text {
  
  inline def apply(): Text = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.devextreme.mod.DevExpress.viz.dxFunnel.Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
