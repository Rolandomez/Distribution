package typings.tstl.mod

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.unaryPredicatorMod.UnaryPredicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "count_if")
@js.native
object countIf extends js.Object {
  
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, pred: UnaryPredicator[ValueType[InputIterator]]): Double = js.native
}
