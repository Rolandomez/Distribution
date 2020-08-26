package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rx.Rx.Observable
import typings.std.Element
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.pointerout")
@js.native
object pointerout extends js.Object {
  def apply(element: Element): Observable[PointerEvent] = js.native
  def apply(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): Observable[PointerEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[PointerEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = js.native
}

