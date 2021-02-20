package typings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jquery {
  
  type DragEvent = typings.std.DragEvent
  
  type Event = typings.std.Event
  
  type FocusEvent = typings.std.FocusEvent
  
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = typings.jquery.JQuery.AjaxSettings[js.Any]
  
  type JQueryAnimationOptions = typings.jquery.JQuery.EffectsOptions[typings.std.Element]
  
  type JQueryCallback = typings.jquery.JQuery.Callbacks[js.Function]
  
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = typings.jquery.JQuery.Coordinates
  
  type JQueryDeferred[T] = typings.jquery.JQuery.Deferred[T, js.Any, js.Any]
  
  /**
    * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ scala.Double, scala.Double]
  
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = typings.jquery.JQuery.EventStatic
  
  type JQueryGenericPromise[T] = typings.jquery.JQuery.Thenable[T]
  
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[scala.Boolean], java.lang.String]
  
  type JQueryPromise[T] = typings.jquery.JQuery.Promise[T, js.Any, js.Any]
  
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  
  /**
    * @deprecated ​ Deprecated.
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typings.jquery.JQuery.TypeOrArray[typings.jquery.JQueryPromiseCallback[T]], 
    /* repeated */ typings.jquery.JQuery.TypeOrArray[typings.jquery.JQueryPromiseCallback[js.Any]], 
    typings.jquery.JQueryPromise[U]
  ]
  
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = typings.jquery.JQuery.NameValuePair
  
  /**
    * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = typings.jquery.JQuery.PlainObject[js.Any]
  
  type KeyboardEvent = typings.std.KeyboardEvent
  
  type MouseEvent = typings.std.MouseEvent
  
  type TouchEvent = typings.std.TouchEvent
  
  type UIEvent = typings.std.UIEvent
}
