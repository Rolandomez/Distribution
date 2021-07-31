package typings.chrome.anon

import typings.chrome.chrome.webRequest.WebAuthenticationChallengeEvent
import typings.chrome.chrome.webRequest.WebRedirectionResponseEvent
import typings.chrome.chrome.webRequest.WebRequestBodyEvent
import typings.chrome.chrome.webRequest.WebRequestHeadersEvent
import typings.chrome.chrome.webRequest.WebRequestHeadersSynchronousEvent
import typings.chrome.chrome.webRequest.WebResponseCacheEvent
import typings.chrome.chrome.webRequest.WebResponseErrorEvent
import typings.chrome.chrome.webRequest.WebResponseHeadersEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofwebRequest extends StObject {
  
  var MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  
  def handlerBehaviorChanged(): Unit = js.native
  def handlerBehaviorChanged(callback: js.Function): Unit = js.native
  
  var onAuthRequired: WebAuthenticationChallengeEvent = js.native
  
  var onBeforeRedirect: WebRedirectionResponseEvent = js.native
  
  var onBeforeRequest: WebRequestBodyEvent = js.native
  
  var onBeforeSendHeaders: WebRequestHeadersSynchronousEvent = js.native
  
  var onCompleted: WebResponseCacheEvent = js.native
  
  var onErrorOccurred: WebResponseErrorEvent = js.native
  
  var onHeadersReceived: WebResponseHeadersEvent = js.native
  
  var onResponseStarted: WebResponseCacheEvent = js.native
  
  var onSendHeaders: WebRequestHeadersEvent = js.native
}
