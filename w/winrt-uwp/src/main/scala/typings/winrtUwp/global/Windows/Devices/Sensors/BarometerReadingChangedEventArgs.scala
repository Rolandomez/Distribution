package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the barometer reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.BarometerReadingChangedEventArgs")
@js.native
abstract class BarometerReadingChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.BarometerReadingChangedEventArgs {
  
  /** Gets the most recent barometer reading. */
  /* CompleteClass */
  var reading: typings.winrtUwp.Windows.Devices.Sensors.BarometerReading = js.native
}
