package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.std.Int32Array
import typings.tensorflowTfjs.tensorflowTfjsStrings.int32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "buffer")
@js.native
object buffer_int32 extends js.Object {
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32
  ): typings.tensorflowTfjsCore.tensorMod.TensorBuffer[R, int32] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32,
    values: Int32Array
  ): typings.tensorflowTfjsCore.tensorMod.TensorBuffer[R, int32] = js.native
}

