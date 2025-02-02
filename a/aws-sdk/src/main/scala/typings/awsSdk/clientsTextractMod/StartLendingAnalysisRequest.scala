package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartLendingAnalysisRequest extends StObject {
  
  /**
    * The idempotent token that you use to identify the start request. If you use the same token with multiple StartLendingAnalysis requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidentally started more than once. For more information, see Calling Amazon Textract Asynchronous Operations.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsTextractMod.ClientRequestToken] = js.undefined
  
  var DocumentLocation: typings.awsSdk.clientsTextractMod.DocumentLocation
  
  /**
    * An identifier that you specify to be included in the completion notification published to the Amazon SNS topic. For example, you can use JobTag to identify the type of document that the completion notification corresponds to (such as a tax form or a receipt).
    */
  var JobTag: js.UndefOr[typings.awsSdk.clientsTextractMod.JobTag] = js.undefined
  
  /**
    * The KMS key used to encrypt the inference results. This can be in either Key ID or Key Alias format. When a KMS key is provided, the KMS key will be used for server-side encryption of the objects in the customer bucket. When this parameter is not enabled, the result will be encrypted server side, using SSE-S3. 
    */
  var KMSKeyId: js.UndefOr[typings.awsSdk.clientsTextractMod.KMSKeyId] = js.undefined
  
  var NotificationChannel: js.UndefOr[typings.awsSdk.clientsTextractMod.NotificationChannel] = js.undefined
  
  var OutputConfig: js.UndefOr[typings.awsSdk.clientsTextractMod.OutputConfig] = js.undefined
}
object StartLendingAnalysisRequest {
  
  inline def apply(DocumentLocation: DocumentLocation): StartLendingAnalysisRequest = {
    val __obj = js.Dynamic.literal(DocumentLocation = DocumentLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLendingAnalysisRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartLendingAnalysisRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDocumentLocation(value: DocumentLocation): Self = StObject.set(x, "DocumentLocation", value.asInstanceOf[js.Any])
    
    inline def setJobTag(value: JobTag): Self = StObject.set(x, "JobTag", value.asInstanceOf[js.Any])
    
    inline def setJobTagUndefined: Self = StObject.set(x, "JobTag", js.undefined)
    
    inline def setKMSKeyId(value: KMSKeyId): Self = StObject.set(x, "KMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyIdUndefined: Self = StObject.set(x, "KMSKeyId", js.undefined)
    
    inline def setNotificationChannel(value: NotificationChannel): Self = StObject.set(x, "NotificationChannel", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelUndefined: Self = StObject.set(x, "NotificationChannel", js.undefined)
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "OutputConfig", js.undefined)
  }
}
