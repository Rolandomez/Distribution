package typings.astTypes.buildersMod

import typings.astTypes.anon.BodyComments
import typings.astTypes.kindsMod.ClassMethodKind
import typings.astTypes.kindsMod.ClassPrivateMethodKind
import typings.astTypes.kindsMod.ClassPrivatePropertyKind
import typings.astTypes.kindsMod.ClassPropertyDefinitionKind
import typings.astTypes.kindsMod.ClassPropertyKind
import typings.astTypes.kindsMod.MethodDefinitionKind
import typings.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typings.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typings.astTypes.kindsMod.TSDeclareMethodKind
import typings.astTypes.kindsMod.TSIndexSignatureKind
import typings.astTypes.kindsMod.TSMethodSignatureKind
import typings.astTypes.kindsMod.TSPropertySignatureKind
import typings.astTypes.kindsMod.VariableDeclaratorKind
import typings.astTypes.namedTypesMod.namedTypes.ClassBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassBodyBuilder extends StObject {
  
  def apply(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): ClassBody = js.native
  
  def from(params: BodyComments): ClassBody = js.native
}
