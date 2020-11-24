package typings.wreck.mod

import typings.node.eventsMod.EventEmitter
import typings.wreck.wreckStrings.request
import typings.wreck.wreckStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WreckEventEmitter extends EventEmitter {
  
  @JSName("on")
  def on_request(event: request, listener: RequestCallback): this.type = js.native
  @JSName("on")
  def on_response(event: response, listener: ResponseCallback): this.type = js.native
}
