package typings.tstl.tstlModuleMod

import typings.tstl.generalMod.General
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.unaryPredicatorMod.UnaryPredicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "replace_if")
@js.native
object replaceIf extends js.Object {
  
  def apply[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: UnaryPredicator[ValueType[InputIterator]],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
}
