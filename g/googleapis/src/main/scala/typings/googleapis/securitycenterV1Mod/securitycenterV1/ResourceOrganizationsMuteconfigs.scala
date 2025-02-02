package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Resource$Organizations$Muteconfigs")
@js.native
open class ResourceOrganizationsMuteconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1MuteConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def create(params: ParamsResourceOrganizationsMuteconfigsCreate): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def create(
    params: ParamsResourceOrganizationsMuteconfigsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1MuteConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsMuteconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1MuteConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1MuteConfig]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsMuteconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def create(
    params: ParamsResourceOrganizationsMuteconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1MuteConfig]
  ): Unit = js.native
  /**
    * Creates a mute config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await securitycenter.organizations.muteConfigs.create({
    *     // Required. Unique identifier provided by the client within the parent scope. It must consist of lower case letters, numbers, and hyphen, with the first character a letter, the last a letter or a number, and a 63 character maximum.
    *     muteConfigId: 'placeholder-value',
    *     // Required. Resource name of the new mute configs's parent. Its format is "organizations/[organization_id]", "folders/[folder_id]", or "projects/[project_id]".
    *     parent: 'organizations/my-organization',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "filter": "my_filter",
    *       //   "mostRecentEditor": "my_mostRecentEditor",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "filter": "my_filter",
    *   //   "mostRecentEditor": "my_mostRecentEditor",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def create(params: ParamsResourceOrganizationsMuteconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrganizationsMuteconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsMuteconfigsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsMuteconfigsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsMuteconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsMuteconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsMuteconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an existing mute config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await securitycenter.organizations.muteConfigs.delete({
    *     // Required. Name of the mute config to delete. Its format is organizations/{organization\}/muteConfigs/{config_id\}, folders/{folder\}/muteConfigs/{config_id\}, or projects/{project\}/muteConfigs/{config_id\}
    *     name: 'organizations/my-organization/muteConfigs/my-muteConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceOrganizationsMuteconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceOrganizationsMuteconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1MuteConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def get(params: ParamsResourceOrganizationsMuteconfigsGet): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def get(
    params: ParamsResourceOrganizationsMuteconfigsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1MuteConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsMuteconfigsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1MuteConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1MuteConfig]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsMuteconfigsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def get(
    params: ParamsResourceOrganizationsMuteconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1MuteConfig]
  ): Unit = js.native
  /**
    * Gets a mute config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await securitycenter.organizations.muteConfigs.get({
    *     // Required. Name of the mute config to retrieve. Its format is organizations/{organization\}/muteConfigs/{config_id\}, folders/{folder\}/muteConfigs/{config_id\}, or projects/{project\}/muteConfigs/{config_id\}
    *     name: 'organizations/my-organization/muteConfigs/my-muteConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "filter": "my_filter",
    *   //   "mostRecentEditor": "my_mostRecentEditor",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceOrganizationsMuteconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrganizationsMuteconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListMuteConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMuteConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMuteConfigsResponse] = js.native
  def list(params: ParamsResourceOrganizationsMuteconfigsList): GaxiosPromise[SchemaListMuteConfigsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsMuteconfigsList,
    callback: BodyResponseCallback[SchemaListMuteConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsMuteconfigsList,
    options: BodyResponseCallback[Readable | SchemaListMuteConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListMuteConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsMuteconfigsList, options: MethodOptions): GaxiosPromise[SchemaListMuteConfigsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsMuteconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMuteConfigsResponse]
  ): Unit = js.native
  /**
    * Lists mute configs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await securitycenter.organizations.muteConfigs.list({
    *     // The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListMuteConfigs` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListMuteConfigs` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent, which owns the collection of mute configs. Its format is "organizations/[organization_id]", "folders/[folder_id]", "projects/[project_id]".
    *     parent: 'organizations/my-organization',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "muteConfigs": [],
    *   //   "nextPageToken": "my_nextPageToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceOrganizationsMuteconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsMuteconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1MuteConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def patch(params: ParamsResourceOrganizationsMuteconfigsPatch): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def patch(
    params: ParamsResourceOrganizationsMuteconfigsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1MuteConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsMuteconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1MuteConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1MuteConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsMuteconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1MuteConfig] = js.native
  def patch(
    params: ParamsResourceOrganizationsMuteconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1MuteConfig]
  ): Unit = js.native
  /**
    * Updates a mute config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await securitycenter.organizations.muteConfigs.patch({
    *     // This field will be ignored if provided on config creation. Format "organizations/{organization\}/muteConfigs/{mute_config\}" "folders/{folder\}/muteConfigs/{mute_config\}" "projects/{project\}/muteConfigs/{mute_config\}"
    *     name: 'organizations/my-organization/muteConfigs/my-muteConfig',
    *     // The list of fields to be updated. If empty all mutable fields will be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "filter": "my_filter",
    *       //   "mostRecentEditor": "my_mostRecentEditor",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "filter": "my_filter",
    *   //   "mostRecentEditor": "my_mostRecentEditor",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceOrganizationsMuteconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrganizationsMuteconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
