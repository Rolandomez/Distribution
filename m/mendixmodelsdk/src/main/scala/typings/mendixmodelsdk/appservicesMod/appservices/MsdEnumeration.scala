package typings.mendixmodelsdk.appservicesMod.appservices

import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumeration")
@js.native
class MsdEnumeration protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMsdEnumeration: IModel = js.native
  def containerAsMsdEnumerationContainer: MsdEnumerationContainer = js.native
  def guid: String = js.native
  def guid_=(newValue: String): Unit = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  def values: IList[MsdEnumerationValue] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumeration")
@js.native
object MsdEnumeration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdEnumeration = js.native
  /**
    * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
    * The new MsdEnumeration will be automatically stored in the 'enumerations' property
    * of the parent MsdEnumerationContainer element passed as argument.
    */
  def createIn(container: MsdEnumerationContainer): MsdEnumeration = js.native
}

