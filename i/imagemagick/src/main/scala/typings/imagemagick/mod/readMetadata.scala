package typings.imagemagick.mod

import typings.node.childProcessMod.ChildProcess
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("imagemagick", "readMetadata")
@js.native
object readMetadata extends js.Object {
  
  def apply(path: String, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
}
