package typings.angularCommon.mod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.PipeTransform
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "AsyncPipe")
@js.native
class AsyncPipe protected ()
  extends StObject
     with OnDestroy
     with PipeTransform {
  def this(_ref: ChangeDetectorRef) = this()
  
  /* private */ var _dispose: js.Any = js.native
  
  /* private */ var _latestValue: js.Any = js.native
  
  /* private */ var _obj: js.Any = js.native
  
  /* private */ var _ref: js.Any = js.native
  
  /* private */ var _selectStrategy: js.Any = js.native
  
  /* private */ var _strategy: js.Any = js.native
  
  /* private */ var _subscribe: js.Any = js.native
  
  /* private */ var _subscription: js.Any = js.native
  
  /* private */ var _updateLatestValue: js.Any = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform[T](): T | Null = js.native
  def transform[T](obj: js.Promise[T]): T | Null = js.native
  def transform[T](obj: Observable_[T]): T | Null = js.native
  @JSName("transform")
  def transform_T_Null[T](): Null = js.native
}
