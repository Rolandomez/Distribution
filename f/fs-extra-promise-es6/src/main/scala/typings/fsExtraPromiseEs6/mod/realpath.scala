package typings.fsExtraPromiseEs6.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise-es6", "realpath")
@js.native
object realpath extends js.Object {
  
  def apply(path: String): Unit = js.native
  def apply(
    path: String,
    cache: String,
    callback: js.Function2[/* err */ Error, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def apply(path: String, callback: js.Function2[/* err */ Error, /* resolvedPath */ String, Unit]): Unit = js.native
}
