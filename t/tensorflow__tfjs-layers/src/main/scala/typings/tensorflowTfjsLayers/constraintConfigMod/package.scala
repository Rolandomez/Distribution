package typings.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object constraintConfigMod {
  
  type ConstraintSerialization = typings.tensorflowTfjsLayers.constraintConfigMod.MaxNormSerialization | typings.tensorflowTfjsLayers.constraintConfigMod.NonNegSerialization | typings.tensorflowTfjsLayers.constraintConfigMod.UnitNormSerialization | typings.tensorflowTfjsLayers.constraintConfigMod.MinMaxNormSerialization
  
  type MaxNormSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm, 
    typings.tensorflowTfjsLayers.constraintConfigMod.MaxNormConfig
  ]
  
  type MinMaxNormSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm, 
    typings.tensorflowTfjsLayers.constraintConfigMod.MinMaxNormConfig
  ]
  
  type NonNegSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg, scala.Null]
  
  type UnitNormSerialization = typings.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm, 
    typings.tensorflowTfjsLayers.constraintConfigMod.UnitNormConfig
  ]
}
