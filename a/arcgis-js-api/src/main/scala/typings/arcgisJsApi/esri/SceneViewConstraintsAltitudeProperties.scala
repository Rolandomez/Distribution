package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewConstraintsAltitudeProperties
  extends StObject
     with Object {
  
  /**
    * The maximum allowed camera altitude (in meters).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum allowed camera altitude (in meters).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var min: js.UndefOr[Double] = js.undefined
}
object SceneViewConstraintsAltitudeProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewConstraintsAltitudeProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewConstraintsAltitudeProperties]
  }
  
  @scala.inline
  implicit class SceneViewConstraintsAltitudePropertiesMutableBuilder[Self <: SceneViewConstraintsAltitudeProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
