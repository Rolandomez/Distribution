package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterInput extends StObject {
  
  /**
    * The identifier of the cluster to describe.
    */
  var ClusterId: typings.awsSdk.clientsEmrMod.ClusterId
}
object DescribeClusterInput {
  
  inline def apply(ClusterId: ClusterId): DescribeClusterInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClusterInput] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
