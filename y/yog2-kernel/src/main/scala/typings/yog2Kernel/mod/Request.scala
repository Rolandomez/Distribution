package typings.yog2Kernel.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.yog2Kernel.anon.TypeofRAL
import typings.yog2Kernel.anon.TypeofRALPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request
  extends typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any, Query] {
  
  var CURRENT_APP: String = js.native
  
  var ral: TypeofRAL = js.native
  
  var ralP: TypeofRALPromise = js.native
}
