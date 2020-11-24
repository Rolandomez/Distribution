package typings.vegaUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AccessorFn[R] = typings.vegaUtil.mod.Fn[R] with typings.vegaUtil.anon.Fields
  
  type Fn[R] = js.Function1[/* repeated */ js.Any, R]
}
