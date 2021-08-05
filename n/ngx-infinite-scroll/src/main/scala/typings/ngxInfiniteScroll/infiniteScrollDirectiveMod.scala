package typings.ngxInfiniteScroll

import typings.angularCore.mod.AfterViewInit
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.SimpleChanges
import typings.ngxInfiniteScroll.modelsMod.IInfiniteScrollAction
import typings.ngxInfiniteScroll.modelsMod.IInfiniteScrollEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteScrollDirectiveMod {
  
  @JSImport("ngx-infinite-scroll/src/modules/infinite-scroll.directive", "InfiniteScrollDirective")
  @js.native
  class InfiniteScrollDirective protected ()
    extends StObject
       with OnDestroy
       with OnChanges
       with AfterViewInit {
    def this(element: ElementRef[js.Any], zone: NgZone) = this()
    
    var alwaysCallback: Boolean = js.native
    
    def destroyScroller(): Unit = js.native
    
    /* private */ var disposeScroller: js.Any = js.native
    
    /* private */ var element: js.Any = js.native
    
    var fromRoot: Boolean = js.native
    
    def handleOnScroll(hasTypePayload: IInfiniteScrollAction): Unit = js.native
    
    var horizontal: Boolean = js.native
    
    var immediateCheck: Boolean = js.native
    
    var infiniteScrollContainer: js.Any = js.native
    
    var infiniteScrollDisabled: Boolean = js.native
    
    var infiniteScrollDistance: Double = js.native
    
    var infiniteScrollThrottle: Double = js.native
    
    var infiniteScrollUpDistance: Double = js.native
    
    /**
      * A callback method that is invoked immediately after
      * Angular has completed initialization of a component's view.
      * It is invoked only once when the view is instantiated.
      *
      */
    /* CompleteClass */
    override def ngAfterViewInit(): Unit = js.native
    
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked data-bound properties
      * if at least one has changed, and before the view and content
      * children are checked.
      * @param changes The changed properties.
      */
    /* CompleteClass */
    override def ngOnChanges(changes: SimpleChanges): Unit = js.native
    
    /**
      * A callback method that performs custom clean-up, invoked immediately
      * before a directive, pipe, or service instance is destroyed.
      */
    /* CompleteClass */
    override def ngOnDestroy(): Unit = js.native
    
    var scrollWindow: Boolean = js.native
    
    var scrolled: EventEmitter[IInfiniteScrollEvent] = js.native
    
    var scrolledUp: EventEmitter[IInfiniteScrollEvent] = js.native
    
    def setup(): Unit = js.native
    
    /* private */ var zone: js.Any = js.native
  }
}
