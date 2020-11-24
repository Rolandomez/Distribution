package typings.bufferstream.postbufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostBuffer
  extends typings.bufferstream.mod.^ {
  
  /** set a callback to get all post data from a http server request */
  def onEnd(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
}
