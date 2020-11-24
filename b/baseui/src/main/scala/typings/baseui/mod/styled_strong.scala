package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.strong
import typings.react.mod.ComponentProps
import typings.std.Exclude
import typings.std.Pick
import typings.styletronReact.mod.StyletronComponent
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui", "styled")
@js.native
object styled_strong extends js.Object {
  
  def apply[P /* <: js.Object */, T](component: strong, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[strong], 
      Exclude[/* keyof react.react.ComponentProps<'strong'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: strong, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[strong], 
      Exclude[/* keyof react.react.ComponentProps<'strong'> */ String, ClassName]
    ]) with P
  ] = js.native
}
