package typings.wheel

import typings.std.GlobalEventHandlers
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wheel", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(element: GlobalEventHandlers, callback: js.Function1[/* event */ WheelEvent, Unit]): Unit = js.native
  def apply(
    element: GlobalEventHandlers,
    callback: js.Function1[/* event */ WheelEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  
  /**
    * Adds a callback to receive mouse wheel events from the given element.
    */
  def addWheelListener(element: GlobalEventHandlers, callback: js.Function1[/* event */ WheelEvent, Unit]): Unit = js.native
  def addWheelListener(
    element: GlobalEventHandlers,
    callback: js.Function1[/* event */ WheelEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  
  /**
    *  Removes a previously added wheel listener callback.
    */
  def removeWheelListener(element: GlobalEventHandlers, callback: js.Function1[/* event */ WheelEvent, Unit]): Unit = js.native
  def removeWheelListener(
    element: GlobalEventHandlers,
    callback: js.Function1[/* event */ WheelEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
}
