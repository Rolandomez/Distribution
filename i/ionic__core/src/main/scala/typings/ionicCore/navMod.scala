package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.NavOutlet
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.mod.ViewController
import typings.ionicCore.navInterfaceMod.NavComponent
import typings.ionicCore.navInterfaceMod.NavComponentWithProps
import typings.ionicCore.navInterfaceMod.NavOptions
import typings.ionicCore.navInterfaceMod.TransitionDoneFn
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navMod {
  
  @JSImport("@ionic/core/dist/types/components/nav/nav", "Nav")
  @js.native
  class Nav ()
    extends StObject
       with NavOutlet {
    
    /**
      * If `true`, the nav should animate the transition of components.
      */
    var animated: Boolean = js.native
    
    /**
      * By default `ion-nav` animates transition between pages based in the mode (ios or material design).
      * However, this property allows to create custom transition using `AnimateBuilder` functions.
      */
    var animation: js.UndefOr[AnimationBuilder] = js.native
    
    /* private */ var animationEnabled: js.Any = js.native
    
    /**
      * Returns `true` if the current view can go back.
      *
      * @param view The view to check.
      */
    def canGoBack(): js.Promise[Boolean] = js.native
    def canGoBack(view: ViewController): js.Promise[Boolean] = js.native
    
    /* private */ var canGoBackSync: js.Any = js.native
    
    /* private */ var canStart: js.Any = js.native
    
    /**
      * DOM WRITE
      */
    /* private */ var cleanup: js.Any = js.native
    
    def componentDidLoad(): js.Promise[Unit] = js.native
    
    def componentWillLoad(): Unit = js.native
    
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    
    /* private */ var destroyView: js.Any = js.native
    
    /* private */ var destroyed: js.Any = js.native
    
    def disconnectedCallback(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var failed: js.Any = js.native
    
    /* private */ var fireError: js.Any = js.native
    
    /* private */ var gesture: js.Any = js.native
    
    /**
      * Get the active view.
      */
    def getActive(): js.Promise[js.UndefOr[ViewController]] = js.native
    
    /* private */ var getActiveSync: js.Any = js.native
    
    /**
      * Get the view at the specified index.
      *
      * @param index The index of the view.
      */
    def getByIndex(index: Double): js.Promise[js.UndefOr[ViewController]] = js.native
    
    /* private */ var getEnteringView: js.Any = js.native
    
    def getLength(): Double = js.native
    
    /**
      * Get the previous view.
      *
      * @param view The view to get.
      */
    def getPrevious(): js.Promise[js.UndefOr[ViewController]] = js.native
    def getPrevious(view: ViewController): js.Promise[js.UndefOr[ViewController]] = js.native
    
    /* private */ var getPreviousSync: js.Any = js.native
    
    def insert(insertIndex: Double): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: String,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: String,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: ComponentProps[String]): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: String,
      componentProps: ComponentProps[String],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: String,
      componentProps: ComponentProps[String],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: String, componentProps: ComponentProps[String], opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: String,
      componentProps: ComponentProps[String],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    /**
      * Inserts a component into the navigation stack at the specified index.
      * This is useful to add a component at any point in the navigation stack.
      *
      * @param insertIndex The index to insert the component at in the stack.
      * @param component The component to insert into the navigation stack.
      * @param componentProps Any properties of the component.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def insert(insertIndex: Double, component: js.Function): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Null,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Null,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: js.Function, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Unit,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Unit,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: js.Function, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: js.Function, componentProps: ComponentProps[js.Function]): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: Null,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: Null,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: ComponentProps[Null]): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: Null,
      componentProps: ComponentProps[Null],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: Null,
      componentProps: ComponentProps[Null],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: Null, componentProps: ComponentProps[Null], opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: Null,
      componentProps: ComponentProps[Null],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: typings.ionicCore.viewControllerMod.ViewController): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController]
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: HTMLElement): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Null,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Null,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: HTMLElement, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Unit,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Unit,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: HTMLElement, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(insertIndex: Double, component: HTMLElement, componentProps: ComponentProps[HTMLElement]): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insert(
      insertIndex: Double,
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    
    /**
      * Inserts an array of components into the navigation stack at the specified index.
      * The last component in the array will become instantiated as a view, and animate
      * in to become the active view.
      *
      * @param insertIndex The index to insert the components at in the stack.
      * @param insertComponents The components to insert into the navigation stack.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def insertPages(insertIndex: Double, insertComponents: js.Array[NavComponent | NavComponentWithProps[js.Any]]): js.Promise[Boolean] = js.native
    def insertPages(
      insertIndex: Double,
      insertComponents: js.Array[NavComponent | NavComponentWithProps[js.Any]],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insertPages(
      insertIndex: Double,
      insertComponents: js.Array[NavComponent | NavComponentWithProps[js.Any]],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def insertPages(
      insertIndex: Double,
      insertComponents: js.Array[NavComponent | NavComponentWithProps[js.Any]],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def insertPages(
      insertIndex: Double,
      insertComponents: js.Array[NavComponent | NavComponentWithProps[js.Any]],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    
    /* private */ var insertViewAt: js.Any = js.native
    
    /**
      * Event fired when the nav has changed components
      */
    var ionNavDidChange: EventEmitter[Unit] = js.native
    
    /**
      * Event fired when the nav will change components
      */
    var ionNavWillChange: EventEmitter[Unit] = js.native
    
    /**
      * Event fired when Nav will load a component
      * @internal
      */
    var ionNavWillLoad: EventEmitter[Unit] = js.native
    
    /* private */ var isTransitioning: js.Any = js.native
    
    /* private */ var nextTrns: js.Any = js.native
    
    /* private */ var onEnd: js.Any = js.native
    
    /* private */ var onMove: js.Any = js.native
    
    /* private */ var onStart: js.Any = js.native
    
    /**
      * Pop a component off of the navigation stack. Navigates back from the current
      * component.
      *
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def pop(): js.Promise[Boolean] = js.native
    def pop(opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def pop(opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def pop(opts: NavOptions): js.Promise[Boolean] = js.native
    def pop(opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    
    /**
      * Pop to a specific index in the navigation stack.
      *
      * @param indexOrViewCtrl The index or view controller to pop to.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def popTo(indexOrViewCtrl: Double): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: Double, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: Double, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: Double, opts: NavOptions): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: Double, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: ViewController): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: ViewController, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: ViewController, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: ViewController, opts: NavOptions): js.Promise[Boolean] = js.native
    def popTo(indexOrViewCtrl: ViewController, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    
    /**
      * Navigate back to the root of the stack, no matter how far back that is.
      *
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def popToRoot(): js.Promise[Boolean] = js.native
    def popToRoot(opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popToRoot(opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def popToRoot(opts: NavOptions): js.Promise[Boolean] = js.native
    def popToRoot(opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    
    /* private */ var postViewInit: js.Any = js.native
    
    /* private */ var prepareTI: js.Any = js.native
    
    def push(): js.Promise[Boolean] = js.native
    def push(component: String): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: ComponentProps[String]): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: ComponentProps[String], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: ComponentProps[String], opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: String, componentProps: ComponentProps[String], opts: NavOptions): js.Promise[Boolean] = js.native
    def push(
      component: String,
      componentProps: ComponentProps[String],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    /**
      * Push a new component onto the current navigation stack. Pass any additional
      * information along as an object. This additional information is accessible
      * through NavParams.
      *
      * @param component The component to push onto the navigation stack.
      * @param componentProps Any properties of the component.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def push(component: js.Function): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: ComponentProps[js.Function]): js.Promise[Boolean] = js.native
    def push(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(component: js.Function, componentProps: ComponentProps[js.Function], opts: NavOptions): js.Promise[Boolean] = js.native
    def push(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: ComponentProps[Null]): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: ComponentProps[Null], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: ComponentProps[Null], opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: ComponentProps[Null], opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: Null, componentProps: ComponentProps[Null], opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: typings.ionicCore.viewControllerMod.ViewController): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController]
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def push(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(component: HTMLElement): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: ComponentProps[HTMLElement]): js.Promise[Boolean] = js.native
    def push(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def push(component: HTMLElement, componentProps: ComponentProps[HTMLElement], opts: NavOptions): js.Promise[Boolean] = js.native
    def push(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    
    /* private */ var queueTrns: js.Any = js.native
    
    /**
      * Removes a component from the navigation stack at the specified index.
      *
      * @param startIndex The number to begin removal at.
      * @param removeCount The number of components to remove.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def removeIndex(startIndex: Double): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Double): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Double, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Double, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Double, opts: NavOptions): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Double, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def removeIndex(startIndex: Double, removeCount: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    
    /* private */ var removeView: js.Any = js.native
    
    def render(): js.Any = js.native
    
    /**
      * Root NavComponent to load
      */
    var root: js.UndefOr[NavComponent] = js.native
    
    def rootChanged(): Unit = js.native
    
    /**
      * Any parameters for the root component
      */
    var rootParams: js.UndefOr[ComponentProps[Null]] = js.native
    
    /* private */ var runTransition: js.Any = js.native
    
    /* private */ var sbAni: js.Any = js.native
    
    /**
      * Set the views of the current navigation stack and navigate to the last view.
      * By default animations are disabled, but they can be enabled by passing options
      * to the navigation controller. Navigation parameters can also be passed to the
      * individual pages in the array.
      *
      * @param views The list of views to set as the navigation stack.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def setPages(views: js.Array[NavComponent | NavComponentWithProps[js.Any]]): js.Promise[Boolean] = js.native
    def setPages(views: js.Array[NavComponent | NavComponentWithProps[js.Any]], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setPages(views: js.Array[NavComponent | NavComponentWithProps[js.Any]], opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setPages(views: js.Array[NavComponent | NavComponentWithProps[js.Any]], opts: NavOptions): js.Promise[Boolean] = js.native
    def setPages(
      views: js.Array[NavComponent | NavComponentWithProps[js.Any]],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    
    def setRoot(): js.Promise[Boolean] = js.native
    def setRoot(component: String): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: ComponentProps[String]): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: ComponentProps[String], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: ComponentProps[String], opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: String, componentProps: ComponentProps[String], opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(
      component: String,
      componentProps: ComponentProps[String],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    /**
      * Set the root for the current navigation stack to a component.
      *
      * @param component The component to set as the root of the navigation stack.
      * @param componentProps Any properties of the component.
      * @param opts The navigation options.
      * @param done The transition complete function.
      */
    def setRoot(component: js.Function): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: ComponentProps[js.Function]): js.Promise[Boolean] = js.native
    def setRoot(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(component: js.Function, componentProps: ComponentProps[js.Function], opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(
      component: js.Function,
      componentProps: ComponentProps[js.Function],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: ComponentProps[Null]): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: ComponentProps[Null], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: ComponentProps[Null], opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: ComponentProps[Null], opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: Null, componentProps: ComponentProps[Null], opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: typings.ionicCore.viewControllerMod.ViewController): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Null,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: Unit,
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController]
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: NavOptions
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: typings.ionicCore.viewControllerMod.ViewController,
      componentProps: ComponentProps[typings.ionicCore.viewControllerMod.ViewController],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Null, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Unit, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Unit, opts: Unit, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Unit, opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: Unit, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: ComponentProps[HTMLElement]): js.Promise[Boolean] = js.native
    def setRoot(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Null,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: Unit,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    def setRoot(component: HTMLElement, componentProps: ComponentProps[HTMLElement], opts: NavOptions): js.Promise[Boolean] = js.native
    def setRoot(
      component: HTMLElement,
      componentProps: ComponentProps[HTMLElement],
      opts: NavOptions,
      done: TransitionDoneFn
    ): js.Promise[Boolean] = js.native
    
    /* private */ var success: js.Any = js.native
    
    /**
      * If the nav component should allow for swipe-to-go-back.
      */
    var swipeGesture: js.UndefOr[Boolean] = js.native
    
    def swipeGestureChanged(): Unit = js.native
    
    /* private */ var transInstr: js.Any = js.native
    
    /* private */ var transition: js.Any = js.native
    
    /* private */ var transitionFinish: js.Any = js.native
    
    /* private */ var useRouter: js.Any = js.native
    
    /* private */ var views: js.Any = js.native
  }
}
