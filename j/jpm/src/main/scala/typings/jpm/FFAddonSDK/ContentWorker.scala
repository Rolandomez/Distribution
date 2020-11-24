package typings.jpm.FFAddonSDK

import org.scalablytyped.runtime.Instantiable1
import typings.jpm.anon.OnError
import typings.jpm.jpmStrings.detach
import typings.jpm.jpmStrings.error
import typings.jpm.jpmStrings.message
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentWorker extends Instantiable1[/* options */ OnError, ContentWorker] {
  
  def destroy(): Unit = js.native
  
  @JSName("on")
  def on_detach(event: detach, handler: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_error(event: error, handler: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_message(event: message, handler: js.Function0[_]): Unit = js.native
  
  var port: Port = js.native
  
  def postMessage(): Unit = js.native
  def postMessage(data: js.Any): Unit = js.native
  
  var tab: Tab = js.native
  
  var url: URL = js.native
}
