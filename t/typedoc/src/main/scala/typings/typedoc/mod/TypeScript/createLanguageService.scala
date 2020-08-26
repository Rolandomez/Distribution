package typings.typedoc.mod.TypeScript

import typings.typescript.mod.DocumentRegistry
import typings.typescript.mod.LanguageService
import typings.typescript.mod.LanguageServiceHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createLanguageService")
@js.native
object createLanguageService extends js.Object {
  def apply(host: LanguageServiceHost): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: js.UndefOr[scala.Nothing], syntaxOnly: Boolean): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry, syntaxOnly: Boolean): LanguageService = js.native
}

