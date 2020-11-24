package typings.aframe.mod.THREE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aframe", "THREE.ParametricGeometry")
@js.native
class ParametricGeometry protected ()
  extends typings.three.mod.ParametricGeometry {
  def this(
    func: js.Function3[/* u */ Double, /* v */ Double, /* dest */ typings.three.vector3Mod.Vector3, Unit],
    slices: Double,
    stacks: Double
  ) = this()
}
