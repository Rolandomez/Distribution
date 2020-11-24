package typings.actionsOnGoogle.assistantMod

import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata
import typings.actionsOnGoogle.frameworkFrameworkMod.Headers
import typings.actionsOnGoogle.frameworkFrameworkMod.StandardHandler
import typings.actionsOnGoogle.frameworkFrameworkMod.StandardResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceBaseApp extends js.Object {
  
  /** @public */
  def handler(/** @public */
  body: JsonObject, /** @public */
  headers: Headers): js.Promise[StandardResponse] = js.native
  def handler(
    /** @public */
  body: JsonObject,
    /** @public */
  headers: Headers,
    /** @public */
  metadata: BuiltinFrameworkMetadata
  ): js.Promise[StandardResponse] = js.native
  /** @public */
  @JSName("handler")
  var handler_Original: StandardHandler = js.native
}
