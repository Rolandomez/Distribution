package typings.awsSdk.mod

import typings.awsSdk.credentialProviderChainMod.provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "CredentialProviderChain")
@js.native
/**
  * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
  */
class CredentialProviderChain ()
  extends typings.awsSdk.coreMod.CredentialProviderChain {
  def this(providers: js.Array[provider]) = this()
}
/* static members */
@JSImport("aws-sdk", "CredentialProviderChain")
@js.native
object CredentialProviderChain extends js.Object {
  
  var defaultProviders: js.Array[provider] = js.native
}
