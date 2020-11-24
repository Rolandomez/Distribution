package typings.testingLibraryVue.mod

import typings.std.HTMLElement
import typings.testingLibraryDom.getQueriesForElementMod.BoundFunctions
import typings.testingLibraryDom.getQueriesForElementMod.Queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/vue", "within")
@js.native
object within extends js.Object {
  
  def apply[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
  def apply[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
}
