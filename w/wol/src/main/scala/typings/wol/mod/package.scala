package typings.wol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type WakeCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
}
