package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/configuration relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Configuration")
@js.native
class Configuration protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FConfiguration: IModel = js.native
  def adminPortNumber: Double = js.native
  def adminPortNumber_=(newValue: Double): Unit = js.native
  def adminPortOnlyLocal: Boolean = js.native
  def adminPortOnlyLocal_=(newValue: Boolean): Unit = js.native
  def applicationRootUrl: String = js.native
  def applicationRootUrl_=(newValue: String): Unit = js.native
  def constantValues: IList[ConstantValue] = js.native
  def containerAsConfigurationSettings: ConfigurationSettings = js.native
  def customSettings: IList[CustomSetting] = js.native
  def databaseName: String = js.native
  def databaseName_=(newValue: String): Unit = js.native
  def databasePassword: String = js.native
  def databasePassword_=(newValue: String): Unit = js.native
  def databaseType: DatabaseType = js.native
  def databaseType_=(newValue: DatabaseType): Unit = js.native
  def databaseUrl: String = js.native
  def databaseUrl_=(newValue: String): Unit = js.native
  def databaseUseIntegratedSecurity: Boolean = js.native
  def databaseUseIntegratedSecurity_=(newValue: Boolean): Unit = js.native
  def databaseUserName: String = js.native
  def databaseUserName_=(newValue: String): Unit = js.native
  /**
    * In version 7.21.0: deleted
    */
  def emulateCloudSecurity: Boolean = js.native
  def emulateCloudSecurity_=(newValue: Boolean): Unit = js.native
  def extraJvmParameters: String = js.native
  def extraJvmParameters_=(newValue: String): Unit = js.native
  def maxJavaHeapSize: Double = js.native
  def maxJavaHeapSize_=(newValue: Double): Unit = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  def runtimePortNumber: Double = js.native
  def runtimePortNumber_=(newValue: Double): Unit = js.native
  def runtimePortOnlyLocal: Boolean = js.native
  def runtimePortOnlyLocal_=(newValue: Boolean): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Configuration")
@js.native
object Configuration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Configuration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Configuration = js.native
  /**
    * Creates and returns a new Configuration instance in the SDK and on the server.
    * The new Configuration will be automatically stored in the 'configurations' property
    * of the parent ConfigurationSettings element passed as argument.
    */
  def createIn(container: ConfigurationSettings): Configuration = js.native
}

