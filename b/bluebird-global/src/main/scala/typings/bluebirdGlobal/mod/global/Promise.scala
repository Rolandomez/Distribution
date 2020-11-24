package typings.bluebirdGlobal.mod.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.bluebird.mod.Bluebird
import typings.bluebird.mod.CatchFilter
import typings.bluebird.mod.ConcurrencyOption
import typings.bluebird.mod.Constructor
import typings.bluebird.mod.Disposer
import typings.bluebird.mod.Inspection
import typings.bluebird.mod.Resolvable
import typings.bluebird.mod.SpreadOption
import typings.bluebirdGlobal.anon.Fn0
import typings.bluebirdGlobal.anon.FnCall
import typings.bluebirdGlobal.anon.FnCallFilter1Filter2Filter3Filter4Filter5OnReject
import typings.bluebirdGlobal.anon.FnCallFilter1Filter2Filter3Filter4Filter5Reason
import typings.bluebirdGlobal.anon.FnCallFilter1Filter2Filter3Filter4Filter5Value
import typings.bluebirdGlobal.anon.FnCallMsMessage
import typings.bluebirdGlobal.anon.FnCallOnFulfilledOnRejected
import typings.bluebirdGlobal.anon.FnCallThis
import typings.bluebirdGlobal.anon.FnCallValue
import typings.std.Error
import typings.std.Map
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Patch all instance method
  */
@js.native
trait Promise[T] extends js.Object {
  
  def all(): typings.bluebird.mod.^[T] = js.native
  
  def any(): typings.bluebird.mod.^[scala.Nothing] = js.native
  @JSName("any")
  def any_Q[Q](): typings.bluebird.mod.^[Q] = js.native
  
