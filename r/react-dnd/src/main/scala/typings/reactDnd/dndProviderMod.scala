package typings.reactDnd

import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd/lib/common/DndProvider", JSImport.Namespace)
@js.native
object dndProviderMod extends js.Object {
  
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDnd.anon.Manager
    - typings.reactDnd.anon.Backend[BackendContext, BackendOptions]
  */
  trait DndProviderProps[BackendContext, BackendOptions] extends js.Object
}
