package typings.logkitty0luekPG6

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsDTsMod {
  
  @JSImport(".logkitty-0luekPG6/build/errors.d.ts", "CodeError")
  @js.native
  open class CodeError protected ()
    extends StObject
       with Error {
    def this(code: String) = this()
    def this(code: String, message: String) = this()
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport(".logkitty-0luekPG6/build/errors.d.ts", "ERR_ANDROID_CANNOT_CLEAN_LOGCAT_BUFFER")
  @js.native
  val ERR_ANDROID_CANNOT_CLEAN_LOGCAT_BUFFER: /* "ERR_ANDROID_CANNOT_CLEAN_LOGCAT_BUFFER" */ String = js.native
  
  @JSImport(".logkitty-0luekPG6/build/errors.d.ts", "ERR_ANDROID_CANNOT_GET_APP_PID")
  @js.native
  val ERR_ANDROID_CANNOT_GET_APP_PID: /* "ERR_ANDROID_CANNOT_GET_APP_PID" */ String = js.native
  
  @JSImport(".logkitty-0luekPG6/build/errors.d.ts", "ERR_ANDROID_CANNOT_START_LOGCAT")
  @js.native
  val ERR_ANDROID_CANNOT_START_LOGCAT: /* "ERR_ANDROID_CANNOT_START_LOGCAT" */ String = js.native
  
  @JSImport(".logkitty-0luekPG6/build/errors.d.ts", "ERR_ANDROID_UNPROCESSABLE_PID")
  @js.native
  val ERR_ANDROID_UNPROCESSABLE_PID: /* "ERR_ANDROID_UNPROCESSABLE_PID" */ String = js.native
  
  @JSImport(".logkitty-0luekPG6/build/errors.d.ts", "ERR_IOS_CANNOT_LIST_SIMULATORS")
  @js.native
  val ERR_IOS_CANNOT_LIST_SIMULATORS: /* "ERR_IOS_CANNOT_LIST_SIMULATORS" */ String = js.native
  
  @JSImport(".logkitty-0luekPG6/build/errors.d.ts", "ERR_IOS_CANNOT_START_SYSLOG")
  @js.native
  val ERR_IOS_CANNOT_START_SYSLOG: /* "ERR_IOS_CANNOT_START_SYSLOG" */ String = js.native
  
  @JSImport(".logkitty-0luekPG6/build/errors.d.ts", "ERR_IOS_NO_SIMULATORS_BOOTED")
  @js.native
  val ERR_IOS_NO_SIMULATORS_BOOTED: /* "ERR_IOS_NO_SIMULATORS_BOOTED" */ String = js.native
}
