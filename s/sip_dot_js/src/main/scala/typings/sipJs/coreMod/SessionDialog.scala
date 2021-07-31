package typings.sipJs.coreMod

import typings.sipJs.dialogStateMod.DialogState
import typings.sipJs.sessionSessionDelegateMod.SessionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "SessionDialog")
@js.native
class SessionDialog protected ()
  extends typings.sipJs.dialogsMod.SessionDialog {
  def this(
    initialTransaction: typings.sipJs.transactionsMod.InviteClientTransaction,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typings.sipJs.transactionsMod.InviteServerTransaction,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typings.sipJs.transactionsMod.InviteClientTransaction,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
  def this(
    initialTransaction: typings.sipJs.transactionsMod.InviteServerTransaction,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
}
