package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV2Getsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource for which to retrieve settings. "projects/[PROJECT_ID]/settings" "organizations/[ORGANIZATION_ID]/settings" "billingAccounts/[BILLING_ACCOUNT_ID]/settings" "folders/[FOLDER_ID]/settings" For example:"organizations/12345/settings"Note: Settings for the Log Router can be get for Google Cloud projects, folders, organizations and billing accounts. Currently it can only be configured for organizations. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceV2Getsettings {
  
  inline def apply(): ParamsResourceV2Getsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV2Getsettings]
  }
  
  extension [Self <: ParamsResourceV2Getsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
