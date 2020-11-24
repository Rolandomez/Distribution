package typings.tensorflowTfjsLayers.mod

import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers", "loadLayersModel")
@js.native
object loadLayersModel extends js.Object {
  
  def apply(pathOrIOHandler: String): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: String, options: LoadOptions): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
}
