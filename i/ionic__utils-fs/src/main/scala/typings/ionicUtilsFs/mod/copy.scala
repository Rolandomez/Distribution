package typings.ionicUtilsFs.mod

import typings.fsExtra.mod.CopyOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "copy")
@js.native
object copy extends js.Object {
  
  def apply(src: String, dest: String): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(src: String, dest: String, options: CopyOptions): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, options: CopyOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
