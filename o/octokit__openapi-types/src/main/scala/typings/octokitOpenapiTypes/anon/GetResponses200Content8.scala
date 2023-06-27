package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content8 extends StObject {
  
  /**
    * Get an organization installation for the authenticated app
    * @description Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: Responses200Content8
}
object GetResponses200Content8 {
  
  inline def apply(get: Responses200Content8): GetResponses200Content8 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content8]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content8] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content8): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
