package typings.pulumiAws.ec2Mod

import typings.pulumiAws.amiLaunchPermissionMod.AmiLaunchPermissionArgs
import typings.pulumiAws.amiLaunchPermissionMod.AmiLaunchPermissionState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "AmiLaunchPermission")
@js.native
class AmiLaunchPermission protected ()
  extends typings.pulumiAws.amiLaunchPermissionMod.AmiLaunchPermission {
  /**
    * Create a AmiLaunchPermission resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AmiLaunchPermissionArgs) = this()
  def this(name: String, args: AmiLaunchPermissionArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object AmiLaunchPermission {
  
  /**
    * Get an existing AmiLaunchPermission resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/ec2", "AmiLaunchPermission.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.amiLaunchPermissionMod.AmiLaunchPermission = js.native
  @JSImport("@pulumi/aws/ec2", "AmiLaunchPermission.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.amiLaunchPermissionMod.AmiLaunchPermission = js.native
  @JSImport("@pulumi/aws/ec2", "AmiLaunchPermission.get")
  @js.native
  def get(name: String, id: Input[ID], state: AmiLaunchPermissionState): typings.pulumiAws.amiLaunchPermissionMod.AmiLaunchPermission = js.native
  @JSImport("@pulumi/aws/ec2", "AmiLaunchPermission.get")
  @js.native
  def get(name: String, id: Input[ID], state: AmiLaunchPermissionState, opts: CustomResourceOptions): typings.pulumiAws.amiLaunchPermissionMod.AmiLaunchPermission = js.native
  
  /**
    * Returns true if the given object is an instance of AmiLaunchPermission.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/ec2", "AmiLaunchPermission.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiLaunchPermission.AmiLaunchPermission */ Boolean = js.native
}
