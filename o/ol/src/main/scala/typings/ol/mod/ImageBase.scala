package typings.ol.mod

import typings.ol.extentMod.Extent
import typings.ol.imageBaseMod.default
import typings.ol.imageStateMod.ImageState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "ImageBase")
@js.native
abstract class ImageBase protected () extends default {
  def this(extent: Extent, resolution: js.UndefOr[scala.Nothing], pixelRatio: Double, state: ImageState) = this()
  def this(extent: Extent, resolution: Double, pixelRatio: Double, state: ImageState) = this()
}

