package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeStatus is information about the current status of a node.
  */
trait NodeStatus extends StObject {
  
  /**
    * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.
    */
  var addresses: js.Array[NodeAddress]
  
  /**
    * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
    */
  var allocatable: StringDictionary[String]
  
  /**
    * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: StringDictionary[String]
  
  /**
    * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
    */
  var conditions: js.Array[NodeCondition]
  
  /**
    * Status of the config assigned to the node via the dynamic Kubelet config feature.
    */
  var config: NodeConfigStatus
  
  /**
    * Endpoints of daemons running on the Node.
    */
  var daemonEndpoints: NodeDaemonEndpoints
  
  /**
    * List of container images on this node
    */
  var images: js.Array[ContainerImage]
  
  /**
    * Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
    */
  var nodeInfo: NodeSystemInfo
  
  /**
    * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
    */
  var phase: String
  
  /**
    * List of volumes that are attached to the node.
    */
  var volumesAttached: js.Array[AttachedVolume]
  
  /**
    * List of attachable volumes in use (mounted) by the node.
    */
  var volumesInUse: js.Array[String]
}
object NodeStatus {
  
  inline def apply(
    addresses: js.Array[NodeAddress],
    allocatable: StringDictionary[String],
    capacity: StringDictionary[String],
    conditions: js.Array[NodeCondition],
    config: NodeConfigStatus,
    daemonEndpoints: NodeDaemonEndpoints,
    images: js.Array[ContainerImage],
    nodeInfo: NodeSystemInfo,
    phase: String,
    volumesAttached: js.Array[AttachedVolume],
    volumesInUse: js.Array[String]
  ): NodeStatus = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], allocatable = allocatable.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], daemonEndpoints = daemonEndpoints.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], nodeInfo = nodeInfo.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], volumesAttached = volumesAttached.asInstanceOf[js.Any], volumesInUse = volumesInUse.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeStatus]
  }
  
  extension [Self <: NodeStatus](x: Self) {
    
    inline def setAddresses(value: js.Array[NodeAddress]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: NodeAddress*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    inline def setAllocatable(value: StringDictionary[String]): Self = StObject.set(x, "allocatable", value.asInstanceOf[js.Any])
    
    inline def setCapacity(value: StringDictionary[String]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: js.Array[NodeCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: NodeCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setConfig(value: NodeConfigStatus): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDaemonEndpoints(value: NodeDaemonEndpoints): Self = StObject.set(x, "daemonEndpoints", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[ContainerImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: ContainerImage*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    inline def setNodeInfo(value: NodeSystemInfo): Self = StObject.set(x, "nodeInfo", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setVolumesAttached(value: js.Array[AttachedVolume]): Self = StObject.set(x, "volumesAttached", value.asInstanceOf[js.Any])
    
    inline def setVolumesAttachedVarargs(value: AttachedVolume*): Self = StObject.set(x, "volumesAttached", js.Array(value :_*))
    
    inline def setVolumesInUse(value: js.Array[String]): Self = StObject.set(x, "volumesInUse", value.asInstanceOf[js.Any])
    
    inline def setVolumesInUseVarargs(value: String*): Self = StObject.set(x, "volumesInUse", js.Array(value :_*))
  }
}
