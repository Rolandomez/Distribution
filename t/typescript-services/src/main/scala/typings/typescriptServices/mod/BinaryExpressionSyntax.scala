package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "BinaryExpressionSyntax")
@js.native
class BinaryExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.BinaryExpressionSyntax {
  def this(
    kind: typings.typescriptServices.TypeScript.SyntaxKind,
    left: IExpressionSyntax,
    operatorToken: ISyntaxToken,
    right: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

