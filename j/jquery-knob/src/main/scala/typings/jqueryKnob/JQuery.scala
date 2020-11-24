package typings.jqueryKnob

import typings.jqueryKnob.JQueryKnob.JQueryKnobOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /**
    * Create a knob for the given input field, with optional options
    */
  def knob(): JQuery = js.native
  def knob(options: JQueryKnobOptions): JQuery = js.native
}
