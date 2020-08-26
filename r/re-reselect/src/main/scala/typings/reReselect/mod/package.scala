package typings.reReselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type KeySelector[S] = js.Function2[/* state */ S, /* repeated */ js.Any, js.Any]
  type KeySelectorCreator[S, C, D] = js.Function1[
    /* selectorInputs */ typings.reReselect.anon.InputSelectors[D, C, S], 
    typings.reReselect.mod.KeySelector[S]
  ]
  type ObjectCacheKey = java.lang.String | scala.Double
  type OutputCachedSelector[S, R, C, D] = js.Function1[
    /* options */ typings.reReselect.mod.KeySelector[S] | (typings.reReselect.mod.Options[S, C, D]), 
    (typings.reReselect.mod.OutputSelector[S, R, C, D]) with (typings.reReselect.anon.Cache[S, R, C, D])
  ]
  type OutputParametricCachedSelector[S, P, R, C, D] = js.Function1[
    /* options */ (typings.reReselect.mod.ParametricKeySelector[S, P]) | (typings.reReselect.mod.ParametricOptions[S, P, C, D]), 
    (typings.reReselect.mod.OutputParametricSelector[S, P, R, C, D]) with (typings.reReselect.anon.ClearCache[S, P, R, C, D])
  ]
  type OutputParametricSelector[S, P, R, C, D] = (typings.reReselect.mod.ParametricSelector[S, P, R]) with (typings.reReselect.anon.Dependencies[C, D])
  type OutputSelector[S, R, C, D] = (typings.reReselect.mod.Selector[S, R]) with (typings.reReselect.anon.Dependencies[C, D])
  type ParametricKeySelector[S, P] = js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, js.Any]
  type ParametricKeySelectorCreator[S, P, C, D] = js.Function1[
    /* selectorInputs */ typings.reReselect.anon.KeySelector[D, C, S, P], 
    typings.reReselect.mod.ParametricKeySelector[S, P]
  ]
  type ParametricSelector[S, P, R] = js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, R]
  type Selector[S, R] = js.Function1[/* state */ S, R]
  type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
