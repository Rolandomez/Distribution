package typings.nodelibFsWalk

import typings.nodelibFsScandir.settingsMod.Options
import typings.nodelibFsScandir.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readersSyncMod {
  
  @JSImport("@nodelib/fs.walk/out/readers/sync", JSImport.Default)
  @js.native
  class default () extends SyncReader
  
  @js.native
  trait SyncReader
    extends typings.nodelibFsWalk.readerMod.default {
    
    var _handleDirectory: js.Any = js.native
    
    var _handleEntry: js.Any = js.native
    
    var _handleError: js.Any = js.native
    
    var _handleQueue: js.Any = js.native
    
    var _pushToQueue: js.Any = js.native
    
    var _pushToStorage: js.Any = js.native
    
    val _queue: js.Any = js.native
    
    /* protected */ def _scandir(path: String): js.Array[Entry] = js.native
    /* protected */ def _scandir(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
    /* protected */ def _scandir(path: String, optionsOrSettings: typings.nodelibFsScandir.settingsMod.default): js.Array[Entry] = js.native
    
    val _storage: js.Any = js.native
    
    def read(): js.Array[typings.nodelibFsWalk.typesMod.Entry] = js.native
  }
}
