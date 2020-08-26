package typings.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketReplicationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketReplicationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketReplicationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketReplicationOutput]
  }
}

