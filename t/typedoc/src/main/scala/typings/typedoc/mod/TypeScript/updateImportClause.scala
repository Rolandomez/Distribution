package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.ImportClause
import typings.typescript.mod.NamedImportBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateImportClause")
@js.native
object updateImportClause extends js.Object {
  def apply(
    node: ImportClause,
    name: js.UndefOr[scala.Nothing],
    namedBindings: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean
  ): ImportClause = js.native
  def apply(
    node: ImportClause,
    name: js.UndefOr[scala.Nothing],
    namedBindings: NamedImportBindings,
    isTypeOnly: Boolean
  ): ImportClause = js.native
  def apply(
    node: ImportClause,
    name: Identifier,
    namedBindings: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean
  ): ImportClause = js.native
  def apply(node: ImportClause, name: Identifier, namedBindings: NamedImportBindings, isTypeOnly: Boolean): ImportClause = js.native
}

