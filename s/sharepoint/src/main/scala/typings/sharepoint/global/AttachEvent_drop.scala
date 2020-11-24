package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.drop
import typings.std.DragEvent
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_drop extends js.Object {
  
  def apply(
    `type`: drop,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}
