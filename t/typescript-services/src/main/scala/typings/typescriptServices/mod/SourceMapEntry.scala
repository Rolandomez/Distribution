package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SourceMapEntry")
@js.native
class SourceMapEntry protected ()
  extends typings.typescriptServices.TypeScript.SourceMapEntry {
  def this(
    emittedFile: String,
    emittedLine: Double,
    emittedColumn: Double,
    sourceFile: String,
    sourceLine: Double,
    sourceColumn: Double,
    sourceName: String
  ) = this()
}

