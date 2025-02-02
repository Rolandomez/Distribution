package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1Scheduling extends StObject {
  
  /**
    * Optional. The maximum job running time, expressed in seconds. The field can contain up to nine fractional digits, terminated by `s`. If not specified, this field defaults to
    * `604800s` (seven days). If the training job is still running after this duration, AI Platform Training cancels it. The duration is measured from when the job enters the `RUNNING`
    * state; therefore it does not overlap with the duration limited by Scheduling.max_wait_time. For example, if you want to ensure your job runs for no more than 2 hours, set this field
    * to `7200s` (2 hours * 60 minutes / hour * 60 seconds / minute). If you submit your training job using the `gcloud` tool, you can [specify this field in a `config.yaml`
    * file](/ai-platform/training/docs/training-jobs#formatting_your_configuration_parameters). For example: ```yaml trainingInput: scheduling: maxRunningTime: 7200s ```
    */
  var maxRunningTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The maximum job wait time, expressed in seconds. The field can contain up to nine fractional digits, terminated by `s`. If not specified, there is no limit to the wait
    * time. The minimum for this field is `1800s` (30 minutes). If the training job has not entered the `RUNNING` state after this duration, AI Platform Training cancels it. After the job
    * begins running, it can no longer be cancelled due to the maximum wait time. Therefore the duration limited by this field does not overlap with the duration limited by
    * Scheduling.max_running_time. For example, if the job temporarily stops running and retries due to a [VM restart](/ai-platform/training/docs/overview#restarts), this cannot lead to a
    * maximum wait time cancellation. However, independently of this constraint, AI Platform Training might stop a job if there are too many retries due to exhausted resources in a
    * region. The following example describes how you might use this field: To cancel your job if it doesn't start running within 1 hour, set this field to `3600s` (1 hour * 60 minutes /
    * hour * 60 seconds / minute). If the job is still in the `QUEUED` or `PREPARING` state after an hour of waiting, AI Platform Training cancels the job. If you submit your training job
    * using the `gcloud` tool, you can [specify this field in a `config.yaml` file](/ai-platform/training/docs/training-jobs#formatting_your_configuration_parameters). For example:
    * ```yaml trainingInput: scheduling: maxWaitTime: 3600s ```
    */
  var maxWaitTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Job scheduling will be based on this priority, which in the range [0, 1000]. The bigger the number, the higher the priority. Default to 0 if not set. If there are multiple
    * jobs requesting same type of accelerators, the high priority job will be scheduled prior to ones with low priority.
    */
  var priority: js.UndefOr[Double] = js.undefined
}
object GoogleCloudMlV1Scheduling {
  
  inline def apply(): GoogleCloudMlV1Scheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Scheduling]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudMlV1Scheduling] (val x: Self) extends AnyVal {
    
    inline def setMaxRunningTime(value: String): Self = StObject.set(x, "maxRunningTime", value.asInstanceOf[js.Any])
    
    inline def setMaxRunningTimeUndefined: Self = StObject.set(x, "maxRunningTime", js.undefined)
    
    inline def setMaxWaitTime(value: String): Self = StObject.set(x, "maxWaitTime", value.asInstanceOf[js.Any])
    
    inline def setMaxWaitTimeUndefined: Self = StObject.set(x, "maxWaitTime", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
