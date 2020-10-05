package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.astMod.TemplateBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typings.angularCompiler.parserMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typings.angularCompiler.astMod.ParserError]
  ) = this()
}

