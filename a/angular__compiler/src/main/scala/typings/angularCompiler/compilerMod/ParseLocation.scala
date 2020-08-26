package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "ParseLocation")
@js.native
class ParseLocation protected ()
  extends typings.angularCompiler.publicApiMod.ParseLocation {
  def this(
    file: typings.angularCompiler.srcParseUtilMod.ParseSourceFile,
    offset: Double,
    line: Double,
    col: Double
  ) = this()
}

