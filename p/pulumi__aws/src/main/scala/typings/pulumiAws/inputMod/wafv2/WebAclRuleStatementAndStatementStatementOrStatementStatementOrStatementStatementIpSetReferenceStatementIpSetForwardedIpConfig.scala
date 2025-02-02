package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig extends StObject {
  
  /**
    * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
    */
  var fallbackBehavior: Input[String]
  
  /**
    * - The name of the HTTP header to use for the IP address.
    */
  var headerName: Input[String]
  
  /**
    * - The position in the header to search for the IP address. Valid values include: `FIRST`, `LAST`, or `ANY`. If `ANY` is specified and the header contains more than 10 IP addresses, AWS WAFv2 inspects the last 10.
    */
  var position: Input[String]
}
object WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig {
  
  inline def apply(fallbackBehavior: Input[String], headerName: Input[String], position: Input[String]): WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig = {
    val __obj = js.Dynamic.literal(fallbackBehavior = fallbackBehavior.asInstanceOf[js.Any], headerName = headerName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig]
  }
  
  extension [Self <: WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig](x: Self) {
    
    inline def setFallbackBehavior(value: Input[String]): Self = StObject.set(x, "fallbackBehavior", value.asInstanceOf[js.Any])
    
    inline def setHeaderName(value: Input[String]): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Input[String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
