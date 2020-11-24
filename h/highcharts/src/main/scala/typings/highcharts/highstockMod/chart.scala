package typings.highcharts.highstockMod

import typings.highcharts.mod.ChartCallbackFunction
import typings.highcharts.mod.HTMLDOMElement
import typings.highcharts.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts/highstock", "chart")
@js.native
object chart extends js.Object {
  
  def apply(options: Options): typings.highcharts.mod.Chart_ = js.native
  def apply(options: Options, callback: ChartCallbackFunction): typings.highcharts.mod.Chart_ = js.native
  def apply(renderTo: String, options: Options): typings.highcharts.mod.Chart_ = js.native
  def apply(renderTo: String, options: Options, callback: ChartCallbackFunction): typings.highcharts.mod.Chart_ = js.native
  def apply(renderTo: HTMLDOMElement, options: Options): typings.highcharts.mod.Chart_ = js.native
  def apply(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): typings.highcharts.mod.Chart_ = js.native
}
