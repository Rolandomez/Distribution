package typings.cryptoHash.mod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto-hash", "sha256")
@js.native
object sha256 extends js.Object {
  
  def apply(input: String): js.Promise[String] = js.native
  def apply(input: String, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  def apply(input: String, options: OptionsHexOutput): js.Promise[String] = js.native
  def apply(input: ArrayBuffer): js.Promise[String] = js.native
  def apply(input: ArrayBufferView): js.Promise[String] = js.native
  def apply(input: ArrayBufferView, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  def apply(input: ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = js.native
  def apply(input: ArrayBuffer, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  def apply(input: ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = js.native
}
