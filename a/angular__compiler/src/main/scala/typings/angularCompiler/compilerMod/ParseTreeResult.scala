package typings.angularCompiler.compilerMod

import typings.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typings.angularCompiler.publicApiMod.ParseTreeResult {
  def this(rootNodes: js.Array[Node], errors: js.Array[typings.angularCompiler.srcParseUtilMod.ParseError]) = this()
}

