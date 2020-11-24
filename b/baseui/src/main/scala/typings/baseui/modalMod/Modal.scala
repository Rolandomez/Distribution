package typings.baseui.modalMod

import typings.baseui.anon.SharedStylePropsArgchildrAnimate
import typings.baseui.baseuiStrings.backdrop
import typings.baseui.baseuiStrings.closeButton
import typings.baseui.baseuiStrings.escape_
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/modal", "Modal")
@js.native
class Modal ()
  extends Component[ModalProps, ModalState, js.Any] {
  
  def addDomEvents(): Unit = js.native
  
  def animateOutComplete(): Unit = js.native
  
  def autoFocus(): Unit = js.native
  
  def captureLastFocus(): Unit = js.native
  
  def clearTimers(): Unit = js.native
  
  def didClose(): Unit = js.native
  
  def didOpen(): Unit = js.native
  
  def disableMountNodeScroll(): Unit = js.native
  
  def getChildren(): ReactNode = js.native
  
  def getMountNode(): HTMLElement = js.native
  
  def getRef(component: String): Ref[_] = js.native
  
  def getSharedProps(): SharedStylePropsArgchildrAnimate = js.native
  
  def onBackdropClick(): Unit = js.native
  
  def onCloseClick(): Unit = js.native
  
  def onDocumentKeyPress(event: KeyboardEvent): Unit = js.native
  
  def removeDomEvents(): Unit = js.native
  
  def renderModal(): ReactNode = js.native
  
  def resentMountNodeScroll(): Unit = js.native
  
  def restoreLastFocus(): Unit = js.native
  
  @JSName("triggerClose")
  def triggerClose_backdrop(source: backdrop): Unit = js.native
  @JSName("triggerClose")
  def triggerClose_closeButton(source: closeButton): Unit = js.native
  @JSName("triggerClose")
  def triggerClose_escape(source: escape_): Unit = js.native
}
