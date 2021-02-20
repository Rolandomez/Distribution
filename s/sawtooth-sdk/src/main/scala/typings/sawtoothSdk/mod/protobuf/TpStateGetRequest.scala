package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpStateGetRequest
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest")
@js.native
/**
  * Constructs a new TpStateGetRequest.
  * @param [properties] Properties to set
  */
class TpStateGetRequest ()
  extends typings.sawtoothSdk.protobufMod.TpStateGetRequest {
  def this(properties: ITpStateGetRequest) = this()
}
/* static members */
object TpStateGetRequest {
  
  /**
    * Creates a new TpStateGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateGetRequest instance
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.create")
  @js.native
  def create(): typings.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.create")
  @js.native
  def create(properties: ITpStateGetRequest): typings.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  
  /**
    * Decodes a TpStateGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decode")
  @js.native
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  
  /**
    * Decodes a TpStateGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  
  /**
    * Encodes the specified TpStateGetRequest message. Does not implicitly {@link TpStateGetRequest.verify|verify} messages.
    * @param message TpStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.encode")
  @js.native
  def encode(message: ITpStateGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.encode")
  @js.native
  def encode(message: ITpStateGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TpStateGetRequest message, length delimited. Does not implicitly {@link TpStateGetRequest.verify|verify} messages.
    * @param message TpStateGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateGetRequest): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITpStateGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a TpStateGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateGetRequest
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpStateGetRequest = js.native
  
  /**
    * Creates a plain object from a TpStateGetRequest message. Also converts values to other types if specified.
    * @param message TpStateGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpStateGetRequest): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.toObject")
  @js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpStateGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TpStateGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.TpStateGetRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
