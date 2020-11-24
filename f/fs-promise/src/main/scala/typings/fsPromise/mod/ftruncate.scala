package typings.fsPromise.mod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "ftruncate")
@js.native
object ftruncate extends js.Object {
  
  def apply(fd: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = js.native
  def apply(fd: Double, len: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, len: Double): js.Promise[Unit] = js.native
  def apply(
    fd: Double,
    len: Double,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
  def apply(fd: Double, len: Null, callback: NoParamCallback): Unit = js.native
}
