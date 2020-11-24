package typings.pulumiAws.mod.s3

import typings.pulumiAws.getBucketObjectMod.GetBucketObjectArgs
import typings.pulumiAws.getBucketObjectMod.GetBucketObjectResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "s3.getBucketObject")
@js.native
object getBucketObject extends js.Object {
  
  def apply(args: GetBucketObjectArgs): js.Promise[GetBucketObjectResult] = js.native
  def apply(args: GetBucketObjectArgs, opts: InvokeOptions): js.Promise[GetBucketObjectResult] = js.native
}
