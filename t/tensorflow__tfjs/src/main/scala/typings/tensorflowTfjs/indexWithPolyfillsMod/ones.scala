package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "ones")
@js.native
object ones extends js.Object {
  /**
    * Creates a `tf.Tensor` with all elements set to 1.
    *
    * ```js
    * tf.ones([2, 2]).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param dtype The type of an element in the resulting tensor. Defaults to
    *     'float'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = js.native
}

