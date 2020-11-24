package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StateAddress
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_sign_final_verify")
@js.native
object cryptoSignFinalVerify extends js.Object {
  
  def apply(state_address: StateAddress, signature: Uint8Array, publicKey: Uint8Array): Boolean = js.native
}
