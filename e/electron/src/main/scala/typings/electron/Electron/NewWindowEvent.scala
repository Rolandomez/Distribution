package typings.electron.Electron

import typings.electron.electronStrings.`background-tab`
import typings.electron.electronStrings.`foreground-tab`
import typings.electron.electronStrings.`new-window`
import typings.electron.electronStrings.`save-to-disk`
import typings.electron.electronStrings.default
import typings.electron.electronStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewWindowEvent
  extends StObject
     with Event {
  
  /**
    * Can be `default`, `foreground-tab`, `background-tab`, `new-window`,
    * `save-to-disk` and `other`.
    */
  var disposition: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other = js.native
  
  var frameName: String = js.native
  
  /**
    * The options which should be used for creating the new `BrowserWindow`.
    */
  var options: BrowserWindowConstructorOptions = js.native
  
  var url: String = js.native
}
