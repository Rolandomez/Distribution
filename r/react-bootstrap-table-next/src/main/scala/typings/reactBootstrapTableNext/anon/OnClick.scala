package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.ColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick[T /* <: js.Object */, E] extends StObject {
  
  def onClick(e: Any, column: ColumnDescription[T, E], columnIndex: Double): Unit
}
object OnClick {
  
  inline def apply[T /* <: js.Object */, E](onClick: (Any, ColumnDescription[T, E], Double) => Unit): OnClick[T, E] = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3(onClick))
    __obj.asInstanceOf[OnClick[T, E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnClick[?, ?], T /* <: js.Object */, E] (val x: Self & (OnClick[T, E])) extends AnyVal {
    
    inline def setOnClick(value: (Any, ColumnDescription[T, E], Double) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
  }
}
