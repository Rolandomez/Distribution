package typings.wixUiCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverUtilsGetArrowShiftMod {
  
  @JSImport("wix-ui-core/src/components/popover/utils/getArrowShift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getArrowShift(shift: Double, direction: String): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrowShift")(shift.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
}
