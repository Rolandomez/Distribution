package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.SchedulerDataSource
import typings.std.Date
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scheduler
  extends StObject
     with Widget {
  
  def addEvent(data: js.Any): Unit = js.native
  
  var calendar: Calendar = js.native
  
  def cancelEvent(): Unit = js.native
  
  def data(): Unit = js.native
  
  var dataSource: DataSource = js.native
  
  def date(): Date = js.native
  def date(value: Date): Unit = js.native
  @JSName("date")
  def date_Unit(): Unit = js.native
  
  def editEvent(event: String): Unit = js.native
  def editEvent(event: typings.kendoUi.kendo.data.SchedulerEvent): Unit = js.native
  
  def items(): js.Any = js.native
  
  def occurrenceByUid(uid: String): typings.kendoUi.kendo.data.SchedulerEvent = js.native
  
  def occurrencesInRange(start: Date, end: Date): js.Any = js.native
  
  @JSName("options")
  var options_Scheduler: SchedulerOptions = js.native
  
  def refresh(): Unit = js.native
  
  def removeEvent(event: String): Unit = js.native
  def removeEvent(event: typings.kendoUi.kendo.data.SchedulerEvent): Unit = js.native
  
  var resources: js.Any = js.native
  
  def resourcesBySlot(slot: js.Any): js.Any = js.native
  
  def saveAsPDF(): JQueryPromise[js.Any] = js.native
  
  def saveEvent(): Unit = js.native
  
  def select(): Unit = js.native
  def select(options: js.Array[SchedulerEvent]): Unit = js.native
  def select(options: SchedulerSelectOptions): Unit = js.native
  
  def setDataSource(dataSource: SchedulerDataSource): Unit = js.native
  
  def slotByElement(element: JQuery): js.Any = js.native
  def slotByElement(element: Element): js.Any = js.native
  
  def slotByPosition(xPosition: Double, yPosition: Double): js.Any = js.native
  
  def view(): SchedulerView = js.native
  def view(`type`: String): Unit = js.native
  
  def viewName(): String = js.native
  
  @JSName("view")
  def view_Unit(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
