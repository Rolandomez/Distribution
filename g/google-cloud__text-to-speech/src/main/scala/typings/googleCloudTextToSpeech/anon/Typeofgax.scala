package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.proto
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.rest
import typings.googleGax.buildSrcApitypesMod.APICallback
import typings.googleGax.buildSrcApitypesMod.GRPCCall
import typings.googleGax.buildSrcApitypesMod.GaxCall
import typings.googleGax.buildSrcBundlingCallsBundleExecutorMod.BundleOptions
import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import typings.googleGax.buildSrcDescriptorMod.Descriptor
import typings.googleGax.buildSrcGaxMod.BackoffSettings
import typings.googleGax.buildSrcGaxMod.BundlingConfig
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.buildSrcGaxMod.CallSettings
import typings.googleGax.buildSrcGaxMod.ClientConfig
import typings.googleGax.buildSrcGaxMod.RetryOptions
import typings.googleGax.buildSrcGrpcMod.GrpcClient
import typings.googleGax.buildSrcLongRunningCallsLongRunningDescriptorMod.LongRunningDescriptor
import typings.googleGax.buildSrcLongRunningCallsLongrunningMod.LROOperation
import typings.googleGax.buildSrcStreamingCallsStreamingMod.StreamType
import typings.googleGax.mod.Operation_
import typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofgax extends StObject {
  
  var BundleDescriptor: Instantiable4[
    /* bundledField */ String, 
    /* requestDiscriminatorFields */ js.Array[String], 
    /* subresponseField */ String, 
    /* byteLengthFunction */ js.Function, 
    typings.googleGax.mod.BundleDescriptor
  ] = js.native
  
  var CallSettings: Instantiable0[typings.googleGax.mod.CallSettings] = js.native
  
  var ChannelCredentials: TypeofChannelCredentialsInstantiable = js.native
  
  var ClientStub: Instantiable2[
    /* address */ String, 
    /* credentials */ ChannelCredentials, 
    typings.googleGax.mod.ClientStub
  ] = js.native
  
  var GoogleAuth: TypeofGoogleAuth = js.native
  
  var GoogleError: TypeofGoogleErrorInstantiable = js.native
  
  var GoogleProtoFilesRoot: TypeofGoogleProtoFilesRoo = js.native
  
  var GrpcClient: TypeofGrpcClientInstantiable = js.native
  
  var IamClient: TypeofIamClient = js.native
  
  var LocationsClient: TypeofLocationsClient = js.native
  
  var OngoingCall: Instantiable1[/* callback */ APICallback, typings.googleGax.mod.OngoingCall] = js.native
  
  var Operation: Instantiable3[
    /* grpcOp */ LROOperation, 
    /* longrunningDescriptor */ LongRunningDescriptor, 
    /* backoffSettings */ BackoffSettings, 
    Operation_
  ] = js.native
  
  var OperationsClient: Instantiable3[
    /* gaxGrpc */ GrpcClient, 
    /* operationsProtos */ Any, 
    /* options */ ClientOptions, 
    typings.googleGax.mod.OperationsClient
  ] = js.native
  
  var PageDescriptor: Instantiable3[
    /* requestPageTokenField */ String, 
    /* responsePageTokenField */ String, 
    /* resourceField */ String, 
    typings.googleGax.mod.PageDescriptor
  ] = js.native
  
  var PathTemplate: Instantiable1[/* data */ String, typings.googleGax.mod.PathTemplate] = js.native
  
  var RetryOptions: Instantiable2[
    /* retryCodes */ js.Array[Double], 
    /* backoffSettings */ BackoffSettings, 
    typings.googleGax.mod.RetryOptions
  ] = js.native
  
  var StreamDescriptor: Instantiable1[/* streamType */ StreamType, typings.googleGax.mod.StreamDescriptor] = js.native
  
  def constructSettings(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: js.Object
  ): Any = js.native
  def constructSettings(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: js.Object,
    otherArgs: js.Object
  ): Any = js.native
  
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, _fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, _fallback: Boolean): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
  def createApiCall(
    func: js.Promise[GRPCCall],
    settings: CallSettings,
    descriptor: Descriptor,
    _fallback: proto | rest
  ): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor, _fallback: Boolean): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, _fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, _fallback: Boolean): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, _fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, _fallback: Boolean): GaxCall = js.native
  
  def createBackoffSettings(initialRetryDelayMillis: Double, retryDelayMultiplier: Double, maxRetryDelayMillis: Double): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = js.native
  
  def createBundleOptions(options: BundlingConfig): BundleOptions = js.native
  
  val createByteLengthFunction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GrpcClient.createByteLengthFunction */ Any = js.native
  
  def createDefaultBackoffSettings(): BackoffSettings = js.native
  
  def createMaxRetriesBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double,
    maxRetries: Double
  ): BackoffSettings = js.native
  
  def createRetryOptions(retryCodes: js.Array[Double], backoffSettings: BackoffSettings): RetryOptions = js.native
  
  val fallback: Typeoffallback = js.native
  
  val grpc: Typeofgrpc = js.native
  
  val lro: Typeoflro = js.native
  
  def operation(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = js.native
  def operation(
    op: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings,
    callOptions: CallOptions
  ): typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = js.native
  
  val protobuf: TypeofprotobufBufferReader = js.native
  
  val protobufMinimal: TypeofprotobufMinimalBufferReader = js.native
  
  val routingHeader: TypeofroutingHeader = js.native
  
  val serializer: Typeofserializer = js.native
  
  val version: Any = js.native
  
  def warn(code: String, message: String): Unit = js.native
  def warn(code: String, message: String, warnType: String): Unit = js.native
}
