package typings.qiniu.mod.rpc

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.qiniu.mod.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("qiniu", "rpc.postMultipart")
@js.native
object postMultipart extends js.Object {
  
  def apply(requestURI: String, requestForm: String, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Null, callback: callback): Unit = js.native
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param callback
    */
  def apply(requestURI: String, requestForm: Buffer, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: ReadableStream, callback: callback): Unit = js.native
}
