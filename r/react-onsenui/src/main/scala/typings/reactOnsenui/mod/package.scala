package typings.reactOnsenui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HTMLAttributes[K /* <: /* keyof react.react.HTMLAttributes<{}> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any */] = typings.std.Partial[typings.std.Pick[typings.react.mod.HTMLAttributes[js.Object], K]]
  
  type InputHTMLAttributes[K /* <: /* keyof react.react.InputHTMLAttributes<{}> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 205 */ js.Any */] = typings.std.Partial[typings.std.Pick[typings.react.mod.InputHTMLAttributes[js.Object], K]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactOnsenui.reactOnsenuiStrings.slide
    - typings.reactOnsenui.reactOnsenuiStrings.lift
    - typings.reactOnsenui.reactOnsenuiStrings.fade
    - typings.reactOnsenui.reactOnsenuiStrings.none
    - java.lang.String
  */
  type NavigatorAnimationTypes = typings.reactOnsenui.mod._NavigatorAnimationTypes | java.lang.String
  
  type Route = js.Any
  
  type RouterProcess = js.Object
}
