package typings.tweetnacl.mod

import typings.std.Uint8Array
import typings.tweetnacl.mod.sign.detached
import typings.tweetnacl.mod.sign.keyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait sign extends js.Object {
  
  def apply(msg: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
  
  def detached(msg: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
  @JSName("detached")
  var detached_Original: detached = js.native
  
  def keyPair(): SignKeyPair = js.native
  @JSName("keyPair")
  var keyPair_Original: keyPair = js.native
  
  def open(signedMsg: Uint8Array, publicKey: Uint8Array): Uint8Array | Null = js.native
  
  val publicKeyLength: Double = js.native
  
  val secretKeyLength: Double = js.native
  
  val seedLength: Double = js.native
  
  val signatureLength: Double = js.native
}
@JSImport("tweetnacl", "sign")
@js.native
object sign extends js.Object {
  
  @js.native
  trait detached extends js.Object {
    
    def apply(msg: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
    
    def verify(msg: Uint8Array, sig: Uint8Array, publicKey: Uint8Array): Boolean = js.native
  }
  
  @js.native
  trait keyPair extends js.Object {
    
    def apply(): SignKeyPair = js.native
    
    def fromSecretKey(secretKey: Uint8Array): SignKeyPair = js.native
    
    def fromSeed(secretKey: Uint8Array): SignKeyPair = js.native
  }
}
