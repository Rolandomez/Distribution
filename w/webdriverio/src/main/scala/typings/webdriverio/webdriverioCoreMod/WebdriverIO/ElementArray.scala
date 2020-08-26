package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Array
import typings.webdriverio.WebdriverIO.BrowserObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementArray extends Array[Element] {
  var foundWith: String = js.native
  var parent: Element | BrowserObject = js.native
  var props: js.Array[_] = js.native
  var selector: String | js.Function = js.native
}

