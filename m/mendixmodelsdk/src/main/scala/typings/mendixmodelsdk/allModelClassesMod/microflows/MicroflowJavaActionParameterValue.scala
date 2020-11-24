package typings.mendixmodelsdk.allModelClassesMod.microflows

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

/**
  * In version 7.21.0: deleted
  * In version 6.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowJavaActionParameterValue")
@js.native
class MicroflowJavaActionParameterValue protected ()
  extends typings.mendixmodelsdk.microflowsMod.microflows.MicroflowJavaActionParameterValue {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowJavaActionParameterValue")
@js.native
object MicroflowJavaActionParameterValue extends js.Object {
  
  /**
    * Creates and returns a new MicroflowJavaActionParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.MicroflowJavaActionParameterValue = js.native
  
  /**
    * Creates and returns a new MicroflowJavaActionParameterValue instance in the SDK and on the server.
    * The new MicroflowJavaActionParameterValue will be automatically stored in the 'value' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 to 7.20.0
    */
  def createIn(container: typings.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping): typings.mendixmodelsdk.microflowsMod.microflows.MicroflowJavaActionParameterValue = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
