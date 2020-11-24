package typings.passportGithub2.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passport.mod.AuthenticateOptions
import typings.passportOauth2.mod.OAuth2Strategy
import typings.passportOauth2.mod.VerifyFunction
import typings.passportOauth2.mod.VerifyFunctionWithRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-github2", "Strategy")
@js.native
class Strategy protected () extends OAuth2Strategy {
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: AuthenticateOptions): Unit = js.native
}
