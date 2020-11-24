package typings.workboxBroadcastUpdate

import typings.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import typings.workboxBroadcastUpdate.broadcastUpdateMod.BroadcastUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-broadcast-update", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def broadcastUpdate(options: BroadcastUpdateOptions): js.Promise[Unit] = js.native
  
  @js.native
  class BroadcastCacheUpdate ()
    extends typings.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdate {
    def this(options: BroadcastCacheUpdateOptions) = this()
  }
  
  @js.native
  class Plugin ()
    extends typings.workboxBroadcastUpdate.pluginMod.Plugin {
    def this(options: BroadcastCacheUpdateOptions) = this()
  }
}
