package typings.pulumiAws.apigatewayMod

import typings.pulumiAws.usagePlanKeyMod.UsagePlanKeyArgs
import typings.pulumiAws.usagePlanKeyMod.UsagePlanKeyState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigateway", "UsagePlanKey")
@js.native
class UsagePlanKey protected ()
  extends typings.pulumiAws.usagePlanKeyMod.UsagePlanKey {
  /**
    * Create a UsagePlanKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UsagePlanKeyArgs) = this()
  def this(name: String, args: UsagePlanKeyArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object UsagePlanKey {
  
  @JSImport("@pulumi/aws/apigateway", "UsagePlanKey")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get an existing UsagePlanKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  inline def get(name: String, id: Input[ID]): typings.pulumiAws.usagePlanKeyMod.UsagePlanKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.usagePlanKeyMod.UsagePlanKey]
  inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.usagePlanKeyMod.UsagePlanKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.usagePlanKeyMod.UsagePlanKey]
  inline def get(name: String, id: Input[ID], state: UsagePlanKeyState): typings.pulumiAws.usagePlanKeyMod.UsagePlanKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.usagePlanKeyMod.UsagePlanKey]
  inline def get(name: String, id: Input[ID], state: UsagePlanKeyState, opts: CustomResourceOptions): typings.pulumiAws.usagePlanKeyMod.UsagePlanKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.usagePlanKeyMod.UsagePlanKey]
  
  /**
    * Returns true if the given object is an instance of UsagePlanKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/usagePlanKey.UsagePlanKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/usagePlanKey.UsagePlanKey */ Boolean]
}
