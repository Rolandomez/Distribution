package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.holt_winters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsHoltWintersMovingAverageAggregation
  extends StObject
     with AggregationsMovingAverageAggregationBase
     with AggregationsMovingAverageAggregation {
  
  var model: holt_winters
  
  var settings: AggregationsHoltWintersModelSettings
}
object AggregationsHoltWintersMovingAverageAggregation {
  
  inline def apply(settings: AggregationsHoltWintersModelSettings): AggregationsHoltWintersMovingAverageAggregation = {
    val __obj = js.Dynamic.literal(model = "holt_winters", settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsHoltWintersMovingAverageAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsHoltWintersMovingAverageAggregation] (val x: Self) extends AnyVal {
    
    inline def setModel(value: holt_winters): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: AggregationsHoltWintersModelSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
