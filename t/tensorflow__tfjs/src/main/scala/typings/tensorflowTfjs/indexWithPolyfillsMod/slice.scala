package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "slice")
@js.native
object slice extends js.Object {
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double]): T = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double], size: js.Array[Double]): T = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double], size: Double): T = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: Double): T = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: Double, size: js.Array[Double]): T = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: T, begin: Double, size: Double): T = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double]): T = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double], size: js.Array[Double]): T = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double], size: Double): T = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double): T = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double, size: js.Array[Double]): T = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double, size: Double): T = js.native
}

