package typings.keycloakConnect.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrantedRequest
  extends Request[ParamsDictionary, js.Any, js.Any, Query] {
  
  var kauth: js.UndefOr[typings.keycloakConnect.anon.Grant] = js.native
}
