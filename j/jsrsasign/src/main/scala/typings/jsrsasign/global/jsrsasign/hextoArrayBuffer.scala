package typings.jsrsasign.global.jsrsasign

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("jsrsasign.hextoArrayBuffer")
@js.native
object hextoArrayBuffer extends js.Object {
  
  /**
    * convert a hexadecimal string to an ArrayBuffer
    * @param hex hexadecimal string
    * @return ArrayBuffer
    * @description
    * This function converts from a hexadecimal string to an ArrayBuffer.
    * @example
    * hextoArrayBuffer("fffa01") → ArrayBuffer of [255, 250, 1]
    */
  def apply(hex: String): ArrayBuffer = js.native
}
