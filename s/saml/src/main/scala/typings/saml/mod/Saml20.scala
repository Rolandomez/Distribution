package typings.saml.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("saml", "Saml20")
@js.native
object Saml20 extends js.Object {
  
  def create(opts: SamlOpts): js.Any = js.native
  def create(opts: SamlOpts, cb: js.Function2[/* err */ Error | Null, /* signed */ String, Unit]): js.Any = js.native
}
