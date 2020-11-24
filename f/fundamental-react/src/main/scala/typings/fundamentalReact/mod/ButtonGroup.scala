package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialButtonGroupProps
import typings.fundamentalReact.anon.WeakValidationMapButtonGr
import typings.fundamentalReact.buttonGroupMod.ButtonGroupProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "ButtonGroup")
@js.native
object ButtonGroup extends js.Object {
  
  def apply(props: PropsWithChildren[ButtonGroupProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ButtonGroupProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialButtonGroupProps] = js.native
  
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.ButtonGroup | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapButtonGr] = js.native
}
