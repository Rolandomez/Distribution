package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "HeritageClauseSyntax")
@js.native
class HeritageClauseSyntax protected ()
  extends typings.typescriptServices.TypeScript.HeritageClauseSyntax {
  def this(
    kind: typings.typescriptServices.TypeScript.SyntaxKind,
    extendsOrImplementsKeyword: ISyntaxToken,
    typeNames: ISeparatedSyntaxList,
    parsedInStrictMode: Boolean
  ) = this()
}

