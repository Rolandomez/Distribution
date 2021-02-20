package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.MenuDotGroup
import typings.fundamentalReact.menuMod.MenuGroupProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuGroupProps> & {  displayName :'Menu.Group'} */
@js.native
trait FunctionComponentMenuGrou extends StObject {
  
  def apply(props: PropsWithChildren[MenuGroupProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[MenuGroupProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialMenuGroupProps] = js.native
  
  var displayName: js.UndefOr[String] with MenuDotGroup = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMenuGrou] = js.native
}
