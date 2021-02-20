package typings.three

import typings.three.anon.Func
import typings.three.geometryMod.Geometry
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parametricGeometryMod {
  
  @JSImport("three/src/geometries/ParametricGeometry", "ParametricGeometry")
  @js.native
  class ParametricGeometry protected () extends Geometry {
    def this(
      func: js.Function3[/* u */ Double, /* v */ Double, /* dest */ Vector3, Unit],
      slices: Double,
      stacks: Double
    ) = this()
    
    var parameters: Func = js.native
  }
}
