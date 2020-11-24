package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.securityMod.security.IModuleRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/nanoflows relevant section in reference guide}
  *
  * In version 7.12.0: removed experimental
  * In version 7.10.0: introduced
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
- typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase because Already inherited
- typings.mendixmodelsdk.microflowsMod.microflows.INanoflow because var conflicts: containerAsFolderBase, id, isLoaded, microflowReturnType, model, returnType, structureTypeName, unit. Inlined allowedModuleRoles, allowedModuleRolesQualifiedNames */ @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Nanoflow")
@js.native
class Nanoflow protected () extends MicroflowBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  /**
    * In version 7.23.0: added public
    */
  def allowedModuleRoles: IList[IModuleRole] = js.native
  
  def allowedModuleRolesQualifiedNames: js.Array[String] = js.native
  @JSName("allowedModuleRolesQualifiedNames")
  val allowedModuleRolesQualifiedNames_FNanoflow: js.Array[String] = js.native
  
  /**
    * In version 7.23.0: added public
    */
  @JSName("allowedModuleRoles")
  val allowedModuleRoles_FNanoflow: IList[IModuleRole] = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MNanoflow: FolderBase = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Nanoflow")
@js.native
object Nanoflow extends js.Object {
  
  /**
    * Creates a new Nanoflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Nanoflow = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
