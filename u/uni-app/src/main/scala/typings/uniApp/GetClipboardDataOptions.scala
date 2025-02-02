package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClipboardDataOptions extends StObject {
  
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ GetClipboardDataSuccessRes, Unit]] = js.undefined
}
object GetClipboardDataOptions {
  
  inline def apply(): GetClipboardDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClipboardDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClipboardDataOptions] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* result */ GetClipboardDataSuccessRes => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
