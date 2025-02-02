package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitResult extends StObject {
  
  var ready: Double
}
object WaitResult {
  
  inline def apply(ready: Double): WaitResult = {
    val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaitResult] (val x: Self) extends AnyVal {
    
    inline def setReady(value: Double): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
  }
}
