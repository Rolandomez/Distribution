package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersMessagesSend
  extends StObject
     with StandardParameters {
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMessage] = js.undefined
  
  /**
    * The user's email address. The special value `me` can be used to indicate the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersMessagesSend {
  
  inline def apply(): ParamsResourceUsersMessagesSend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersMessagesSend]
  }
  
  extension [Self <: ParamsResourceUsersMessagesSend](x: Self) {
    
    inline def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setRequestBody(value: SchemaMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
