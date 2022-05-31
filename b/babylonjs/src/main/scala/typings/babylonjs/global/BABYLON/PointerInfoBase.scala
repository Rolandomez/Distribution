package typings.babylonjs.global.BABYLON

import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PointerInfoBase")
@js.native
class PointerInfoBase protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PointerInfoBase {
  def this(
    /**
    * Defines the type of event (PointerEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: MouseWheelEvent
  ) = this()
  /**
    * Instantiates the base class of pointers info.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    */
  def this(
    /**
    * Defines the type of event (PointerEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: PointerEvent
  ) = this()
  
  /**
    * Defines the related dom event
    */
  /* CompleteClass */
  var event: PointerEvent | MouseWheelEvent = js.native
  
  /**
    * Defines the type of event (PointerEventTypes)
    */
  /* CompleteClass */
  var `type`: Double = js.native
}
