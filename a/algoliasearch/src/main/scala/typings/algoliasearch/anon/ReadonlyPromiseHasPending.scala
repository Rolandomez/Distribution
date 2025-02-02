package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.HasPendingMappingsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.HasPendingMappingsResponse>> */
trait ReadonlyPromiseHasPending extends StObject {
  
  def `catch`[TResult](): js.Promise[HasPendingMappingsResponse | TResult]
  
  def `finally`(): js.Promise[HasPendingMappingsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseHasPending {
  
  inline def apply(
    `catch`: () => js.Promise[HasPendingMappingsResponse | Any],
    `finally`: () => js.Promise[HasPendingMappingsResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseHasPending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseHasPending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPromiseHasPending] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[HasPendingMappingsResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[HasPendingMappingsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