  def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit]): this.type = js.native
  def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit], options: SpreadOption): this.type = js.native
  def asCallback(sink: js.Any*): this.type = js.native
  @JSName("asCallback")
  var asCallback_Original: FnCall[T] = js.native
  
  def bind(thisArg: js.Any): Bluebird[T] = js.native
  @JSName("bind")
  var bind_Original: js.Function1[/* thisArg */ js.Any, Bluebird[T]] = js.native
  
  def call[U /* <: /* keyof Q */ String */, Q](propertyName: U, args: js.Any*): Bluebird[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: Q[U] */ js.Any
    ]
  ] = js.native
  @JSName("call")
  var call_Original: js.ThisFunction2[
    /* this */ Bluebird[_], 
    /* keyof any */ /* propertyName */ String, 
    /* repeated */ js.Any, 
    Bluebird[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ]
  ] = js.native
  
  def cancel(): Unit = js.native
  @JSName("cancel")
  var cancel_Original: js.Function0[Unit] = js.native
  
  /*
    * TypeScript disallows adding overrides via `catch: typeof Bluebird.prototype.catch`. Copy&paste them then.
    *
    * @todo Duplication of code is never ideal. See whether there's a better way of achieving this.
    */
  def `catch`(
    predicate: js.Function1[/* error */ js.Any, Boolean],
    onReject: js.Function1[/* error */ js.Any, T | (js.Thenable[T | Unit]) | Unit]
  ): typings.bluebird.mod.^[T] = js.native
  def `catch`(
    predicate: js.Object,
    onReject: js.Function1[/* error */ js.Any, T | (js.Thenable[T | Unit]) | Unit]
  ): typings.bluebird.mod.^[T] = js.native
  def `catch`[TResult](): Promise[T | TResult] = js.native
  def `catch`[E /* <: Error */](
    ErrorClass: Instantiable1[/* args (repeated) */ js.Any, E],
    onReject: js.Function1[/* error */ E, T | (js.Thenable[T | Unit]) | Unit]
  ): typings.bluebird.mod.^[T] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
  
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](// tslint:disable-next-line:unified-signatures
  filter1: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](value: U): Bluebird[T | U] = js.native
  @JSName("catchReturn")
  var catchReturn_Original: FnCallFilter1Filter2Filter3Filter4Filter5Value[T] = js.native
  
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(filter1: CatchFilter[Error], filter2: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(filter1: CatchFilter[Error], filter2: Constructor[Error], reason: Error): Bluebird[T] = js.native
  def catchThrow(// tslint:disable-next-line:unified-signatures
  filter1: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(filter1: Constructor[Error], filter2: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(filter1: Constructor[Error], filter2: Constructor[Error], reason: Error): Bluebird[T] = js.native
  def catchThrow(filter1: Constructor[Error], reason: Error): Bluebird[T] = js.native
  def catchThrow(reason: Error): Bluebird[T] = js.native
  @JSName("catchThrow")
  var catchThrow_Original: FnCallFilter1Filter2Filter3Filter4Filter5Reason[T] = js.native
  
  @JSName("catch")
  def catch_E_ErrorU[E /* <: Error */, U](
    ErrorClass: Instantiable1[/* args (repeated) */ js.Any, E],
    onReject: js.Function1[/* error */ E, U | js.Thenable[U]]
  ): typings.bluebird.mod.^[U | T] = js.native
  @JSName("catch")
  def catch_U[U](
    predicate: js.Function1[/* error */ js.Any, Boolean],
    onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]
  ): typings.bluebird.mod.^[U | T] = js.native
  @JSName("catch")
  def catch_U[U](predicate: js.Object, onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]): typings.bluebird.mod.^[U | T] = js.native
  
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U](): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U](onReject: js.Function1[/* error */ js.Any, Resolvable[U]]): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1](
    // tslint:disable-next-line:unified-signatures
  filter1: CatchFilter[E1],
    onReject: js.Function1[/* error */ E1, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[U]]): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  @JSName("caught")
  var caught_Original: typings.bluebird.anon.FnCall[T] with FnCallFilter1Filter2Filter3Filter4Filter5OnReject[T] = js.native
  
  def delay(ms: Double): Bluebird[T] = js.native
  @JSName("delay")
  var delay_Original: js.Function1[/* ms */ Double, Bluebird[T]] = js.native
  
  def disposer(disposeFn: js.Function2[/* arg */ T, /* promise */ Bluebird[T], Resolvable[Unit]]): Disposer[T] = js.native
  @JSName("disposer")
  var disposer_Original: js.Function1[
    /* disposeFn */ js.Function2[/* arg */ T, /* promise */ Bluebird[T], Resolvable[Unit]], 
    Disposer[T]
  ] = js.native
  
  def done[U](): Unit = js.native
  def done[U](
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.Function1[/* error */ js.Any, Resolvable[U]]
  ): Unit = js.native
  def done[U](onFulfilled: js.Function1[/* value */ T, Resolvable[U]]): Unit = js.native
  def done[U](
    onFulfilled: js.Function1[/* value */ T, Resolvable[U]],
    onRejected: js.Function1[/* error */ js.Any, Resolvable[U]]
  ): Unit = js.native
  @JSName("done")
  var done_Original: FnCallOnFulfilledOnRejected[T] = js.native
  
  def each[Q](iterator: IterateFunction[Q, _]): typings.bluebird.mod.^[T] = js.native
  
  def error[U](onReject: js.Function1[/* reason */ js.Any, Resolvable[U]]): Bluebird[U] = js.native
  @JSName("error")
  var error_Original: js.Function1[/* onReject */ js.Function1[/* reason */ js.Any, Resolvable[_]], Bluebird[_]] = js.native
  
  def filter[Q](filterer: IterateFunction[Q, Boolean]): typings.bluebird.mod.^[T] = js.native
  def filter[Q](filterer: IterateFunction[Q, Boolean], options: ConcurrencyOption): typings.bluebird.mod.^[T] = js.native
  
  /*
    * See comments above `then` for the reason why this is needed. Taken from es2018.promise.d.ts.
    *
    * #std-lib-copy&paste-to-remove
    *
    * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
    */
  def `finally`(): Promise[T] = js.native
  def `finally`(onfinally: js.Function0[Unit]): Promise[T] = js.native
  
  // finally: Bluebird<T>["finally"]; // Provided by lib.es2018.promise.d.ts
  def get[U /* <: /* keyof T */ String */](key: U): Bluebird[
    /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any
  ] = js.native
  // finally: Bluebird<T>["finally"]; // Provided by lib.es2018.promise.d.ts
  @JSName("get")
  var get_Original: js.Function1[
    /* keyof T */ /* key */ String, 
    Bluebird[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  def isCancelled(): Boolean = js.native
  @JSName("isCancelled")
  var isCancelled_Original: js.Function0[Boolean] = js.native
  
  def isFulfilled(): Boolean = js.native
  @JSName("isFulfilled")
  var isFulfilled_Original: js.Function0[Boolean] = js.native
  
  def isPending(): Boolean = js.native
  @JSName("isPending")
  var isPending_Original: js.Function0[Boolean] = js.native
  
  def isRejected(): Boolean = js.native
  @JSName("isRejected")
  var isRejected_Original: js.Function0[Boolean] = js.native
  
  def isResolved(): Boolean = js.native
  @JSName("isResolved")
  var isResolved_Original: js.Function0[Boolean] = js.native
  
  def lastly(handler: js.Function0[Resolvable[_]]): Bluebird[T] = js.native
  @JSName("lastly")
  var lastly_Original: js.Function1[/* handler */ js.Function0[Resolvable[_]], Bluebird[T]] = js.native
  
  def map[U, Q](mapper: IterateFunction[Q, U]): typings.bluebird.mod.^[js.Array[U]] = js.native
  def map[U, Q](mapper: IterateFunction[Q, U], options: ConcurrencyOption): typings.bluebird.mod.^[js.Array[U]] = js.native
  
  def mapSeries[U, Q](iterator: IterateFunction[Q, U]): typings.bluebird.mod.^[js.Array[U]] = js.native
  
  def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit]): this.type = js.native
  def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit], options: SpreadOption): this.type = js.native
  def nodeify(sink: js.Any*): this.type = js.native
  @JSName("nodeify")
  var nodeify_Original: FnCall[T] = js.native
  
  def props[T](): Bluebird[T] = js.native
  @JSName("props")
  def props_KV[K, V](): Bluebird[Map[K, V]] = js.native
  @JSName("props")
  var props_Original: FnCallThis = js.native
  
  def race(): typings.bluebird.mod.^[scala.Nothing] = js.native
  @JSName("race")
  def race_Q[Q](): typings.bluebird.mod.^[Q] = js.native
  
  def reason(): js.Any = js.native
  @JSName("reason")
  var reason_Original: js.Function0[_] = js.native
  
  def reduce[U, Q](
    reducer: js.Function4[
      /* memo */ U, 
      /* item */ Q, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      U | js.Thenable[U]
    ]
  ): typings.bluebird.mod.^[U] = js.native
  def reduce[U, Q](
    reducer: js.Function4[
      /* memo */ U, 
      /* item */ Q, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      U | js.Thenable[U]
    ],
    initialValue: U
  ): typings.bluebird.mod.^[U] = js.native
  
  def reflect(): Bluebird[Inspection[T]] = js.native
  @JSName("reflect")
  var reflect_Original: js.Function0[Bluebird[Inspection[T]]] = js.native
  
  def `return`(): Bluebird[Unit] = js.native
  def `return`[U](value: U): Bluebird[U] = js.native
  @JSName("return")
  var return_Original: FnCallValue = js.native
  
  def some(count: Double): typings.bluebird.mod.^[T] = js.native
  
  def spread[U, Q](fulfilledHandler: js.Function1[/* repeated */ Q, U | js.Thenable[U]]): typings.bluebird.mod.^[U] = js.native
  
  def suppressUnhandledRejections(): Unit = js.native
  @JSName("suppressUnhandledRejections")
  var suppressUnhandledRejections_Original: js.Function0[Unit] = js.native
  
  def tap(onFulFill: js.Function1[/* value */ T, Resolvable[_]]): Bluebird[T] = js.native
  
  def tapCatch(onReject: js.Function1[/* error */ js.UndefOr[js.Any], Resolvable[_]]): Bluebird[T] = js.native
  def tapCatch[E1](
    // tslint:disable-next-line:unified-signatures
  filter1: CatchFilter[E1],
    onReject: js.Function1[/* error */ E1, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[_]]): Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
  ): Bluebird[T] = js.native
  @JSName("tapCatch")
  var tapCatch_Original: Fn0[T] = js.native
  
  @JSName("tap")
  var tap_Original: js.Function1[/* onFulFill */ js.Function1[/* value */ T, Resolvable[_]], Bluebird[T]] = js.native
  
  /*
    * Copy&paste ::then and ::catch from lib.es5.promise.d.ts, because Bluebird's typings are not
    * in line with the standard lib.
    *
    * #std-lib-copy&paste-to-remove
    *
    * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
    */
  def `then`[TResult1, TResult2](): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): Promise[TResult1 | TResult2] = js.native
  
  // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
  def thenReturn(): Bluebird[Unit] = js.native
  // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
  def thenReturn[U](value: U): Bluebird[U] = js.native
  // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
  @JSName("thenReturn")
  var thenReturn_Original: FnCallValue = js.native
  
  def thenThrow(reason: Error): Bluebird[scala.Nothing] = js.native
  @JSName("thenThrow")
  var thenThrow_Original: js.Function1[/* reason */ Error, Bluebird[scala.Nothing]] = js.native
  
  def `throw`(reason: Error): Bluebird[scala.Nothing] = js.native
  @JSName("throw")
  var throw_Original: js.Function1[/* reason */ Error, Bluebird[scala.Nothing]] = js.native
  
  def timeout(ms: Double): Bluebird[T] = js.native
  def timeout(ms: Double, message: String): Bluebird[T] = js.native
  def timeout(ms: Double, message: Error): Bluebird[T] = js.native
  @JSName("timeout")
  var timeout_Original: FnCallMsMessage[T] = js.native
  
  def toJSON(): js.Object = js.native
  @JSName("toJSON")
  var toJSON_Original: js.Function0[js.Object] = js.native
  
  @JSName("toString")
  var toString_Original: js.Function0[String] = js.native
  
  def value(): T = js.native
  @JSName("value")
  var value_Original: js.Function0[T] = js.native
}
/*
  * Declare the `Promise` variable. This is needed for es5 only and is a no-op for all other targets.
  *
  * #std-lib-copy&paste-to-remove
  *
  * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
  */
@JSGlobal("Promise")
@js.native
object Promise extends TopLevel[PromiseConstructor]
