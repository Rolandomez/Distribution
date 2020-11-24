package typings.newrelic.mod

import typings.newrelic.anon.ModuleName
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instrument_ extends js.Object {
  
  def apply(moduleName: String, onRequire: js.Function0[Unit]): Unit = js.native
  def apply(moduleName: String, onRequire: js.Function0[Unit], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(opts: ModuleName): Unit = js.native
}
