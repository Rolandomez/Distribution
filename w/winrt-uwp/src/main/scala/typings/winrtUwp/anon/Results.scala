package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.Numerics.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Results extends StObject {
  
  /** A set of coordinates, relative to the coordinate system of the camera device and with correlated depth values. */ var results: Vector3
  
  /** This method returns asynchronously. */ var returnValue: IPromiseWithIAsyncAction
}
object Results {
  
  inline def apply(results: Vector3, returnValue: IPromiseWithIAsyncAction): Results = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
    
    inline def setResults(value: Vector3): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: IPromiseWithIAsyncAction): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
