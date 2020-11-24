package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IConsensusPeerInfo
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo")
@js.native
/**
  * Constructs a new ConsensusPeerInfo.
  * @param [properties] Properties to set
  */
class ConsensusPeerInfo ()
  extends typings.sawtoothSdk.protobufMod.ConsensusPeerInfo {
  def this(properties: IConsensusPeerInfo) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusPeerInfo")
@js.native
object ConsensusPeerInfo extends js.Object {
  
  /**
    * Creates a new ConsensusPeerInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusPeerInfo instance
    */
  def create(): typings.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  def create(properties: IConsensusPeerInfo): typings.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  
  /**
    * Decodes a ConsensusPeerInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusPeerInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  
  /**
    * Decodes a ConsensusPeerInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusPeerInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  
  /**
    * Encodes the specified ConsensusPeerInfo message. Does not implicitly {@link ConsensusPeerInfo.verify|verify} messages.
    * @param message ConsensusPeerInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusPeerInfo): Writer = js.native
  def encode(message: IConsensusPeerInfo, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ConsensusPeerInfo message, length delimited. Does not implicitly {@link ConsensusPeerInfo.verify|verify} messages.
    * @param message ConsensusPeerInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusPeerInfo): Writer = js.native
  def encodeDelimited(message: IConsensusPeerInfo, writer: Writer): Writer = js.native
  
  /**
    * Creates a ConsensusPeerInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusPeerInfo
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.ConsensusPeerInfo = js.native
  
  /**
    * Creates a plain object from a ConsensusPeerInfo message. Also converts values to other types if specified.
    * @param message ConsensusPeerInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusPeerInfo): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.ConsensusPeerInfo, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ConsensusPeerInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
