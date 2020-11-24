package typings.immer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrayMethod = typings.std.Exclude[/* keyof [] */ java.lang.String, scala.Double]
  
  type AtomicObject = js.Function | (typings.std.Map[js.Any, js.Any]) | (typings.std.WeakMap[js.Any, js.Any]) | typings.std.Set[js.Any] | typings.std.WeakSet[js.Any] | js.Promise[js.Any] | typings.std.Date | typings.std.RegExp | scala.Boolean | typings.std.Number | java.lang.String
  
  type Draft[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias immer.immer.Draft<T[P]> * / object}
    */ typings.immer.immerStrings.Draft with org.scalablytyped.runtime.TopLevel[js.Any]) | typings.immer.mod.DraftTuple[T] | typings.immer.mod.DraftArray[T]
  
  type DraftTuple[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: P extends immer.immer.Indices<T>? immer.immer.Draft<T[P]> : never}
    */ typings.immer.immerStrings.DraftTuple with org.scalablytyped.runtime.TopLevel[T]
  
  /** Converts `nothing` into `undefined` */
  type FromNothing[T] = js.UndefOr[T | (typings.std.Exclude[T, typings.immer.mod.Nothing_])]
  
  type Indices[T] = typings.std.Exclude[/* keyof T */ java.lang.String, typings.immer.mod.ArrayMethod]
  
  type PatchListener = js.Function2[
    /* patches */ js.Array[typings.immer.mod.Patch], 
    /* inversePatches */ js.Array[typings.immer.mod.Patch], 
    scala.Unit
  ]
  
  /** The inferred return type of `produce` */
  type Produced[Base, Return] = (typings.immer.mod.FromNothing[(typings.std.Exclude[Return, scala.Unit]) | Return]) | Base
}
