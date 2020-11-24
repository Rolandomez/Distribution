package typings.scrypt.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrypt", "verifyKdf")
@js.native
object verifyKdf extends js.Object {
  
  def apply(kdf: Buffer, key: String): js.Promise[Boolean] = js.native
  def apply(kdf: Buffer, key: String, cb: js.Function2[/* err */ Error | Null, /* obj */ Boolean, Unit]): Unit = js.native
  def apply(kdf: Buffer, key: Buffer): js.Promise[Boolean] = js.native
  def apply(kdf: Buffer, key: Buffer, cb: js.Function2[/* err */ Error | Null, /* obj */ Boolean, Unit]): Unit = js.native
}
