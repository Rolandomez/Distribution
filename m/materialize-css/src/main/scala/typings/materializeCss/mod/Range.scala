package typings.materializeCss.mod

import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<undefined> * / any */ @JSImport("materialize-css", "Range")
@js.native
class Range () extends js.Object
/* static members */
@JSImport("materialize-css", "Range")
@js.native
object Range extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Range = js.native
  
  /**
    * Init Ranges
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Range] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: Partial[js.UndefOr[scala.Nothing]]
  ): js.Array[typings.materializeCss.M.Range] = js.native
  /**
    * Init Range
    */
  def init(els: Element): typings.materializeCss.M.Range = js.native
  def init(els: Element, options: Partial[js.UndefOr[scala.Nothing]]): typings.materializeCss.M.Range = js.native
}
