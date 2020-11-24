package typings.dynamodb

import typings.dynamodb.callbackMod.Callback
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynamodb/ExecuteFilter", JSImport.Namespace)
@js.native
object executeFilterMod extends js.Object {
  
  @js.native
  trait ExecuteFilter extends js.Object {
    
    def apply(): Readable = js.native
    def apply(callback: Callback): Unit = js.native
  }
}
