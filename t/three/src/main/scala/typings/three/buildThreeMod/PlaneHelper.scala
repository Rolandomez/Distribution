package typings.three.buildThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three", "PlaneHelper")
@js.native
open class PlaneHelper protected ()
  extends typings.three.srcThreeMod.PlaneHelper {
  /**
    * Creates a new wireframe representation of the passed plane.
    * @param plane The plane to visualize.
    * @param size Side length of plane helper. Expects a `Float`. Default `1`
    * @param hex Color. Default `0xffff00`
    */
  def this(plane: typings.three.srcMathPlaneMod.Plane) = this()
  def this(plane: typings.three.srcMathPlaneMod.Plane, size: Double) = this()
  def this(plane: typings.three.srcMathPlaneMod.Plane, size: Double, hex: Double) = this()
  def this(plane: typings.three.srcMathPlaneMod.Plane, size: Unit, hex: Double) = this()
}
