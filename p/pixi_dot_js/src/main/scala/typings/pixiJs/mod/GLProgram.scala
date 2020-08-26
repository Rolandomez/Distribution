package typings.pixiJs.mod

import typings.std.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class to create a WebGL Program
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "GLProgram")
@js.native
class GLProgram protected ()
  extends typings.pixiJs.PIXI.GLProgram {
  def this(program: WebGLProgram, uniformData: js.Any) = this()
}

