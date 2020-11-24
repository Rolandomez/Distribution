package typings.videoJs.videoCoreMod.default

import typings.std.Element
import typings.videoJs.mod.videojs.EventTarget.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js/dist/alt/video.core", "one")
@js.native
object one extends js.Object {
  
  /**
    * Trigger a listener only once for an event
    *
    * @param elem
    *        Element or object to bind to.
    *
    * @param type
    *        Name/type of event
    *
    * @param fn
    *        Event Listener function
    */
  def apply(elem: Element, `type`: String, fn: EventListener): Unit = js.native
  def apply(elem: Element, `type`: js.Array[String], fn: EventListener): Unit = js.native
}
