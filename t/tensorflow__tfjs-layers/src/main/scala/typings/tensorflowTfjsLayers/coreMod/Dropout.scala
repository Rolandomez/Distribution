package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dropout")
@js.native
class Dropout protected () extends Layer {
  def this(args: DropoutLayerArgs) = this()
  
  /* protected */ def getNoiseShape(input: Tensor[Rank]): Shape = js.native
  
  val noiseShape: js.Any = js.native
  
  val rate: js.Any = js.native
  
  val seed: js.Any = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dropout")
@js.native
object Dropout extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
}
