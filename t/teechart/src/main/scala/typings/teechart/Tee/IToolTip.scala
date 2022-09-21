package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToolTip
  extends StObject
     with IAnnotation {
  
  var animated: Double
  
  var autoHide: Boolean
  
  var autoRedraw: Boolean
  
  var currentIndex: Double
  
  var currentSeries: ISeries
  
  var delay: Double
  
  def hide(): Unit
  
  def refresh(series: ISeries, index: Double): Unit
}
object IToolTip {
  
  inline def apply(
    active: Boolean,
    add: String => IAnnotation,
    animated: Double,
    autoHide: Boolean,
    autoRedraw: Boolean,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => Boolean,
    currentIndex: Double,
    currentSeries: ISeries,
    delay: Double,
    draw: () => Unit,
    format: IFormat,
    hide: () => Unit,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: Any => Boolean,
    mousemove: Any => Boolean,
    position: IPoint,
    refresh: (ISeries, Double) => Unit,
    resize: () => Unit,
    text: String,
    transparent: Boolean,
    visible: Boolean
  ): IToolTip = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), animated = animated.asInstanceOf[js.Any], autoHide = autoHide.asInstanceOf[js.Any], autoRedraw = autoRedraw.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), currentIndex = currentIndex.asInstanceOf[js.Any], currentSeries = currentSeries.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], draw = js.Any.fromFunction0(draw), format = format.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), items = items.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), position = position.asInstanceOf[js.Any], refresh = js.Any.fromFunction2(refresh), resize = js.Any.fromFunction0(resize), text = text.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToolTip]
  }
  
  extension [Self <: IToolTip](x: Self) {
    
    inline def setAnimated(value: Double): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoRedraw(value: Boolean): Self = StObject.set(x, "autoRedraw", value.asInstanceOf[js.Any])
    
    inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
    
    inline def setCurrentSeries(value: ISeries): Self = StObject.set(x, "currentSeries", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setRefresh(value: (ISeries, Double) => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction2(value))
  }
}
