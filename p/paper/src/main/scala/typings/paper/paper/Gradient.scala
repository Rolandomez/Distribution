package typings.paper.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Gradient object.
  */
trait Gradient extends StObject {
  
  /** 
    * Checks whether the gradient is equal to the supplied gradient.
    * 
    * @return true if they are equal
    */
  def equals(gradient: Gradient): Boolean
  
  /** 
    * Specifies whether the gradient is radial or linear.
    */
  var radial: Boolean
  
  /** 
    * The gradient stops on the gradient ramp.
    */
  var stops: js.Array[GradientStop]
}
object Gradient {
  
  inline def apply(equals_ : Gradient => Boolean, radial: Boolean, stops: js.Array[GradientStop]): Gradient = {
    val __obj = js.Dynamic.literal(radial = radial.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Gradient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gradient] (val x: Self) extends AnyVal {
    
    inline def setEquals_(value: Gradient => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setRadial(value: Boolean): Self = StObject.set(x, "radial", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[GradientStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: GradientStop*): Self = StObject.set(x, "stops", js.Array(value*))
  }
}
