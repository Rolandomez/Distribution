package typings.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.DoCheck
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.KeyValueDiffers
import typings.angularCore.mod.Renderer2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgStyle")
@js.native
class NgStyle protected ()
  extends StObject
     with DoCheck {
  def this(_ngEl: ElementRef[js.Any], _differs: KeyValueDiffers, _renderer: Renderer2) = this()
  
  var _applyChanges: js.Any = js.native
  
  var _differ: js.Any = js.native
  
  var _differs: js.Any = js.native
  
  var _ngEl: js.Any = js.native
  
  var _ngStyle: js.Any = js.native
  
  var _renderer: js.Any = js.native
  
  var _setStyle: js.Any = js.native
  
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): Unit = js.native
  
  def ngStyle_=(values: StringDictionary[js.Any] | Null): Unit = js.native
}
