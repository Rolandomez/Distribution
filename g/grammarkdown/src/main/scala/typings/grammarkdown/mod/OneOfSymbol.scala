package typings.grammarkdown.mod

import typings.grammarkdown.nodesMod.LexicalSymbol
import typings.grammarkdown.tokensMod.SyntaxKind.OfKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OneOfSymbol")
@js.native
class OneOfSymbol protected ()
  extends typings.grammarkdown.nodesMod.OneOfSymbol {
  def this(oneKeyword: typings.grammarkdown.nodesMod.Token[OneKeyword]) = this()
  def this(
    oneKeyword: typings.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.nodesMod.Token[OfKeyword]
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    symbols: js.Array[LexicalSymbol]
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.nodesMod.Token[OfKeyword],
    symbols: js.Array[LexicalSymbol]
  ) = this()
}

