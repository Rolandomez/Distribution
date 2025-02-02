package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorAxisEventsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps) As opposed to the `setExtremes` event,
    * this event fires after the final min and max values are computed and
    * corrected for `minRange`.
    *
    * Fires when the minimum and maximum is set for the axis, either by calling
    * the `.setExtremes()` method or by selecting an area in the chart. One
    * parameter, `event`, is passed to the function, containing common event
    * information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in axis
    * values. The actual data extremes are found in `event.dataMin` and
    * `event.dataMax`.
    */
  var afterSetExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) Fires when the legend item belonging to
    * the colorAxis is clicked. One parameter, `event`, is passed to the
    * function.
    */
  var legendItemClick: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) Fires when the minimum and maximum is
    * set for the axis, either by calling the `.setExtremes()` method or by
    * selecting an area in the chart. One parameter, `event`, is passed to the
    * function, containing common event information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in data
    * values. When an axis is zoomed all the way out from the "Reset zoom"
    * button, `event.min` and `event.max` are null, and the new extremes are
    * set based on `this.dataMin` and `this.dataMax`.
    */
  var setExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.undefined
}
object ColorAxisEventsOptions {
  
  inline def apply(): ColorAxisEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisEventsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorAxisEventsOptions] (val x: Self) extends AnyVal {
    
    inline def setAfterSetExtremes(value: AxisSetExtremesEventCallbackFunction): Self = StObject.set(x, "afterSetExtremes", value.asInstanceOf[js.Any])
    
    inline def setAfterSetExtremesUndefined: Self = StObject.set(x, "afterSetExtremes", js.undefined)
    
    inline def setLegendItemClick(value: js.Function): Self = StObject.set(x, "legendItemClick", value.asInstanceOf[js.Any])
    
    inline def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
    
    inline def setSetExtremes(value: AxisSetExtremesEventCallbackFunction): Self = StObject.set(x, "setExtremes", value.asInstanceOf[js.Any])
    
    inline def setSetExtremesUndefined: Self = StObject.set(x, "setExtremes", js.undefined)
  }
}
