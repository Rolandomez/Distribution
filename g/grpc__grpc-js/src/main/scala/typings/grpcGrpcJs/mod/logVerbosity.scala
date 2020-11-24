package typings.grpcGrpcJs.mod

import typings.grpcGrpcJs.constantsMod.LogVerbosity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js", "logVerbosity")
@js.native
object logVerbosity extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogVerbosity with Double] = js.native
  
  /* 0 */ val DEBUG: typings.grpcGrpcJs.constantsMod.LogVerbosity.DEBUG with Double = js.native
  
  /* 2 */ val ERROR: typings.grpcGrpcJs.constantsMod.LogVerbosity.ERROR with Double = js.native
  
  /* 1 */ val INFO: typings.grpcGrpcJs.constantsMod.LogVerbosity.INFO with Double = js.native
}
