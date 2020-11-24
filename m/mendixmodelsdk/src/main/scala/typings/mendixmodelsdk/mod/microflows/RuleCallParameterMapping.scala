package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.RuleCallParameterMapping")
@js.native
class RuleCallParameterMapping protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.RuleCallParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "microflows.RuleCallParameterMapping")
@js.native
object RuleCallParameterMapping extends js.Object {
  
  /**
    * Creates and returns a new RuleCallParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.RuleCallParameterMapping = js.native
  
  /**
    * Creates and returns a new RuleCallParameterMapping instance in the SDK and on the server.
    * The new RuleCallParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent RuleCall element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.microflowsMod.microflows.RuleCall): typings.mendixmodelsdk.microflowsMod.microflows.RuleCallParameterMapping = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
