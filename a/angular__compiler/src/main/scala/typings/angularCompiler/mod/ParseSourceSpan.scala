package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ParseSourceSpan")
@js.native
class ParseSourceSpan protected ()
  extends typings.angularCompiler.compilerMod.ParseSourceSpan {
  def this(
    start: typings.angularCompiler.srcParseUtilMod.ParseLocation,
    end: typings.angularCompiler.srcParseUtilMod.ParseLocation
  ) = this()
  def this(
    start: typings.angularCompiler.srcParseUtilMod.ParseLocation,
    end: typings.angularCompiler.srcParseUtilMod.ParseLocation,
    details: String
  ) = this()
}

