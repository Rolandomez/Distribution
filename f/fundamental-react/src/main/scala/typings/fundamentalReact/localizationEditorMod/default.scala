package typings.fundamentalReact.localizationEditorMod

import typings.fundamentalReact.anon.PartialLocalizationEditor
import typings.fundamentalReact.anon.WeakValidationMapLocaliza
import typings.fundamentalReact.fundamentalReactStrings.LocalizationEditor
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[LocalizationEditorProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[LocalizationEditorProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialLocalizationEditor] = js.native
  
  var displayName: js.UndefOr[LocalizationEditor | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapLocaliza] = js.native
}
