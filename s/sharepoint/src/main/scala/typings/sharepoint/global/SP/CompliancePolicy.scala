package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompliancePolicy {
  
  @JSGlobal("SP.CompliancePolicy.SPContainerId")
  @js.native
  class SPContainerId ()
    extends typings.sharepoint.SP.CompliancePolicy.SPContainerId
  object SPContainerId {
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPContainerId.create")
    @js.native
    def create(context: typings.sharepoint.SP.ClientRuntimeContext, containerId: js.Any): typings.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPContainerId.createFromList")
    @js.native
    def createFromList(context: typings.sharepoint.SP.ClientRuntimeContext, list: typings.sharepoint.SP.List[_]): typings.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPContainerId.createFromSite")
    @js.native
    def createFromSite(context: typings.sharepoint.SP.ClientRuntimeContext, site: typings.sharepoint.SP.Site): typings.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPContainerId.createFromWeb")
    @js.native
    def createFromWeb(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
  }
  
  @JSGlobal("SP.CompliancePolicy.SPContainerType")
  @js.native
  object SPContainerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.CompliancePolicy.SPContainerType with Double] = js.native
    
    /* 2 */ val list: typings.sharepoint.SP.CompliancePolicy.SPContainerType.list with Double = js.native
    
    /* 0 */ val site: typings.sharepoint.SP.CompliancePolicy.SPContainerType.site with Double = js.native
    
    /* 1 */ val web: typings.sharepoint.SP.CompliancePolicy.SPContainerType.web with Double = js.native
  }
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyAssociation")
  @js.native
  class SPPolicyAssociation ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyAssociation
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyBinding")
  @js.native
  class SPPolicyBinding ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyBinding
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyDefinition")
  @js.native
  class SPPolicyDefinition ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyDefinition
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyRule")
  @js.native
  class SPPolicyRule ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyRule
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyStore")
  @js.native
  class SPPolicyStore protected ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyStore {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web) = this()
  }
  object SPPolicyStore {
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPPolicyStore.createPolicyAssociation")
    @js.native
    def createPolicyAssociation(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyAssociation = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPPolicyStore.createPolicyBinding")
    @js.native
    def createPolicyBinding(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyBinding = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPPolicyStore.createPolicyDefinition")
    @js.native
    def createPolicyDefinition(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyDefinition = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPPolicyStore.createPolicyRule")
    @js.native
    def createPolicyRule(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyRule = js.native
  }
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyStoreProxy")
  @js.native
  class SPPolicyStoreProxy protected ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyStoreProxy {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web) = this()
  }
}
