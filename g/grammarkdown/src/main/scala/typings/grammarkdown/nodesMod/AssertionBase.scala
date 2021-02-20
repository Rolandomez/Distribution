package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.AssertionKind
import typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "AssertionBase")
@js.native
abstract class AssertionBase[TKind /* <: AssertionKind */, TBracket /* <: OpenBracketToken | OpenBracketGreaterThanToken */] protected () extends LexicalSymbolBase[TKind] {
  def this(kind: TKind, openBracketToken: Token[TBracket]) = this()
  def this(kind: TKind, openBracketToken: Token[TBracket], closeBracketToken: Token[CloseBracketToken]) = this()
  
  val closeBracketToken: js.UndefOr[Token[CloseBracketToken]] = js.native
  
  val openBracketToken: Token[TBracket] = js.native
}
