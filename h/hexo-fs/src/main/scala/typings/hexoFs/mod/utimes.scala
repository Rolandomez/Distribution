package typings.hexoFs.mod

import typings.node.fsMod.PathLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "utimes")
@js.native
object utimes extends js.Object {
  
  def apply(path: PathLike, atime: String, mtime: String): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: String, mtime: Double): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: String, mtime: Date): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: String): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: Double): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: Date): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Date, mtime: String): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Date, mtime: Double): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Date, mtime: Date): typings.bluebird.mod.^[Unit] = js.native
}
