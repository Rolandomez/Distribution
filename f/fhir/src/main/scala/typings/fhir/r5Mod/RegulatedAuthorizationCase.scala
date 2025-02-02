package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegulatedAuthorizationCase
  extends StObject
     with BackboneElement {
  
  var _dateDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * A regulatory submission from an organization to a regulator, as part of an assessing case. Multiple applications may occur over time, with more or different information to support or modify the submission or the authorization. The applications can be considered as steps within the longer running case or procedure for this authorization process.
    */
  var application: js.UndefOr[js.Array[RegulatedAuthorizationCase]] = js.undefined
  
  /**
    * Relevant date for this case.
    */
  var dateDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Relevant date for this case.
    */
  var datePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Identifier by which this case can be referenced.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The status associated with the case.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The defining type of case.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object RegulatedAuthorizationCase {
  
  inline def apply(): RegulatedAuthorizationCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegulatedAuthorizationCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegulatedAuthorizationCase] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: js.Array[RegulatedAuthorizationCase]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setApplicationVarargs(value: RegulatedAuthorizationCase*): Self = StObject.set(x, "application", js.Array(value*))
    
    inline def setDateDateTime(value: String): Self = StObject.set(x, "dateDateTime", value.asInstanceOf[js.Any])
    
    inline def setDateDateTimeUndefined: Self = StObject.set(x, "dateDateTime", js.undefined)
    
    inline def setDatePeriod(value: Period): Self = StObject.set(x, "datePeriod", value.asInstanceOf[js.Any])
    
    inline def setDatePeriodUndefined: Self = StObject.set(x, "datePeriod", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_dateDateTime(value: Element): Self = StObject.set(x, "_dateDateTime", value.asInstanceOf[js.Any])
    
    inline def set_dateDateTimeUndefined: Self = StObject.set(x, "_dateDateTime", js.undefined)
  }
}
