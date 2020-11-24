package typings.builderUtil.mod

import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util", "doSpawn")
@js.native
object doSpawn extends js.Object {
  
  def apply(command: String, args: js.Array[String]): ChildProcess = js.native
  def apply(
    command: String,
    args: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    extraOptions: ExtraSpawnOptions
  ): ChildProcess = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): ChildProcess = js.native
}
