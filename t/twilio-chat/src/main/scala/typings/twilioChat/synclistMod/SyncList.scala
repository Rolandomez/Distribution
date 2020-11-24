package typings.twilioChat.synclistMod

import typings.twilioChat.restpaginatorMod.RestPaginator
import typings.twilioChat.synclistdescriptorMod.SyncListDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides async pagination interface for sync list
  *
  * @property {Network} network Network transport
  * @property {string} syncListUrl Url to the sync list endpoint
  */
@JSImport("twilio-chat/lib/synclist", "SyncList")
@js.native
class SyncList protected () extends js.Object {
  /**
    * @param {SyncListServices} services - services needed for SyncList service
    * @private
    */
  def this(services: SyncListServices) = this()
  
  def getPage(): js.Promise[RestPaginator[SyncListDescriptor]] = js.native
  def getPage(args: js.Any): js.Promise[RestPaginator[SyncListDescriptor]] = js.native
  
  val services: js.Any = js.native
}
