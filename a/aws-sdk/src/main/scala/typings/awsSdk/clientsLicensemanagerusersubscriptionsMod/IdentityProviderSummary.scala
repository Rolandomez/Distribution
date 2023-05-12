package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProviderSummary extends StObject {
  
  /**
    * The failure message associated with an identity provider.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * An object that specifies details for the identity provider.
    */
  var IdentityProvider: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.IdentityProvider
  
  /**
    * The name of the user-based subscription product.
    */
  var Product: String
  
  /**
    * An object that details the registered identity provider’s product related configuration settings such as the subnets to provision VPC endpoints.
    */
  var Settings: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.Settings
  
  /**
    * The status of an identity provider.
    */
  var Status: String
}
object IdentityProviderSummary {
  
  inline def apply(IdentityProvider: IdentityProvider, Product: String, Settings: Settings, Status: String): IdentityProviderSummary = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any], Product = Product.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityProviderSummary] (val x: Self) extends AnyVal {
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
