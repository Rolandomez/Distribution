package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTupleType
  extends Node
     with TSType {
  var elementTypes: js.Array[TSType] = js.native
  @JSName("type")
  var type_TSTupleType: typings.babelTypes.babelTypesStrings.TSTupleType = js.native
}

@JSImport("babel-types", "TSTupleType")
@js.native
object TSTupleType extends js.Object {
  def apply(elementTypes: js.Array[TSType]): TSTupleType = js.native
}

