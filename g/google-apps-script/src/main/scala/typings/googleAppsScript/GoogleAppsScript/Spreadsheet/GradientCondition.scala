package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access gradient (color) conditions in ConditionalFormatRuleApis.
  * Each conditional format rule may contain a single gradient condition. A gradient condition is
  * defined by three points along a number scale (min, mid, and max), each of which has a color, a
  * value, and a InterpolationType. The content of a cell is
  * compared to the values in the number scale and the color applied to the cell is interpolated
  * based on the cell content's proximity to the gradient condition min, mid, and max points.
  *
  *     // Logs all the information inside gradient conditional format rules on a sheet.
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var rules = sheet.getConditionalFormatRules();
  *     for (int i = 0; i < rules.length; i++) {
  *       var gradient = rules[i].getGradientCondition();
  *       Logger.log("The conditional format gradient information for rule %d:\n
  *         MinColor %s, MinType %s, MinValue %s, \n
  *         MidColor %s, MidType %s, MidValue %s, \n
  *         MaxColor %s, MaxType %s, MaxValue %s \n", i,
  *         gradient.getMinColor(), gradient.getMinType(), gradient.getMinValue(),
  *         gradient.getMidColor(), gradient.getMidType(), gradient.getMidValue(),
  *         gradient.getMaxColor(), gradient.getMaxType(), gradient.getMaxValue());
  *     }
  */
trait GradientCondition extends StObject {
  
  def getMaxColor(): String
  
  def getMaxType(): InterpolationType | Null
  
  def getMaxValue(): String
  
  def getMidColor(): String
  
  def getMidType(): InterpolationType | Null
  
  def getMidValue(): String
  
  def getMinColor(): String
  
  def getMinType(): InterpolationType | Null
  
  def getMinValue(): String
}
object GradientCondition {
  
  inline def apply(
    getMaxColor: () => String,
    getMaxType: () => InterpolationType | Null,
    getMaxValue: () => String,
    getMidColor: () => String,
    getMidType: () => InterpolationType | Null,
    getMidValue: () => String,
    getMinColor: () => String,
    getMinType: () => InterpolationType | Null,
    getMinValue: () => String
  ): GradientCondition = {
    val __obj = js.Dynamic.literal(getMaxColor = js.Any.fromFunction0(getMaxColor), getMaxType = js.Any.fromFunction0(getMaxType), getMaxValue = js.Any.fromFunction0(getMaxValue), getMidColor = js.Any.fromFunction0(getMidColor), getMidType = js.Any.fromFunction0(getMidType), getMidValue = js.Any.fromFunction0(getMidValue), getMinColor = js.Any.fromFunction0(getMinColor), getMinType = js.Any.fromFunction0(getMinType), getMinValue = js.Any.fromFunction0(getMinValue))
    __obj.asInstanceOf[GradientCondition]
  }
  
  extension [Self <: GradientCondition](x: Self) {
    
    inline def setGetMaxColor(value: () => String): Self = StObject.set(x, "getMaxColor", js.Any.fromFunction0(value))
    
    inline def setGetMaxType(value: () => InterpolationType | Null): Self = StObject.set(x, "getMaxType", js.Any.fromFunction0(value))
    
    inline def setGetMaxValue(value: () => String): Self = StObject.set(x, "getMaxValue", js.Any.fromFunction0(value))
    
    inline def setGetMidColor(value: () => String): Self = StObject.set(x, "getMidColor", js.Any.fromFunction0(value))
    
    inline def setGetMidType(value: () => InterpolationType | Null): Self = StObject.set(x, "getMidType", js.Any.fromFunction0(value))
    
    inline def setGetMidValue(value: () => String): Self = StObject.set(x, "getMidValue", js.Any.fromFunction0(value))
    
    inline def setGetMinColor(value: () => String): Self = StObject.set(x, "getMinColor", js.Any.fromFunction0(value))
    
    inline def setGetMinType(value: () => InterpolationType | Null): Self = StObject.set(x, "getMinType", js.Any.fromFunction0(value))
    
    inline def setGetMinValue(value: () => String): Self = StObject.set(x, "getMinValue", js.Any.fromFunction0(value))
  }
}
