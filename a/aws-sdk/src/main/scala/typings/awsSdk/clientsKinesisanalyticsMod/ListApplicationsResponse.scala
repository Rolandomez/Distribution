package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsResponse extends StObject {
  
  /**
    * List of ApplicationSummary objects. 
    */
  var ApplicationSummaries: typings.awsSdk.clientsKinesisanalyticsMod.ApplicationSummaries
  
  /**
    * Returns true if there are more applications to retrieve.
    */
  var HasMoreApplications: BooleanObject
}
object ListApplicationsResponse {
  
  inline def apply(ApplicationSummaries: ApplicationSummaries, HasMoreApplications: BooleanObject): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSummaries = ApplicationSummaries.asInstanceOf[js.Any], HasMoreApplications = HasMoreApplications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApplicationsResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationSummaries(value: ApplicationSummaries): Self = StObject.set(x, "ApplicationSummaries", value.asInstanceOf[js.Any])
    
    inline def setApplicationSummariesVarargs(value: ApplicationSummary*): Self = StObject.set(x, "ApplicationSummaries", js.Array(value*))
    
    inline def setHasMoreApplications(value: BooleanObject): Self = StObject.set(x, "HasMoreApplications", value.asInstanceOf[js.Any])
  }
}
