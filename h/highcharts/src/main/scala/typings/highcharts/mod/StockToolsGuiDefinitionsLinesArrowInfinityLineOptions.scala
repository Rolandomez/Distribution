package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsLinesArrowInfinityLineOptions extends StObject {
  
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}
object StockToolsGuiDefinitionsLinesArrowInfinityLineOptions {
  
  inline def apply(): StockToolsGuiDefinitionsLinesArrowInfinityLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsLinesArrowInfinityLineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StockToolsGuiDefinitionsLinesArrowInfinityLineOptions] (val x: Self) extends AnyVal {
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
