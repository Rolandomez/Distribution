package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollbarOptions extends StObject {
  
  /**
    * (Highstock, Gantt) The background color of the scrollbar itself.
    */
  var barBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock, Gantt) The color of the scrollbar's border.
    */
  var barBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock, Gantt) The border rounding radius of the bar.
    */
  var barBorderRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The width of the bar's border.
    */
  var barBorderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The color of the small arrow inside the scrollbar
    * buttons.
    */
  var buttonArrowColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock, Gantt) The color of scrollbar buttons.
    */
  var buttonBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock, Gantt) The color of the border of the scrollbar buttons.
    */
  var buttonBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock, Gantt) The corner radius of the scrollbar buttons.
    */
  var buttonBorderRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The border width of the scrollbar buttons.
    */
  var buttonBorderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) Enable or disable the buttons at the end of the
    * scrollbar.
    */
  var buttonsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) Enable or disable the scrollbar.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) The height of the scrollbar. If `buttonsEnabled` is
    * true , the height also applies to the width of the scroll arrows so that
    * they are always squares.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) Whether to redraw the main chart as the scrollbar or
    * the navigator zoomed window is moved. Defaults to `true` for modern
    * browsers and `false` for legacy IE browsers as well as mobile devices.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) The margin between the scrollbar and its axis when the
    * scrollbar is applied directly to an axis, or the navigator in case that
    * is enabled. Defaults to 10 for axis, 0 for navigator.
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The minimum width of the scrollbar.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The color of the small rifles in the middle of the
    * scrollbar.
    */
  var rifleColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock, Gantt) Whether to show or hide the scrollbar when the
    * scrolled content is zoomed out to it full extent.
    */
  var showFull: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) The color of the track background.
    */
  var trackBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock, Gantt) The color of the border of the scrollbar track.
    */
  var trackBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock, Gantt) The corner radius of the border of the scrollbar
    * track.
    */
  var trackBorderRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The width of the border of the scrollbar track.
    */
  var trackBorderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The z index of the scrollbar group.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object ScrollbarOptions {
  
  inline def apply(): ScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollbarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollbarOptions] (val x: Self) extends AnyVal {
    
    inline def setBarBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "barBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBarBackgroundColorUndefined: Self = StObject.set(x, "barBackgroundColor", js.undefined)
    
    inline def setBarBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "barBorderColor", value.asInstanceOf[js.Any])
    
    inline def setBarBorderColorUndefined: Self = StObject.set(x, "barBorderColor", js.undefined)
    
    inline def setBarBorderRadius(value: Double): Self = StObject.set(x, "barBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setBarBorderRadiusUndefined: Self = StObject.set(x, "barBorderRadius", js.undefined)
    
    inline def setBarBorderWidth(value: Double): Self = StObject.set(x, "barBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setBarBorderWidthUndefined: Self = StObject.set(x, "barBorderWidth", js.undefined)
    
    inline def setButtonArrowColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "buttonArrowColor", value.asInstanceOf[js.Any])
    
    inline def setButtonArrowColorUndefined: Self = StObject.set(x, "buttonArrowColor", js.undefined)
    
    inline def setButtonBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "buttonBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setButtonBackgroundColorUndefined: Self = StObject.set(x, "buttonBackgroundColor", js.undefined)
    
    inline def setButtonBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "buttonBorderColor", value.asInstanceOf[js.Any])
    
    inline def setButtonBorderColorUndefined: Self = StObject.set(x, "buttonBorderColor", js.undefined)
    
    inline def setButtonBorderRadius(value: Double): Self = StObject.set(x, "buttonBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setButtonBorderRadiusUndefined: Self = StObject.set(x, "buttonBorderRadius", js.undefined)
    
    inline def setButtonBorderWidth(value: Double): Self = StObject.set(x, "buttonBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setButtonBorderWidthUndefined: Self = StObject.set(x, "buttonBorderWidth", js.undefined)
    
    inline def setButtonsEnabled(value: Boolean): Self = StObject.set(x, "buttonsEnabled", value.asInstanceOf[js.Any])
    
    inline def setButtonsEnabledUndefined: Self = StObject.set(x, "buttonsEnabled", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLiveRedraw(value: Boolean): Self = StObject.set(x, "liveRedraw", value.asInstanceOf[js.Any])
    
    inline def setLiveRedrawUndefined: Self = StObject.set(x, "liveRedraw", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setRifleColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "rifleColor", value.asInstanceOf[js.Any])
    
    inline def setRifleColorUndefined: Self = StObject.set(x, "rifleColor", js.undefined)
    
    inline def setShowFull(value: Boolean): Self = StObject.set(x, "showFull", value.asInstanceOf[js.Any])
    
    inline def setShowFullUndefined: Self = StObject.set(x, "showFull", js.undefined)
    
    inline def setTrackBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "trackBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setTrackBackgroundColorUndefined: Self = StObject.set(x, "trackBackgroundColor", js.undefined)
    
    inline def setTrackBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "trackBorderColor", value.asInstanceOf[js.Any])
    
    inline def setTrackBorderColorUndefined: Self = StObject.set(x, "trackBorderColor", js.undefined)
    
    inline def setTrackBorderRadius(value: Double): Self = StObject.set(x, "trackBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setTrackBorderRadiusUndefined: Self = StObject.set(x, "trackBorderRadius", js.undefined)
    
    inline def setTrackBorderWidth(value: Double): Self = StObject.set(x, "trackBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setTrackBorderWidthUndefined: Self = StObject.set(x, "trackBorderWidth", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
