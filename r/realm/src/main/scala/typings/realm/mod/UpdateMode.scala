package typings.realm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("realm", "UpdateMode")
@js.native
object UpdateMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.realm.Realm.UpdateMode with String] = js.native
  
  /* "all" */ val All: typings.realm.Realm.UpdateMode.All with String = js.native
  
  /* "modified" */ val Modified: typings.realm.Realm.UpdateMode.Modified with String = js.native
  
  /* "never" */ val Never: typings.realm.Realm.UpdateMode.Never with String = js.native
}
