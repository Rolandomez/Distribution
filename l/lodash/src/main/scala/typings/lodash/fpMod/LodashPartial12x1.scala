package typings.lodash.fpMod

import typings.lodash.mod.Function1
import typings.lodash.mod.Function2
import typings.lodash.mod.Function3
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPartial12x1[T1, T2, T3, T4, R] extends js.Object {
  def apply(arg1: js.Array[T1]): Function3[T2, T3, T4, R] = js.native
  def apply(arg1: js.Tuple2[T1, T2]): Function2[T3, T4, R] = js.native
  def apply(arg1: js.Tuple3[T1, T2, T3]): Function1[T4, R] = js.native
  def apply(arg1: js.Tuple4[T1 | __, T2 | __, T3 | __, T4]): Function1[T3, R] = js.native
}

