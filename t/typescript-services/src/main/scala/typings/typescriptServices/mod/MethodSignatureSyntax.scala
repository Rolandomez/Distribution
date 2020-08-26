package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MethodSignatureSyntax")
@js.native
class MethodSignatureSyntax protected ()
  extends typings.typescriptServices.TypeScript.MethodSignatureSyntax {
  def this(
    propertyName: ISyntaxToken,
    questionToken: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "MethodSignatureSyntax")
@js.native
object MethodSignatureSyntax extends js.Object {
  def create(
    propertyName: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax
  ): typings.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
}

