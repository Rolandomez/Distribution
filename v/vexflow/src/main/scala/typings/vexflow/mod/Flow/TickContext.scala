package typings.vexflow.mod.Flow

import typings.vexflow.Vex.Flow.Tickable
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.ExtraLeft
import typings.vexflow.anon.ExtraRightPx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.TickContext")
@js.native
open class TickContext ()
  extends StObject
     with typings.vexflow.Vex.Flow.TickContext {
  
  /* CompleteClass */
  override def addTickable(tickable: Tickable): typings.vexflow.Vex.Flow.TickContext = js.native
  
  /* CompleteClass */
  override def getCenterAlignedTickables(): js.Array[Tickable] = js.native
  
  /* CompleteClass */
  override def getContext(): IRenderContext = js.native
  
  /* CompleteClass */
  override def getCurrentTick(): typings.vexflow.Vex.Flow.Fraction = js.native
  
  /* CompleteClass */
  override def getExtraPx(): ExtraLeft = js.native
  
  /* CompleteClass */
  override def getMaxTicks(): Double = js.native
  
  /* CompleteClass */
  override def getMetrics(): ExtraRightPx = js.native
  
  /* CompleteClass */
  override def getMinTicks(): Double = js.native
  
  /* CompleteClass */
  override def getPixelsUsed(): Double = js.native
  
  /* CompleteClass */
  override def getTickables(): js.Array[Tickable] = js.native
  
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
  /* CompleteClass */
  override def getX(): Double = js.native
  
  /* CompleteClass */
  override def getXBase(): Double = js.native
  
  /* CompleteClass */
  override def getXOffset(): Double = js.native
  
  /* CompleteClass */
  override def postFormat(): typings.vexflow.Vex.Flow.TickContext = js.native
  
  /* CompleteClass */
  override def preFormat(): typings.vexflow.Vex.Flow.TickContext = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): Unit = js.native
  
  /* CompleteClass */
  override def setCurrentTick(tick: typings.vexflow.Vex.Flow.Fraction): Unit = js.native
  
  /* CompleteClass */
  override def setPadding(padding: Double): typings.vexflow.Vex.Flow.TickContext = js.native
  
  /* CompleteClass */
  override def setPixelsUsed(pixelsUsed: Double): typings.vexflow.Vex.Flow.TickContext = js.native
  
  /* CompleteClass */
  override def setX(x: Double): typings.vexflow.Vex.Flow.TickContext = js.native
  
  /* CompleteClass */
  override def setXBase(xBase: Double): Unit = js.native
  
  /* CompleteClass */
  override def setXOffset(xOffset: Double): Unit = js.native
  
  /* CompleteClass */
  override def shouldIgnoreTicks(): Boolean = js.native
}
object TickContext {
  
  @JSImport("vexflow", "Flow.TickContext")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getNextContext(tContext: typings.vexflow.Vex.Flow.TickContext): typings.vexflow.Vex.Flow.TickContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextContext")(tContext.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.TickContext]
}
