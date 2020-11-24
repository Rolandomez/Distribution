package typings.sipJs.userAgentsMod

import typings.sipJs.dialogsMod.SessionDialog
import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import typings.sipJs.messagesMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/user-agents", "ByeUserAgentServer")
@js.native
class ByeUserAgentServer protected ()
  extends typings.sipJs.byeUserAgentServerMod.ByeUserAgentServer {
  def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
  def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}
