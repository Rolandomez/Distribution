package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketVersioningRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the S3 on Outposts bucket.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The S3 on Outposts bucket to return the versioning state for.
    */
  var Bucket: BucketName
}
object GetBucketVersioningRequest {
  
  inline def apply(AccountId: AccountId, Bucket: BucketName): GetBucketVersioningRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketVersioningRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketVersioningRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
  }
}
