package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMaxTransceiveLengthOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetMaxTransceiveLengthCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetMaxTransceiveLengthFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetMaxTransceiveLengthSuccessCallback] = js.undefined
}
object GetMaxTransceiveLengthOption {
  
  inline def apply(): GetMaxTransceiveLengthOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMaxTransceiveLengthOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMaxTransceiveLengthOption] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* res */ Nfcrwerror => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ Nfcrwerror => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* result */ GetMaxTransceiveLengthSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
