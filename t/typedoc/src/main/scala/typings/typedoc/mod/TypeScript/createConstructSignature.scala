package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ConstructSignatureDeclaration
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createConstructSignature")
@js.native
object createConstructSignature extends js.Object {
  def apply(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  def apply(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def apply(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
}

