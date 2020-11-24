package typings.baseui.accordionMod

import typings.baseui.baseuiStrings.expand
import typings.react.mod.Component
import typings.react.mod.Key
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/accordion", "Accordion")
@js.native
class Accordion ()
  extends Component[AccordionProps, AccordionState, js.Any] {
  
  def getItems(): ReactNode = js.native
  
  @JSName("internalSetState")
  def internalSetState_expand(`type`: expand, changes: AccordionState): Unit = js.native
  
  def onPanelChange(
    key: Key,
    onChange: js.Function0[_],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
}
