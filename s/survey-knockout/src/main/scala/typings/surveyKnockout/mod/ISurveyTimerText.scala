package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISurveyTimerText extends StObject {
  
  var timerInfoText: String
}
object ISurveyTimerText {
  
  inline def apply(timerInfoText: String): ISurveyTimerText = {
    val __obj = js.Dynamic.literal(timerInfoText = timerInfoText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISurveyTimerText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISurveyTimerText] (val x: Self) extends AnyVal {
    
    inline def setTimerInfoText(value: String): Self = StObject.set(x, "timerInfoText", value.asInstanceOf[js.Any])
  }
}
