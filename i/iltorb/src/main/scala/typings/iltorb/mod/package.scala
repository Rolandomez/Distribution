package typings.iltorb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IltorbCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* output */ typings.node.Buffer, 
    scala.Unit
  ]
}
