package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IASTToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MemberFunctionDeclaration")
@js.native
class MemberFunctionDeclaration protected ()
  extends typings.typescriptServices.TypeScript.MemberFunctionDeclaration {
  def this(
    modifiers: js.Array[typings.typescriptServices.TypeScript.PullElementFlags],
    propertyName: IASTToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignature,
    block: typings.typescriptServices.TypeScript.Block
  ) = this()
}

