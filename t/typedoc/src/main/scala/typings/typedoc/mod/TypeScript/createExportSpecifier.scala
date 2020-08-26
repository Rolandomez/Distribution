package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ExportSpecifier
import typings.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createExportSpecifier")
@js.native
object createExportSpecifier extends js.Object {
  def apply(propertyName: js.UndefOr[scala.Nothing], name: String): ExportSpecifier = js.native
  def apply(propertyName: js.UndefOr[scala.Nothing], name: Identifier): ExportSpecifier = js.native
  def apply(propertyName: String, name: String): ExportSpecifier = js.native
  def apply(propertyName: String, name: Identifier): ExportSpecifier = js.native
  def apply(propertyName: Identifier, name: String): ExportSpecifier = js.native
  def apply(propertyName: Identifier, name: Identifier): ExportSpecifier = js.native
}

