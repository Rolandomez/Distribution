package typings.stompit.incomingFrameStreamMod

import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Internal class, which is not exported
@js.native
trait IncomingFrame extends Readable {
  
  def readEmptyBody(): Unit = js.native
  def readEmptyBody(callback: js.Function1[/* isEmpty */ Boolean, Unit]): Unit = js.native
  
  def readString(encoding: String): Unit = js.native
  def readString(
    encoding: String,
    callback: js.Function2[/* err */ Error | Null, /* buffer */ js.UndefOr[String], Unit]
  ): Unit = js.native
}
