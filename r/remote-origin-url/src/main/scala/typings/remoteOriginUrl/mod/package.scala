package typings.remoteOriginUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* url */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
