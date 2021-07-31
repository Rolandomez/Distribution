package typings.yandexMaps.mod.control

import typings.yandexMaps.mod.ICollection
import typings.yandexMaps.mod.IControlParent
import typings.yandexMaps.mod.IEventManager
import typings.yandexMaps.mod.IIterator
import typings.yandexMaps.mod.IOptionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options
- typings.yandexMaps.mod.IChild because var conflicts: events. Inlined getParent, setParent, setParent */ @JSImport("yandex-maps", "control.ListBox")
@js.native
class ListBox ()
  extends StObject
     with ICollection {
  def this(parameters: IListBoxParameters) = this()
  
  /* CompleteClass */
  override def add(`object`: js.Object): this.type = js.native
  
  var data: typings.yandexMaps.mod.data.Manager = js.native
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  /* CompleteClass */
  override def getIterator(): IIterator = js.native
  
  def getParent(): Null | IControlParent = js.native
  
  var options: IOptionManager = js.native
  
  /* CompleteClass */
  override def remove(`object`: js.Object): this.type = js.native
  
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
  def setParent(parent: IControlParent): this.type = js.native
  
  var state: typings.yandexMaps.mod.data.Manager = js.native
}
