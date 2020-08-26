package typings.pulumiAws.s3Mod

import typings.pulumiAws.getBucketMod.GetBucketArgs
import typings.pulumiAws.getBucketMod.GetBucketResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "getBucket")
@js.native
object getBucket extends js.Object {
  def apply(args: GetBucketArgs): js.Promise[GetBucketResult] = js.native
  def apply(args: GetBucketArgs, opts: InvokeOptions): js.Promise[GetBucketResult] = js.native
}

