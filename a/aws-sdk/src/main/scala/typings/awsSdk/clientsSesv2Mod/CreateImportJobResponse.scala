package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImportJobResponse extends StObject {
  
  /**
    * A string that represents the import job ID.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsSesv2Mod.JobId] = js.undefined
}
object CreateImportJobResponse {
  
  inline def apply(): CreateImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImportJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateImportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
