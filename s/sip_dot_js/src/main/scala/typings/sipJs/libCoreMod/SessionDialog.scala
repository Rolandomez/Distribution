package typings.sipJs.libCoreMod

import typings.sipJs.libCoreDialogsDialogStateMod.DialogState
import typings.sipJs.libCoreSessionSessionDelegateMod.SessionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "SessionDialog")
@js.native
open class SessionDialog protected ()
  extends typings.sipJs.libCoreDialogsMod.SessionDialog {
  def this(
    initialTransaction: typings.sipJs.libCoreTransactionsInviteClientTransactionMod.InviteClientTransaction,
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typings.sipJs.libCoreTransactionsInviteServerTransactionMod.InviteServerTransaction,
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typings.sipJs.libCoreTransactionsInviteClientTransactionMod.InviteClientTransaction,
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
  def this(
    initialTransaction: typings.sipJs.libCoreTransactionsInviteServerTransactionMod.InviteServerTransaction,
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
}
