package typings.sipJs.coreMod

import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.userAgentClientMod.ClientTransactionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "UserAgentClient")
@js.native
open class UserAgentClient protected ()
  extends typings.sipJs.userAgentsMod.UserAgentClient {
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}
