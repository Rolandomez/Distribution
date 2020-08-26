package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebGL renderer plugin for tiling sprites
  *
  * @class
  * @memberof PIXI
  * @extends PIXI.ObjectRenderer
  */
@JSImport("pixi.js", "TilingSpriteRenderer")
@js.native
class TilingSpriteRenderer protected ()
  extends typings.pixiJs.PIXI.TilingSpriteRenderer {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
}

