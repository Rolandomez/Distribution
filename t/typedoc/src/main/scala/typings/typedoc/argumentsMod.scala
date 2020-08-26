package typings.typedoc

import typings.typedoc.loggersMod.Logger
import typings.typedoc.optionsMod.Options
import typings.typedoc.optionsOptionsMod.OptionsReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/readers/arguments", JSImport.Namespace)
@js.native
object argumentsMod extends js.Object {
  @js.native
  class ArgumentsReader protected () extends OptionsReader {
    def this(priority: Double) = this()
    def this(priority: Double, args: js.Array[String]) = this()
    var args: js.Any = js.native
    def read(container: Options, logger: Logger): Unit = js.native
  }
  
}

