package typings.mockRequire

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Stub = js.Object | typings.mockRequire.mod.StubFunction
  
  type StubFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
