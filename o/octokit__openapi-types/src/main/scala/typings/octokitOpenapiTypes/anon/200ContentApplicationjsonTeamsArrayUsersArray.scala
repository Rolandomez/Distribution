package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonTeamsArrayUsersArray` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonTeamsArrayUsersArray
}
object `200ContentApplicationjsonTeamsArrayUsersArray` {
  
  inline def apply(`200`: ContentApplicationjsonTeamsArrayUsersArray): `200ContentApplicationjsonTeamsArrayUsersArray` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonTeamsArrayUsersArray`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonTeamsArrayUsersArray`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonTeamsArrayUsersArray): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
