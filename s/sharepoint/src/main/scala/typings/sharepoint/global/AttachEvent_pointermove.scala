package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.pointermove
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_pointermove extends js.Object {
  
  def apply(
    `type`: pointermove,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}
