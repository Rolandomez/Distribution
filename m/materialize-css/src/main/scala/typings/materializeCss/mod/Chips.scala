package typings.materializeCss.mod

import typings.materializeCss.anon.PartialChipsOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Chips")
@js.native
class Chips ()
  extends typings.materializeCss.M.Chips
/* static members */
@JSImport("materialize-css", "Chips")
@js.native
object Chips extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Chips = js.native
  
  /**
    * Init Chipses
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Chips] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialChipsOptions
  ): js.Array[typings.materializeCss.M.Chips] = js.native
  /**
    * Init Chips
    */
  def init(els: Element): typings.materializeCss.M.Chips = js.native
  def init(els: Element, options: PartialChipsOptions): typings.materializeCss.M.Chips = js.native
}
