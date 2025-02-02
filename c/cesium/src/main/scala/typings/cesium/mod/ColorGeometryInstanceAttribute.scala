package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ColorGeometryInstanceAttribute")
@js.native
open class ColorGeometryInstanceAttribute () extends StObject {
  def this(red: Double) = this()
  def this(red: Double, green: Double) = this()
  def this(red: Unit, green: Double) = this()
  def this(red: Double, green: Double, blue: Double) = this()
  def this(red: Double, green: Unit, blue: Double) = this()
  def this(red: Unit, green: Double, blue: Double) = this()
  def this(red: Unit, green: Unit, blue: Double) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  def this(red: Double, green: Double, blue: Unit, alpha: Double) = this()
  def this(red: Double, green: Unit, blue: Double, alpha: Double) = this()
  def this(red: Double, green: Unit, blue: Unit, alpha: Double) = this()
  def this(red: Unit, green: Double, blue: Double, alpha: Double) = this()
  def this(red: Unit, green: Double, blue: Unit, alpha: Double) = this()
  def this(red: Unit, green: Unit, blue: Double, alpha: Double) = this()
  def this(red: Unit, green: Unit, blue: Unit, alpha: Double) = this()
  
  /**
    * The datatype of each component in the attribute, e.g., individual elements in
    * {@link ColorGeometryInstanceAttribute#value}.
    */
  val componentDatatype: ComponentDatatype = js.native
  
  /**
    * The number of components in the attributes, i.e., {@link ColorGeometryInstanceAttribute#value}.
    */
  val componentsPerAttribute: Double = js.native
  
  /**
    * When <code>true</code> and <code>componentDatatype</code> is an integer format,
    * indicate that the components should be mapped to the range [0, 1] (unsigned)
    * or [-1, 1] (signed) when they are accessed as floating-point for rendering.
    */
  val normalize: Boolean = js.native
  
  /**
    * The values for the attributes stored in a typed array.
    */
  var value: js.typedarray.Uint8Array = js.native
}
/* static members */
object ColorGeometryInstanceAttribute {
  
  @JSImport("cesium", "ColorGeometryInstanceAttribute")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compares the provided ColorGeometryInstanceAttributes and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [left] - The first ColorGeometryInstanceAttribute.
    * @param [right] - The second ColorGeometryInstanceAttribute.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(left: Unit, right: ColorGeometryInstanceAttribute): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: ColorGeometryInstanceAttribute): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(left: ColorGeometryInstanceAttribute, right: ColorGeometryInstanceAttribute): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Creates a new {@link ColorGeometryInstanceAttribute} instance given the provided {@link Color}.
    * @example
    * const instance = new Cesium.GeometryInstance({
    *   geometry : geometry,
    *   attributes : {
    *     color : Cesium.ColorGeometryInstanceAttribute.fromColor(Cesium.Color.CORNFLOWERBLUE),
    *   }
    * });
    * @param color - The color.
    * @returns The new {@link ColorGeometryInstanceAttribute} instance.
    */
  inline def fromColor(color: Color): ColorGeometryInstanceAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColor")(color.asInstanceOf[js.Any]).asInstanceOf[ColorGeometryInstanceAttribute]
  
  /**
    * Converts a color to a typed array that can be used to assign a color attribute.
    * @example
    * const attributes = primitive.getGeometryInstanceAttributes('an id');
    * attributes.color = Cesium.ColorGeometryInstanceAttribute.toValue(Cesium.Color.AQUA, attributes.color);
    * @param color - The color.
    * @param [result] - The array to store the result in, if undefined a new instance will be created.
    * @returns The modified result parameter or a new instance if result was undefined.
    */
  inline def toValue(color: Color): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(color.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toValue(color: Color, result: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(color.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
