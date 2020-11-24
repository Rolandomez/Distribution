package typings.apolloServerCaching

import typings.apolloServerCaching.anon.MaxSize
import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-caching", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class InMemoryLRUCache[V] ()
    extends typings.apolloServerCaching.inMemoryLRUCacheMod.InMemoryLRUCache[V] {
    def this(hasMaxSizeSizeCalculatorOnDispose: MaxSize[V]) = this()
  }
  
  @js.native
  class PrefixingKeyValueCache[V] protected ()
    extends typings.apolloServerCaching.prefixingKeyValueCacheMod.PrefixingKeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
  }
}
