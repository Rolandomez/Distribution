package typings.reactCopyWrite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // It'd be nice if this could somehow be improved! Perhaps we need variadic
  // kinds plus infer keyword? Alternatively unions may solve our issue if we had
  // the ability to restrict type widening.
  type AnyDeepMemberOfState[T] = js.Any
  
  type Consumer[T] = typings.react.mod.Component[typings.reactCopyWrite.mod.ConsumerProps[T], js.Object, js.Any]
  
  type MutateFn[T] = js.Function2[/* draft */ T, /* state */ T, scala.Unit]
  
  type Mutator[T] = js.Function1[/* mutator */ typings.reactCopyWrite.mod.MutateFn[T], scala.Unit]
  
  type Provider[T] = typings.react.mod.Component[typings.reactCopyWrite.mod.ProviderProps[T], js.Object, js.Any]
  
  type RenderFn[T] = js.Function1[
    /* repeated */ typings.std.ReturnType[typings.reactCopyWrite.mod.SelectorFn[T]], 
    typings.react.mod.global.JSX.Element | js.Array[typings.react.mod.global.JSX.Element] | scala.Null
  ]
  
  type SelectorFn[T] = js.Function1[/* state */ T, typings.reactCopyWrite.mod.AnyDeepMemberOfState[T]]
}
