package typings.firebaseAuth

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAuth.distBrowserCjsSrcCoreAuthAuthImplMod.AuthImpl
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.Dependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcCoreAuthInitializeMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/core/auth/initialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializeAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  inline def initializeAuth(app: FirebaseApp, deps: Dependencies): Auth = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Auth]
  
  inline def initializeAuthInstance(auth: AuthImpl): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_initializeAuthInstance")(auth.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def initializeAuthInstance(auth: AuthImpl, deps: Dependencies): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_initializeAuthInstance")(auth.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
