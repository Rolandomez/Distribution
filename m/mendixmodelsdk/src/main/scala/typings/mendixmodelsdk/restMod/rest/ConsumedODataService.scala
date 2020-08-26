package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.constantsMod.constants.IConstant
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.RemoteEntitySourceDocument
import typings.mendixmodelsdk.expressionsMod.expressions.Expression
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.microflowsMod.microflows.RequestProxyType
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-odata-services relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.18.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument because Already inherited
- typings.mendixmodelsdk.restMod.rest.IConsumedODataService because var conflicts: containerAsFolderBase, icon, id, isLoaded, model, structureTypeName, unit. Inlined serviceName, version, applicationId */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ConsumedODataService")
@js.native
class ConsumedODataService protected () extends RemoteEntitySourceDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  /**
    * In version 8.12.0: added public
    * In version 8.11.0: introduced
    */
  @JSName("applicationId")
  val applicationId_FConsumedODataService: String = js.native
  @JSName("model")
  var model_FConsumedODataService: IModel = js.native
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  @JSName("serviceName")
  val serviceName_FConsumedODataService: String = js.native
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  @JSName("version")
  val version_FConsumedODataService: String = js.native
  /**
    * In version 8.12.0: added public
    * In version 8.11.0: introduced
    */
  def applicationId: String = js.native
  def applicationId_=(newValue: String): Unit = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MConsumedODataService: FolderBase = js.native
  /**
    * In version 8.4.0: introduced
    */
  def headersMicroflow: IMicroflow | Null = js.native
  def headersMicroflowQualifiedName: String | Null = js.native
  def headersMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  /**
    * In version 8.0.0: introduced
    */
  def httpConfiguration: HttpConfiguration = js.native
  def httpConfiguration_=(newValue: HttpConfiguration): Unit = js.native
  def metadata: String = js.native
  /**
    * In version 8.6.0: introduced
    */
  def metadataReferences: IList[MetadataReference] = js.native
  def metadataUrl: String = js.native
  def metadataUrl_=(newValue: String): Unit = js.native
  def metadata_=(newValue: String): Unit = js.native
  /**
    * In version 8.6.0: introduced
    */
  def oDataVersion: ODataVersion = js.native
  def oDataVersion_=(newValue: ODataVersion): Unit = js.native
  def proxyHost: IConstant | Null = js.native
  def proxyHostQualifiedName: String | Null = js.native
  def proxyHost_=(newValue: IConstant | Null): Unit = js.native
  def proxyPassword: IConstant | Null = js.native
  def proxyPasswordQualifiedName: String | Null = js.native
  def proxyPassword_=(newValue: IConstant | Null): Unit = js.native
  def proxyPort: IConstant | Null = js.native
  def proxyPortQualifiedName: String | Null = js.native
  def proxyPort_=(newValue: IConstant | Null): Unit = js.native
  def proxyType: RequestProxyType = js.native
  def proxyType_=(newValue: RequestProxyType): Unit = js.native
  def proxyUsername: IConstant | Null = js.native
  def proxyUsernameQualifiedName: String | Null = js.native
  def proxyUsername_=(newValue: IConstant | Null): Unit = js.native
  /**
    * In version 8.0.0: introduced
    */
  def serviceId: String = js.native
  def serviceId_=(newValue: String): Unit = js.native
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  def serviceName: String = js.native
  def serviceName_=(newValue: String): Unit = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.5.0: introduced
    */
  def timeoutExpression: String = js.native
  def timeoutExpression_=(newValue: String): Unit = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.5.0: introduced
    */
  def timeoutModel: Expression = js.native
  def timeoutModel_=(newValue: Expression): Unit = js.native
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  def version: String = js.native
  def version_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.ConsumedODataService")
@js.native
object ConsumedODataService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new ConsumedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): ConsumedODataService = js.native
}

