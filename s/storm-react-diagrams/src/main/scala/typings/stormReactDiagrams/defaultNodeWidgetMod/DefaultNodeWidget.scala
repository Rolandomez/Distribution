package typings.stormReactDiagrams.defaultNodeWidgetMod

import typings.react.mod.global.JSX.Element
import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultNodeWidget", "DefaultNodeWidget")
@js.native
class DefaultNodeWidget protected () extends BaseWidget[DefaultNodeProps, DefaultNodeState] {
  def this(props: DefaultNodeProps) = this()
  
  def generatePort(port: js.Any): Element = js.native
}
