package typings.d3Scale

import typings.d3Scale.d3ScaleStrings.`implicit`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: `implicit`
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal(name = "implicit")
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: `implicit`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToString extends StObject
  
  trait ValueOf extends StObject
}
