package typings.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Error")
@js.native
class Error ()
  extends typings.minappEnv.Error {
  def this(message: java.lang.String) = this()
}

@JSGlobal("Error")
@js.native
object Error extends TopLevel[ErrorConstructor]

