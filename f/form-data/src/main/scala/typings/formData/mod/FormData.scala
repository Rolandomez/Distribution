package typings.formData.mod

import typings.node.Buffer
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormData extends Readable {
  
  def append(key: String, value: js.Any): Unit = js.native
  def append(key: String, value: js.Any, options: String): Unit = js.native
  def append(key: String, value: js.Any, options: AppendOptions): Unit = js.native
  
  def getBoundary(): String = js.native
  
  def getBuffer(): Buffer = js.native
  
  def getHeaders(): Headers = js.native
  def getHeaders(userHeaders: Headers): Headers = js.native
  
  def getLength(callback: js.Function2[/* err */ Error | Null, /* length */ Double, Unit]): Unit = js.native
  
  def getLengthSync(): Double = js.native
  
  def hasKnownLength(): Boolean = js.native
  
  def submit(params: String): ClientRequest = js.native
  def submit(
    params: String,
    callback: js.Function2[/* error */ Error | Null, /* response */ IncomingMessage, Unit]
  ): ClientRequest = js.native
  def submit(params: SubmitOptions): ClientRequest = js.native
  def submit(
    params: SubmitOptions,
    callback: js.Function2[/* error */ Error | Null, /* response */ IncomingMessage, Unit]
  ): ClientRequest = js.native
}
