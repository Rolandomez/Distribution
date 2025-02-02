package typings.mendixmodelsdk.srcGenAllModelClassesMod.settings

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.0.0: deleted
  * In version 6.9.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.JavaActionsSettings")
@js.native
open class JavaActionsSettings protected ()
  extends typings.mendixmodelsdk.srcGenSettingsMod.settings.JavaActionsSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object JavaActionsSettings {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.JavaActionsSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new JavaActionsSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenSettingsMod.settings.JavaActionsSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenSettingsMod.settings.JavaActionsSettings]
  
  /**
    * Creates and returns a new JavaActionsSettings instance in the SDK and on the server.
    * The new JavaActionsSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 to 7.23.0
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenSettingsMod.settings.ProjectSettings): typings.mendixmodelsdk.srcGenSettingsMod.settings.JavaActionsSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenSettingsMod.settings.JavaActionsSettings]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.JavaActionsSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.JavaActionsSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
