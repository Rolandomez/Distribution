package typings.grpcGrpcJs.serverCallMod

import typings.grpcGrpcJs.makeClientMod.Deserialize
import typings.grpcGrpcJs.makeClientMod.Serialize
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientStreamingHandler[RequestType, ResponseType] extends Handler[RequestType, ResponseType] {
  @JSName("deserialize")
  var deserialize_Original: Deserialize[RequestType] = js.native
  @JSName("func")
  var func_Original: handleClientStreamingCall[RequestType, ResponseType] = js.native
  var path: String = js.native
  @JSName("serialize")
  var serialize_Original: Serialize[ResponseType] = js.native
  var `type`: HandlerType = js.native
  def deserialize(bytes: Buffer): RequestType = js.native
  def func(call: ServerReadableStream[RequestType, ResponseType], callback: sendUnaryData[ResponseType]): Unit = js.native
  def serialize(value: ResponseType): Buffer = js.native
}

