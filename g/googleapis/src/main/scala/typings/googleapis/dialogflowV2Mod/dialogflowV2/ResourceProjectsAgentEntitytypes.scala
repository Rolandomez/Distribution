package typings.googleapis.dialogflowV2Mod.dialogflowV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Agent$Entitytypes")
@js.native
open class ResourceProjectsAgentEntitytypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchDelete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(params: ParamsResourceProjectsAgentEntitytypesBatchdelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentEntitytypesBatchdelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentEntitytypesBatchdelete,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceProjectsAgentEntitytypesBatchdelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentEntitytypesBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Deletes entity types in the specified agent. This method is a [long-running operation](https://cloud.google.com/dialogflow/es/docs/how/long-running-operations). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty) Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.entityTypes.batchDelete({
    *     // Required. The name of the agent to delete all entities types for. Format: `projects//agent`.
    *     parent: 'projects/my-project/agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entityTypeNames": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def batchDelete(params: ParamsResourceProjectsAgentEntitytypesBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentEntitytypesBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUpdate(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(params: ParamsResourceProjectsAgentEntitytypesBatchupdate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentEntitytypesBatchupdate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentEntitytypesBatchupdate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceProjectsAgentEntitytypesBatchupdate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentEntitytypesBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Updates/Creates multiple entity types in the specified agent. This method is a [long-running operation](https://cloud.google.com/dialogflow/es/docs/how/long-running-operations). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: BatchUpdateEntityTypesResponse Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.entityTypes.batchUpdate({
    *     // Required. The name of the agent to update or create entity types in. Format: `projects//agent`.
    *     parent: 'projects/my-project/agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entityTypeBatchInline": {},
    *       //   "entityTypeBatchUri": "my_entityTypeBatchUri",
    *       //   "languageCode": "my_languageCode",
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def batchUpdate(params: ParamsResourceProjectsAgentEntitytypesBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentEntitytypesBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def create(params: ParamsResourceProjectsAgentEntitytypesCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def create(
    params: ParamsResourceProjectsAgentEntitytypesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentEntitytypesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2EntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAgentEntitytypesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def create(
    params: ParamsResourceProjectsAgentEntitytypesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  /**
    * Creates an entity type in the specified agent. Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.entityTypes.create({
    *     // Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    *     languageCode: 'placeholder-value',
    *     // Required. The agent to create a entity type for. Format: `projects//agent`.
    *     parent: 'projects/my-project/agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "autoExpansionMode": "my_autoExpansionMode",
    *       //   "displayName": "my_displayName",
    *       //   "enableFuzzyExtraction": false,
    *       //   "entities": [],
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoExpansionMode": "my_autoExpansionMode",
    *   //   "displayName": "my_displayName",
    *   //   "enableFuzzyExtraction": false,
    *   //   "entities": [],
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def create(params: ParamsResourceProjectsAgentEntitytypesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAgentEntitytypesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsAgentEntitytypesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEntitytypesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentEntitytypesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAgentEntitytypesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEntitytypesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified entity type. Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.entityTypes.delete({
    *     // Required. The name of the entity type to delete. Format: `projects//agent/entityTypes/`.
    *     name: 'projects/my-project/agent/entityTypes/my-entityType',
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
  def delete(params: ParamsResourceProjectsAgentEntitytypesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEntitytypesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var entities: ResourceProjectsAgentEntitytypesEntities = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def get(params: ParamsResourceProjectsAgentEntitytypesGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def get(
    params: ParamsResourceProjectsAgentEntitytypesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAgentEntitytypesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2EntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAgentEntitytypesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def get(
    params: ParamsResourceProjectsAgentEntitytypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  /**
    * Retrieves the specified entity type.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.entityTypes.get({
    *     // Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    *     languageCode: 'placeholder-value',
    *     // Required. The name of the entity type. Format: `projects//agent/entityTypes/`.
    *     name: 'projects/my-project/agent/entityTypes/my-entityType',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoExpansionMode": "my_autoExpansionMode",
    *   //   "displayName": "my_displayName",
    *   //   "enableFuzzyExtraction": false,
    *   //   "entities": [],
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceProjectsAgentEntitytypesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAgentEntitytypesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse] = js.native
  def list(params: ParamsResourceProjectsAgentEntitytypesList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEntitytypesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentEntitytypesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListEntityTypesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListEntityTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAgentEntitytypesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEntitytypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse]
  ): Unit = js.native
  /**
    * Returns the list of all entity types in the specified agent.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.entityTypes.list({
    *     // Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    *     languageCode: 'placeholder-value',
    *     // Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The agent to list all entity types from. Format: `projects//agent`.
    *     parent: 'projects/my-project/agent',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entityTypes": [],
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
  def list(params: ParamsResourceProjectsAgentEntitytypesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAgentEntitytypesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def patch(params: ParamsResourceProjectsAgentEntitytypesPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEntitytypesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentEntitytypesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2EntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAgentEntitytypesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEntitytypesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  /**
    * Updates the specified entity type. Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.agent.entityTypes.patch({
    *     // Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    *     languageCode: 'placeholder-value',
    *     // The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Format: `projects//agent/entityTypes/`.
    *     name: 'projects/my-project/agent/entityTypes/my-entityType',
    *     // Optional. The mask to control which fields get updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "autoExpansionMode": "my_autoExpansionMode",
    *       //   "displayName": "my_displayName",
    *       //   "enableFuzzyExtraction": false,
    *       //   "entities": [],
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoExpansionMode": "my_autoExpansionMode",
    *   //   "displayName": "my_displayName",
    *   //   "enableFuzzyExtraction": false,
    *   //   "entities": [],
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceProjectsAgentEntitytypesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEntitytypesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
