package typings.auth0Lock

import typings.auth0Lock.auth0LockStrings.error
import typings.auth0Lock.auth0LockStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockFlashMessageOptions extends StObject {
  
  var text: String
  
  var `type`: success | error
}
object Auth0LockFlashMessageOptions {
  
  @scala.inline
  def apply(text: String, `type`: success | error): Auth0LockFlashMessageOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockFlashMessageOptions]
  }
  
  @scala.inline
  implicit class Auth0LockFlashMessageOptionsMutableBuilder[Self <: Auth0LockFlashMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: success | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
