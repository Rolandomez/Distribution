package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "NodeTransformationProperty")
@js.native
open class NodeTransformationProperty () extends StObject {
  def this(options: Scale) = this()
  
  /**
    * Gets the event that is raised whenever the definition of this property changes.
    * The definition is considered to have changed if a call to getValue would return
    * a different result for the same time.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Compares this property to the provided property and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [other] - The other property.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  
  /**
    * Gets the value of the property at the provided time.
    * @param time - The time for which to retrieve the value.
    * @param [result] - The object to store the value into, if omitted, a new instance is created and returned.
    * @returns The modified result parameter or a new instance if the result parameter was not supplied.
    */
  def getValue(time: JulianDate): TranslationRotationScale = js.native
  def getValue(time: JulianDate, result: TranslationRotationScale): TranslationRotationScale = js.native
  
  /**
    * Gets a value indicating if this property is constant.  A property is considered
    * constant if getValue always returns the same result for the current definition.
    */
  val isConstant: Boolean = js.native
  
  /**
    * Gets or sets the {@link Quaternion} Property specifying the (x, y, z, w) rotation to apply to the node.
    */
  var rotation: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link Cartesian3} Property specifying the (x, y, z) scaling to apply to the node.
    */
  var scale: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link Cartesian3} Property specifying the (x, y, z) translation to apply to the node.
    */
  var translation: js.UndefOr[Property] = js.native
}
