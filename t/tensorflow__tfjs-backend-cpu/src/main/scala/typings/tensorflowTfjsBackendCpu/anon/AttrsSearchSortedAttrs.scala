package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.SearchSortedAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.SearchSortedInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSearchSortedAttrs extends StObject {
  
  var attrs: SearchSortedAttrs
  
  var backend: MathBackendCPU
  
  var inputs: SearchSortedInputs
}
object AttrsSearchSortedAttrs {
  
  inline def apply(attrs: SearchSortedAttrs, backend: MathBackendCPU, inputs: SearchSortedInputs): AttrsSearchSortedAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSearchSortedAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsSearchSortedAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: SearchSortedAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SearchSortedInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
