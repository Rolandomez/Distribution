package typings.openjscad.global

import typings.openjscad.CSG.ICircleOptions
import typings.openjscad.CSG.IRectangleOptions
import typings.openjscad.CSG.Path2D
import typings.openjscad.CSG.Polygon
import typings.openjscad.CSG.Vector2D
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CAG")
@js.native
class CAG ()
  extends typings.openjscad.CAG

/* static members */
@JSGlobal("CAG")
@js.native
object CAG extends js.Object {
  @js.native
  class Side protected ()
    extends typings.openjscad.CAG.Side {
    def this(vertex0: typings.openjscad.CAG.Vertex, vertex1: typings.openjscad.CAG.Vertex) = this()
  }
  
  @js.native
  class Vertex protected ()
    extends typings.openjscad.CAG.Vertex {
    def this(pos: Vector2D) = this()
  }
  
  @js.native
  class fuzzyCAGFactory ()
    extends typings.openjscad.CAG.fuzzyCAGFactory
  
  def PathsToDxf(paths: js.Array[Path2D]): Blob = js.native
  def circle(options: ICircleOptions): typings.openjscad.CAG = js.native
  def fromCompactBinary(bin: js.Any): typings.openjscad.CAG = js.native
  def fromFakeCSG(csg: typings.openjscad.CSG): typings.openjscad.CAG = js.native
  def fromPoints(points: js.Array[Vector2D]): typings.openjscad.CAG = js.native
  def fromPointsNoCheck(points: js.Array[Vector2D]): typings.openjscad.CAG = js.native
  def fromSides(sides: js.Array[typings.openjscad.CAG.Side]): typings.openjscad.CAG = js.native
  def linesIntersect(p0start: Vector2D, p0end: Vector2D, p1start: Vector2D, p1end: Vector2D): Boolean = js.native
  def rectangle(options: IRectangleOptions): typings.openjscad.CAG = js.native
  def roundedRectangle(options: js.Any): typings.openjscad.CAG = js.native
  /* static members */
  @js.native
  object Side extends js.Object {
    def _fromFakePolygon(polygon: Polygon): typings.openjscad.CAG.Side = js.native
  }
  
}

