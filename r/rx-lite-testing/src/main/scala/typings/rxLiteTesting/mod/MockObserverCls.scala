package typings.rxLiteTesting.mod

import typings.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite-testing", "MockObserver")
@js.native
class MockObserverCls[T] protected ()
  extends typings.rxLiteTesting.Rx.MockObserver[T] {
  def this(scheduler: IScheduler) = this()
}

