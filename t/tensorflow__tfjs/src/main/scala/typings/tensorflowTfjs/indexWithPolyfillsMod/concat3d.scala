package typings.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "concat3d")
@js.native
object concat3d
  extends TopLevel[
      js.Function2[/* tensors */ js.Array[Tensor3D | TensorLike], /* axis */ Double, Tensor3D]
    ]

