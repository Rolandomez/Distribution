package typings.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.anon.Mean
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "moments")
@js.native
object moments
  extends TopLevel[
      js.Function3[
        /* x */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        /* keepDims */ js.UndefOr[Boolean], 
        Mean
      ]
    ]

