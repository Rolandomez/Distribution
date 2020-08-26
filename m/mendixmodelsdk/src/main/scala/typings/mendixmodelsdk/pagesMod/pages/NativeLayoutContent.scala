package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.pagesMod.pages.ILayoutContent because Already inherited
- typings.mendixmodelsdk.pagesMod.pages.INativeLayoutContent because var conflicts: containerAsLayout, id, isLoaded, model, structureTypeName, unit. Inlined layoutType */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NativeLayoutContent")
@js.native
class NativeLayoutContent protected () extends LayoutContent {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 8.5.0: introduced
    */
  @JSName("layoutType")
  val layoutType_FNativeLayoutContent: NativeLayoutType = js.native
  @JSName("model")
  var model_FNativeLayoutContent: IModel = js.native
  @JSName("containerAsLayout")
  def containerAsLayout_MNativeLayoutContent: Layout = js.native
  /**
    * In version 8.5.0: introduced
    */
  def layoutType: NativeLayoutType = js.native
  def layoutType_=(newValue: NativeLayoutType): Unit = js.native
  def rightHeaderPlaceholder: Placeholder | Null = js.native
  def rightHeaderPlaceholder_=(newValue: Placeholder | Null): Unit = js.native
  /**
    * In version 8.2.0: introduced
    */
  def showBottomBar: Boolean = js.native
  def showBottomBar_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.5.0: introduced
    */
  def sidebar: Boolean = js.native
  /**
    * In version 8.5.0: introduced
    */
  def sidebarWidgets: IList[Widget] = js.native
  def sidebar_=(newValue: Boolean): Unit = js.native
  def widgets: IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NativeLayoutContent")
@js.native
object NativeLayoutContent extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NativeLayoutContent instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NativeLayoutContent = js.native
  /**
    * Creates and returns a new NativeLayoutContent instance in the SDK and on the server.
    * The new NativeLayoutContent will be automatically stored in the 'content' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: Layout): NativeLayoutContent = js.native
}

