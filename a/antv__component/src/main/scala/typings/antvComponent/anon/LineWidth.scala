package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineWidth extends StObject {
  
  var lineWidth: Double
  
  var stroke: String
}
object LineWidth {
  
  inline def apply(lineWidth: Double, stroke: String): LineWidth = {
    val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineWidth] (val x: Self) extends AnyVal {
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
