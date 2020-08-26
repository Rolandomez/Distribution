package typings.officeUiFabricReact.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "getFirstTabbable")
@js.native
object getFirstTabbable extends js.Object {
  def apply(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def apply(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: js.UndefOr[scala.Nothing],
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  def apply(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  def apply(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = js.native
}

