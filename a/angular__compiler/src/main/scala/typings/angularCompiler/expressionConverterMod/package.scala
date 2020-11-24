package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object expressionConverterMod {
  
  type BuiltinConverter = js.Function1[
    /* args */ js.Array[typings.angularCompiler.outputAstMod.Expression], 
    typings.angularCompiler.outputAstMod.Expression
  ]
  
  type InterpolationFunction = js.Function1[
    /* args */ js.Array[typings.angularCompiler.outputAstMod.Expression], 
    typings.angularCompiler.outputAstMod.Expression
  ]
}
