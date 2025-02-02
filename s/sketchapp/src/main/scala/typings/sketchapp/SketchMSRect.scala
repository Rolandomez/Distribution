package typings.sketchapp

import typings.sketchapp.sketchappStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSRect extends StObject {
  
  var _class: rect
  
  var constrainProportions: Boolean
  
  var height: Double
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object SketchMSRect {
  
  inline def apply(constrainProportions: Boolean, height: Double, width: Double, x: Double, y: Double): SketchMSRect = {
    val __obj = js.Dynamic.literal(_class = "rect", constrainProportions = constrainProportions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSRect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSRect] (val x: Self) extends AnyVal {
    
    inline def setConstrainProportions(value: Boolean): Self = StObject.set(x, "constrainProportions", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def set_class(value: rect): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
