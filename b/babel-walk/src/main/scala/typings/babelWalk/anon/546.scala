package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.Private
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `546`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[Private, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[Private, TState]] = js.undefined
}
object `546` {
  
  inline def apply[TState](): `546`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`546`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `546`[?], TState] (val x: Self & `546`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[Private], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Private], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
