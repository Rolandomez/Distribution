package typings.qiniuJs.mod

import typings.qiniuJs.qiniuJsNumbers.`1`
import typings.qiniuJs.qiniuJsStrings.Center
import typings.qiniuJs.qiniuJsStrings.East
import typings.qiniuJs.qiniuJsStrings.North
import typings.qiniuJs.qiniuJsStrings.NorthEast
import typings.qiniuJs.qiniuJsStrings.NorthWest
import typings.qiniuJs.qiniuJsStrings.South
import typings.qiniuJs.qiniuJsStrings.SouthEast
import typings.qiniuJs.qiniuJsStrings.SouthWest
import typings.qiniuJs.qiniuJsStrings.West
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterMarkFopOptions1 extends WaterMarkOptions1 {
  
  var fop: typings.qiniuJs.qiniuJsStrings.watermark = js.native
}
object WaterMarkFopOptions1 {
  
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    fop: typings.qiniuJs.qiniuJsStrings.watermark,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    image: String,
    mode: `1`
  ): WaterMarkFopOptions1 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fop = fop.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterMarkFopOptions1]
  }
  
  @scala.inline
  implicit class WaterMarkFopOptions1MutableBuilder[Self <: WaterMarkFopOptions1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFop(value: typings.qiniuJs.qiniuJsStrings.watermark): Self = StObject.set(x, "fop", value.asInstanceOf[js.Any])
  }
}
