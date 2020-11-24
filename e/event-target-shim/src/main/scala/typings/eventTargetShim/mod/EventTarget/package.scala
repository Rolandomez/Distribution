package typings.eventTargetShim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object EventTarget {
  
  type EventAttributes[TEventAttributes /* <: typings.eventTargetShim.mod.EventTarget.EventDefinition */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TEventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<TEventAttributes[P]> | null}
    */ typings.eventTargetShim.eventTargetShimStrings.EventAttributes with org.scalablytyped.runtime.TopLevel[TEventAttributes]
  
  /* Rewritten from type alias, can be one of: 
    - typings.eventTargetShim.mod.Event
    - typings.eventTargetShim.mod.EventTarget.NonStandardEvent
    - (typings.std.Pick[
  / * import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] * / js.Any, 
  typings.std.Exclude[
    / * import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] * / js.Any, 
    typings.eventTargetShim.mod.EventTarget.OmittableEventKeys
  ]]) with typings.eventTargetShim.anon.PartialPickEventOmittable[TEvents]
  */
  type EventData[TEvents /* <: typings.eventTargetShim.mod.EventTarget.EventDefinition */, TEventType /* <: /* keyof TEvents */ java.lang.String */, TMode /* <: typings.eventTargetShim.mod.EventTarget.Mode */] = (typings.eventTargetShim.mod.EventTarget._EventData[TEvents, TEventType, TMode]) | ((typings.std.Pick[
    /* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any, 
    typings.std.Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] */ js.Any, 
      typings.eventTargetShim.mod.EventTarget.OmittableEventKeys
    ]
  ]) with typings.eventTargetShim.anon.PartialPickEventOmittable[TEvents])
  
  type EventDefinition = org.scalablytyped.runtime.StringDictionary[typings.eventTargetShim.mod.Event]
  
  type EventType[TEvents /* <: typings.eventTargetShim.mod.EventTarget.EventDefinition */, TMode /* <: typings.eventTargetShim.mod.EventTarget.Mode */] = /* keyof TEvents */ java.lang.String
  
  type FunctionListener[TEvent] = js.Function1[/* event */ TEvent, scala.Unit]
  
  type Listener[TEvent] = typings.eventTargetShim.mod.EventTarget.FunctionListener[TEvent] | typings.eventTargetShim.mod.EventTarget.ObjectListener[TEvent]
  
  type PickEvent[TEvents /* <: typings.eventTargetShim.mod.EventTarget.EventDefinition */, TEventType /* <: /* keyof TEvents */ java.lang.String */] = typings.eventTargetShim.mod.Event | (/* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any)
}
