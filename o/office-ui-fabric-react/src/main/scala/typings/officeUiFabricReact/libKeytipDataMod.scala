package typings.officeUiFabricReact

import typings.officeUiFabricReact.keytipDataTypesMod.IKeytipDataProps
import typings.officeUiFabricReact.keytipDataTypesMod.KeytipDataOptions
import typings.react.mod.FunctionComponent
import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.uifabricUtilities.irendercomponentMod.IRenderComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/KeytipData", JSImport.Namespace)
@js.native
object libKeytipDataMod extends js.Object {
  val KeytipData: FunctionComponent[IKeytipDataProps with IRenderComponent[js.Object]] = js.native
  def useKeytipRef[TElement /* <: HTMLElement */](options: KeytipDataOptions): Ref[TElement] = js.native
}

