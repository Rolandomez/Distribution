package typings.eventIterator

import typings.eventIterator.anon.PartialEventIteratorOptio
import typings.eventIterator.libEventIteratorMod.EventIteratorOptions
import typings.eventIterator.libEventIteratorMod.ListenHandler
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodeMod {
  
  @JSImport("event-iterator/lib/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("event-iterator/lib/node", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends typings.eventIterator.libEventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], param1: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/node", "EventIterator")
  @js.native
  open class EventIterator[T] protected ()
    extends typings.eventIterator.libEventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], param1: PartialEventIteratorOptio) = this()
  }
  
  inline def stream(): typings.eventIterator.libEventIteratorMod.EventIterator[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")().asInstanceOf[typings.eventIterator.libEventIteratorMod.EventIterator[Buffer]]
  inline def stream(evOptions: EventIteratorOptions): typings.eventIterator.libEventIteratorMod.EventIterator[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(evOptions.asInstanceOf[js.Any]).asInstanceOf[typings.eventIterator.libEventIteratorMod.EventIterator[Buffer]]
}
