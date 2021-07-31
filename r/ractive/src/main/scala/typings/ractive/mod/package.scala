package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdaptorPrefixer = js.Function1[/* map */ typings.ractive.mod.ValueMap, typings.ractive.mod.ValueMap]

type Component = typings.ractive.mod.Static[typings.ractive.mod.Ractive[typings.ractive.mod.Ractive[js.Any]]] | (js.Promise[
typings.ractive.mod.Static[typings.ractive.mod.Ractive[typings.ractive.mod.Ractive[js.Any]]]])

type Computation[T /* <: typings.ractive.mod.Ractive[T] */] = java.lang.String | typings.ractive.mod.ComputationFn[T] | typings.ractive.mod.ComputationDescriptor[T]

type ComputationFn[T /* <: typings.ractive.mod.Ractive[T] */] = js.ThisFunction0[/* this */ T, js.Any]

type CssFn = js.Function1[/* data */ typings.ractive.mod.DataGetFn, java.lang.String]

type Data = typings.ractive.mod.ValueMap

type DataFn[T /* <: typings.ractive.mod.Ractive[T] */] = js.ThisFunction0[/* this */ T, typings.ractive.mod.ValueMap]

type DataGetFn = js.Function1[/* keypath */ java.lang.String, js.Any]

type Easing = js.Function1[/* time */ scala.Double, scala.Double]

type EventPlugin[T /* <: typings.ractive.mod.Ractive[T] */] = js.ThisFunction2[
/* this */ T, 
/* node */ typings.std.HTMLElement, 
/* fire */ js.Function1[/* event */ typings.std.Event, scala.Unit], 
typings.ractive.anon.Teardown]

type Interpolator = js.Function2[/* from */ js.Any, /* to */ js.Any, js.Function1[/* t */ scala.Double, js.Any]]

type MacroFn = js.Function1[/* MacroHelper */ js.Any, typings.ractive.mod.MacroHandle]

type ObserverArrayCallback[T /* <: typings.ractive.mod.Ractive[T] */] = js.ThisFunction1[
/* this */ T, 
/* changes */ typings.ractive.mod.ArrayChanges, 
scala.Unit | js.Promise[js.Any]]

type ParseDelimiters = js.Tuple2[java.lang.String, java.lang.String]

type ParseFn = js.Function1[
/* helper */ typings.ractive.mod.ParseHelper, 
java.lang.String | (js.Array[js.Object | java.lang.String]) | typings.ractive.mod.ParsedTemplate]

type Partial = java.lang.String | js.Array[js.Any] | typings.ractive.mod.ParseFn | typings.ractive.mod.Macro

type PartialMap = org.scalablytyped.runtime.StringDictionary[typings.ractive.mod.Partial]

type Plugin = js.Function1[/* PluginArgsBase */ js.Any, scala.Unit]

type PluginExtend = js.Function1[/* PluginArgsExtend */ js.Any, scala.Unit]

type PluginInstance = js.Function1[/* PluginArgsInstance */ js.Any, scala.Unit]

type Registry[T] = org.scalablytyped.runtime.StringDictionary[T]

type ShuffleFn = js.Function2[
/* left */ js.Any, 
/* right */ js.Any, 
typings.ractive.ractiveNumbers.`1` | typings.ractive.ractiveNumbers.`0` | typings.ractive.ractiveNumbers.`-1`]

type Shuffler = scala.Boolean | java.lang.String | typings.ractive.mod.ShuffleFn

type Target = java.lang.String | typings.std.HTMLElement | typings.std.ArrayLike[js.Any]

type Template = typings.ractive.mod.ParsedTemplate | java.lang.String | js.Array[js.Any] | typings.ractive.mod.ParseFn

type ValueMap = org.scalablytyped.runtime.StringDictionary[js.Any]
