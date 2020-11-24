package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.markdown
import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.plaintext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.plaintext
  - typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.markdown
*/
trait MarkupKind extends js.Object
@JSImport("vscode-languageserver-types", "MarkupKind")
@js.native
object MarkupKind extends js.Object {
  
  /**
    * Markdown is supported as a content format
    */
  val Markdown: markdown = js.native
  
  /**
    * Plain text is supported as a content format
    */
  val PlainText: plaintext = js.native
  
  /**
    * Checks whether the given value is a value of the [MarkupKind](#MarkupKind) type.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkupKind */ Boolean = js.native
}
