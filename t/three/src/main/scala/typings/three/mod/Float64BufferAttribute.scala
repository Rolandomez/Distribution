package typings.three.mod

import typings.std.ArrayBuffer
import typings.std.ArrayLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Float64BufferAttribute")
@js.native
class Float64BufferAttribute protected ()
  extends typings.three.bufferAttributeMod.Float64BufferAttribute {
  def this(array: Double, itemSize: Double) = this()
  def this(array: ArrayBuffer, itemSize: Double) = this()
  def this(array: ArrayLike[Double], itemSize: Double) = this()
  def this(array: Iterable[Double], itemSize: Double) = this()
  def this(array: Double, itemSize: Double, normalized: Boolean) = this()
  def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
}

