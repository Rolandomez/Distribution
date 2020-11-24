package typings.pulumiAws.opsworksMod

import typings.pulumiAws.memcachedLayerMod.MemcachedLayerArgs
import typings.pulumiAws.memcachedLayerMod.MemcachedLayerState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/opsworks", "MemcachedLayer")
@js.native
class MemcachedLayer protected ()
  extends typings.pulumiAws.memcachedLayerMod.MemcachedLayer {
  /**
    * Create a MemcachedLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MemcachedLayerArgs) = this()
  def this(name: String, args: MemcachedLayerArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/opsworks", "MemcachedLayer")
@js.native
object MemcachedLayer extends js.Object {
  
  /**
    * Get an existing MemcachedLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
  def get(name: String, id: Input[ID], state: MemcachedLayerState): typings.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
  def get(name: String, id: Input[ID], state: MemcachedLayerState, opts: CustomResourceOptions): typings.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
  
  /**
    * Returns true if the given object is an instance of MemcachedLayer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/memcachedLayer.MemcachedLayer */ Boolean = js.native
}
