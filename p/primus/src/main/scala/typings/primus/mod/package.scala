package typings.primus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AuthorizationHandler = js.Function2[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* done */ js.Function1[
      /* err */ js.UndefOr[java.lang.String | typings.std.Error | typings.primus.anon.Authenticate], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type Middleware = js.Function2[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    scala.Unit
  ]
}
