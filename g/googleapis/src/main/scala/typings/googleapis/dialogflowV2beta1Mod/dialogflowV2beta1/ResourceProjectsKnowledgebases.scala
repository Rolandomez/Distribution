package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Knowledgebases")
@js.native
open class ResourceProjectsKnowledgebases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def create(params: ParamsResourceProjectsKnowledgebasesCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def create(
    params: ParamsResourceProjectsKnowledgebasesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsKnowledgebasesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1KnowledgeBase],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsKnowledgebasesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def create(
    params: ParamsResourceProjectsKnowledgebasesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  /**
    * Creates a knowledge base. Note: The `projects.agent.knowledgeBases` resource is deprecated; only use `projects.knowledgeBases`.
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.knowledgeBases.create({
    *     // Required. The project to create a knowledge base for. Format: `projects//locations/`.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "languageCode": "my_languageCode",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "languageCode": "my_languageCode",
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
  def create(params: ParamsResourceProjectsKnowledgebasesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsKnowledgebasesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsKnowledgebasesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsKnowledgebasesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsKnowledgebasesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsKnowledgebasesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsKnowledgebasesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified knowledge base. Note: The `projects.agent.knowledgeBases` resource is deprecated; only use `projects.knowledgeBases`.
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.knowledgeBases.delete({
    *     // Optional. Force deletes the knowledge base. When set to true, any documents in the knowledge base are also deleted.
    *     force: 'placeholder-value',
    *     // Required. The name of the knowledge base to delete. Format: `projects//locations//knowledgeBases/`.
    *     name: 'projects/my-project/knowledgeBases/my-knowledgeBase',
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
  def delete(params: ParamsResourceProjectsKnowledgebasesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsKnowledgebasesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var documents: ResourceProjectsKnowledgebasesDocuments = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def get(params: ParamsResourceProjectsKnowledgebasesGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def get(
    params: ParamsResourceProjectsKnowledgebasesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsKnowledgebasesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1KnowledgeBase],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsKnowledgebasesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def get(
    params: ParamsResourceProjectsKnowledgebasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  /**
    * Retrieves the specified knowledge base. Note: The `projects.agent.knowledgeBases` resource is deprecated; only use `projects.knowledgeBases`.
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.knowledgeBases.get({
    *     // Required. The name of the knowledge base to retrieve. Format `projects//locations//knowledgeBases/`.
    *     name: 'projects/my-project/knowledgeBases/my-knowledgeBase',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "languageCode": "my_languageCode",
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
  def get(params: ParamsResourceProjectsKnowledgebasesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsKnowledgebasesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse] = js.native
  def list(params: ParamsResourceProjectsKnowledgebasesList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsKnowledgebasesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsKnowledgebasesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsKnowledgebasesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsKnowledgebasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse]
  ): Unit = js.native
  /**
    * Returns the list of all knowledge bases of the specified agent. Note: The `projects.agent.knowledgeBases` resource is deprecated; only use `projects.knowledgeBases`.
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.knowledgeBases.list({
    *     // The filter expression used to filter knowledge bases returned by the list method. The expression has the following syntax: [AND ] ... The following fields and operators are supported: * display_name with has(:) operator * language_code with equals(=) operator Examples: * 'language_code=en-us' matches knowledge bases with en-us language code. * 'display_name:articles' matches knowledge bases whose display name contains "articles". * 'display_name:"Best Articles"' matches knowledge bases whose display name contains "Best Articles". * 'language_code=en-gb AND display_name=articles' matches all knowledge bases whose display name contains "articles" and whose language code is "en-gb". Note: An empty filter string (i.e. "") is a no-op and will result in no filtering. For more information about filtering, see [API Filtering](https://aip.dev/160).
    *     filter: 'placeholder-value',
    *     // The maximum number of items to return in a single page. By default 10 and at most 100.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The project to list of knowledge bases for. Format: `projects//locations/`.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "knowledgeBases": [],
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
  def list(params: ParamsResourceProjectsKnowledgebasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsKnowledgebasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def patch(params: ParamsResourceProjectsKnowledgebasesPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def patch(
    params: ParamsResourceProjectsKnowledgebasesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsKnowledgebasesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1KnowledgeBase],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsKnowledgebasesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def patch(
    params: ParamsResourceProjectsKnowledgebasesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  /**
    * Updates the specified knowledge base. Note: The `projects.agent.knowledgeBases` resource is deprecated; only use `projects.knowledgeBases`.
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.knowledgeBases.patch({
    *     // The knowledge base resource name. The name must be empty when creating a knowledge base. Format: `projects//locations//knowledgeBases/`.
    *     name: 'projects/my-project/knowledgeBases/my-knowledgeBase',
    *     // Optional. Not specified means `update all`. Currently, only `display_name` can be updated, an InvalidArgument will be returned for attempting to update other fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "languageCode": "my_languageCode",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "languageCode": "my_languageCode",
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
  def patch(params: ParamsResourceProjectsKnowledgebasesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsKnowledgebasesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
