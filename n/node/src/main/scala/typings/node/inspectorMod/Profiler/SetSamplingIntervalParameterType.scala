package typings.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSamplingIntervalParameterType extends StObject {
  
  /**
    * New sampling interval in microseconds.
    */
  var interval: Double
}
object SetSamplingIntervalParameterType {
  
  inline def apply(interval: Double): SetSamplingIntervalParameterType = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSamplingIntervalParameterType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetSamplingIntervalParameterType] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
