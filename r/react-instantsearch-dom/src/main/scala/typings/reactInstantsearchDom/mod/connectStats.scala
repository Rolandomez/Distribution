package typings.reactInstantsearchDom.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.reactInstantsearchCore.anon.PartialStatsProvided
import typings.reactInstantsearchCore.mod.ConnectedComponentClass
import typings.reactInstantsearchCore.mod.StatsProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-instantsearch-dom", "connectStats")
@js.native
object connectStats extends js.Object {
  
  def apply(stateless: FunctionComponent[StatsProvided]): ComponentClass[js.Object, ComponentState] = js.native
  def apply[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StatsProvided, js.Object] = js.native
}
