package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusSettingsGetRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest")
@js.native
/**
  * Constructs a new ConsensusSettingsGetRequest.
  * @param [properties] Properties to set
  */
class ConsensusSettingsGetRequest ()
  extends typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest {
  def this(properties: IConsensusSettingsGetRequest) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusSettingsGetRequest")
@js.native
object ConsensusSettingsGetRequest extends js.Object {
  
  /**
    * Creates a new ConsensusSettingsGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSettingsGetRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  def create(properties: IConsensusSettingsGetRequest): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  
  /**
    * Decodes a ConsensusSettingsGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSettingsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  
  /**
    * Decodes a ConsensusSettingsGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSettingsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  
  /**
    * Encodes the specified ConsensusSettingsGetRequest message. Does not implicitly {@link ConsensusSettingsGetRequest.verify|verify} messages.
    * @param message ConsensusSettingsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusSettingsGetRequest): Writer = js.native
  def encode(message: IConsensusSettingsGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusSettingsGetRequest message, length delimited. Does not implicitly {@link ConsensusSettingsGetRequest.verify|verify} messages.
    * @param message ConsensusSettingsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusSettingsGetRequest): Writer = js.native
  def encodeDelimited(message: IConsensusSettingsGetRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusSettingsGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSettingsGetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest = js.native
  
  /**
    * Creates a plain object from a ConsensusSettingsGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusSettingsGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusSettingsGetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusSettingsGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
