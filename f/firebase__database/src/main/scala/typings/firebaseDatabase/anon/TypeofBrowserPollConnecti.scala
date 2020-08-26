package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.firebaseDatabase.browserPollConnectionMod.BrowserPollConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBrowserPollConnecti
  extends Instantiable2[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      BrowserPollConnection
    ]
     with Instantiable3[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      /* applicationId */ String, 
      BrowserPollConnection
    ]
     with Instantiable4[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      js.UndefOr[/* applicationId */ String], 
      /* transportSessionId */ String, 
      BrowserPollConnection
    ]
     with Instantiable5[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      js.UndefOr[/* applicationId */ String], 
      js.UndefOr[/* transportSessionId */ String], 
      /* lastSessionId */ String, 
      BrowserPollConnection
    ] {
  var forceAllow_ : js.Any = js.native
  var forceDisallow_ : js.Any = js.native
  /**
    * Forces long polling to be considered as a potential transport
    */
  def forceAllow(): Unit = js.native
  /**
    * Forces longpolling to not be considered as a potential transport
    */
  def forceDisallow(): Unit = js.native
  def isAvailable(): Boolean = js.native
}

