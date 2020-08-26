package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.colorMod.Color
import typings.three.geometryMod.Geometry
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/GridHelper", JSImport.Namespace)
@js.native
object gridHelperMod extends js.Object {
  @js.native
  class GridHelper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(size: Double, divisions: Double) = this()
    def this(size: Double, divisions: Double, color1: String) = this()
    def this(size: Double, divisions: Double, color1: Double) = this()
    def this(size: Double, divisions: Double, color1: Color) = this()
    def this(size: Double, divisions: Double, color1: js.UndefOr[scala.Nothing], color2: String) = this()
    def this(size: Double, divisions: Double, color1: js.UndefOr[scala.Nothing], color2: Double) = this()
    def this(size: Double, divisions: Double, color1: js.UndefOr[scala.Nothing], color2: Color) = this()
    def this(size: Double, divisions: Double, color1: String, color2: String) = this()
    def this(size: Double, divisions: Double, color1: String, color2: Double) = this()
    def this(size: Double, divisions: Double, color1: String, color2: Color) = this()
    def this(size: Double, divisions: Double, color1: Double, color2: String) = this()
    def this(size: Double, divisions: Double, color1: Double, color2: Double) = this()
    def this(size: Double, divisions: Double, color1: Double, color2: Color) = this()
    def this(size: Double, divisions: Double, color1: Color, color2: String) = this()
    def this(size: Double, divisions: Double, color1: Color, color2: Double) = this()
    def this(size: Double, divisions: Double, color1: Color, color2: Color) = this()
    /**
    	 * @deprecated Colors should be specified in the constructor.
    	 */
    def setColors(): Unit = js.native
    def setColors(color1: js.UndefOr[scala.Nothing], color2: String): Unit = js.native
    def setColors(color1: js.UndefOr[scala.Nothing], color2: Double): Unit = js.native
    def setColors(color1: js.UndefOr[scala.Nothing], color2: Color): Unit = js.native
    def setColors(color1: String): Unit = js.native
    def setColors(color1: String, color2: String): Unit = js.native
    def setColors(color1: String, color2: Double): Unit = js.native
    def setColors(color1: String, color2: Color): Unit = js.native
    def setColors(color1: Double): Unit = js.native
    def setColors(color1: Double, color2: String): Unit = js.native
    def setColors(color1: Double, color2: Double): Unit = js.native
    def setColors(color1: Double, color2: Color): Unit = js.native
    def setColors(color1: Color): Unit = js.native
    def setColors(color1: Color, color2: String): Unit = js.native
    def setColors(color1: Color, color2: Double): Unit = js.native
    def setColors(color1: Color, color2: Color): Unit = js.native
  }
  
}

