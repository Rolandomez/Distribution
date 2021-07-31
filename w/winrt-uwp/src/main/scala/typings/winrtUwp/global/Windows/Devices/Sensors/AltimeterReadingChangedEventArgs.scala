package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the altimeter reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.AltimeterReadingChangedEventArgs")
@js.native
abstract class AltimeterReadingChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.AltimeterReadingChangedEventArgs {
  
  /** Gets the most recent barometer reading. */
  /* CompleteClass */
  var reading: typings.winrtUwp.Windows.Devices.Sensors.AltimeterReading = js.native
}
