package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.viz.dxChart.ChartSingleValueSeriesAggregationMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesStackedBarSeriesAggregation
  extends StObject
     with dxChartSeriesTypesCommonSeriesAggregation {
  
  /**
    * Specifies how to aggregate series points.
    */
  @JSName("method")
  var method_dxChartSeriesTypesStackedBarSeriesAggregation: js.UndefOr[ChartSingleValueSeriesAggregationMethod] = js.undefined
}
object dxChartSeriesTypesStackedBarSeriesAggregation {
  
  inline def apply(): dxChartSeriesTypesStackedBarSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStackedBarSeriesAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartSeriesTypesStackedBarSeriesAggregation] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: ChartSingleValueSeriesAggregationMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
