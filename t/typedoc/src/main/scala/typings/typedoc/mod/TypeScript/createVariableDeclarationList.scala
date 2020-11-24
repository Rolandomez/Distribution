package typings.typedoc.mod.TypeScript

import typings.typescript.mod.VariableDeclaration
import typings.typescript.mod.VariableDeclarationList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createVariableDeclarationList")
@js.native
object createVariableDeclarationList extends js.Object {
  
  /** @deprecated Use `factory.createVariableDeclarationList` or the factory supplied by your transformation context instead. */
  def apply(declarations: js.Array[VariableDeclaration]): VariableDeclarationList = js.native
  def apply(declarations: js.Array[VariableDeclaration], flags: typings.typescript.mod.NodeFlags): VariableDeclarationList = js.native
}
