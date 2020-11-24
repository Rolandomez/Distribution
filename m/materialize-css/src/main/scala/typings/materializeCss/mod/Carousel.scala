package typings.materializeCss.mod

import typings.materializeCss.anon.PartialCarouselOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Carousel")
@js.native
class Carousel ()
  extends typings.materializeCss.M.Carousel
/* static members */
@JSImport("materialize-css", "Carousel")
@js.native
object Carousel extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Carousel = js.native
  
  /**
    * Init carousels
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Carousel] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialCarouselOptions
  ): js.Array[typings.materializeCss.M.Carousel] = js.native
  /**
    * Init carousel
    */
  def init(els: Element): typings.materializeCss.M.Carousel = js.native
  def init(els: Element, options: PartialCarouselOptions): typings.materializeCss.M.Carousel = js.native
}
