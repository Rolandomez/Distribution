package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.AnimationStateListener
import typings.pixiSpine.PIXI.spine.core.Timeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.AnimationState")
@js.native
class AnimationState protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.AnimationState {
  def this(data: typings.pixiSpine.PIXI.spine.core.AnimationStateData) = this()
  
  /* CompleteClass */
  override def _animationsChanged(): Unit = js.native
  
  /* CompleteClass */
  override def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  
  /* CompleteClass */
  override def addAnimationByName(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): Unit = js.native
  
  /* CompleteClass */
  override def addAnimationWith(
    trackIndex: Double,
    animation: typings.pixiSpine.PIXI.spine.core.Animation,
    loop: Boolean,
    delay: Double
  ): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  
  /* CompleteClass */
  override def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  
  /* CompleteClass */
  override def addListener(listener: AnimationStateListener): Unit = js.native
  
  /* CompleteClass */
  var animationsChanged: Boolean = js.native
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton): Boolean = js.native
  
  /* CompleteClass */
  override def applyAttachmentTimeline(
    timeline: typings.pixiSpine.PIXI.spine.core.AttachmentTimeline,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    time: Double,
    blend: typings.pixiSpine.PIXI.spine.core.MixBlend,
    attachments: Boolean
  ): Unit = js.native
  
  /* CompleteClass */
  override def applyMixingFrom(
    to: typings.pixiSpine.PIXI.spine.core.TrackEntry,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    blend: typings.pixiSpine.PIXI.spine.core.MixBlend
  ): Double = js.native
  
  /* CompleteClass */
  override def applyRotateTimeline(
    timeline: Timeline,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    time: Double,
    alpha: Double,
    blend: typings.pixiSpine.PIXI.spine.core.MixBlend,
    timelinesRotation: js.Array[Double],
    i: Double,
    firstFrame: Boolean
  ): Unit = js.native
  
  /* CompleteClass */
  override def clearListenerNotifications(): Unit = js.native
  
  /* CompleteClass */
  override def clearListeners(): Unit = js.native
  
  /* CompleteClass */
  override def clearTrack(trackIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def clearTracks(): Unit = js.native
  
  /* CompleteClass */
  override def computeHold(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  var data: typings.pixiSpine.PIXI.spine.core.AnimationStateData = js.native
  
  /* CompleteClass */
  override def disposeNext(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  var events: js.Array[typings.pixiSpine.PIXI.spine.core.Event] = js.native
  
  /* CompleteClass */
  override def expandToIndex(index: Double): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  
  /* CompleteClass */
  override def getCurrent(trackIndex: Double): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  
  /* CompleteClass */
  override def hasAnimation(animationName: String): Boolean = js.native
  
  /* CompleteClass */
  override def hasAnimationByName(animationName: String): Boolean = js.native
  
  /* CompleteClass */
  var listeners: js.Array[AnimationStateListener] = js.native
  
  /* CompleteClass */
  override def onComplete(trackIndex: Double, loopCount: Double): js.Any = js.native
  
  /* CompleteClass */
  override def onEnd(trackIndex: Double): js.Any = js.native
  
  /* CompleteClass */
  override def onEvent(trackIndex: Double, event: typings.pixiSpine.PIXI.spine.core.Event): js.Any = js.native
  
  /* CompleteClass */
  override def onStart(trackIndex: Double): js.Any = js.native
  
  /* CompleteClass */
  var propertyIDs: typings.pixiSpine.PIXI.spine.core.IntSet = js.native
  
  /* CompleteClass */
  var queue: typings.pixiSpine.PIXI.spine.core.EventQueue = js.native
  
  /* CompleteClass */
  override def queueEvents(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry, animationTime: Double): Unit = js.native
  
  /* CompleteClass */
  override def removeListener(listener: AnimationStateListener): Unit = js.native
  
  /* CompleteClass */
  override def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  
  /* CompleteClass */
  override def setAnimationByName(trackIndex: Double, animationName: String, loop: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setAnimationWith(trackIndex: Double, animation: typings.pixiSpine.PIXI.spine.core.Animation, loop: Boolean): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  
  /* CompleteClass */
  override def setAttachment(
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    slot: typings.pixiSpine.PIXI.spine.core.Slot,
    attachmentName: String,
    attachments: Boolean
  ): Unit = js.native
  
  /* CompleteClass */
  override def setCurrent(index: Double, current: typings.pixiSpine.PIXI.spine.core.TrackEntry, interrupt: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setEmptyAnimation(trackIndex: Double, mixDuration: Double): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  
  /* CompleteClass */
  override def setEmptyAnimations(mixDuration: Double): Unit = js.native
  
  /* CompleteClass */
  var timeScale: Double = js.native
  
  /* CompleteClass */
  override def trackEntry(
    trackIndex: Double,
    animation: typings.pixiSpine.PIXI.spine.core.Animation,
    loop: Boolean,
    last: typings.pixiSpine.PIXI.spine.core.TrackEntry
  ): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  
  /* CompleteClass */
  var trackEntryPool: typings.pixiSpine.PIXI.spine.core.Pool[typings.pixiSpine.PIXI.spine.core.TrackEntry] = js.native
  
  /* CompleteClass */
  var tracks: js.Array[typings.pixiSpine.PIXI.spine.core.TrackEntry] = js.native
  
  /* CompleteClass */
  var unkeyedState: Double = js.native
  
  /* CompleteClass */
  override def update(delta: Double): Unit = js.native
  
  /* CompleteClass */
  override def updateMixingFrom(to: typings.pixiSpine.PIXI.spine.core.TrackEntry, delta: Double): Boolean = js.native
}
object AnimationState {
  
  @JSGlobal("PIXI.spine.core.AnimationState")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationState.CURRENT")
  @js.native
  def CURRENT: Double = js.native
  inline def CURRENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURRENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationState.FIRST")
  @js.native
  def FIRST: Double = js.native
  inline def FIRST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIRST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationState.HOLD_FIRST")
  @js.native
  def HOLD_FIRST: Double = js.native
  inline def HOLD_FIRST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOLD_FIRST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationState.HOLD_MIX")
  @js.native
  def HOLD_MIX: Double = js.native
  inline def HOLD_MIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOLD_MIX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationState.HOLD_SUBSEQUENT")
  @js.native
  def HOLD_SUBSEQUENT: Double = js.native
  inline def HOLD_SUBSEQUENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOLD_SUBSEQUENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationState.SETUP")
  @js.native
  def SETUP: Double = js.native
  inline def SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SETUP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationState.SUBSEQUENT")
  @js.native
  def SUBSEQUENT: Double = js.native
  inline def SUBSEQUENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBSEQUENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationState.deprecatedWarning1")
  @js.native
  def deprecatedWarning1: js.Any = js.native
  inline def deprecatedWarning1_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationState.deprecatedWarning2")
  @js.native
  def deprecatedWarning2: js.Any = js.native
  inline def deprecatedWarning2_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning2")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationState.deprecatedWarning3")
  @js.native
  def deprecatedWarning3: js.Any = js.native
  inline def deprecatedWarning3_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning3")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationState.emptyAnimation")
  @js.native
  def emptyAnimation: typings.pixiSpine.PIXI.spine.core.Animation = js.native
  inline def emptyAnimation_=(x: typings.pixiSpine.PIXI.spine.core.Animation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyAnimation")(x.asInstanceOf[js.Any])
}
