package typings.d3Array.mod

import typings.std.ArrayLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramCommon[Datum, Value /* <: js.UndefOr[Double | Date] */] extends js.Object {
  
  def apply(data: ArrayLike[Datum]): js.Array[Bin_[Datum, Value]] = js.native
  
  def value(): js.Function3[/* d */ Datum, /* i */ Double, /* data */ ArrayLike[Datum], Value] = js.native
  def value(valueAccessor: js.Function3[/* d */ Datum, /* i */ Double, /* data */ ArrayLike[Datum], Value]): this.type = js.native
}
