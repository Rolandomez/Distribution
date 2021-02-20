package typings.winrtUwp.global.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates whether certain Bluetooth API methods should operate on values cached in the system or retrieve those values from the Bluetooth device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothCacheMode")
@js.native
object BluetoothCacheMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothCacheMode with Double] = js.native
  
  /* 0 */ val cached: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothCacheMode.cached with Double = js.native
  
  /* 1 */ val uncached: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothCacheMode.uncached with Double = js.native
}
