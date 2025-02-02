package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVaultNotificationsInput extends StObject {
  
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String
  
  /**
    * The name of the vault.
    */
  var vaultName: String
  
  /**
    * Provides options for specifying notification configuration.
    */
  var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
}
object SetVaultNotificationsInput {
  
  inline def apply(accountId: String, vaultName: String): SetVaultNotificationsInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVaultNotificationsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetVaultNotificationsInput] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setVaultName(value: String): Self = StObject.set(x, "vaultName", value.asInstanceOf[js.Any])
    
    inline def setVaultNotificationConfig(value: VaultNotificationConfig): Self = StObject.set(x, "vaultNotificationConfig", value.asInstanceOf[js.Any])
    
    inline def setVaultNotificationConfigUndefined: Self = StObject.set(x, "vaultNotificationConfig", js.undefined)
  }
}
