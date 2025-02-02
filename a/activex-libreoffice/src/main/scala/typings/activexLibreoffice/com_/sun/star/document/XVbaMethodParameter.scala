package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XVbaMethodParameter
  extends StObject
     with XInterface {
  
  /** returns the value of the parameter with the specified name. */
  def getVbaMethodParameter(PropertyName: String): Any
  
  /** sets the value of the parameter with the specified name. */
  def setVbaMethodParameter(PropertyName: String, Value: Any): Unit
}
object XVbaMethodParameter {
  
  inline def apply(
    acquire: () => Unit,
    getVbaMethodParameter: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    setVbaMethodParameter: (String, Any) => Unit
  ): XVbaMethodParameter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getVbaMethodParameter = js.Any.fromFunction1(getVbaMethodParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setVbaMethodParameter = js.Any.fromFunction2(setVbaMethodParameter))
    __obj.asInstanceOf[XVbaMethodParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XVbaMethodParameter] (val x: Self) extends AnyVal {
    
    inline def setGetVbaMethodParameter(value: String => Any): Self = StObject.set(x, "getVbaMethodParameter", js.Any.fromFunction1(value))
    
    inline def setSetVbaMethodParameter(value: (String, Any) => Unit): Self = StObject.set(x, "setVbaMethodParameter", js.Any.fromFunction2(value))
  }
}
