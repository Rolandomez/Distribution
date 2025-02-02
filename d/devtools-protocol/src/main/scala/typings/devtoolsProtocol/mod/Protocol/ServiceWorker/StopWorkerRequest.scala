package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopWorkerRequest extends StObject {
  
  var versionId: String
}
object StopWorkerRequest {
  
  inline def apply(versionId: String): StopWorkerRequest = {
    val __obj = js.Dynamic.literal(versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopWorkerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopWorkerRequest] (val x: Self) extends AnyVal {
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
