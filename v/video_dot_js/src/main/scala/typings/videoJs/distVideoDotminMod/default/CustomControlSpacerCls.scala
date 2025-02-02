package typings.videoJs.distVideoDotminMod.default

import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.mod.videojs.ComponentOptions
import typings.videoJs.mod.videojs.CustomControlSpacer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js/dist/video.min", "default.CustomControlSpacer")
@js.native
open class CustomControlSpacerCls protected ()
  extends StObject
     with CustomControlSpacer {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param [ready]
    *        Function that gets called when the `Component` is ready.
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: ComponentOptions) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: Unit, ready: ReadyCallback) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: ComponentOptions, ready: ReadyCallback) = this()
}
