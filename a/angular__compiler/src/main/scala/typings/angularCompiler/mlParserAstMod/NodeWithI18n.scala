package typings.angularCompiler.mlParserAstMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/ml_parser/ast", "NodeWithI18n")
@js.native
abstract class NodeWithI18n protected () extends Node {
  def this(sourceSpan: ParseSourceSpan) = this()
  def this(sourceSpan: ParseSourceSpan, i18n: Message) = this()
  def this(sourceSpan: ParseSourceSpan, i18n: typings.angularCompiler.i18nAstMod.Node) = this()
  var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
}

