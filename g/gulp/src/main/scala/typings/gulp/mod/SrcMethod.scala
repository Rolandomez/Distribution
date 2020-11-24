package typings.gulp.mod

import typings.node.NodeJS.ReadWriteStream
import typings.vinylFs.mod.SrcOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SrcMethod extends js.Object {
  
  def apply(globs: String): ReadWriteStream = js.native
  def apply(globs: String, opt: SrcOptions): ReadWriteStream = js.native
  def apply(globs: js.Array[String]): ReadWriteStream = js.native
  def apply(globs: js.Array[String], opt: SrcOptions): ReadWriteStream = js.native
}
