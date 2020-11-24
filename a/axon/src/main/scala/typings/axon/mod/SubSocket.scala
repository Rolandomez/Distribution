package typings.axon.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("axon", "SubSocket")
@js.native
class SubSocket () extends Socket_ {
  
  def clearSubscriptions(): Unit = js.native
  
  def hasSubscriptions(): Boolean = js.native
  
  def matches(topic: String): Boolean = js.native
  
  /**
    * @throws {Error}
    */
  def send(): Unit = js.native
  
  def subscribe(re: String): RegExp = js.native
  def subscribe(re: RegExp): RegExp = js.native
  
  def unsubscribe(re: String): Unit = js.native
  def unsubscribe(re: RegExp): Unit = js.native
}
