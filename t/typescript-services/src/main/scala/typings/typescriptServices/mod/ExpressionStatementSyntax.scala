package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ExpressionStatementSyntax")
@js.native
class ExpressionStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.ExpressionStatementSyntax {
  def this(expression: IExpressionSyntax, semicolonToken: ISyntaxToken, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "ExpressionStatementSyntax")
@js.native
object ExpressionStatementSyntax extends js.Object {
  def create1(expression: IExpressionSyntax): typings.typescriptServices.TypeScript.ExpressionStatementSyntax = js.native
}

