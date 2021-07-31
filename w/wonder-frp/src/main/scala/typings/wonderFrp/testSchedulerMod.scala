package typings.wonderFrp

import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.mockObserverMod.MockObserver
import typings.wonderFrp.mockPromiseMod.MockPromise
import typings.wonderFrp.observerMod.Observer
import typings.wonderFrp.recordMod.Record
import typings.wonderFrp.schedulerMod.Scheduler
import typings.wonderFrp.testStreamMod.TestStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testSchedulerMod {
  
  @JSImport("wonder-frp/dist/commonjs/testing/TestScheduler", "TestScheduler")
  @js.native
  class TestScheduler protected () extends Scheduler {
    def this(isReset: Boolean) = this()
    
    var _clock: js.Any = js.native
    
    var _disposedTime: js.Any = js.native
    
    /* private */ def _exec(time: js.Any, map: js.Any): js.Any = js.native
    
    /* private */ def _getMinAndMaxTime(): js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _isReset: js.Any = js.native
    
    var _observer: js.Any = js.native
    
    /* private */ def _runAt(time: js.Any, callback: js.Any): js.Any = js.native
    
    /* private */ def _runStream(time: js.Any): js.Any = js.native
    
    /* private */ def _setClock(): js.Any = js.native
    
    var _streamMap: js.Any = js.native
    
    var _subscribedTime: js.Any = js.native
    
    /* private */ def _tick(time: js.Any): js.Any = js.native
    
    var _timerMap: js.Any = js.native
    
    var clock: Double = js.native
    
    def createObserver(): MockObserver = js.native
    
    def createRejectPromise(time: Double, error: js.Any): MockPromise = js.native
    
    def createResolvedPromise(time: Double, value: js.Any): MockPromise = js.native
    
    def createStream(args: js.Any): TestStream = js.native
    
    def publicAbsolute(time: js.Any, handler: js.Any): Unit = js.native
    
    def publishRecursive(observer: MockObserver, initial: js.Any, recursiveFunc: js.Function): Unit = js.native
    
    def remove(observer: Observer): Unit = js.native
    
    def setStreamMap(observer: IObserver, messages: js.Array[Record]): Unit = js.native
    
    def start(): Unit = js.native
    
    def startWithDispose(create: js.Any): MockObserver = js.native
    def startWithDispose(create: js.Any, disposedTime: Double): MockObserver = js.native
    
    def startWithSubscribe(create: js.Any): MockObserver = js.native
    def startWithSubscribe(create: js.Any, subscribedTime: Double): MockObserver = js.native
    
    def startWithTime(create: js.Function, subscribedTime: Double, disposedTime: Double): MockObserver = js.native
  }
  /* static members */
  object TestScheduler {
    
    @JSImport("wonder-frp/dist/commonjs/testing/TestScheduler", "TestScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def completed(tick: js.Any): Record = ^.asInstanceOf[js.Dynamic].applyDynamic("completed")(tick.asInstanceOf[js.Any]).asInstanceOf[Record]
    
    @scala.inline
    def create(): TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TestScheduler]
    @scala.inline
    def create(isReset: Boolean): TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(isReset.asInstanceOf[js.Any]).asInstanceOf[TestScheduler]
    
    @scala.inline
    def error(tick: js.Any, error: js.Any): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(tick.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Record]
    
    @scala.inline
    def next(tick: js.Any, value: js.Any): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(tick.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Record]
  }
}
