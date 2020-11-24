package typings.nprogress.mod

import typings.nprogress.anon.PartialNProgressOptions
import typings.nprogress.nprogressStrings.margin
import typings.nprogress.nprogressStrings.translate
import typings.nprogress.nprogressStrings.translate3d
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NProgress extends js.Object {
  
  def configure(options: PartialNProgressOptions): NProgress = js.native
  
  def done(): NProgress = js.native
  def done(force: Boolean): NProgress = js.native
  
  def getPositioningCSS(): translate3d | translate | margin = js.native
  
  def inc(): NProgress = js.native
  def inc(amount: Double): NProgress = js.native
  
  def isRendered(): Boolean = js.native
  
  def isStarted(): Boolean = js.native
  
  def remove(): Unit = js.native
  
  /* Internal */
  def render(): HTMLDivElement = js.native
  def render(fromStart: Boolean): HTMLDivElement = js.native
  
  def set(number: Double): NProgress = js.native
  
  var settings: NProgressOptions = js.native
  
  def start(): NProgress = js.native
  
  var status: Double | Null = js.native
  
  def trickle(): NProgress = js.native
  
  var version: String = js.native
}
