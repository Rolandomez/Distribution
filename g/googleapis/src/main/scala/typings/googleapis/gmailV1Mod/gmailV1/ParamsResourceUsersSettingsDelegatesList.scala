package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSettingsDelegatesList
  extends StObject
     with StandardParameters {
  
  /**
    * User's email address. The special value "me" can be used to indicate the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersSettingsDelegatesList {
  
  inline def apply(): ParamsResourceUsersSettingsDelegatesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSettingsDelegatesList]
  }
  
  extension [Self <: ParamsResourceUsersSettingsDelegatesList](x: Self) {
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
