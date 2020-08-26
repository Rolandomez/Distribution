package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.commonMod.common.IPoint
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/entities relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, generalization, attributes, isRemote, remoteSourceDocument, remoteSourceDocumentQualifiedName, source, capabilities */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Entity")
@js.native
class Entity protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("attributes")
  val attributes_FEntity: IList[IAttribute] = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.12.0: introduced
    */
  @JSName("capabilities")
  val capabilities_FEntity: IEntityCapabilities = js.native
  @JSName("containerAsDomainModel")
  val containerAsDomainModel_FEntity: IDomainModel = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("generalization")
  val generalization_FEntity: IGeneralizationBase = js.native
  /**
    * In version 8.10.0: deleted
    * In version 8.2.0: added public
    * In version 7.17.0: introduced
    */
  @JSName("isRemote")
  val isRemote_FEntity: Boolean = js.native
  @JSName("model")
  var model_FEntity: IModel = js.native
  @JSName("name")
  val name_FEntity: String = js.native
  @JSName("remoteSourceDocumentQualifiedName")
  val remoteSourceDocumentQualifiedName_FEntity: String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.10.0: deleted
    * In version 8.2.0: introduced
    */
  @JSName("remoteSourceDocument")
  val remoteSourceDocument_FEntity: IRemoteEntitySourceDocument | Null = js.native
  /**
    * In version 8.10.0: introduced
    */
  @JSName("source")
  val source_FEntity: IEntitySource | Null = js.native
  def accessRules: IList[AccessRule] = js.native
  def attributes: IList[Attribute] = js.native
  /**
    * In version 8.12.0: introduced
    */
  def capabilities: EntityCapabilities = js.native
  def capabilities_=(newValue: EntityCapabilities): Unit = js.native
  def containerAsDomainModel: DomainModel = js.native
  def dataStorageGuid: String = js.native
  def dataStorageGuid_=(newValue: String): Unit = js.native
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  def eventHandlers: IList[EventHandler] = js.native
  def generalization: GeneralizationBase = js.native
  def generalization_=(newValue: GeneralizationBase): Unit = js.native
  def image: IImage | Null = js.native
  def imageQualifiedName: String | Null = js.native
  def image_=(newValue: IImage | Null): Unit = js.native
  def indexes: IList[Index] = js.native
  /**
    * In version 8.10.0: deleted
    * In version 8.2.0: added public
    * In version 7.17.0: introduced
    */
  def isRemote: Boolean = js.native
  def isRemote_=(newValue: Boolean): Unit = js.native
  def location: IPoint = js.native
  def location_=(newValue: IPoint): Unit = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("qualifiedName")
  def qualifiedName_MEntity: String | Null = js.native
  /**
    * In version 8.10.0: deleted
    * In version 7.17.0: introduced
    */
  def remoteSource: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.10.0: deleted
    * In version 8.2.0: introduced
    */
  def remoteSourceDocument: IRemoteEntitySourceDocument | Null = js.native
  def remoteSourceDocumentQualifiedName: String | Null = js.native
  def remoteSourceDocument_=(newValue: IRemoteEntitySourceDocument | Null): Unit = js.native
  def remoteSource_=(newValue: String): Unit = js.native
  /**
    * In version 8.10.0: introduced
    */
  def source: EntitySource | Null = js.native
  def source_=(newValue: EntitySource | Null): Unit = js.native
  def validationRules: IList[ValidationRule] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Entity")
@js.native
object Entity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Entity = js.native
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * The new Entity will be automatically stored in the 'entities' property
    * of the parent DomainModel element passed as argument.
    */
  def createIn(container: DomainModel): Entity = js.native
}

