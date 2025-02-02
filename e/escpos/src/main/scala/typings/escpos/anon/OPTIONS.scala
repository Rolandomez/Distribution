package typings.escpos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OPTIONS extends StObject {
  
  var CMD: /* (k 1E */ String
  
  var OPTIONS: H
}
object OPTIONS {
  
  inline def apply(OPTIONS: H): OPTIONS = {
    val __obj = js.Dynamic.literal(CMD = "\u001D(k\u0003\u00001E", OPTIONS = OPTIONS.asInstanceOf[js.Any])
    __obj.asInstanceOf[OPTIONS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OPTIONS] (val x: Self) extends AnyVal {
    
    inline def setCMD(value: /* (k 1E */ String): Self = StObject.set(x, "CMD", value.asInstanceOf[js.Any])
    
    inline def setOPTIONS(value: H): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
  }
}
