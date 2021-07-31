package typings.gsap.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gsap.gsap.Timeline because Already inherited */ @js.native
trait TimelineLite
  extends StObject
     with SimpleTimeline {
  
  /** Adds a label to the timeline, making it easy to mark important positions/times. */
  def addLabel(label: String, position: js.Any): TimelineLite = js.native
  
  /** Inserts a special callback that pauses playback of the timeline at a particular time or label. */
  def addPause(): TimelineLite = js.native
  def addPause(position: js.Any): TimelineLite = js.native
  def addPause(position: js.Any, callback: js.Function1[/* repeated */ js.Any, Unit]): TimelineLite = js.native
  def addPause(position: js.Any, callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any]): TimelineLite = js.native
  def addPause(
    position: js.Any,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[js.Any],
    scope: js.Any
  ): TimelineLite = js.native
  def addPause(position: js.Any, callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Any): TimelineLite = js.native
  def addPause(position: js.Any, callback: Unit, params: js.Array[js.Any]): TimelineLite = js.native
  def addPause(position: js.Any, callback: Unit, params: js.Array[js.Any], scope: js.Any): TimelineLite = js.native
  def addPause(position: js.Any, callback: Unit, params: Unit, scope: js.Any): TimelineLite = js.native
  def addPause(position: Unit, callback: js.Function1[/* repeated */ js.Any, Unit]): TimelineLite = js.native
  def addPause(position: Unit, callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any]): TimelineLite = js.native
  def addPause(
    position: Unit,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[js.Any],
    scope: js.Any
  ): TimelineLite = js.native
  def addPause(position: Unit, callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Any): TimelineLite = js.native
  def addPause(position: Unit, callback: Unit, params: js.Array[js.Any]): TimelineLite = js.native
  def addPause(position: Unit, callback: Unit, params: js.Array[js.Any], scope: js.Any): TimelineLite = js.native
  def addPause(position: Unit, callback: Unit, params: Unit, scope: js.Any): TimelineLite = js.native
  
  /**
    * Adds a callback to the end of the timeline (or elsewhere using the "position" parameter) - this is a convenience method that accomplishes exactly the same thing as
    * add( TweenLite.delayedCall(...) ) but with less code.
    */
  def call(callback: js.Function1[/* repeated */ js.Any, Unit]): TimelineLite = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any]): TimelineLite = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any], scope: js.Any): TimelineLite = js.native
  def call(
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[js.Any],
    scope: js.Any,
    position: js.Any
  ): TimelineLite = js.native
  def call(
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[js.Any],
    scope: Unit,
    position: js.Any
  ): TimelineLite = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Any): TimelineLite = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Any, position: js.Any): TimelineLite = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: Unit, position: js.Any): TimelineLite = js.native
  
  /** Empties the timeline of all tweens, timelines, and callbacks (and optionally labels too). */
  def clear(): TimelineLite = js.native
  def clear(labels: Boolean): TimelineLite = js.native
  
  /** Returns the time at which the animation will finish according to the parent timeline's local time. */
  def endTime(): Double = js.native
  def endTime(includeRepeats: Boolean): Double = js.native
  
  /**
    * Adds a TweenLite.from() tween to the end of the timeline (or elsewhere using the "position" parameter) - this is a convenience method that accomplishes exactly the same thing as
    * add( TweenLite.from(...) ) but with less code.
    */
  def from(target: js.Object, duration: Double, vars: js.Object): TimelineLite = js.native
  def from(target: js.Object, duration: Double, vars: js.Object, position: js.Any): TimelineLite = js.native
  
  /** Adds a TweenLite.fromTo() tween to the end of the timeline - this is a convenience method that accomplishes exactly the same thing as add( TweenLite.fromTo(...) ) but with less code. */
  def fromTo(target: js.Object, duration: Double, fromVars: js.Object, toVars: js.Object): TimelineLite = js.native
  def fromTo(target: js.Object, duration: Double, fromVars: js.Object, toVars: js.Object, position: js.Any): TimelineLite = js.native
  
  /** Returns an array containing all the tweens and/or timelines nested in this timeline. */
  def getChildren(): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Boolean): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Boolean, tweens: Boolean): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Boolean, tweens: Boolean, timelines: Boolean): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Boolean, tweens: Boolean, timelines: Boolean, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Boolean, tweens: Boolean, timelines: Unit, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Boolean, tweens: Unit, timelines: Boolean): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Boolean, tweens: Unit, timelines: Boolean, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Boolean, tweens: Unit, timelines: Unit, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Unit, tweens: Boolean): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Unit, tweens: Boolean, timelines: Boolean): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Unit, tweens: Boolean, timelines: Boolean, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Unit, tweens: Boolean, timelines: Unit, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Unit, tweens: Unit, timelines: Boolean): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Unit, tweens: Unit, timelines: Boolean, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
  def getChildren(nested: Unit, tweens: Unit, timelines: Unit, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
  
  /** Returns the time associated with a particular label. */
  def getLabelTime(label: String): Double = js.native
  
  /** Returns the tweens of a particular object that are inside this timeline. */
  def getTweensOf(target: js.Object): js.Array[Tween] = js.native
  def getTweensOf(target: js.Object, nested: Boolean): js.Array[Tween] = js.native
  
  /** Returns the most recently added child tween/timeline/callback regardless of its position in the timeline. */
  def recent(): Animation = js.native
  
  /** Removes a tween, timeline, callback, or label (or array of them) from the timeline. */
  def remove(value: js.Any): TimelineLite = js.native
  
  /** Removes a label from the timeline and returns the time of that label. */
  def removeLabel(label: String): js.Any = js.native
  
  /** Jumps to a specific time (or label) without affecting whether or not the instance is paused or reversed. */
  def seek(position: String): TimelineLite = js.native
  def seek(position: String, supressEvents: Boolean): TimelineLite = js.native
  def seek(position: Double): TimelineLite = js.native
  def seek(position: Double, supressEvents: Boolean): TimelineLite = js.native
  
  /**
    * Adds a zero-duration tween to the end of the timeline (or elsewhere using the "position" parameter) that sets values immediately (when the virtual playhead reaches that
    * position on the timeline) - this is a convenience method that accomplishes exactly the same thing as add( TweenLite.to(target, 0, {...}) ) but with less code.
    */
  def set(target: js.Object, vars: js.Object): TimelineLite = js.native
  def set(target: js.Object, vars: js.Object, position: js.Any): TimelineLite = js.native
  
  /** Shifts the startTime of the timeline's children by a certain amount and optionally adjusts labels too. */
  def shiftChildren(amount: Double): TimelineLite = js.native
  def shiftChildren(amount: Double, adjustLabels: Boolean): TimelineLite = js.native
  def shiftChildren(amount: Double, adjustLabels: Boolean, ignoreBeforeTime: Double): TimelineLite = js.native
  def shiftChildren(amount: Double, adjustLabels: Unit, ignoreBeforeTime: Double): TimelineLite = js.native
  
  /**
    * Tweens an array of targets from a common set of destination values (using the current values as the destination), but staggers their start times by a specified amount of time,
    * creating an evenly-spaced sequence with a surprisingly small amount of code.
    */
  def staggerFrom(targets: js.Any, duration: Double, vars: js.Object): TimelineLite = js.native
  def staggerFrom(targets: js.Any, duration: Double, vars: js.Object, stagger: Double): TimelineLite = js.native
  def staggerFrom(targets: js.Any, duration: Double, vars: js.Object, stagger: Double, position: js.Any): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(targets: js.Any, duration: Double, vars: js.Object, stagger: Unit, position: js.Any): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteScope: js.Any
  ): TimelineLite = js.native
  
  /**
    * Tweens an array of targets from and to a common set of values, but staggers their start times by a specified amount of time, creating an evenly-spaced sequence with a surprisingly
    * small amount of code.
    */
  def staggerFromTo(targets: js.Any, duration: Double, fromVars: js.Object, toVars: js.Object): TimelineLite = js.native
  def staggerFromTo(targets: js.Any, duration: Double, fromVars: js.Object, toVars: js.Object, stagger: Double): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Unit,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  
  /**
    * Tweens an array of targets to a common set of destination values, but staggers their start times by a specified amount of time, creating an evenly-spaced sequence with a surprisingly
    * small amount of code.
    */
  def staggerTo(targets: js.Any, duration: Double, vars: js.Object, stagger: Double): TimelineLite = js.native
  def staggerTo(targets: js.Any, duration: Double, vars: js.Object, stagger: Double, position: js.Any): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: js.Any,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    position: Unit,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): TimelineLite = js.native
  
  /**
    * Adds a TweenLite.to() tween to the end of the timeline (or elsewhere using the "position" parameter) - this is a convenience method that accomplishes exactly the same thing as
    * add( TweenLite.to(...) ) but with less code.
    */
  def to(target: js.Object, duration: Double, vars: js.Object): TimelineLite = js.native
  def to(target: js.Object, duration: Double, vars: js.Object, position: js.Any): TimelineLite = js.native
  
  /** If true, the timeline's timing mode is frames-based instead of seconds. */
  def useFrames(): Boolean = js.native
  
  def usesFrames(): Boolean = js.native
}
