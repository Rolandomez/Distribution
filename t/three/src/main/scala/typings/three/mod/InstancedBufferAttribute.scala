package typings.three.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "InstancedBufferAttribute")
@js.native
class InstancedBufferAttribute protected ()
  extends typings.three.instancedBufferAttributeMod.InstancedBufferAttribute {
  def this(array: ArrayLike[Double], itemSize: Double) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  def this(
    array: ArrayLike[Double],
    itemSize: Double,
    normalized: js.UndefOr[scala.Nothing],
    meshPerAttribute: Double
  ) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean, meshPerAttribute: Double) = this()
}

