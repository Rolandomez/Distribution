package typings.reactVirtualized.esWindowScrollerMod

import typings.react.mod.Component
import typings.reactVirtualized.anon.OnResize
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/es/WindowScroller", "WindowScroller")
@js.native
class WindowScroller ()
  extends Component[WindowScrollerProps, WindowScrollerState, js.Any] {
  
  def updatePosition(): Unit = js.native
  def updatePosition(scrollElement: HTMLElement): Unit = js.native
}
/* static members */
@JSImport("react-virtualized/dist/es/WindowScroller", "WindowScroller")
@js.native
object WindowScroller extends js.Object {
  
  var defaultProps: OnResize = js.native
}
