package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsPadV2Attrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsPadV2Mod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/PadV2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def padV2(args: AttrsPadV2Attrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("padV2")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/PadV2", "padV2Config")
  @js.native
  val padV2Config: KernelConfig = js.native
}
