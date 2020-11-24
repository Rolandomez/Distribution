package typings.fundamentalReact.actionBarMod

import typings.fundamentalReact.anon.PartialActionBarProps
import typings.fundamentalReact.anon.WeakValidationMapActionBa
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react/lib/ActionBar/ActionBar", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[ActionBarProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ActionBarProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialActionBarProps] = js.native
  
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.ActionBar | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapActionBa] = js.native
}
