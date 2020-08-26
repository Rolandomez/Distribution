package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/mat_mul", JSImport.Namespace)
@js.native
object matMulMod extends js.Object {
  @js.native
  object matMul extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: Boolean, transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike, transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike, transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T, transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T, transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T, transposeA: Boolean, transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
  }
  
}

