package typings.reactAddonsTestUtils.mod

import typings.react.mod.CElement
import typings.react.mod.Component
import typings.react.mod.DOMElement
import typings.react.mod.ReactElement
import typings.react.mod.SFCElement
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-addons-test-utils", "renderIntoDocument")
@js.native
object renderIntoDocument extends js.Object {
  
  def apply(element: SFCElement[_]): Unit = js.native
  def apply[T /* <: Component[_, js.Object, _] */](element: CElement[_, T]): T = js.native
  def apply[T /* <: Element */](element: DOMElement[_, T]): T = js.native
  def apply[P](element: ReactElement): (Component[P, js.Object, _]) | Element | Unit = js.native
}
