package typings.nock.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.urlMod.Url
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(basePath: String): Scope = js.native
  def apply(basePath: String, options: Options): Scope = js.native
  def apply(basePath: Url): Scope = js.native
  def apply(basePath: Url, options: Options): Scope = js.native
  def apply(basePath: RegExp): Scope = js.native
  def apply(basePath: RegExp, options: Options): Scope = js.native
  
  var back: Back_ = js.native
  
  var emitter: EventEmitter = js.native
  
  var recorder: Recorder_ = js.native
}
