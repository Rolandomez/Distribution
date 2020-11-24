package typings.cliColor.anon

import typings.cliColor.columnsMod.ColumnsOptions
import typings.cliColor.columnsMod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(data: js.Array[js.Array[_]]): String = js.native
  def apply(data: js.Array[js.Array[_]], options: ColumnsOptions): String = js.native
  def apply(data: Data): String = js.native
  def apply(data: Data, options: ColumnsOptions): String = js.native
}
