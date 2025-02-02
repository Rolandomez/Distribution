package typings.toTitleCaseGouch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String extends StObject {
  
  def toTitleCase(): java.lang.String
}
object String {
  
  inline def apply(toTitleCase: () => java.lang.String): String = {
    val __obj = js.Dynamic.literal(toTitleCase = js.Any.fromFunction0(toTitleCase))
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: String] (val x: Self) extends AnyVal {
    
    inline def setToTitleCase(value: () => java.lang.String): Self = StObject.set(x, "toTitleCase", js.Any.fromFunction0(value))
  }
}
