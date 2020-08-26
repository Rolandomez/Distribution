package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SourceUnitSyntax")
@js.native
class SourceUnitSyntax protected ()
  extends typings.typescriptServices.TypeScript.SourceUnitSyntax {
  def this(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "SourceUnitSyntax")
@js.native
object SourceUnitSyntax extends js.Object {
  def create(endOfFileToken: ISyntaxToken): typings.typescriptServices.TypeScript.SourceUnitSyntax = js.native
  def create1(endOfFileToken: ISyntaxToken): typings.typescriptServices.TypeScript.SourceUnitSyntax = js.native
}

