package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoryselectionTotalcount extends StObject {
  
  var parameters: `553`
  
  var responses: `200ContentApplicationjsonRepositoryselectionTotalcount`
}
object Responses200ContentApplicationjsonRepositoryselectionTotalcount {
  
  inline def apply(parameters: `553`, responses: `200ContentApplicationjsonRepositoryselectionTotalcount`): Responses200ContentApplicationjsonRepositoryselectionTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoryselectionTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRepositoryselectionTotalcount] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `553`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoryselectionTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
