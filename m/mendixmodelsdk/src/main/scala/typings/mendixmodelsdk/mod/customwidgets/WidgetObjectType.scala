package typings.mendixmodelsdk.mod.customwidgets

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType")
@js.native
class WidgetObjectType protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetObjectType {
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
@JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType")
@js.native
object WidgetObjectType extends js.Object {
  
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
  
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * The new WidgetObjectType will be automatically stored in the 'objectType' property
    * of the parent CustomWidgetType element passed as argument.
    */
  def createInCustomWidgetTypeUnderObjectType(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetType): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
  
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * The new WidgetObjectType will be automatically stored in the 'objectType' property
    * of the parent WidgetValueType element passed as argument.
    */
  def createInWidgetValueTypeUnderObjectType(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
