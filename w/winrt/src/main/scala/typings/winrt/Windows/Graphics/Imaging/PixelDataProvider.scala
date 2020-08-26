package typings.winrt.Windows.Graphics.Imaging

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PixelDataProvider extends IPixelDataProvider

object PixelDataProvider {
  @scala.inline
  def apply(detachPixelData: () => Uint8Array): PixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = js.Any.fromFunction0(detachPixelData))
    __obj.asInstanceOf[PixelDataProvider]
  }
}

