package typings.videoJs.videoCoreMod.default

import typings.videoJs.mod.videojs.MenuItemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js/dist/alt/video.core", "MenuItem")
@js.native
class MenuItemCls protected ()
  extends typings.videoJs.mod.videojs.MenuItem {
  /**
    * Creates an instance of the this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options={}]
    *        The key/value store of player options.
    *
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: MenuItemOptions) = this()
}
