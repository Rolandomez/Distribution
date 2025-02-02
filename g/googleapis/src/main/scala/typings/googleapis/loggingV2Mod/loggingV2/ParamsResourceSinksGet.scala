package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSinksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the sink: "projects/[PROJECT_ID]/sinks/[SINK_ID]" "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]" "folders/[FOLDER_ID]/sinks/[SINK_ID]" For example:"projects/my-project/sinks/my-sink"
    */
  var sinkName: js.UndefOr[String] = js.undefined
}
object ParamsResourceSinksGet {
  
  inline def apply(): ParamsResourceSinksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSinksGet]
  }
  
  extension [Self <: ParamsResourceSinksGet](x: Self) {
    
    inline def setSinkName(value: String): Self = StObject.set(x, "sinkName", value.asInstanceOf[js.Any])
    
    inline def setSinkNameUndefined: Self = StObject.set(x, "sinkName", js.undefined)
  }
}
