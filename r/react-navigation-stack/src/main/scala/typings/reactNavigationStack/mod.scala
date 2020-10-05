package typings.reactNavigationStack

import typings.react.mod.Context
import typings.react.mod.NamedExoticComponent
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNavigation.mod.CreateNavigatorConfig
import typings.reactNavigation.mod.NavigationNavigator
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigation.mod.NavigationStackRouterConfig
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.anon.ClosingRouteKeys
import typings.reactNavigationStack.anon.Descriptors
import typings.reactNavigationStack.anon.ReadonlyProps
import typings.reactNavigationStack.anon.ReadonlyState
import typings.reactNavigationStack.headerBackButtonMod.Props
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderProps
import typings.reactNavigationStack.vendorTypesMod.StackNavigationConfig
import typings.reactNavigationStack.vendorTypesMod.StackNavigationOptions
import typings.reactNavigationStack.vendorTypesMod.StackNavigationProp
import typings.reactNavigationStack.vendorTypesMod.TransitionPreset
import typings.reactNavigationStack.vendorTypesMod.TransitionSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-navigation-stack", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class StackView ()
    extends typings.reactNavigationStack.vendorMod.StackView
  
  val Assets: js.Array[js.Any] = js.native
  val CardAnimationContext: Context[js.UndefOr[StackCardInterpolationProps]] = js.native
  val GestureHandlerRefContext: Context[Ref[PanGestureHandler]] = js.native
  val Header: NamedExoticComponent[StackHeaderProps] = js.native
  val HeaderHeightContext: Context[js.UndefOr[Double]] = js.native
  def HeaderBackButton(
    hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressPressColorAndroidScreenLayoutTintColorTitleLayoutTruncatedLabelAccessibilityLabel: Props
  ): Element = js.native
  def HeaderBackground(hasStyleRest: typings.reactNavigationStack.headerBackgroundMod.Props): Element = js.native
  def HeaderTitle(hasTintColorStyleRest: typings.reactNavigationStack.headerTitleMod.Props): Element = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ): NavigationNavigator[_, NavigationProp[NavigationState]] = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ],
    stackConfig: CreateNavigatorConfig[
      StackNavigationConfig, 
      NavigationStackRouterConfig, 
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ): NavigationNavigator[_, NavigationProp[NavigationState]] = js.native
  def useCardAnimation(): StackCardInterpolationProps = js.native
  def useGestureHandlerRef(): Ref[PanGestureHandler] = js.native
  def useHeaderHeight(): Double = js.native
  @js.native
  object CardStyleInterpolators extends js.Object {
    def forFadeFromBottomAndroid(hasCurrentInvertedLayoutsClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forHorizontalIOS(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forModalPresentationIOS(hasIndexCurrentNextInvertedLayoutsInsets: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forNoAnimation(): StackCardInterpolatedStyle = js.native
    def forRevealFromBottomAndroid(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forScaleFromCenterAndroid(hasCurrentNextClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forVerticalIOS(hasCurrentInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  }
  
  @js.native
  object HeaderStyleInterpolators extends js.Object {
    def forFade(hasCurrentNext: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forNoAnimation(): StackHeaderInterpolatedStyle = js.native
    def forSlideLeft(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forSlideRight(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forSlideUp(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forUIKit(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
  }
  
  /* static members */
  @js.native
  object StackView extends js.Object {
    def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | Descriptors = js.native
  }
  
  @js.native
  object TransitionPresets extends js.Object {
    val DefaultTransition: TransitionPreset = js.native
    val FadeFromBottomAndroid: TransitionPreset = js.native
    val ModalPresentationIOS: TransitionPreset = js.native
    val ModalSlideFromBottomIOS: TransitionPreset = js.native
    val ModalTransition: TransitionPreset = js.native
    val RevealFromBottomAndroid: TransitionPreset = js.native
    val ScaleFromCenterAndroid: TransitionPreset = js.native
    val SlideFromRightIOS: TransitionPreset = js.native
  }
  
  @js.native
  object TransitionSpecs extends js.Object {
    val FadeInFromBottomAndroidSpec: TransitionSpec = js.native
    val FadeOutToBottomAndroidSpec: TransitionSpec = js.native
    val RevealFromBottomAndroidSpec: TransitionSpec = js.native
    val ScaleFromCenterAndroidSpec: TransitionSpec = js.native
    val TransitionIOSSpec: TransitionSpec = js.native
  }
  
}

