package typings.novaEditorNode.global

import typings.novaEditorNode.anon.Args
import typings.novaEditorNode.anon.InitializationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/language-client/
@JSGlobal("LanguageClient")
@js.native
class LanguageClient protected ()
  extends typings.novaEditorNode.LanguageClient {
  def this(identifier: String, name: String, serverOptions: Args, clientOptions: InitializationOptions) = this()
}
