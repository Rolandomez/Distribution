package typings.nunjucks.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.nunjucks.mod.ILoader because var conflicts: extend. Inlined async, getSource, getSource */ @JSImport("nunjucks", "PrecompiledLoader")
@js.native
class PrecompiledLoader () extends Loader {
  
  var async: js.UndefOr[Boolean] = js.native
  
  def getSource(name: String): LoaderSource = js.native
  def getSource(name: String, callback: Callback[Error, LoaderSource]): Unit = js.native
  
  def init(searchPaths: js.Array[String], opts: js.Any): Unit = js.native
}
