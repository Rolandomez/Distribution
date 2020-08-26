package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.IStatementSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "WithStatementSyntax")
@js.native
class WithStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.WithStatementSyntax {
  def this(
    withKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "WithStatementSyntax")
@js.native
object WithStatementSyntax extends js.Object {
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typings.typescriptServices.TypeScript.WithStatementSyntax = js.native
}

