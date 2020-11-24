package typings.expressWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Application = typings.express.mod.Application_ with typings.expressWs.mod.WithWebsocketMethod
  
  type Router = typings.express.mod.Router with typings.expressWs.mod.WithWebsocketMethod
  
  type WebsocketMethod[T] = js.Function2[
    /* route */ typings.expressServeStaticCore.mod.PathParams, 
    /* repeated */ typings.expressWs.mod.WebsocketRequestHandler, 
    T
  ]
  
  type WebsocketRequestHandler = js.Function3[
    /* ws */ typings.ws.mod.^, 
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* next */ typings.express.mod.NextFunction, 
    scala.Unit
  ]
}
