package typings.ionic.authMod

import typings.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/auth", "AuthClient")
@js.native
class AuthClient protected () extends ResourceClient {
  def this(e: AuthClientDeps) = this()
  
  val connections: AuthConnectionClient = js.native
  
  val e: AuthClientDeps = js.native
}
