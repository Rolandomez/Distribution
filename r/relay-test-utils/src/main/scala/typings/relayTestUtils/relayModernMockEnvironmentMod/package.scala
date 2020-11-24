package typings.relayTestUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object relayModernMockEnvironmentMod {
  
  type OperationMockResolver = js.Function1[
    /* operation */ typings.relayRuntime.relayStoreTypesMod.OperationDescriptor, 
    typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse | typings.std.Error | scala.Null
  ]
}
