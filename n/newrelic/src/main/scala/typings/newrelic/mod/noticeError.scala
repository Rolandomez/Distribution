package typings.newrelic.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("newrelic", "noticeError")
@js.native
object noticeError extends js.Object {
  
  def apply(error: Error): Unit = js.native
  def apply(error: Error, customAttributes: StringDictionary[String | Double | Boolean]): Unit = js.native
}
