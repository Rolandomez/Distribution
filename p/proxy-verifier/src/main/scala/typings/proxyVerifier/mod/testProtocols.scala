package typings.proxyVerifier.mod

import typings.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proxy-verifier", "testProtocols")
@js.native
object testProtocols extends js.Object {
  
  def apply(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, Unit]): Unit = js.native
  def apply(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, Unit]
  ): Unit = js.native
}
