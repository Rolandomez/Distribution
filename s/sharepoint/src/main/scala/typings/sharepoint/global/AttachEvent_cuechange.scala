package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.cuechange
import typings.std.Event
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_cuechange extends js.Object {
  
  def apply(
    `type`: cuechange,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}
