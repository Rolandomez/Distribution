package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.canvas
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
object styled_canvas extends js.Object {
  
  def apply[P /* <: js.Object */, T](component: canvas, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[canvas], 
      Exclude[/* keyof react.react.ComponentProps<'canvas'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: canvas, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[canvas], 
      Exclude[/* keyof react.react.ComponentProps<'canvas'> */ String, ClassName]
    ]) with P
  ] = js.native
}
