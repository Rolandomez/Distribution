package typings.reactScroll

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactScroll.linkMod.ReactScrollLinkProps
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-scroll/modules/components/Button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  
  @js.native
  class default ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  type Button = Component[ButtonProps, js.Object, js.Any]
  
  type ButtonProps = ReactScrollLinkProps with HTMLProps[HTMLButtonElement]
}
