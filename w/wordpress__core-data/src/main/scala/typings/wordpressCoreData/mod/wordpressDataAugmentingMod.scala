package typings.wordpressCoreData.mod

import typings.wordpressCoreData.anon.TypeofimportedActions
import typings.wordpressCoreData.anon.TypeofimportedSelectors
import typings.wordpressCoreData.wordpressCoreDataStrings.core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  
  @JSName("dispatch")
  def dispatch_core(key: core): TypeofimportedActions = js.native
  
  @JSName("select")
  def select_core(key: core): TypeofimportedSelectors = js.native
}
