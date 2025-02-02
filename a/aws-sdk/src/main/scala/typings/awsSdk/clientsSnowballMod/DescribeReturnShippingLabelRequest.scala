package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReturnShippingLabelRequest extends StObject {
  
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.clientsSnowballMod.JobId
}
object DescribeReturnShippingLabelRequest {
  
  inline def apply(JobId: JobId): DescribeReturnShippingLabelRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReturnShippingLabelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReturnShippingLabelRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
