package typings.ol

import typings.ol.colorMod.Color
import typings.ol.imageStateMod.ImageState
import typings.ol.sizeMod.Size
import typings.ol.styleCircleMod.Options
import typings.ol.styleCircleMod.default
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style", JSImport.Namespace)
@js.native
object styleMod extends js.Object {
  @js.native
  class Circle () extends default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class Fill ()
    extends typings.ol.fillMod.default {
    def this(opt_options: typings.ol.fillMod.Options) = this()
  }
  
  @js.native
  class Icon ()
    extends typings.ol.iconMod.default {
    def this(opt_options: typings.ol.iconMod.Options) = this()
  }
  
  @js.native
  class IconImage protected ()
    extends typings.ol.iconImageMod.default {
    def this(
      image: HTMLCanvasElement,
      src: js.UndefOr[scala.Nothing],
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: js.UndefOr[scala.Nothing],
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
  }
  
  @js.native
  abstract class Image protected ()
    extends typings.ol.styleImageMod.default {
    def this(options: typings.ol.styleImageMod.Options) = this()
  }
  
  @js.native
  class RegularShape protected ()
    extends typings.ol.regularShapeMod.default {
    def this(options: typings.ol.regularShapeMod.Options) = this()
  }
  
  @js.native
  class Stroke ()
    extends typings.ol.strokeMod.default {
    def this(opt_options: typings.ol.strokeMod.Options) = this()
  }
  
  @js.native
  class Style ()
    extends typings.ol.styleStyleMod.default {
    def this(opt_options: typings.ol.styleStyleMod.Options) = this()
  }
  
  @js.native
  class Text ()
    extends typings.ol.textMod.default {
    def this(opt_options: typings.ol.textMod.Options) = this()
  }
  
}

