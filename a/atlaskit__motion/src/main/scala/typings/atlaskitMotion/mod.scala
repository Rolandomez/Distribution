package typings.atlaskitMotion

import typings.atlaskitMotion.anon.Mediaprefersreducedmotionreduce
import typings.atlaskitMotion.anon.RefCallbackRef
import typings.atlaskitMotion.anon.ResizingHeightOptschildre
import typings.atlaskitMotion.distTypesEnteringExitingPersistenceMod.ExitingChildContext
import typings.atlaskitMotion.distTypesEnteringExitingPersistenceMod.ExitingPersistenceProps
import typings.atlaskitMotion.distTypesEnteringFadeInMod.FadeKeyframesMotionProps
import typings.atlaskitMotion.distTypesEnteringKeyframesMotionMod.KeyframesMotionProps
import typings.atlaskitMotion.distTypesEnteringShrinkOutMod.ShrinkOutProps
import typings.atlaskitMotion.distTypesEnteringSlideInMod.SlideInProps
import typings.atlaskitMotion.distTypesEnteringStaggeredEntranceMod.StaggeredEntranceProps
import typings.atlaskitMotion.distTypesEnteringTypesMod.Direction
import typings.atlaskitMotion.distTypesEnteringTypesMod.Distance
import typings.atlaskitMotion.distTypesEnteringTypesMod.Fade
import typings.atlaskitMotion.distTypesEnteringTypesMod.Transition
import typings.atlaskitMotion.distTypesResizingHeightMod.ResizingHeightOpts
import typings.atlaskitMotion.distTypesUtilsCurvesMod.AnimationCurve
import typings.emotionSerialize.mod.CSSObject
import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __ExitingPersistence__
    *
    * Useful for enabling elements to persist and animate away when they are removed from the DOM.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion", "ExitingPersistence")
  @js.native
  val ExitingPersistence: MemoExoticComponent[js.Function1[/* param0 */ ExitingPersistenceProps, Any]] = js.native
  
  /**
    * __FadeIn__
    *
    * Useful for fading in one or more elements.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  inline def FadeIn(param0: FadeKeyframesMotionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FadeIn")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResizingHeight(param0: ResizingHeightOptschildre): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResizingHeight")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    * __ShrinkOut__
    *
    * Will shrink an element down to nothing when exiting.
    * Works best with flex children as collapsing margins can come with undesired behaviour.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  inline def ShrinkOut(param0: ShrinkOutProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ShrinkOut")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * __SlideIn__
    *
    * Will slide an element into position, generally used for things that appear from outside of the viewport into view.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  inline def SlideIn(param0: SlideInProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SlideIn")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    * For a list of elements that need to animate in,
    * this should be used in conjunction with entering components.
    * This does not need Javascript to execute so it will run immediately for any SSR rendered React apps before the JS has executed.
    *
    * Will dynamically add delay to each child entering component.
    * Unfortunately all entering components _NEED_ to be a direct descendant.
    */
  inline def StaggeredEntrance(param0: StaggeredEntranceProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StaggeredEntrance")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    * __ZoomIn__
    *
    * Will over zoom an element into position.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  inline def ZoomIn(param0: KeyframesMotionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ZoomIn")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@atlaskit/motion", "durationStep")
  @js.native
  val durationStep: /* 25 */ Double = js.native
  
  @JSImport("@atlaskit/motion", "easeIn")
  @js.native
  val easeIn: AnimationCurve = js.native
  
  @JSImport("@atlaskit/motion", "easeInOut")
  @js.native
  val easeInOut: AnimationCurve = js.native
  
  @JSImport("@atlaskit/motion", "easeOut")
  @js.native
  val easeOut: AnimationCurve = js.native
  
  inline def fadeInAnimation(): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")().asInstanceOf[CSSObject]
  inline def fadeInAnimation(direction: Unit, distance: Distance): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  inline def fadeInAnimation(direction: Direction): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  inline def fadeInAnimation(direction: Direction, distance: Distance): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  
  inline def isReducedMotion(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReducedMotion")().asInstanceOf[Boolean]
  
  @JSImport("@atlaskit/motion", "largeDurationMs")
  @js.native
  val largeDurationMs: Double = js.native
  
  @JSImport("@atlaskit/motion", "mediumDurationMs")
  @js.native
  val mediumDurationMs: Double = js.native
  
  inline def prefersReducedMotion(): Mediaprefersreducedmotionreduce = ^.asInstanceOf[js.Dynamic].applyDynamic("prefersReducedMotion")().asInstanceOf[Mediaprefersreducedmotionreduce]
  
  inline def shrinkOutAnimation(): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("shrinkOutAnimation")().asInstanceOf[CSSObject]
  
  inline def slideInAnimation(from: Direction, state: Transition, fade: Fade): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("slideInAnimation")(from.asInstanceOf[js.Any], state.asInstanceOf[js.Any], fade.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  
  @JSImport("@atlaskit/motion", "smallDurationMs")
  @js.native
  val smallDurationMs: Double = js.native
  
  inline def useExitingPersistence(): ExitingChildContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useExitingPersistence")().asInstanceOf[ExitingChildContext]
  
  inline def useIsReducedMotion(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsReducedMotion")().asInstanceOf[Boolean]
  
  inline def useResizingHeight(): RefCallbackRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizingHeight")().asInstanceOf[RefCallbackRef]
  inline def useResizingHeight(param0: ResizingHeightOpts): RefCallbackRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizingHeight")(param0.asInstanceOf[js.Any]).asInstanceOf[RefCallbackRef]
  
  inline def zoomInAnimation(): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("zoomInAnimation")().asInstanceOf[CSSObject]
}
