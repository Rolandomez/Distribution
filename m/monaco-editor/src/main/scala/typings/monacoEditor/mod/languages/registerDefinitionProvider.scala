package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "languages.registerDefinitionProvider")
@js.native
object registerDefinitionProvider extends js.Object {
  
  def apply(languageId: String, provider: DefinitionProvider): IDisposable = js.native
}
