package typings.stylelint.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Result
import typings.stylelint.anon.Index
import typings.stylelint.anon.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stylelint", "utils")
@js.native
object utils extends js.Object {
  
  def checkAgainstRule(options: Root, callback: js.Function1[/* warning */ String, Unit]): Unit = js.native
  
  def report(violation: Index): Unit = js.native
  
  def ruleMessages[T /* <: StringDictionary[RuleMessageValue] */](ruleName: String, messages: T): T = js.native
  
  def validateOptions(result: Result, ruleName: String, options: ValidateOptionsAssertion*): Boolean = js.native
}
