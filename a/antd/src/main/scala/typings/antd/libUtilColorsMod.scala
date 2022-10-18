package typings.antd

import typings.antd.antdStrings.blue
import typings.antd.antdStrings.cyan
import typings.antd.antdStrings.default
import typings.antd.antdStrings.error
import typings.antd.antdStrings.geekblue
import typings.antd.antdStrings.gold
import typings.antd.antdStrings.green
import typings.antd.antdStrings.lime
import typings.antd.antdStrings.magenta
import typings.antd.antdStrings.orange
import typings.antd.antdStrings.pink
import typings.antd.antdStrings.processing
import typings.antd.antdStrings.purple
import typings.antd.antdStrings.red
import typings.antd.antdStrings.success
import typings.antd.antdStrings.volcano
import typings.antd.antdStrings.warning
import typings.antd.antdStrings.yellow
import typings.antd.libUtilTypeMod.ElementOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilColorsMod {
  
  @JSImport("antd/lib/_util/colors", "PresetColorTypes")
  @js.native
  val PresetColorTypes: js.Tuple13[pink, red, yellow, orange, cyan, green, blue, purple, geekblue, magenta, volcano, gold, lime] = js.native
  
  @JSImport("antd/lib/_util/colors", "PresetStatusColorTypes")
  @js.native
  val PresetStatusColorTypes: js.Tuple5[success, processing, error, default, warning] = js.native
  
  type PresetColorType = ElementOf[
    js.Tuple13[pink, red, yellow, orange, cyan, green, blue, purple, geekblue, magenta, volcano, gold, lime]
  ]
  
  type PresetStatusColorType = ElementOf[js.Tuple5[success, processing, error, default, warning]]
}
