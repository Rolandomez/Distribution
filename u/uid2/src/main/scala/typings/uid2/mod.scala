package typings.uid2

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uid2", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(length: Double): String = js.native
  def apply(
    length: Double,
    callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = js.native
}
