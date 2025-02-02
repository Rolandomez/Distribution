package typings.preact

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.preact.preactInts.`1`
import typings.preact.preactInts.`2`
import typings.preact.preactInts.`3`
import typings.std.DOMHighResTimeStamp
import typings.std.EventTarget
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[T] extends StObject {
    
    def children(value: T): ComponentChildren
  }
  object `0` {
    
    inline def apply[T](children: T => ComponentChildren): `0`[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[`0`[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`[?], T] (val x: Self & `0`[T]) extends AnyVal {
      
      inline def setChildren(value: T => ComponentChildren): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait Children extends StObject {
    
    var children: ComponentChildren
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait ChildrenComponentChildren extends StObject {
    
    var children: typings.preact.srcInternalMod.ComponentChildren
  }
  object ChildrenComponentChildren {
    
    inline def apply(): ChildrenComponentChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildrenComponentChildren]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChildrenComponentChildren] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: typings.preact.srcInternalMod.ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: typings.preact.srcInternalMod.ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait CurrentTarget[Target /* <: EventTarget */] extends StObject {
    
    val currentTarget: Target
  }
  object CurrentTarget {
    
    inline def apply[Target /* <: EventTarget */](currentTarget: Target): CurrentTarget[Target] = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentTarget[Target]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrentTarget[?], Target /* <: EventTarget */] (val x: Self & CurrentTarget[Target]) extends AnyVal {
      
      inline def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T /* <: Node */](node: T): T = js.native
    def apply[T /* <: Node */](node: T, child: Node): T = js.native
  }
  
  trait Html extends StObject {
    
    var __html: String
  }
  object Html {
    
    inline def apply(__html: String): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      inline def set__html(value: String): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref[RefType] extends StObject {
    
    var children: js.UndefOr[ComponentChildren] = js.undefined
    
    var ref: js.UndefOr[typings.preact.mod.Ref[RefType]] = js.undefined
  }
  object Ref {
    
    inline def apply[RefType](): Ref[RefType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[RefType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ref[?], RefType] (val x: Self & Ref[RefType]) extends AnyVal {
      
      inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setRef(value: typings.preact.mod.Ref[RefType]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ RefType | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<std.EventTarget, std.Event> */
  trait TargetedEventEventTargetE extends StObject {
    
    var AT_TARGET: `2`
    
    var BUBBLING_PHASE: `3`
    
    var CAPTURING_PHASE: `1`
    
    var NONE: typings.preact.preactInts.`0`
    
    var bubbles: Boolean
    
    var cancelBubble: Boolean
    
    var cancelable: Boolean
    
    var composed: Boolean
    
    def composedPath(): js.Array[EventTarget]
    @JSName("composedPath")
    var composedPath_Original: js.Function0[js.Array[EventTarget]]
    
    val currentTarget: EventTarget
    
    var defaultPrevented: Boolean
    
    var eventPhase: Double
    
    def initEvent(`type`: String): Unit
    @JSName("initEvent")
    var initEvent_Original: js.Function1[/* type */ String, Unit]
    
    var isTrusted: Boolean
    
    def preventDefault(): Unit
    @JSName("preventDefault")
    var preventDefault_Original: js.Function0[Unit]
    
    var returnValue: Boolean
    
    var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
    
    def stopImmediatePropagation(): Unit
    @JSName("stopImmediatePropagation")
    var stopImmediatePropagation_Original: js.Function0[Unit]
    
    def stopPropagation(): Unit
    @JSName("stopPropagation")
    var stopPropagation_Original: js.Function0[Unit]
    
    var target: js.UndefOr[EventTarget | Null] = js.undefined
    
    var timeStamp: DOMHighResTimeStamp
    
    var `type`: String
  }
  object TargetedEventEventTargetE {
    
    inline def apply(
      bubbles: Boolean,
      cancelBubble: Boolean,
      cancelable: Boolean,
      composed: Boolean,
      composedPath: () => js.Array[EventTarget],
      currentTarget: EventTarget,
      defaultPrevented: Boolean,
      eventPhase: Double,
      initEvent: /* type */ String => Unit,
      isTrusted: Boolean,
      preventDefault: () => Unit,
      returnValue: Boolean,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      timeStamp: DOMHighResTimeStamp,
      `type`: String
    ): TargetedEventEventTargetE = {
      val __obj = js.Dynamic.literal(AT_TARGET = 2, BUBBLING_PHASE = 3, CAPTURING_PHASE = 1, NONE = 0, bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction1(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetedEventEventTargetE]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetedEventEventTargetE] (val x: Self) extends AnyVal {
      
      inline def setAT_TARGET(value: `2`): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
      
      inline def setBUBBLING_PHASE(value: `3`): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCAPTURING_PHASE(value: `1`): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      inline def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
      
      inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: typings.preact.preactInts.`0`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
      
      inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
      
      inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeStamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value[T] extends StObject {
    
    var children: ComponentChildren
    
    var value: T
  }
  object Value {
    
    inline def apply[T](value: T): Value[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value[?], T] (val x: Self & Value[T]) extends AnyVal {
      
      inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
