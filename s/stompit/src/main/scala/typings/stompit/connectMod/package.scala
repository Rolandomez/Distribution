package typings.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object connectMod {
  
  type ConnectionListener = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* client */ typings.stompit.clientMod.^, 
    scala.Unit
  ]
}
