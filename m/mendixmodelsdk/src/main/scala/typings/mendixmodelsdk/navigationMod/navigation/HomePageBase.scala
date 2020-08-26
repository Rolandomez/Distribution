package typings.mendixmodelsdk.navigationMod.navigation

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.navigationMod.StructureVersionInfo
import typings.mendixmodelsdk.pagesMod.pages.IPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
  */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePageBase")
@js.native
abstract class HomePageBase protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FHomePageBase: IModel = js.native
  def containerAsNavigationProfile: NavigationProfile = js.native
  def microflow: IMicroflow | Null = js.native
  def microflowQualifiedName: String | Null = js.native
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  def page: IPage | Null = js.native
  def pageQualifiedName: String | Null = js.native
  def page_=(newValue: IPage | Null): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePageBase")
@js.native
object HomePageBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

