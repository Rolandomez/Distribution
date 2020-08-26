package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AsteriskToken
import typings.typescript.mod.Block
import typings.typescript.mod.Decorator
import typings.typescript.mod.MethodDeclaration
import typings.typescript.mod.Modifier
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyName
import typings.typescript.mod.QuestionToken
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createMethod")
@js.native
object createMethod extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: String | PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): MethodDeclaration = js.native
}

