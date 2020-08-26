package typings.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketInventoryConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketInventoryConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketInventoryConfigurationOutput]
  }
}

