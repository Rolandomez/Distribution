package typings.jimpJpeg.anon

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagejpegDecoderFn extends js.Object {
  
  @JSName("image/jpeg")
  def imageSlashjpeg(data: Buffer): Bitmap = js.native
  @JSName("image/jpeg")
  var imageSlashjpeg_Original: DecoderFn = js.native
}
