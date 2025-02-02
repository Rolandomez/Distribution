package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayLiteralExpression
  extends StObject
     with PrimaryExpression
     with ArrayBindingOrAssignmentPattern
     with AssignmentPattern
     with DestructuringPattern
     with JsonObjectExpression
     with _ArrayBindingOrAssignmentElement {
  
  val elements: NodeArray[Expression] = js.native
  
  @JSName("kind")
  val kind_ArrayLiteralExpression: typings.typescript.mod.SyntaxKind.ArrayLiteralExpression = js.native
}
