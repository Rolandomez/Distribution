package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.datatypesMod.datatypes.IDataType
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined returnType, microflowReturnType */ @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowBase")
@js.native
abstract class MicroflowBase protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMicroflowBase: FolderBase = js.native
  
  def flows: IList[Flow] = js.native
  
  def markAsUsed: Boolean = js.native
  def markAsUsed_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.9.0: introduced
    */
  def microflowReturnType: DataType = js.native
  def microflowReturnType_=(newValue: DataType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.9.0: introduced
    */
  @JSName("microflowReturnType")
  val microflowReturnType_FMicroflowBase: IDataType = js.native
  
  def objectCollection: MicroflowObjectCollection = js.native
  def objectCollection_=(newValue: MicroflowObjectCollection): Unit = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def returnType: String = js.native
  def returnType_=(newValue: String): Unit = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  @JSName("returnType")
  val returnType_FMicroflowBase: String | Null = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowBase")
@js.native
object MicroflowBase extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
