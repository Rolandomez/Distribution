package typings.electron.originalFsMod

import typings.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "close")
@js.native
object close extends js.Object {
  def apply(fd: Double, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  @JSName("__promisify__")
  def promisify(fd: Double): js.Promise[Unit] = js.native
}

