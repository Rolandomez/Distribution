package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object kernelRegistryMod {
  
  type Attribute = typings.tensorflowTfjsCore.kernelRegistryMod.AttributeValue | typings.tensorflowTfjsCore.distTypesMod.RecursiveArray[typings.tensorflowTfjsCore.kernelRegistryMod.AttributeValue]
  
  type AttributeValue = scala.Double | (js.Array[scala.Boolean | scala.Double | java.lang.String]) | scala.Boolean | java.lang.String | typings.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
  
  type DataId = js.Object
  
  type GradFunc = js.Function3[
    /* dy */ typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]), 
    /* saved */ js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ], 
    /* attrs */ typings.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap, 
    typings.tensorflowTfjsCore.tapeMod.NamedGradientMap
  ]
  
  type KernelDisposeFunc = typings.tensorflowTfjsCore.kernelRegistryMod.KernelSetupFunc
  
  type KernelFunc = js.Function1[
    /* params */ typings.tensorflowTfjsCore.anon.Attrs, 
    typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo | js.Array[typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo]
  ]
  
  type KernelSetupFunc = js.Function1[/* backend */ js.Object, scala.Unit]
  
  type NamedTensorInfoMap = org.scalablytyped.runtime.StringDictionary[typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo]
}
