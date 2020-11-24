package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "deleteObjects")
@js.native
object deleteObjects extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* objectIDs */ js.Array[String], 
    /* requestOptions */ js.UndefOr[RequestOptions with ChunkOptions], 
    ReadonlyWaitablePromiseCh
  ] = js.native
}
