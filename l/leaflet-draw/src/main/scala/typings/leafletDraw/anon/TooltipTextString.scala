package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipTextString extends StObject {
  
  var tooltip: TextString
}
object TooltipTextString {
  
  inline def apply(tooltip: TextString): TooltipTextString = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipTextString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipTextString] (val x: Self) extends AnyVal {
    
    inline def setTooltip(value: TextString): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
