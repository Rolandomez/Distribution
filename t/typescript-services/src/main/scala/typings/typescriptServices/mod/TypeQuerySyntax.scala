package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.INameSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeQuerySyntax")
@js.native
class TypeQuerySyntax protected ()
  extends typings.typescriptServices.TypeScript.TypeQuerySyntax {
  def this(typeOfKeyword: ISyntaxToken, name: INameSyntax, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "TypeQuerySyntax")
@js.native
object TypeQuerySyntax extends js.Object {
  def create1(name: INameSyntax): typings.typescriptServices.TypeScript.TypeQuerySyntax = js.native
}

