package typings.relayTestUtils.relayModernMockEnvironmentMod

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockFunctions extends js.Object {
  
  def cachePayload(request: ConcreteRequest, variables: Variables, payload: GraphQLResponse): Unit = js.native
  def cachePayload(request: OperationDescriptor, variables: Variables, payload: GraphQLResponse): Unit = js.native
  
  def clearCache(): Unit = js.native
  
  def complete(request: ConcreteRequest): Unit = js.native
  def complete(request: OperationDescriptor): Unit = js.native
  
  def findOperation(findFn: js.Function1[/* operation */ OperationDescriptor, Boolean]): OperationDescriptor = js.native
  
  def getAllOperations(): js.Array[OperationDescriptor] = js.native
  
  def getMostRecentOperation(): OperationDescriptor = js.native
  
  def isLoading(request: ConcreteRequest, variables: Variables): Boolean = js.native
  def isLoading(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): Boolean = js.native
  def isLoading(request: OperationDescriptor, variables: Variables): Boolean = js.native
  def isLoading(request: OperationDescriptor, variables: Variables, cacheConfig: CacheConfig): Boolean = js.native
  
  def nextValue(request: ConcreteRequest, payload: GraphQLResponse): Unit = js.native
  def nextValue(request: OperationDescriptor, payload: GraphQLResponse): Unit = js.native
  
  def queueOperationResolver(resolver: OperationMockResolver): Unit = js.native
  
  def reject(request: ConcreteRequest, error: String): Unit = js.native
  def reject(request: ConcreteRequest, error: Error): Unit = js.native
  def reject(request: OperationDescriptor, error: String): Unit = js.native
  def reject(request: OperationDescriptor, error: Error): Unit = js.native
  
  def rejectMostRecentOperation(error: js.Function1[/* operation */ OperationDescriptor, Error]): Unit = js.native
  def rejectMostRecentOperation(error: Error): Unit = js.native
  
  def resolve(request: ConcreteRequest, payload: GraphQLResponse): Unit = js.native
  def resolve(request: OperationDescriptor, payload: GraphQLResponse): Unit = js.native
  
  def resolveMostRecentOperation(payload: js.Function1[/* operation */ OperationDescriptor, GraphQLResponse | Unit]): Unit = js.native
  def resolveMostRecentOperation(payload: GraphQLResponse): Unit = js.native
}
