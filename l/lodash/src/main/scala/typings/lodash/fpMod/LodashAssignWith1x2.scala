package typings.lodash.fpMod

import typings.lodash.mod.AssignCustomizer
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashAssignWith1x2[TObject] extends js.Object {
  
  def apply(customizer: AssignCustomizer): LodashAssignWith1x3[TObject] = js.native
  def apply[TSource](customizer: AssignCustomizer, source: TSource): TObject with TSource = js.native
  def apply[TSource](customizer: __, source: TSource): LodashAssignWith1x6[TObject, TSource] = js.native
}
