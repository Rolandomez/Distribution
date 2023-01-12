package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalExpression
  extends StObject
     with AST {
  
  var condition: AST
  
  def structuralEquals(ast: ConditionalExpression, includingPosition: Boolean): Boolean
  
  var whenFalse: AST
  
  var whenTrue: AST
}
object ConditionalExpression {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    condition: AST,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (ConditionalExpression, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    whenFalse: AST,
    whenTrue: AST,
    width: () => Double
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), whenFalse = whenFalse.asInstanceOf[js.Any], whenTrue = whenTrue.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ConditionalExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalExpression] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: AST): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setStructuralEquals(value: (ConditionalExpression, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def setWhenFalse(value: AST): Self = StObject.set(x, "whenFalse", value.asInstanceOf[js.Any])
    
    inline def setWhenTrue(value: AST): Self = StObject.set(x, "whenTrue", value.asInstanceOf[js.Any])
  }
}
