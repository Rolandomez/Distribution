package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content425 extends StObject {
  
  var parameters: `165`
  
  var responses: `200Content425`
}
object Responses200Content425 {
  
  inline def apply(parameters: `165`, responses: `200Content425`): Responses200Content425 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content425]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content425] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content425`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
