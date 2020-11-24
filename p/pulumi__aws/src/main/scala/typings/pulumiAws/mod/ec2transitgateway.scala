package typings.pulumiAws.mod

import typings.pulumiAws.ec2transitgatewayRouteMod.RouteArgs
import typings.pulumiAws.ec2transitgatewayRouteMod.RouteState
import typings.pulumiAws.getDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentArgs
import typings.pulumiAws.getDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentResult
import typings.pulumiAws.getPeeringAttachmentMod.GetPeeringAttachmentArgs
import typings.pulumiAws.getPeeringAttachmentMod.GetPeeringAttachmentResult
import typings.pulumiAws.getRouteTableMod.GetRouteTableArgs
import typings.pulumiAws.getRouteTableMod.GetRouteTableResult
import typings.pulumiAws.getTransitGatewayMod.GetTransitGatewayArgs
import typings.pulumiAws.getTransitGatewayMod.GetTransitGatewayResult
import typings.pulumiAws.getVpcAttachmentMod.GetVpcAttachmentArgs
import typings.pulumiAws.getVpcAttachmentMod.GetVpcAttachmentResult
import typings.pulumiAws.getVpnAttachmentMod.GetVpnAttachmentArgs
import typings.pulumiAws.getVpnAttachmentMod.GetVpnAttachmentResult
import typings.pulumiAws.peeringAttachmentMod.PeeringAttachmentArgs
import typings.pulumiAws.peeringAttachmentMod.PeeringAttachmentState
import typings.pulumiAws.routeTableAssociationMod.RouteTableAssociationArgs
import typings.pulumiAws.routeTableAssociationMod.RouteTableAssociationState
import typings.pulumiAws.routeTableMod.RouteTableArgs
import typings.pulumiAws.routeTableMod.RouteTableState
import typings.pulumiAws.routeTablePropagationMod.RouteTablePropagationArgs
import typings.pulumiAws.routeTablePropagationMod.RouteTablePropagationState
import typings.pulumiAws.transitGatewayMod.TransitGatewayArgs
import typings.pulumiAws.transitGatewayMod.TransitGatewayState
import typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepterArgs
import typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepterState
import typings.pulumiAws.vpcAttachmentMod.VpcAttachmentArgs
import typings.pulumiAws.vpcAttachmentMod.VpcAttachmentState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2transitgateway")
@js.native
object ec2transitgateway extends js.Object {
  
  def getDirectConnectGatewayAttachment(): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  def getDirectConnectGatewayAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs, opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  
  def getPeeringAttachment(): js.Promise[GetPeeringAttachmentResult] = js.native
  def getPeeringAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetPeeringAttachmentResult] = js.native
  def getPeeringAttachment(args: GetPeeringAttachmentArgs): js.Promise[GetPeeringAttachmentResult] = js.native
  def getPeeringAttachment(args: GetPeeringAttachmentArgs, opts: InvokeOptions): js.Promise[GetPeeringAttachmentResult] = js.native
  
  def getRouteTable(): js.Promise[GetRouteTableResult] = js.native
  def getRouteTable(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] = js.native
  def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  
  def getTransitGateway(): js.Promise[GetTransitGatewayResult] = js.native
  def getTransitGateway(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = js.native
  def getTransitGateway(args: GetTransitGatewayArgs): js.Promise[GetTransitGatewayResult] = js.native
  def getTransitGateway(args: GetTransitGatewayArgs, opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = js.native
  
  def getVpcAttachment(): js.Promise[GetVpcAttachmentResult] = js.native
  def getVpcAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] = js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs): js.Promise[GetVpcAttachmentResult] = js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] = js.native
  
  def getVpnAttachment(): js.Promise[GetVpnAttachmentResult] = js.native
  def getVpnAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs): js.Promise[GetVpnAttachmentResult] = js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = js.native
  
  @js.native
  class PeeringAttachment protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.PeeringAttachment {
    /**
      * Create a PeeringAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PeeringAttachmentArgs) = this()
    def this(name: String, args: PeeringAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object PeeringAttachment extends js.Object {
    
    /**
      * Get an existing PeeringAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    def get(name: String, id: Input[ID], state: PeeringAttachmentState): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    def get(name: String, id: Input[ID], state: PeeringAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of PeeringAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/peeringAttachment.PeeringAttachment */ Boolean = js.native
  }
  
  @js.native
  class Route protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.Route {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteArgs) = this()
    def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Route extends js.Object {
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState): typings.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typings.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ Boolean = js.native
  }
  
  @js.native
  class RouteTable protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.RouteTable {
    /**
      * Create a RouteTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTableArgs) = this()
    def this(name: String, args: RouteTableArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object RouteTable extends js.Object {
    
    /**
      * Get an existing RouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.routeTableMod.RouteTable = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.routeTableMod.RouteTable = js.native
    def get(name: String, id: Input[ID], state: RouteTableState): typings.pulumiAws.routeTableMod.RouteTable = js.native
    def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): typings.pulumiAws.routeTableMod.RouteTable = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean = js.native
  }
  
  @js.native
  class RouteTableAssociation protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.RouteTableAssociation {
    /**
      * Create a RouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTableAssociationArgs) = this()
    def this(name: String, args: RouteTableAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object RouteTableAssociation extends js.Object {
    
    /**
      * Get an existing RouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState, opts: CustomResourceOptions): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTableAssociation.RouteTableAssociation */ Boolean = js.native
  }
  
  @js.native
  class RouteTablePropagation protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.RouteTablePropagation {
    /**
      * Create a RouteTablePropagation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTablePropagationArgs) = this()
    def this(name: String, args: RouteTablePropagationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object RouteTablePropagation extends js.Object {
    
    /**
      * Get an existing RouteTablePropagation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    def get(name: String, id: Input[ID], state: RouteTablePropagationState): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    def get(name: String, id: Input[ID], state: RouteTablePropagationState, opts: CustomResourceOptions): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTablePropagation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTablePropagation.RouteTablePropagation */ Boolean = js.native
  }
  
  @js.native
  class TransitGateway protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.TransitGateway {
    /**
      * Create a TransitGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TransitGatewayArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TransitGatewayArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object TransitGateway extends js.Object {
    
    /**
      * Get an existing TransitGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.transitGatewayMod.TransitGateway = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.transitGatewayMod.TransitGateway = js.native
    def get(name: String, id: Input[ID], state: TransitGatewayState): typings.pulumiAws.transitGatewayMod.TransitGateway = js.native
    def get(name: String, id: Input[ID], state: TransitGatewayState, opts: CustomResourceOptions): typings.pulumiAws.transitGatewayMod.TransitGateway = js.native
    
    /**
      * Returns true if the given object is an instance of TransitGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/transitGateway.TransitGateway */ Boolean = js.native
  }
  
  @js.native
  class VpcAttachment protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.VpcAttachment {
    /**
      * Create a VpcAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAttachmentArgs) = this()
    def this(name: String, args: VpcAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object VpcAttachment extends js.Object {
    
    /**
      * Get an existing VpcAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentState): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of VpcAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachment.VpcAttachment */ Boolean = js.native
  }
  
  @js.native
  class VpcAttachmentAccepter protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.VpcAttachmentAccepter {
    /**
      * Create a VpcAttachmentAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAttachmentAccepterArgs) = this()
    def this(name: String, args: VpcAttachmentAccepterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object VpcAttachmentAccepter extends js.Object {
    
    /**
      * Get an existing VpcAttachmentAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState, opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    
    /**
      * Returns true if the given object is an instance of VpcAttachmentAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter.VpcAttachmentAccepter */ Boolean = js.native
  }
}
