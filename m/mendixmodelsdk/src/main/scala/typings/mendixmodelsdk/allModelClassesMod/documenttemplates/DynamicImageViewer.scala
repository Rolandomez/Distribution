package typings.mendixmodelsdk.allModelClassesMod.documenttemplates

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/dynamic-image-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DynamicImageViewer")
@js.native
class DynamicImageViewer protected ()
  extends typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicImageViewer {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DynamicImageViewer")
@js.native
object DynamicImageViewer extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicImageViewer = js.native
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * The new DynamicImageViewer will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicImageViewer = js.native
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * The new DynamicImageViewer will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DropZone): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicImageViewer = js.native
}

