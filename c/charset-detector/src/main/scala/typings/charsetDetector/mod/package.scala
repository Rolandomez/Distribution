package typings.charsetDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CharsetMatcher = js.Function2[
    /* input */ typings.std.ArrayLike[scala.Double], 
    /* stats */ typings.charsetDetector.mod.InputStats, 
    typings.charsetDetector.mod.CharsetMatch | scala.Null
  ]
}
