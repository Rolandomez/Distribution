package typings.backlogJs.mod.Error

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backlog-js", "Error.UnexpectedError")
@js.native
class UnexpectedError protected () extends BacklogError {
  def this(response: Response) = this()
}
