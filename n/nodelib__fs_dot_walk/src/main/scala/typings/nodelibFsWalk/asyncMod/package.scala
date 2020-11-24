package typings.nodelibFsWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object asyncMod {
  
  type AsyncCallback = js.Function2[
    /* err */ typings.nodelibFsWalk.typesMod.Errno, 
    /* entries */ js.Array[typings.nodelibFsWalk.typesMod.Entry], 
    scala.Unit
  ]
}
