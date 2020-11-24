package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stackingUtilsMod {
  
  type GenericStackingResult[D] = typings.plottable.utilsMod.Map[
    typings.plottable.datasetMod.Dataset, 
    typings.plottable.utilsMod.Map[
      java.lang.String | scala.Double, 
      typings.plottable.stackingUtilsMod.GenericStackedDatum[D]
    ]
  ]
  
  type StackedDatum = typings.plottable.stackingUtilsMod.GenericStackedDatum[java.lang.String]
  
  type StackingResult = typings.plottable.stackingUtilsMod.GenericStackingResult[java.lang.String]
}
