package typings.vscodeJsonrpc.messageReaderMod

import typings.node.BufferEncoding
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/messageReader", "SocketMessageReader")
@js.native
class SocketMessageReader protected () extends StreamMessageReader {
  def this(socket: Socket) = this()
  def this(socket: Socket, encoding: BufferEncoding) = this()
}
