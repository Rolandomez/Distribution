package typings.pngJs.mod

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("png.js", JSImport.Namespace)
@js.native
class ^ protected () extends PNGReader {
  def this(bytes: String) = this()
  def this(bytes: Buffer) = this()
  def this(bytes: ArrayBuffer) = this()
  def this(bytes: Uint8Array) = this()
}
