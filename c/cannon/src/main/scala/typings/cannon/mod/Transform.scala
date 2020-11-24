package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Transform")
@js.native
class Transform ()
  extends typings.cannon.CANNON.Transform
/* static members */
@JSImport("cannon", "Transform")
@js.native
object Transform extends js.Object {
  
  def pointToLocalFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    worldPoint: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
  def pointToLocalFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    worldPoint: typings.cannon.CANNON.Vec3,
    result: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
  
  def pointToWorldFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    localPoint: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
  def pointToWorldFrame(
    position: typings.cannon.CANNON.Vec3,
    quaternion: typings.cannon.CANNON.Quaternion,
    localPoint: typings.cannon.CANNON.Vec3,
    result: typings.cannon.CANNON.Vec3
  ): typings.cannon.CANNON.Vec3 = js.native
}
