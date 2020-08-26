package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "IndexSignatureSyntax")
@js.native
class IndexSignatureSyntax protected ()
  extends typings.typescriptServices.TypeScript.IndexSignatureSyntax {
  def this(
    openBracketToken: ISyntaxToken,
    parameter: typings.typescriptServices.TypeScript.ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "IndexSignatureSyntax")
@js.native
object IndexSignatureSyntax extends js.Object {
  def create(
    openBracketToken: ISyntaxToken,
    parameter: typings.typescriptServices.TypeScript.ParameterSyntax,
    closeBracketToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
  def create1(parameter: typings.typescriptServices.TypeScript.ParameterSyntax): typings.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
}

