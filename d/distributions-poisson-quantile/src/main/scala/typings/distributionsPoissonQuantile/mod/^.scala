package typings.distributionsPoissonQuantile.mod

import typings.distributionsPoissonQuantile.anon.Optionsdtypefloat32
import typings.distributionsPoissonQuantile.anon.Optionsdtypefloat64undefi
import typings.distributionsPoissonQuantile.anon.Optionsdtypeint16
import typings.distributionsPoissonQuantile.anon.Optionsdtypeint32
import typings.distributionsPoissonQuantile.anon.Optionsdtypeint8
import typings.distributionsPoissonQuantile.anon.Optionsdtypeuint16
import typings.distributionsPoissonQuantile.anon.Optionsdtypeuint32
import typings.distributionsPoissonQuantile.anon.Optionsdtypeuint8
import typings.distributionsPoissonQuantile.anon.Optionsdtypeuint8clamped
import typings.distributionsPoissonQuantile.anon.Optionsdtypeundefined
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("distributions-poisson-quantile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(p: js.Array[Double]): js.Array[Double] = js.native
  def apply(p: js.Array[Double], options: Optionsdtypeundefined): js.Array[Double] = js.native
  /**
    * Evaluates the quantile function for a Poisson distribution.
    * @param p input value
    * @param options function options
    * @returns quantile function value(s)
    */
  def apply(p: Double): Double | Data | Matrix = js.native
  def apply(p: Double, options: Options): Double | Data | Matrix = js.native
  def apply(p: Data): Double | Data | Matrix = js.native
  def apply(p: Data, options: Optionsdtypefloat32): Float32Array = js.native
  def apply(p: Data, options: Optionsdtypefloat64undefi): Float64Array = js.native
  def apply(p: Data, options: Optionsdtypeint16): Int16Array = js.native
  def apply(p: Data, options: Optionsdtypeint32): Int32Array = js.native
  def apply(p: Data, options: Optionsdtypeint8): Int8Array = js.native
  def apply(p: Data, options: Optionsdtypeuint16): Uint16Array = js.native
  def apply(p: Data, options: Optionsdtypeuint32): Uint32Array = js.native
  def apply(p: Data, options: Optionsdtypeuint8): Uint8Array = js.native
  def apply(p: Data, options: Optionsdtypeuint8clamped): Uint8ClampedArray = js.native
  def apply(p: Data, options: Options): Double | Data | Matrix = js.native
  def apply(p: MatrixLike): Double | Data | Matrix = js.native
  def apply(p: MatrixLike, options: Options): Double | Data | Matrix = js.native
}
