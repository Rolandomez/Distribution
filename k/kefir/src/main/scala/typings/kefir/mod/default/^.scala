package typings.kefir.mod.default

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.kefir.anon.Fn0
import typings.kefir.anon.Fn1
import typings.kefir.anon.FnCall
import typings.kefir.anon.FnCallError
import typings.kefir.anon.FnCallFn
import typings.kefir.anon.FnCallGenerator
import typings.kefir.anon.FnCallIntervalFn
import typings.kefir.anon.FnCallIntervalHandler
import typings.kefir.anon.FnCallIntervalValues
import typings.kefir.anon.FnCallObservable
import typings.kefir.anon.FnCallObss
import typings.kefir.anon.FnCallObssObssPCombinator
import typings.kefir.anon.FnCallObssPassiveObssCombinator
import typings.kefir.anon.FnCallPromise
import typings.kefir.anon.FnCallSubscribe
import typings.kefir.anon.FnCallTargetEventNameTransform
import typings.kefir.anon.FnCallValue
import typings.kefir.anon.Observable
import typings.kefir.anon.Off
import typings.kefir.mod.Emitter
import typings.kefir.mod.Pool_
import typings.kefir.mod.Property
import typings.kefir.mod.Stream_
import typings.kefir.mod.ValueOfAnObservable
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", JSImport.Default)
@js.native
object ^ extends js.Object {
  var Observable: Instantiable0[typings.kefir.mod.Observable[js.Object, js.Object]] = js.native
  var Pool: Instantiable0[Pool_[js.Object, js.Object]] = js.native
  var Property: Instantiable0[typings.kefir.mod.Property[js.Object, js.Object]] = js.native
  var Stream: Instantiable0[Stream_[js.Object, js.Object]] = js.native
  @JSName("combine")
  var combine_Original: FnCallObssObssPCombinator = js.native
  @JSName("concat")
  var concat_Original: FnCallObss = js.native
  @JSName("constantError")
  var constantError_Original: FnCallError = js.native
  @JSName("constant")
  var constant_Original: FnCallValue = js.native
  @JSName("fromCallback")
  var fromCallback_Original: FnCallFn = js.native
  @JSName("fromESObservable")
  var fromESObservable_Original: FnCallObservable = js.native
  @JSName("fromEvents")
  var fromEvents_Original: FnCallTargetEventNameTransform = js.native
  @JSName("fromNodeCallback")
  var fromNodeCallback_Original: Fn0 = js.native
  @JSName("fromPoll")
  var fromPoll_Original: FnCallIntervalFn = js.native
  @JSName("fromPromise")
  var fromPromise_Original: FnCallPromise = js.native
  @JSName("interval")
  var interval_Original: FnCall = js.native
  @JSName("later")
  var later_Original: FnCall = js.native
  @JSName("merge")
  var merge_Original: FnCallObss = js.native
  @JSName("pool")
  var pool_Original: Fn1 = js.native
  @JSName("repeat")
  var repeat_Original: FnCallGenerator = js.native
  @JSName("sequentially")
  var sequentially_Original: FnCallIntervalValues = js.native
  var staticLand: Observable = js.native
  @JSName("stream")
  var stream_Original: FnCallSubscribe = js.native
  @JSName("withInterval")
  var withInterval_Original: FnCallIntervalHandler = js.native
  @JSName("zip")
  var zip_Original: FnCallObssPassiveObssCombinator = js.native
  def combine[T /* <: js.Tuple8[
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _]
  ] */](obss: T): Stream_[
    js.Tuple8[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[3] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[4] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[5] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[6] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[7] */ js.Any
      ]
    ], 
    _
  ] = js.native
  def combine[T /* <: StringDictionary[typings.kefir.mod.Observable[_, _]] */, K /* <: StringDictionary[typings.kefir.mod.Observable[_, _]] */](obss: T, passiveObss: K): Stream_[typings.kefir.kefirStrings.^  with TopLevel[T] with TopLevel[K], _] = js.native
  def combine[T, S, U](obss: js.Array[typings.kefir.mod.Observable[T, S]], combinator: js.Function1[/* repeated */ T, U]): Stream_[U, S] = js.native
  def combine[T, S, U](
    obss: js.Array[typings.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typings.kefir.mod.Observable[T, S]]
  ): Stream_[U, S] = js.native
  def combine[T, S, U](
    obss: js.Array[typings.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typings.kefir.mod.Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): Stream_[U, S] = js.native
  @JSName("combine")
  def combine_0[T /* <: js.Array[typings.kefir.mod.Observable[_, _]] */, P /* <: js.Array[typings.kefir.mod.Observable[_, _]] */, K](
    obss: T,
    obssP: P,
    combinator: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[0][''] */ /* a */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: P[0][''] */ /* b */ js.Any, 
      K
    ]
  ): typings.kefir.mod.Observable[K, _] = js.native
  @JSName("combine")
  def combine_T_ArrayNothing[T /* <: js.Array[scala.Nothing] */](obss: T): Stream_[scala.Nothing, scala.Nothing] = js.native
  @JSName("combine")
  def combine_T_ArrayObservableWildcardWildcard[T /* <: js.Array[typings.kefir.mod.Observable[_, _]] */](obss: T): Stream_[
    js.Array[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_ArrayObservableWildcardWildcardP_String[T /* <: js.Array[typings.kefir.mod.Observable[_, _]] */, P /* <: /* keyof T */ String */](obss: T): Stream_[
    js.Array[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_StringDictionaryObservableWildcardWildcard[T /* <: StringDictionary[typings.kefir.mod.Observable[_, _]] */](obss: T): Stream_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: kefir.kefir.ValueOfAnObservable<T[P]>}
    */ typings.kefir.kefirStrings.^  with TopLevel[T], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple2ObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple2[typings.kefir.mod.Observable[_, _], typings.kefir.mod.Observable[_, _]] */](obss: T): Stream_[
    js.Tuple2[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple3ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple3[
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _]
  ] */](obss: T): Stream_[
    js.Tuple3[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple4ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple4[
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _]
  ] */](obss: T): Stream_[
    js.Tuple4[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[3] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple5ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple5[
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _]
  ] */](obss: T): Stream_[
    js.Tuple5[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[3] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[4] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple6ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple6[
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _]
  ] */](obss: T): Stream_[
    js.Tuple6[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[3] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[4] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[5] */ js.Any
      ]
    ], 
    _
  ] = js.native
  @JSName("combine")
  def combine_T_Tuple7ObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcardObservableWildcardWildcard[T /* <: js.Tuple7[
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _]
  ] */](obss: T): Stream_[
    js.Tuple7[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[3] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[4] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[5] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[6] */ js.Any
      ]
    ], 
    _
  ] = js.native
  def concat[T, S](obss: js.Array[typings.kefir.mod.Observable[T, S]]): typings.kefir.mod.Observable[T, S] = js.native
  def constant[T](value: T): Property[T, scala.Nothing] = js.native
  def constantError[T](error: T): Property[scala.Nothing, T] = js.native
  def fromCallback[T](fn: js.Function1[/* callback */ js.Function1[/* value */ T, Unit], Unit]): Stream_[T, scala.Nothing] = js.native
  def fromESObservable[T, S](observable: js.Any): Stream_[T, S] = js.native
  def fromEvents[T, S](target: Off, eventName: String): Stream_[T, S] = js.native
  def fromEvents[T, S](target: Off, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def fromEvents[T, S](target: EventEmitter, eventName: String): Stream_[T, S] = js.native
  def fromEvents[T, S](target: EventEmitter, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def fromEvents[T, S](target: EventTarget, eventName: String): Stream_[T, S] = js.native
  def fromEvents[T, S](target: EventTarget, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def fromNodeCallback[T, S](fn: js.Function1[/* callback */ js.Function2[/* error */ S | Null, /* result */ T, Unit], Unit]): Stream_[T, S] = js.native
  def fromPoll[T](interval: Double, fn: js.Function0[T]): Stream_[T, scala.Nothing] = js.native
  def fromPromise[T, S](promise: js.Promise[T]): Property[T, S] = js.native
  def interval[T](interval: Double, value: T): Stream_[T, scala.Nothing] = js.native
  def later[T](interval: Double, value: T): Stream_[T, scala.Nothing] = js.native
  def merge[T, S](obss: js.Array[typings.kefir.mod.Observable[T, S]]): typings.kefir.mod.Observable[T, S] = js.native
  def pool[T, S](): Pool_[T, S] = js.native
  def repeat[T, S](generator: js.Function1[/* i */ Double, (typings.kefir.mod.Observable[T, S]) | Boolean]): typings.kefir.mod.Observable[T, S] = js.native
  def sequentially[T](interval: Double, values: js.Array[T]): Stream_[T, scala.Nothing] = js.native
  def stream[T, S](subscribe: js.Function1[/* emitter */ Emitter[T, S], js.Function | Unit]): Stream_[T, S] = js.native
  def withInterval[T, S](interval: Double, handler: js.Function1[/* emitter */ Emitter[T, S], Unit]): Stream_[T, S] = js.native
  def zip[T, S, U](obss: js.Array[typings.kefir.mod.Observable[T, S]]): typings.kefir.mod.Observable[U, S] = js.native
  def zip[T, S, U](
    obss: js.Array[typings.kefir.mod.Observable[T, S]],
    passiveObss: js.UndefOr[scala.Nothing],
    combinator: js.Function1[/* repeated */ T, U]
  ): typings.kefir.mod.Observable[U, S] = js.native
  def zip[T, S, U](
    obss: js.Array[typings.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typings.kefir.mod.Observable[T, S]]
  ): typings.kefir.mod.Observable[U, S] = js.native
  def zip[T, S, U](
    obss: js.Array[typings.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typings.kefir.mod.Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): typings.kefir.mod.Observable[U, S] = js.native
}

