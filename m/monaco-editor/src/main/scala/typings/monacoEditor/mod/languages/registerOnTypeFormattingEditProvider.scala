package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "languages.registerOnTypeFormattingEditProvider")
@js.native
object registerOnTypeFormattingEditProvider extends js.Object {
  
  def apply(languageId: String, provider: OnTypeFormattingEditProvider): IDisposable = js.native
}
