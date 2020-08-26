package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionTypeSyntax")
@js.native
class FunctionTypeSyntax protected ()
  extends typings.typescriptServices.TypeScript.FunctionTypeSyntax {
  def this(
    typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionTypeSyntax")
@js.native
object FunctionTypeSyntax extends js.Object {
  def create(
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typings.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
  def create1(`type`: ITypeSyntax): typings.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
}

