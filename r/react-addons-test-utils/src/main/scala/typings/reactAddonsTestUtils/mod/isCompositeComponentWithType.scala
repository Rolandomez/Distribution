package typings.reactAddonsTestUtils.mod

import typings.react.mod.ClassType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-addons-test-utils", "isCompositeComponentWithType")
@js.native
object isCompositeComponentWithType extends js.Object {
  
  def apply[T /* <: Component[_, js.Object, _] */, C /* <: ComponentClass[_, ComponentState] */](instance: ReactInstance, `type`: ClassType[_, T, C]): T = js.native
}
