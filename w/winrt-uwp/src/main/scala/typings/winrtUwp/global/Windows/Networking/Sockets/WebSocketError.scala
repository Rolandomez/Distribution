package typings.winrtUwp.global.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Web.WebErrorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides socket error status on a MessageWebSocket or StreamWebSocket object. */
@JSGlobal("Windows.Networking.Sockets.WebSocketError")
@js.native
abstract class WebSocketError ()
  extends typings.winrtUwp.Windows.Networking.Sockets.WebSocketError
/* static members */
@JSGlobal("Windows.Networking.Sockets.WebSocketError")
@js.native
object WebSocketError extends js.Object {
  
  /**
    * Gets a WebErrorStatus value based on an error encountered by a WebSocket operation.
    * @param hresult The error encountered by a WebSocket operation represented as an HRESULT.
    * @return The socket error status value for a WebSocket operation.
    */
  def getStatus(hresult: Double): WebErrorStatus = js.native
}
