package typings.fundamentalReact.messageStripMod

import typings.fundamentalReact.anon.PartialMessageStripProps
import typings.fundamentalReact.anon.WeakValidationMapMessageS
import typings.fundamentalReact.fundamentalReactStrings.MessageStrip
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react/lib/MessageStrip/MessageStrip", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[MessageStripProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[MessageStripProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialMessageStripProps] = js.native
  
  var displayName: js.UndefOr[MessageStrip | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMessageS] = js.native
}
