package typings.googleProtobuf.anyPbMod

import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/any_pb", "Any")
@js.native
class Any_ () extends Message {
  
  def getTypeName(): String = js.native
  
  def getTypeUrl(): String = js.native
  
  def getValue(): Uint8Array | String = js.native
  
  def getValue_asB64(): String = js.native
  
  def getValue_asU8(): Uint8Array = js.native
  
  def pack(serialized: Uint8Array, name: String): Unit = js.native
  def pack(serialized: Uint8Array, name: String, typeUrlPrefix: String): Unit = js.native
  
  def setTypeUrl(value: String): Any = js.native
  
  def setValue(value: String): Any = js.native
  def setValue(value: Uint8Array): Any = js.native
  
  def unpack[T /* <: Message */](deserialize: js.Function1[/* packed */ Uint8Array, T], name: String): T | Null = js.native
}
