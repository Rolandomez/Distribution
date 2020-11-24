package typings.astTypes.buildersMod

import typings.astTypes.anon.Quasis
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.TemplateElementKind
import typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateLiteralBuilder extends js.Object {
  
  def apply(quasis: js.Array[TemplateElementKind], expressions: js.Array[ExpressionKind]): TemplateLiteral = js.native
  
  def from(params: Quasis): TemplateLiteral = js.native
}
