package typings.tweetnacl.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait nacl extends js.Object {
  
  def box(msg: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
  @JSName("box")
  var box_Original: box = js.native
  
  def hash(msg: Uint8Array): Uint8Array = js.native
  @JSName("hash")
  var hash_Original: hash = js.native
  
  def randomBytes(n: Double): Uint8Array = js.native
  
  def scalarMult(n: Uint8Array, p: Uint8Array): Uint8Array = js.native
  @JSName("scalarMult")
  var scalarMult_Original: scalarMult = js.native
  
  def secretbox(msg: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSName("secretbox")
  var secretbox_Original: secretbox = js.native
  
  def setPRNG(fn: js.Function2[/* x */ Uint8Array, /* n */ Double, Unit]): Unit = js.native
  
  def sign(msg: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
  @JSName("sign")
  var sign_Original: sign = js.native
  
  def verify(x: Uint8Array, y: Uint8Array): Boolean = js.native
}
