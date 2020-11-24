package typings.expressWechatAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type WeMiddleware = js.Function3[
    /* req */ js.Any, 
    /* res */ typings.std.Response | typings.node.httpMod.ServerResponse, 
    /* next */ typings.express.mod.NextFunction, 
    js.Any
  ]
}
