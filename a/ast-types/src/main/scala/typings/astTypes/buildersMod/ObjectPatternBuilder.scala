package typings.astTypes.buildersMod

import typings.astTypes.anon.Decorators
import typings.astTypes.kindsMod.ObjectPropertyKind
import typings.astTypes.kindsMod.PropertyKind
import typings.astTypes.kindsMod.PropertyPatternKind
import typings.astTypes.kindsMod.RestPropertyKind
import typings.astTypes.kindsMod.SpreadPropertyKind
import typings.astTypes.kindsMod.SpreadPropertyPatternKind
import typings.astTypes.namedTypesMod.namedTypes.ObjectPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPatternBuilder extends js.Object {
  
  def apply(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ]
  ): ObjectPattern = js.native
  
  def from(params: Decorators): ObjectPattern = js.native
}
