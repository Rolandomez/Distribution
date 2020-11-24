package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "deleteSynonym")
@js.native
object deleteSynonym extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* objectID */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions with DeleteSynonymOptions], 
    ReadonlyWaitablePromiseDe
  ] = js.native
}
