package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Transport")
@js.native
class Transport ()
  extends typings.nodegit.transportMod.Transport
/* static members */
@JSImport("nodegit", "Transport")
@js.native
object Transport extends js.Object {
  
  def sshWithPaths(owner: typings.nodegit.remoteMod.Remote, payload: String): js.Promise[typings.nodegit.transportMod.Transport] = js.native
  def sshWithPaths(owner: typings.nodegit.remoteMod.Remote, payload: js.Array[String]): js.Promise[typings.nodegit.transportMod.Transport] = js.native
  def sshWithPaths(owner: typings.nodegit.remoteMod.Remote, payload: typings.nodegit.strArrayMod.Strarray): js.Promise[typings.nodegit.transportMod.Transport] = js.native
  
  def unregister(prefix: String): Double = js.native
}
