package typings.javascriptStringify

import typings.javascriptStringify.typesMod.Next
import typings.std.PropertyKey
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("javascript-stringify/dist/quote", JSImport.Namespace)
@js.native
object quoteMod extends js.Object {
  
  val IS_VALID_IDENTIFIER: RegExp = js.native
  
  def isValidVariableName(name: PropertyKey): /* is string */ Boolean = js.native
  
  def quoteKey(key: PropertyKey, next: Next): js.UndefOr[String] = js.native
  
  def quoteString(str: String): String = js.native
  
  def stringifyPath(path: js.Array[PropertyKey], next: Next): String = js.native
}
