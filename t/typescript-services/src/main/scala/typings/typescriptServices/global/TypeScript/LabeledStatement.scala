package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.LabeledStatement")
@js.native
open class LabeledStatement protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.LabeledStatement {
  def this(
    identifier: typings.typescriptServices.TypeScript.Identifier,
    statement: typings.typescriptServices.TypeScript.AST
  ) = this()
  
  /* private */ /* CompleteClass */
  var _astID: Any = js.native
  
  /* CompleteClass */
  var _end: Double = js.native
  
  /* private */ /* CompleteClass */
  var _postComments: Any = js.native
  
  /* private */ /* CompleteClass */
  var _preComments: Any = js.native
  
  /* CompleteClass */
  var _start: Double = js.native
  
  /* CompleteClass */
  var _trailingTriviaWidth: Double = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  var identifier: typings.typescriptServices.TypeScript.Identifier = js.native
  
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  
  /* CompleteClass */
  override def kind(): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  var parent: typings.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  override def postComments(): js.Array[typings.typescriptServices.TypeScript.Comment] = js.native
  
  /* CompleteClass */
  override def preComments(): js.Array[typings.typescriptServices.TypeScript.Comment] = js.native
  
  /* CompleteClass */
  override def setPostComments(comments: js.Array[typings.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def setPreComments(comments: js.Array[typings.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
  
  /* CompleteClass */
  var statement: typings.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  override def structuralEquals(ast: typings.typescriptServices.TypeScript.AST, includingPosition: Boolean): Boolean = js.native
  /* CompleteClass */
  override def structuralEquals(ast: typings.typescriptServices.TypeScript.LabeledStatement, includingPosition: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def syntaxID(): Double = js.native
  
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  override def width(): Double = js.native
}
