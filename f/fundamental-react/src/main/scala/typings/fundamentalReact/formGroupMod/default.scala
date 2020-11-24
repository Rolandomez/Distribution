package typings.fundamentalReact.formGroupMod

import typings.fundamentalReact.anon.PartialFormGroupProps
import typings.fundamentalReact.anon.WeakValidationMapFormGrou
import typings.fundamentalReact.fundamentalReactStrings.FormGroup
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react/lib/Forms/FormGroup", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[FormGroupProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[FormGroupProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialFormGroupProps] = js.native
  
  var displayName: js.UndefOr[FormGroup | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapFormGrou] = js.native
}
