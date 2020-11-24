package typings.ionicReact.createControllerComponentMod

import typings.ionicReact.anon.Create
import typings.ionicReact.anon.ForwardedRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/components/createControllerComponent", "createControllerComponent")
@js.native
object createControllerComponent extends js.Object {
  
  def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](displayName: String, controller: Create[OptionsType, OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OptionsType with ReactControllerProps with ForwardedRef[OverlayType]]) with RefAttributes[OverlayType]
  ] = js.native
}
