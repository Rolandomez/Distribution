package typings.awsSdk.clientsImportexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobInput extends StObject {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.undefined
  
  var JobId: typings.awsSdk.clientsImportexportMod.JobId
}
object CancelJobInput {
  
  inline def apply(JobId: JobId): CancelJobInput = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelJobInput] (val x: Self) extends AnyVal {
    
    inline def setAPIVersion(value: APIVersion_): Self = StObject.set(x, "APIVersion", value.asInstanceOf[js.Any])
    
    inline def setAPIVersionUndefined: Self = StObject.set(x, "APIVersion", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
