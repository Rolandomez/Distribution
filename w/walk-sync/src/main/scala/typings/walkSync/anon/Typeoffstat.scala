package typings.walkSync.anon

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffstat extends js.Object {
  def apply(fd: Double, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  /**
    * Asynchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: Double): js.Promise[Stats] = js.native
}

