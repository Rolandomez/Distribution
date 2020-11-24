package typings.videoJs.mod.default

import typings.std.Element
import typings.videoJs.mod.videojs.EventTarget.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js", "off")
@js.native
object off extends js.Object {
  
  /**
    * Removes event listeners from an element
    *
    * @param elem
    *        Object to remove listeners from.
    *
    * @param [type]
    *        Type of listener to remove. Don't include to remove all events from element.
    *
    * @param [fn]
    *        Specific listener to remove. Don't include to remove listeners for an event
    *        type.
    */
  def apply(elem: Element, `type`: String, fn: EventListener): Unit = js.native
}
