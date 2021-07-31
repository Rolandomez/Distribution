package typings.servicenow.servicenow

import typings.servicenow.anon.Get
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RESTResponseV2 extends StObject {
  
  def getBody(): String
  
  def getCookies(): Get
  
  def getErrorCode(): Double
  
  def getErrorMessage(): String
  
  def getHeader(name: String): String
  
  def getHeaders(): js.Object
  
  def getQueryString(): String
  
  def getResponseAttachmentSysid(): String
  
  def getStatusCode(): Double
  
  def haveError(): Boolean
  
  def waitForResponse(timeoutSecs: Double): Unit
}
object RESTResponseV2 {
  
  @scala.inline
  def apply(
    getBody: () => String,
    getCookies: () => Get,
    getErrorCode: () => Double,
    getErrorMessage: () => String,
    getHeader: String => String,
    getHeaders: () => js.Object,
    getQueryString: () => String,
    getResponseAttachmentSysid: () => String,
    getStatusCode: () => Double,
    haveError: () => Boolean,
    waitForResponse: Double => Unit
  ): RESTResponseV2 = {
    val __obj = js.Dynamic.literal(getBody = js.Any.fromFunction0(getBody), getCookies = js.Any.fromFunction0(getCookies), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), getQueryString = js.Any.fromFunction0(getQueryString), getResponseAttachmentSysid = js.Any.fromFunction0(getResponseAttachmentSysid), getStatusCode = js.Any.fromFunction0(getStatusCode), haveError = js.Any.fromFunction0(haveError), waitForResponse = js.Any.fromFunction1(waitForResponse))
    __obj.asInstanceOf[RESTResponseV2]
  }
  
  @scala.inline
  implicit class RESTResponseV2MutableBuilder[Self <: RESTResponseV2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBody(value: () => String): Self = StObject.set(x, "getBody", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCookies(value: () => Get): Self = StObject.set(x, "getCookies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorCode(value: () => Double): Self = StObject.set(x, "getErrorCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorMessage(value: () => String): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHeaders(value: () => js.Object): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQueryString(value: () => String): Self = StObject.set(x, "getQueryString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResponseAttachmentSysid(value: () => String): Self = StObject.set(x, "getResponseAttachmentSysid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatusCode(value: () => Double): Self = StObject.set(x, "getStatusCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHaveError(value: () => Boolean): Self = StObject.set(x, "haveError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWaitForResponse(value: Double => Unit): Self = StObject.set(x, "waitForResponse", js.Any.fromFunction1(value))
  }
}
