package typings.typescriptNn5FuAjk.Intl

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.always
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.auto
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.compact
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.engineering
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.exceptZero
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.long
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.narrow
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.never
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.scientific
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.short
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedNumberFormatOptions extends StObject {
  
  var compactDisplay: js.UndefOr[short | long] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currencyDisplay: js.UndefOr[String] = js.undefined
  
  var currencySign: js.UndefOr[String] = js.undefined
  
  var locale: String
  
  var maximumFractionDigits: Double
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var minimumFractionDigits: Double
  
  var minimumIntegerDigits: Double
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var notation: js.UndefOr[standard | scientific | engineering | compact] = js.undefined
  
  var numberingSystem: String
  
  var signDisplay: js.UndefOr[auto | never | always | exceptZero] = js.undefined
  
  var style: String
  
  var unit: js.UndefOr[String] = js.undefined
  
  var unitDisplay: js.UndefOr[short | long | narrow] = js.undefined
  
  var useGrouping: Boolean
}
object ResolvedNumberFormatOptions {
  
  inline def apply(
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    numberingSystem: String,
    style: String,
    useGrouping: Boolean
  ): ResolvedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedNumberFormatOptions]
  }
  
  extension [Self <: ResolvedNumberFormatOptions](x: Self) {
    
    inline def setCompactDisplay(value: short | long): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    inline def setCompactDisplayUndefined: Self = StObject.set(x, "compactDisplay", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplay(value: String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    inline def setCurrencySign(value: String): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    inline def setCurrencySignUndefined: Self = StObject.set(x, "currencySign", js.undefined)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    inline def setNotation(value: standard | scientific | engineering | compact): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNotationUndefined: Self = StObject.set(x, "notation", js.undefined)
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setSignDisplay(value: auto | never | always | exceptZero): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    inline def setSignDisplayUndefined: Self = StObject.set(x, "signDisplay", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplay(value: short | long | narrow): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplayUndefined: Self = StObject.set(x, "unitDisplay", js.undefined)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
  }
}
