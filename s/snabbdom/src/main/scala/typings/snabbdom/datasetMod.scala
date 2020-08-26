package typings.snabbdom

import typings.snabbdom.moduleMod.Module
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/build/package/modules/dataset", JSImport.Namespace)
@js.native
object datasetMod extends js.Object {
  val datasetModule: Module = js.native
  type Dataset = Record[String, String]
}

