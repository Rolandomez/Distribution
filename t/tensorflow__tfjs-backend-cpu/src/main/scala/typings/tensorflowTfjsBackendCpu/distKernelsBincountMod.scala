package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsBincountAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsBincountMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Bincount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bincount(args: AttrsBincountAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("bincount")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Bincount", "bincountConfig")
  @js.native
  val bincountConfig: KernelConfig = js.native
}
