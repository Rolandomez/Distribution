package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaThen
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "saveRule")
@js.native
object saveRule extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* rule */ Rule, 
    /* requestOptions */ js.UndefOr[RequestOptions with SaveRulesOptions], 
    ReadonlyWaitablePromiseSaThen
  ] = js.native
}
