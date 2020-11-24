package typings.nodeStatsd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error], 
    /* bytes */ js.UndefOr[typings.node.Buffer], 
    scala.Unit
  ]
}
