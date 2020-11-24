package typings.mobx.internalMod

import typings.mobx.computedvalueMod.IComputedValue
import typings.mobx.coreObservableMod.IObservable
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "onBecomeObserved")
@js.native
object onBecomeObserved extends js.Object {
  
  def apply(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  def apply(value: IObservable, listener: Lambda): Lambda = js.native
  def apply(value: ObservableMap[_, _], listener: Lambda): Lambda = js.native
  def apply(value: ObservableSet[_], listener: Lambda): Lambda = js.native
  def apply(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  def apply[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  def apply[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
}
