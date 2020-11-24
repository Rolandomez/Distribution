package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.abort
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_abort extends js.Object {
  
  def apply(
    `type`: abort,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}
