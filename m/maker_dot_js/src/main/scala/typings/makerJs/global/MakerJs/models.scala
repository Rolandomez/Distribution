package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IFindChainsOptions
import typings.makerJs.MakerJs.IMeasure
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathArc
import typings.makerJs.MakerJs.IPathBezierSeed
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import typings.opentypeJs.mod.Font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object models {
  
  @JSGlobal("MakerJs.models.BezierCurve")
  @js.native
  class BezierCurve protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.BezierCurve {
    def this(points: js.Array[IPoint]) = this()
    def this(seed: IPathBezierSeed) = this()
    def this(points: js.Array[IPoint], accuracy: Double) = this()
    def this(seed: IPathBezierSeed, accuracy: Double) = this()
    def this(seed: IPathBezierSeed, isChild: Boolean) = this()
    def this(origin: IPoint, controls: js.Array[IPoint], end: IPoint) = this()
    def this(origin: IPoint, control: IPoint, end: IPoint) = this()
    def this(seed: IPathBezierSeed, isChild: Boolean, accuracy: Double) = this()
    def this(origin: IPoint, control1: IPoint, control2: IPoint, end: IPoint) = this()
    def this(origin: IPoint, controls: js.Array[IPoint], end: IPoint, accuracy: Double) = this()
    def this(origin: IPoint, control: IPoint, end: IPoint, accuracy: Double) = this()
    def this(origin: IPoint, control1: IPoint, control2: IPoint, end: IPoint, accuracy: Double) = this()
    
    /* CompleteClass */
    var accuracy: Double = js.native
    
    /* CompleteClass */
    @JSName("models")
    var models_BezierCurve: IModelMap = js.native
    
    /* CompleteClass */
    @JSName("origin")
    var origin_BezierCurve: IPoint = js.native
    
    /* CompleteClass */
    @JSName("paths")
    var paths_BezierCurve: IPathMap = js.native
    
    /* CompleteClass */
    var seed: IPathBezierSeed = js.native
    
    /* CompleteClass */
    @JSName("type")
    var type_BezierCurve: String = js.native
  }
  object BezierCurve {
    
    @JSGlobal("MakerJs.models.BezierCurve")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def computeLength(seed: IPathBezierSeed): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLength")(seed.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def computePoint(seed: IPathBezierSeed, t: Double): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("computePoint")(seed.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[IPoint]
    
    /* static member */
    inline def getBezierSeeds(curve: typings.makerJs.MakerJs.models.BezierCurve): js.Array[IPathBezierSeed] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBezierSeeds")(curve.asInstanceOf[js.Any]).asInstanceOf[js.Array[IPathBezierSeed]]
    inline def getBezierSeeds(curve: typings.makerJs.MakerJs.models.BezierCurve, options: IFindChainsOptions): js.Array[IPathBezierSeed] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBezierSeeds")(curve.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPathBezierSeed]]
    
    /* static member */
    @JSGlobal("MakerJs.models.BezierCurve.typeName")
    @js.native
    def typeName: String = js.native
    inline def typeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeName")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("MakerJs.models.BoltCircle")
  @js.native
  class BoltCircle protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.BoltCircle {
    def this(boltRadius: Double, holeRadius: Double, boltCount: Double) = this()
    def this(boltRadius: Double, holeRadius: Double, boltCount: Double, firstBoltAngleInDegrees: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_BoltCircle: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.BoltRectangle")
  @js.native
  class BoltRectangle protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.BoltRectangle {
    def this(width: Double, height: Double, holeRadius: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_BoltRectangle: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.ConnectTheDots")
  @js.native
  class ConnectTheDots protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.ConnectTheDots {
    /**
      * Create a model by connecting points designated in a numeric array. The model will be 'closed' - i.e. the last point will connect to the first point.
      *
      * Example:
      * ```
      * var c = new makerjs.models.ConnectTheDots([-10, 0, 10, 0, 0, 20]); // 3 coordinates to form a triangle
      * ```
      *
      * @param coords Array of coordinates.
      */
    def this(coords: js.Array[Double]) = this()
    /**
      * Create a model by connecting points designated in a string. The model will be 'closed' - i.e. the last point will connect to the first point.
      *
      * Example:
      * ```
      * var c = new makerjs.models.ConnectTheDots('-10 0 10 0 0 20'); // 3 coordinates to form a triangle
      * ```
      *
      * @param numericList String containing a list of numbers which can be delimited by spaces, commas, or anything non-numeric (Note: [exponential notation](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toExponential) is allowed).
      */
    def this(numericList: String) = this()
    /**
      * Create a model by connecting points designated in a numeric array. The model will be 'closed' - i.e. the last point will connect to the first point.
      *
      * Example:
      * ```
      * var c = new makerjs.models.ConnectTheDots(false, [-10, 0, 10, 0, 0, 20]); // 3 coordinates to form a polyline
      * ```
      *
      * @param isClosed Flag to specify if last point should connect to the first point.
      * @param coords Array of coordinates.
      */
    /**
      * Create a model by connecting points designated in an array of points. The model may be closed, or left open.
      *
      * Example:
      * ```
      * var c = new makerjs.models.ConnectTheDots(false, [[-10, 0], [10, 0], [0, 20]]); // 3 coordinates left open
      * ```
      *
      * @param isClosed Flag to specify if last point should connect to the first point.
      * @param points Array of IPoints.
      */
    def this(isClosed: Boolean, coords: js.Array[Double | IPoint]) = this()
    /**
      * Create a model by connecting points designated in a string. The model will be 'closed' - i.e. the last point will connect to the first point.
      *
      * Example:
      * ```
      * var c = new makerjs.models.ConnectTheDots(false, '-10 0 10 0 0 20'); // 3 coordinates to form a polyline
      * ```
      *
      * @param isClosed Flag to specify if last point should connect to the first point.
      * @param numericList String containing a list of numbers which can be delimited by spaces, commas, or anything non-numeric (Note: [exponential notation](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toExponential) is allowed).
      */
    def this(isClosed: Boolean, numericList: String) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_ConnectTheDots: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.Dogbone")
  @js.native
  class Dogbone protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Dogbone {
    /**
      * Create a dogbone from width, height, corner radius, style, and bottomless flag.
      *
      * Example:
      * ```
      * var d = new makerjs.models.Dogbone(50, 100, 5);
      * ```
      *
      * @param width Width of the rectangle.
      * @param height Height of the rectangle.
      * @param radius Corner radius.
      * @param style Optional corner style: 0 (default) for dogbone, 1 for vertical, -1 for horizontal.
      * @param bottomless Optional flag to omit the bottom line and bottom corners (default false).
      */
    def this(width: Double, height: Double, radius: Double) = this()
    def this(width: Double, height: Double, radius: Double, style: Double) = this()
    def this(width: Double, height: Double, radius: Double, style: Double, bottomless: Boolean) = this()
    def this(width: Double, height: Double, radius: Double, style: Unit, bottomless: Boolean) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Dogbone: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.Dome")
  @js.native
  class Dome protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Dome {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, radius: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Dome: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.Ellipse")
  @js.native
  class Ellipse protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Ellipse {
    /**
      * Class for Ellipse created with 2 radii.
      *
      * @param radiusX The x radius of the ellipse.
      * @param radiusY The y radius of the ellipse.
      * @param accuracy Optional accuracy of the underlying BezierCurve.
      */
    def this(radiusX: Double, radiusY: Double) = this()
    /**
      * Class for Ellipse created at a specific origin and 2 radii.
      *
      * @param origin The center of the ellipse.
      * @param radiusX The x radius of the ellipse.
      * @param radiusY The y radius of the ellipse.
      * @param accuracy Optional accuracy of the underlying BezierCurve.
      */
    def this(origin: IPoint, radiusX: Double, radiusY: Double) = this()
    def this(radiusX: Double, radiusY: Double, accuracy: Double) = this()
    /**
      * Class for Ellipse created at a specific x, y and 2 radii.
      *
      * @param cx The x coordinate of the center of the ellipse.
      * @param cy The y coordinate of the center of the ellipse.
      * @param rX The x radius of the ellipse.
      * @param rY The y radius of the ellipse.
      * @param accuracy Optional accuracy of the underlying BezierCurve.
      */
    def this(cx: Double, cy: Double, rx: Double, ry: Double) = this()
    def this(origin: IPoint, radiusX: Double, radiusY: Double, accuracy: Double) = this()
    def this(cx: Double, cy: Double, rx: Double, ry: Double, accuracy: Double) = this()
    
    /* CompleteClass */
    @JSName("models")
    var models_Ellipse: IModelMap = js.native
    
    /* CompleteClass */
    @JSName("origin")
    var origin_Ellipse: IPoint = js.native
  }
  
  @JSGlobal("MakerJs.models.EllipticArc")
  @js.native
  class EllipticArc protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.EllipticArc {
    /**
      * Class for Elliptic Arc created by distorting a circular arc.
      *
      * @param arc The circular arc to use as the basis of the elliptic arc.
      * @param distortX The x scale of the ellipse.
      * @param distortY The y scale of the ellipse.
      * @param accuracy Optional accuracy of the underlying BezierCurve.
      */
    def this(arc: IPathArc, distortX: Double, distortY: Double) = this()
    def this(arc: IPathArc, distortX: Double, distortY: Double, accuracy: Double) = this()
    /**
      * Class for Elliptic Arc created by distorting a circular arc.
      *
      * @param arc The circular arc to use as the basis of the elliptic arc.
      * @param radiusX The x radius of the ellipse.
      * @param radiusY The y radius of the ellipse.
      * @param accuracy Optional accuracy of the underlying BezierCurve.
      */
    def this(startAngle: Double, endAngle: Double, radiusX: Double, radiusY: Double) = this()
    def this(startAngle: Double, endAngle: Double, radiusX: Double, radiusY: Double, accuracy: Double) = this()
    
    /* CompleteClass */
    @JSName("models")
    var models_EllipticArc: IModelMap = js.native
  }
  
  @JSGlobal("MakerJs.models.Holes")
  @js.native
  class Holes protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Holes {
    /**
      * Create an array of circles of the same radius from an array of center points.
      *
      * Example:
      * ```
      * //Create some holes from an array of points
      * var makerjs = require('makerjs');
      * var model = new makerjs.models.Holes(10, [[0, 0],[50, 0],[25, 40]]);
      * var svg = makerjs.exporter.toSVG(model);
      * document.write(svg);
      * ```
      *
      * @param holeRadius Hole radius.
      * @param points Array of points for origin of each hole.
      * @param ids Optional array of corresponding path ids for the holes.
      */
    def this(holeRadius: Double, points: js.Array[IPoint]) = this()
    def this(holeRadius: Double, points: js.Array[IPoint], ids: js.Array[String]) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Holes: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.Oval")
  @js.native
  class Oval protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Oval {
    def this(width: Double, height: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Oval: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.OvalArc")
  @js.native
  class OvalArc protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.OvalArc {
    def this(startAngle: Double, endAngle: Double, sweepRadius: Double, slotRadius: Double) = this()
    def this(
      startAngle: Double,
      endAngle: Double,
      sweepRadius: Double,
      slotRadius: Double,
      selfIntersect: Boolean
    ) = this()
    def this(
      startAngle: Double,
      endAngle: Double,
      sweepRadius: Double,
      slotRadius: Double,
      selfIntersect: Boolean,
      isolateCaps: Boolean
    ) = this()
    def this(
      startAngle: Double,
      endAngle: Double,
      sweepRadius: Double,
      slotRadius: Double,
      selfIntersect: Unit,
      isolateCaps: Boolean
    ) = this()
    
    /* CompleteClass */
    @JSName("models")
    var models_OvalArc: IModelMap = js.native
    
    /* CompleteClass */
    @JSName("paths")
    var paths_OvalArc: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.Polygon")
  @js.native
  class Polygon protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Polygon {
    def this(numberOfSides: Double, radius: Double) = this()
    def this(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double) = this()
    def this(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double, circumscribed: Boolean) = this()
    def this(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Unit, circumscribed: Boolean) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Polygon: IPathMap = js.native
  }
  object Polygon {
    
    @JSGlobal("MakerJs.models.Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def circumscribedRadius(radius: Double, angleInRadians: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("circumscribedRadius")(radius.asInstanceOf[js.Any], angleInRadians.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* static member */
    inline def getPoints(numberOfSides: Double, radius: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoints")(numberOfSides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
    inline def getPoints(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoints")(numberOfSides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], firstCornerAngleInDegrees.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
    inline def getPoints(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double, circumscribed: Boolean): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoints")(numberOfSides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], firstCornerAngleInDegrees.asInstanceOf[js.Any], circumscribed.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
    inline def getPoints(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Unit, circumscribed: Boolean): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoints")(numberOfSides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], firstCornerAngleInDegrees.asInstanceOf[js.Any], circumscribed.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
  }
  
  @JSGlobal("MakerJs.models.Rectangle")
  @js.native
  class Rectangle protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Rectangle {
    /**
      * Create a rectangle from a measurement.
      *
      * Example:
      * ```
      * //Create a rectangle from a measurement.
      * var makerjs = require('makerjs');
      * var e = new makerjs.models.Ellipse(17, 10); // draw an ellipse so we have something to measure.
      * var m = makerjs.measure.modelExtents(e);    // measure the ellipse.
      * var r = new makerjs.models.Rectangle(m);    // draws a rectangle surrounding the ellipse.
      * var svg = makerjs.exporter.toSVG({ models: { e: e, r: r }});
      * document.write(svg);
      * ```
      *
      * @param measurement IMeasure object. See http://microsoft.github.io/maker.js/docs/api/modules/makerjs.measure.html#pathextents and http://microsoft.github.io/maker.js/docs/api/modules/makerjs.measure.html#modelextents to get measurements of paths and models.
      */
    def this(measurement: IMeasure) = this()
    /**
      * Create a rectangle which will surround a model.
      *
      * Example:
      * ```
      * //Create a rectangle which will surround a model
      * var makerjs = require('makerjs');
      * var e = new makerjs.models.Ellipse(17, 10); // draw an ellipse so we have something to surround.
      * var r = new makerjs.models.Rectangle(e, 3); // draws a rectangle surrounding the ellipse by 3 units.
      * var svg = makerjs.exporter.toSVG({ models: { e: e, r: r }});
      * document.write(svg);
      * ```
      *
      * @param modelToSurround IModel object.
      * @param margin Optional distance from the model.
      */
    def this(modelToSurround: IModel) = this()
    def this(modelToSurround: IModel, margin: Double) = this()
    /**
      * Create a rectangle from width and height.
      *
      * Example:
      * ```
      * //Create a rectangle from width and height
      * var makerjs = require('makerjs');
      * var model = new makerjs.models.Rectangle(50, 100);
      * var svg = makerjs.exporter.toSVG(model);
      * document.write(svg);
      * ```
      *
      * @param width Width of the rectangle.
      * @param height Height of the rectangle.
      */
    def this(width: Double, height: Double) = this()
    
    /* CompleteClass */
    @JSName("origin")
    var origin_Rectangle: IPoint = js.native
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Rectangle: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.Ring")
  @js.native
  class Ring protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Ring {
    def this(outerRadius: Double, innerRadius: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Ring: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.RoundRectangle")
  @js.native
  class RoundRectangle protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.RoundRectangle {
    /**
      * Create a round rectangle which will surround a model.
      *
      * Example:
      * ```
      * var b = new makerjs.models.BoltRectangle(30, 20, 1); //draw a bolt rectangle so we have something to surround
      * var r = new makerjs.models.RoundRectangle(b, 2.5);   //surround it
      * ```
      *
      * @param modelToSurround IModel object.
      * @param margin Distance from the model. This will also become the corner radius.
      */
    def this(modelToSurround: IModel, margin: Double) = this()
    /**
      * Create a round rectangle from width, height, and corner radius.
      *
      * Example:
      * ```
      * var r = new makerjs.models.RoundRectangle(100, 50, 5);
      * ```
      *
      * @param width Width of the rectangle.
      * @param height Height of the rectangle.
      * @param radius Corner radius.
      */
    def this(width: Double, height: Double, radius: Double) = this()
    
    /* CompleteClass */
    @JSName("origin")
    var origin_RoundRectangle: IPoint = js.native
    
    /* CompleteClass */
    @JSName("paths")
    var paths_RoundRectangle: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.SCurve")
  @js.native
  class SCurve protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.SCurve {
    def this(width: Double, height: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_SCurve: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.Slot")
  @js.native
  class Slot protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Slot {
    def this(origin: IPoint, endPoint: IPoint, radius: Double) = this()
    def this(origin: IPoint, endPoint: IPoint, radius: Double, isolateCaps: Boolean) = this()
    
    /* CompleteClass */
    @JSName("models")
    var models_Slot: IModelMap = js.native
    
    /* CompleteClass */
    @JSName("origin")
    var origin_Slot: IPoint = js.native
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Slot: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.Square")
  @js.native
  class Square protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Square {
    def this(side: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Square: IPathMap = js.native
  }
  
  @JSGlobal("MakerJs.models.Star")
  @js.native
  class Star protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Star {
    def this(numberOfPoints: Double, outerRadius: Double) = this()
    def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Double) = this()
    def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Double, skipPoints: Double) = this()
    def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Unit, skipPoints: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Star: IPathMap = js.native
  }
  object Star {
    
    @JSGlobal("MakerJs.models.Star")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def InnerRadiusRatio(numberOfPoints: Double, skipPoints: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("InnerRadiusRatio")(numberOfPoints.asInstanceOf[js.Any], skipPoints.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSGlobal("MakerJs.models.Text")
  @js.native
  class Text protected ()
    extends StObject
       with typings.makerJs.MakerJs.models.Text {
    def this(font: Font, text: String, fontSize: Double) = this()
    def this(font: Font, text: String, fontSize: Double, combine: Boolean) = this()
    def this(font: Font, text: String, fontSize: Double, combine: Boolean, centerCharacterOrigin: Boolean) = this()
    def this(font: Font, text: String, fontSize: Double, combine: Unit, centerCharacterOrigin: Boolean) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Boolean,
      centerCharacterOrigin: Boolean,
      bezierAccuracy: Double
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Boolean,
      centerCharacterOrigin: Unit,
      bezierAccuracy: Double
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Unit,
      centerCharacterOrigin: Boolean,
      bezierAccuracy: Double
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Unit,
      centerCharacterOrigin: Unit,
      bezierAccuracy: Double
    ) = this()
    
    /* CompleteClass */
    @JSName("models")
    var models_Text: IModelMap = js.native
  }
}
