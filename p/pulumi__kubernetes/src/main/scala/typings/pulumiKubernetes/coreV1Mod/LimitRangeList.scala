package typings.pulumiKubernetes.coreV1Mod

import typings.pulumiKubernetes.limitRangeListMod.LimitRangeListArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/core/v1", "LimitRangeList")
@js.native
class LimitRangeList protected ()
  extends typings.pulumiKubernetes.limitRangeListMod.LimitRangeList {
  /**
    * Create a LimitRangeList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: LimitRangeListArgs) = this()
  def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
  def this(name: String, args: LimitRangeListArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object LimitRangeList {
  
  @JSImport("@pulumi/kubernetes/core/v1", "LimitRangeList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get an existing LimitRangeList resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.limitRangeListMod.LimitRangeList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.limitRangeListMod.LimitRangeList]
  inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.limitRangeListMod.LimitRangeList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.limitRangeListMod.LimitRangeList]
  
  /**
    * Returns true if the given object is an instance of LimitRangeList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/limitRangeList.LimitRangeList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/limitRangeList.LimitRangeList */ Boolean]
}
