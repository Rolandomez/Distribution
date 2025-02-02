package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption extends StObject {
  
  /**
    * The method used to add instances to a replacement environment.
    * * `DISCOVER_EXISTING`: Use instances that already exist or will be created manually.
    * * `COPY_AUTO_SCALING_GROUP`: Use settings from a specified **Auto Scaling** group to define and create instances in a new Auto Scaling group. _Exactly one Auto Scaling group must be specified_ when selecting `COPY_AUTO_SCALING_GROUP`. Use `autoscalingGroups` to specify the Auto Scaling group.
    */
  var action: js.UndefOr[String] = js.undefined
}
object DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption {
  
  inline def apply(): DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption]
  }
  
  extension [Self <: DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
  }
}
