package typings.koaRedisCache.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-redis-cache", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: CacheOptions): Middleware[DefaultState, DefaultContext] = js.native
}
