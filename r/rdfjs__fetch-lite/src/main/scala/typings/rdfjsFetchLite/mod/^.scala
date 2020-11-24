package typings.rdfjsFetchLite.mod

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rdfjs/fetch-lite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(url: String, options: FormatsInit): js.Promise[RdfFetchResponse[Quad]] = js.native
  def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String, options: FactoryInit[D, OutQuad, InQuad]): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = js.native
}
