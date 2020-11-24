package typings.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "DocumentHighlight")
@js.native
object DocumentHighlight extends js.Object {
  
  /**
    * Create a DocumentHighlight object.
    * @param range The range the highlight applies to.
    */
  def create(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.DocumentHighlight = js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    kind: typings.vscodeLanguageserverTypes.mod.DocumentHighlightKind
  ): typings.vscodeLanguageserverTypes.mod.DocumentHighlight = js.native
}
