package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayArgs
import typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getCustomerGateway")
@js.native
object getCustomerGateway extends js.Object {
  def apply(): js.Promise[GetCustomerGatewayResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCustomerGatewayResult] = js.native
  def apply(args: GetCustomerGatewayArgs): js.Promise[GetCustomerGatewayResult] = js.native
  def apply(args: GetCustomerGatewayArgs, opts: InvokeOptions): js.Promise[GetCustomerGatewayResult] = js.native
}

