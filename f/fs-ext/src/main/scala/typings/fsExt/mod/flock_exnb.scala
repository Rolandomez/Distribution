package typings.fsExt.mod

import typings.fsExt.fsExtStrings.exnb
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-ext", "flock")
@js.native
object flock_exnb extends js.Object {
  
  def apply(fd: Double, flags: exnb, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
}
