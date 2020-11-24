package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.EventEmitter
import typings.pouchdbCore.pouchdbCoreStrings.change
import typings.pouchdbCore.pouchdbCoreStrings.complete
import typings.pouchdbCore.pouchdbCoreStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Changes[Content /* <: js.Object */]
  extends js.Promise[ChangesResponse[Content]]
     with EventEmitter {
  
  def cancel(): Unit = js.native
  
  @JSName("on")
  def on_change(event: change, listener: js.Function1[/* value */ ChangesResponseChange[Content], _]): this.type = js.native
  @JSName("on")
  def on_complete(event: complete, listener: js.Function1[/* value */ ChangesResponse[Content], _]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* value */ js.Any, _]): this.type = js.native
}
