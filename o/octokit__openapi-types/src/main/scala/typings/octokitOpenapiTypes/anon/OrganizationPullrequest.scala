package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.auto_merge_enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationPullrequest extends StObject {
  
  /** @enum {string} */
  var action: auto_merge_enabled
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var number: Double
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** Pull Request */
  var pull_request: Mergecommitsha
  
  var reason: js.UndefOr[String] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object OrganizationPullrequest {
  
  inline def apply(number: Double, pull_request: Mergecommitsha, repository: Allowupdatebranch, sender: Avatarurl): OrganizationPullrequest = {
    val __obj = js.Dynamic.literal(action = "auto_merge_enabled", number = number.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationPullrequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationPullrequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: auto_merge_enabled): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPull_request(value: Mergecommitsha): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
