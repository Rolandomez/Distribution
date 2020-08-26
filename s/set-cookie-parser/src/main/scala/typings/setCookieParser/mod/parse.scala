package typings.setCookieParser.mod

import typings.node.httpMod.IncomingMessage
import typings.setCookieParser.anon.Optionsmapfalseundefined
import typings.setCookieParser.anon.Optionsmaptrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("set-cookie-parser", "parse")
@js.native
object parse extends js.Object {
  def apply(input: String): js.Array[Cookie] | CookieMap = js.native
  def apply(input: String, options: Optionsmapfalseundefined): js.Array[Cookie] = js.native
  def apply(input: String, options: Optionsmaptrue): CookieMap = js.native
  def apply(input: String, options: Options): js.Array[Cookie] | CookieMap = js.native
  def apply(input: js.Array[String]): js.Array[Cookie] | CookieMap = js.native
  def apply(input: js.Array[String], options: Optionsmapfalseundefined): js.Array[Cookie] = js.native
  def apply(input: js.Array[String], options: Optionsmaptrue): CookieMap = js.native
  def apply(input: js.Array[String], options: Options): js.Array[Cookie] | CookieMap = js.native
  def apply(input: IncomingMessage): js.Array[Cookie] | CookieMap = js.native
  def apply(input: IncomingMessage, options: Optionsmapfalseundefined): js.Array[Cookie] = js.native
  def apply(input: IncomingMessage, options: Optionsmaptrue): CookieMap = js.native
  def apply(input: IncomingMessage, options: Options): js.Array[Cookie] | CookieMap = js.native
}

