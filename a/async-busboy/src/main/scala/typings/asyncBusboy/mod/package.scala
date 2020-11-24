package typings.asyncBusboy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncBusboy = js.Function2[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* options */ js.UndefOr[typings.asyncBusboy.mod.Options], 
    js.Promise[typings.asyncBusboy.anon.Fields]
  ]
}
