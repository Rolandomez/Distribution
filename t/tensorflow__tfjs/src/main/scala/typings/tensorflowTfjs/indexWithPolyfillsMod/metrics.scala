package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "metrics")
@js.native
object metrics extends js.Object {
  @JSName("MAPE")
  def MAPE_(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSName("MSE")
  def MSE_(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def binaryAccuracy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def binaryCrossentropy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def categoricalAccuracy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def categoricalCrossentropy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def cosineProximity(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def mape(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanAbsoluteError(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanAbsolutePercentageError(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanSquaredError(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def mse(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def precision(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def recall(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def sparseCategoricalAccuracy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}

