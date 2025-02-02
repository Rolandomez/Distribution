package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.BinaryInputs */
trait AddInputs extends StObject {
  
  var a: js.UndefOr[scala.Any] = js.undefined
  
  var b: js.UndefOr[scala.Any] = js.undefined
}
object AddInputs {
  
  inline def apply(): AddInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddInputs] (val x: Self) extends AnyVal {
    
    inline def setA(value: scala.Any): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
    
    inline def setB(value: scala.Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
  }
}
