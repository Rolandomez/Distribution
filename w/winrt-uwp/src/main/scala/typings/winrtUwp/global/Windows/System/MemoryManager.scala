package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.appmemoryusagedecreased
import typings.winrtUwp.winrtUwpStrings.appmemoryusageincreased
import typings.winrtUwp.winrtUwpStrings.appmemoryusagelimitchanging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to information on an app's memory usage. */
@JSGlobal("Windows.System.MemoryManager")
@js.native
abstract class MemoryManager ()
  extends typings.winrtUwp.Windows.System.MemoryManager
/* static members */
@JSGlobal("Windows.System.MemoryManager")
@js.native
object MemoryManager extends js.Object {
  
   /* unmapped type */ def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_appmemoryusagedecreased(`type`: appmemoryusagedecreased, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_appmemoryusageincreased(`type`: appmemoryusageincreased, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_appmemoryusagelimitchanging(`type`: appmemoryusagelimitchanging, listener: EventHandler[_]): Unit = js.native
  
  /** Gets the app's current memory usage. */
  var appMemoryUsage: Double = js.native
  
  /** Gets the app's memory usage level. */
  var appMemoryUsageLevel: typings.winrtUwp.Windows.System.AppMemoryUsageLevel = js.native
  
  /** Gets the app's memory usage limit. */
  var appMemoryUsageLimit: Double = js.native
  
  /**
    * Gets an AppMemoryReport for the app, which provides information about its memory usage.
    * @return Information about the process' memory usage.
    */
  def getAppMemoryReport(): typings.winrtUwp.Windows.System.AppMemoryReport = js.native
  
  /**
    * Gets a ProcessMemoryReport for a process, which provides information about its memory usage.
    * @return Information about the process' memory usage.
    */
  def getProcessMemoryReport(): typings.winrtUwp.Windows.System.ProcessMemoryReport = js.native
  
  /** Raised when the app's memory consumption has decreased to a lower value in the AppMemoryUsageLevel enumeration. */
  def onappmemoryusagedecreased(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Raised when the app's memory consumption has decreased to a lower value in the AppMemoryUsageLevel enumeration. */
  @JSName("onappmemoryusagedecreased")
  var onappmemoryusagedecreased_Original: EventHandler[_] = js.native
  
  /** Raised when the app's memory consumption has increased to a higher value in the AppMemoryUsageLevel enumeration. */
  def onappmemoryusageincreased(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Raised when the app's memory consumption has increased to a higher value in the AppMemoryUsageLevel enumeration. */
  @JSName("onappmemoryusageincreased")
  var onappmemoryusageincreased_Original: EventHandler[_] = js.native
  
  /** Raised just before the limit of how much total memory the app can use is changed. */
  def onappmemoryusagelimitchanging(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Raised just before the limit of how much total memory the app can use is changed. */
  @JSName("onappmemoryusagelimitchanging")
  var onappmemoryusagelimitchanging_Original: EventHandler[_] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_appmemoryusagedecreased(`type`: appmemoryusagedecreased, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_appmemoryusageincreased(`type`: appmemoryusageincreased, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_appmemoryusagelimitchanging(`type`: appmemoryusagelimitchanging, listener: EventHandler[_]): Unit = js.native
  
  var trySetAppMemoryUsageLimit: js.Any = js.native
}
