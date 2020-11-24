package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentBlock
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  
  var `type`: typings.astTypes.astTypesStrings.CommentBlock = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.CommentBlock")
@js.native
object CommentBlock extends TopLevel[Type[CommentBlock]]
