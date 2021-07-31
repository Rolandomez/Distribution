package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TimeLimiter limits the number of items handled by a {@link PIXI.BasePrepare} to a specified
  * number of milliseconds per frame.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "TimeLimiter")
@js.native
class TimeLimiter protected ()
  extends StObject
     with typings.pixiJs.PIXI.TimeLimiter {
  def this(maxMilliseconds: Double) = this()
  
  /**
    * Checks to see if another item can be uploaded. This should only be called once per item.
    * @return {boolean} If the item is allowed to be uploaded.
    */
  /* CompleteClass */
  override def allowedToUpload(): Boolean = js.native
  
  /**
    * Resets any counting properties to start fresh on a new frame.
    */
  /* CompleteClass */
  override def beginFrame(): Unit = js.native
}
