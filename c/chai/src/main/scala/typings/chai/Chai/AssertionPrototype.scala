package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionPrototype extends StObject {
  
  var _obj: js.Any
  
  def assert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AssertionArgs is not an array type */ args: AssertionArgs
  ): Unit
}
object AssertionPrototype {
  
  @scala.inline
  def apply(_obj: js.Any, assert: AssertionArgs => Unit): AssertionPrototype = {
    val __obj = js.Dynamic.literal(_obj = _obj.asInstanceOf[js.Any], assert = js.Any.fromFunction1(assert))
    __obj.asInstanceOf[AssertionPrototype]
  }
  
  @scala.inline
  implicit class AssertionPrototypeMutableBuilder[Self <: AssertionPrototype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssert(value: AssertionArgs => Unit): Self = StObject.set(x, "assert", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_obj(value: js.Any): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
  }
}
