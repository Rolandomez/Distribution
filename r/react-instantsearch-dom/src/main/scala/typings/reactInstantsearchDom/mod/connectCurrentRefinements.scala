package typings.reactInstantsearchDom.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.reactInstantsearchCore.anon.PartialCurrentRefinements
import typings.reactInstantsearchCore.mod.ConnectedComponentClass
import typings.reactInstantsearchCore.mod.CurrentRefinementsExposed
import typings.reactInstantsearchCore.mod.CurrentRefinementsProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-instantsearch-dom", "connectCurrentRefinements")
@js.native
object connectCurrentRefinements extends js.Object {
  
  def apply(stateless: FunctionComponent[CurrentRefinementsProvided]): ComponentClass[CurrentRefinementsExposed, ComponentState] = js.native
  def apply[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = js.native
}
