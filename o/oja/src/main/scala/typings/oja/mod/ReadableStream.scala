package typings.oja.mod

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oja", "ReadableStream")
@js.native
class ReadableStream protected () extends Readable {
  def this(topic: String, emitter: EventEmitter) = this()
}
