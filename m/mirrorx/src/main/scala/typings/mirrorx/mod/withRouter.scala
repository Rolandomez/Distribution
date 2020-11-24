package typings.mirrorx.mod

import typings.mirrorx.mirrorxStrings.`match`
import typings.mirrorx.mirrorxStrings.history
import typings.mirrorx.mirrorxStrings.location
import typings.mirrorx.mirrorxStrings.staticContext
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirrorx", "withRouter")
@js.native
object withRouter extends js.Object {
  
  def apply[P /* <: RouteComponentProps[_] */](component: ComponentType[P]): ComponentClass[
    Omit[
      P, 
      /* keyof mirrorx.mirrorx.RouteComponentProps<any> */ `match` | location | history | staticContext
    ], 
    ComponentState
  ] = js.native
  def apply[TFunction /* <: ComponentClass[_, ComponentState] */](target: TFunction): TFunction = js.native
}
