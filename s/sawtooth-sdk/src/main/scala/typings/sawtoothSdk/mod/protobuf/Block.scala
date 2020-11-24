package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IBlock
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.Block")
@js.native
/**
  * Constructs a new Block.
  * @param [properties] Properties to set
  */
class Block ()
  extends typings.sawtoothSdk.protobufMod.Block {
  def this(properties: IBlock) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.Block")
@js.native
object Block extends js.Object {
  
  /**
    * Creates a new Block instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Block instance
    */
  def create(): typings.sawtoothSdk.protobufMod.Block = js.native
  def create(properties: IBlock): typings.sawtoothSdk.protobufMod.Block = js.native
  
  /**
    * Decodes a Block message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Block
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Block = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Block = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Block = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Block = js.native
  
  /**
    * Decodes a Block message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Block
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Block = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Block = js.native
  
  /**
    * Encodes the specified Block message. Does not implicitly {@link Block.verify|verify} messages.
    * @param message Block message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBlock): Writer = js.native
  def encode(message: IBlock, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Block message, length delimited. Does not implicitly {@link Block.verify|verify} messages.
    * @param message Block message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBlock): Writer = js.native
  def encodeDelimited(message: IBlock, writer: Writer): Writer = js.native
  
  /**
    * Creates a Block message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Block
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Block = js.native
  
  /**
    * Creates a plain object from a Block message. Also converts values to other types if specified.
    * @param message Block
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.Block): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Block, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Block message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
