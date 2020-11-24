package typings.stormReactDiagrams

import typings.react.mod.global.JSX.Element
import typings.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.labelModelMod.LabelModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/factories/AbstractLabelFactory", JSImport.Namespace)
@js.native
object abstractLabelFactoryMod extends js.Object {
  
  @js.native
  abstract class AbstractLabelFactory[T /* <: LabelModel */] () extends AbstractFactory[T] {
    
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): Element = js.native
  }
}
