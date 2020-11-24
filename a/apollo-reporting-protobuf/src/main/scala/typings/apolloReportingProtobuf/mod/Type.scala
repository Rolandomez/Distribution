package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.IType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "Type")
@js.native
/**
  * Constructs a new Type.
  * @param [properties] Properties to set
  */
class Type ()
  extends typings.apolloReportingProtobuf.protobufMod.Type {
  def this(properties: IType) = this()
}
/* static members */
@JSImport("apollo-reporting-protobuf", "Type")
@js.native
object Type extends js.Object {
  
  /**
    * Creates a new Type instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Type instance
    */
  def create(): typings.apolloReportingProtobuf.protobufMod.Type = js.native
  def create(properties: IType): typings.apolloReportingProtobuf.protobufMod.Type = js.native
  
  /**
    * Decodes a Type message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Type
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Type = js.native
  def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Type = js.native
  def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Type = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Type = js.native
  
  /**
    * Decodes a Type message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Type
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Type = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Type = js.native
  
  /**
    * Encodes the specified Type message. Does not implicitly {@link Type.verify|verify} messages.
    * @param message Type message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IType): Writer = js.native
  def encode(message: IType, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Type message, length delimited. Does not implicitly {@link Type.verify|verify} messages.
    * @param message Type message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IType): Writer = js.native
  def encodeDelimited(message: IType, writer: Writer): Writer = js.native
  
  /**
    * Creates a Type message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Type
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Type = js.native
  
  /**
    * Creates a plain object from a Type message. Also converts values to other types if specified.
    * @param message Type
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.Type): StringDictionary[js.Any] = js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.Type, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Type message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
