package typings.pulumiPulumi.mod

import typings.pulumiPulumi.dynamicMod.ResourceProvider
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi", "dynamic")
@js.native
object dynamic extends js.Object {
  
  @js.native
  abstract class Resource protected ()
    extends typings.pulumiPulumi.dynamicMod.Resource {
    /**
      * Creates a new dynamic resource.
      *
      * @param provider The implementation of the resource's CRUD operations.
      * @param name The name of the resource.
      * @param props The arguments to use to populate the new resource. Must not define the reserved
      *              property "__provider".
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(provider: ResourceProvider, name: String, props: Inputs) = this()
    def this(provider: ResourceProvider, name: String, props: Inputs, opts: CustomResourceOptions) = this()
  }
}
