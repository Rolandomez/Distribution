package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_box_open_easy_afternm")
@js.native
object cryptoBoxOpenEasyAfternm extends js.Object {
  
  def apply(ciphertext: String, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  def apply(ciphertext: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(ciphertext: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(ciphertext: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  def apply(ciphertext: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(
    ciphertext: Uint8Array,
    nonce: Uint8Array,
    sharedKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
}
