package typings.shopifyPrime

import org.scalablytyped.runtime.StringDictionary
import typings.shopifyPrime.authGrantMod.AuthGrant
import typings.shopifyPrime.authScopeMod.AuthScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/auth", JSImport.Namespace)
@js.native
object authMod extends js.Object {
  def authorize(code: String, shopDomain: String, shopifyApiKey: String, shopifySecretKey: String): js.Promise[String] = js.native
  def buildAuthorizationUrl(scopes: js.Array[AuthScope], shopifyDomain: String, shopifyApiKey: String): js.Promise[String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[AuthScope],
    shopifyDomain: String,
    shopifyApiKey: String,
    redirectUrl: js.UndefOr[scala.Nothing],
    state: js.UndefOr[scala.Nothing],
    grants: js.Array[AuthGrant]
  ): js.Promise[String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[AuthScope],
    shopifyDomain: String,
    shopifyApiKey: String,
    redirectUrl: js.UndefOr[scala.Nothing],
    state: String
  ): js.Promise[String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[AuthScope],
    shopifyDomain: String,
    shopifyApiKey: String,
    redirectUrl: js.UndefOr[scala.Nothing],
    state: String,
    grants: js.Array[AuthGrant]
  ): js.Promise[String] = js.native
  def buildAuthorizationUrl(scopes: js.Array[AuthScope], shopifyDomain: String, shopifyApiKey: String, redirectUrl: String): js.Promise[String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[AuthScope],
    shopifyDomain: String,
    shopifyApiKey: String,
    redirectUrl: String,
    state: js.UndefOr[scala.Nothing],
    grants: js.Array[AuthGrant]
  ): js.Promise[String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[AuthScope],
    shopifyDomain: String,
    shopifyApiKey: String,
    redirectUrl: String,
    state: String
  ): js.Promise[String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[AuthScope],
    shopifyDomain: String,
    shopifyApiKey: String,
    redirectUrl: String,
    state: String,
    grants: js.Array[AuthGrant]
  ): js.Promise[String] = js.native
  def isAuthenticProxyRequest(querystring: StringDictionary[js.Any], shopifySecretKey: String): js.Promise[Boolean] = js.native
  def isAuthenticRequest(querystring: StringDictionary[js.Any], shopifySecretKey: String): js.Promise[Boolean] = js.native
  def isAuthenticWebhook(headers: String, requestBody: String, shopifySecretKey: String): js.Promise[Boolean] = js.native
  def isAuthenticWebhook(headers: StringDictionary[js.Any], requestBody: String, shopifySecretKey: String): js.Promise[Boolean] = js.native
  def isValidShopifyDomain(shopifyDomain: String): js.Promise[Boolean] = js.native
}

