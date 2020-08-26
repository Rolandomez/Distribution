package typings.ol

import typings.ol.extentMod.Extent
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Image", JSImport.Namespace)
@js.native
object olImageMod extends js.Object {
  @js.native
  trait ImageWrapper
    extends typings.ol.imageBaseMod.default {
    def setImage(image: HTMLCanvasElement): Unit = js.native
    def setImage(image: HTMLImageElement): Unit = js.native
    def setImage(image: HTMLVideoElement): Unit = js.native
  }
  
  @js.native
  class default protected () extends ImageWrapper {
    def this(
      extent: Extent,
      resolution: js.UndefOr[scala.Nothing],
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
  }
  
  def listenImage(image: HTMLCanvasElement, loadHandler: js.Function0[_], errorHandler: js.Function0[_]): js.Function0[Unit] = js.native
  def listenImage(image: HTMLImageElement, loadHandler: js.Function0[_], errorHandler: js.Function0[_]): js.Function0[Unit] = js.native
  def listenImage(image: HTMLVideoElement, loadHandler: js.Function0[_], errorHandler: js.Function0[_]): js.Function0[Unit] = js.native
  type LoadFunction = js.Function2[/* p0 */ ImageWrapper, /* p1 */ String, Unit]
}

