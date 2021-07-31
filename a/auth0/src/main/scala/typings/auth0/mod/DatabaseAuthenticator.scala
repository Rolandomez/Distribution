package typings.auth0.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "DatabaseAuthenticator")
@js.native
class DatabaseAuthenticator[A, U] protected () extends StObject {
  def this(options: DatabaseClientOptions, oauth: OAuthAuthenticator) = this()
  
  def changePassword(data: ResetPasswordOptions): js.Promise[js.Any] = js.native
  def changePassword(data: ResetPasswordOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions): js.Promise[js.Any] = js.native
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions, cb: js.Function2[/* err */ Error, /* message */ String, Unit]): Unit = js.native
  
  def signIn(
    data: CreateUserData,
    cb: js.Function2[/* err */ Error, /* data */ User[AppMetadata, UserMetadata], Unit]
  ): Unit = js.native
  def signIn(data: SignInOptions): js.Promise[SignInToken] = js.native
  def signIn(data: SignInOptions, cb: js.Function2[/* err */ Error, /* data */ SignInToken, Unit]): Unit = js.native
  
  def signUp(data: CreateUserData): js.Promise[User[A, U]] = js.native
}
