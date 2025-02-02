package typings.urllib

import typings.node.bufferMod.global.Buffer
import typings.urllib.srcEsmRequestMod.RequestOptions
import typings.urllib.srcEsmRequestMod.RequestURL
import typings.urllib.srcEsmResponseMod.HttpClientResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cert extends StObject {
    
    /**
      * A string or Buffer containing the certificate key of the client in PEM format.
      * Notes: This is necessary only if using the client certificate authentication
      */
    var cert: js.UndefOr[String | Buffer] = js.undefined
    
    var key: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * If true, the server certificate is verified against the list of supplied CAs.
      * An 'error' event is emitted if verification fails.Default: true.
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * sockePath string | null (optional) - Default: null - An IPC endpoint, either Unix domain socket or Windows named pipe
      */
    var socketPath: js.UndefOr[String | Null] = js.undefined
  }
  object Cert {
    
    inline def apply(): Cert = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cert]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cert] (val x: Self) extends AnyVal {
      
      inline def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathNull: Self = StObject.set(x, "socketPath", null)
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](url: RequestURL): js.Promise[HttpClientResponse[T]] = js.native
    def apply[T](url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  }
}
