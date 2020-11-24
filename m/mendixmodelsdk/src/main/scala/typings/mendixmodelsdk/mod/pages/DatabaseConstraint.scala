package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.DatabaseConstraint")
@js.native
class DatabaseConstraint protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.DatabaseConstraint {
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
@JSImport("mendixmodelsdk", "pages.DatabaseConstraint")
@js.native
object DatabaseConstraint extends js.Object {
  
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.DatabaseConstraint = js.native
  
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * The new DatabaseConstraint will be automatically stored in the 'databaseConstraints' property
    * of the parent DatabaseSourceBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.0.1
    */
  def createIn(container: typings.mendixmodelsdk.pagesMod.pages.DatabaseSourceBase): typings.mendixmodelsdk.pagesMod.pages.DatabaseConstraint = js.native
  
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * The new DatabaseConstraint will be automatically stored in the 'databaseConstraints' property
    * of the parent DatabaseSourceBase element passed as argument.
    */
  def createInDatabaseSourceBaseUnderDatabaseConstraints(container: typings.mendixmodelsdk.pagesMod.pages.DatabaseSourceBase): typings.mendixmodelsdk.pagesMod.pages.DatabaseConstraint = js.native
  
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * The new DatabaseConstraint will be automatically stored in the 'databaseConstraints' property
    * of the parent SelectorDatabaseSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.1.0 and higher
    */
  def createInSelectorDatabaseSourceUnderDatabaseConstraints(container: typings.mendixmodelsdk.pagesMod.pages.SelectorDatabaseSource): typings.mendixmodelsdk.pagesMod.pages.DatabaseConstraint = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
