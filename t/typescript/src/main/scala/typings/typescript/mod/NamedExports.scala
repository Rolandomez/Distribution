package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedExports
  extends Node
     with NamedExportBindings
     with NamedImportsOrExports {
  var elements: NodeArray[ExportSpecifier] = js.native
  @JSName("kind")
  var kind_NamedExports: typings.typescript.mod.SyntaxKind.NamedExports = js.native
  @JSName("parent")
  var parent_NamedExports: ExportDeclaration = js.native
}

