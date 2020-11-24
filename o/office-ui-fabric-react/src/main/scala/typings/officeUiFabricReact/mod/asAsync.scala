package typings.officeUiFabricReact.mod

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.uifabricUtilities.anon.AsyncPlaceholder
import typings.uifabricUtilities.asAsyncMod.IAsAsyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "asAsync")
@js.native
object asAsync extends js.Object {
  
  def apply[TProps](options: IAsAsyncOptions[TProps]): ForwardRefExoticComponent[
    (PropsWithoutRef[TProps with AsyncPlaceholder]) with RefAttributes[typings.react.mod.ElementType[TProps]]
  ] = js.native
}
