package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "TemplateParseError")
@js.native
class TemplateParseError protected ()
  extends typings.angularCompiler.publicApiMod.TemplateParseError {
  def this(
    message: String,
    span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    level: typings.angularCompiler.srcParseUtilMod.ParseErrorLevel
  ) = this()
}

