package typings.samchon

import typings.samchon.communicatorBaseMod.CommunicatorBase
import typings.std.MessageEvent
import typings.std.MessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol/communicator/communicator/SharedWorkerCommunicator", JSImport.Namespace)
@js.native
object sharedWorkerCommunicatorMod extends js.Object {
  
  @js.native
  abstract class SharedWorkerCommunicator () extends CommunicatorBase {
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_message(event: MessageEvent[_]): Unit = js.native
    
    /**
      * @hidden
      */
    var port_ : MessagePort = js.native
  }
}
