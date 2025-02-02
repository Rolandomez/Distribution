package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Backendservices")
@js.native
open class ResourceBackendservices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addSignedUrlKey(): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addSignedUrlKey(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(params: ParamsResourceBackendservicesAddsignedurlkey): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendservicesAddsignedurlkey,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendservicesAddsignedurlkey,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def addSignedUrlKey(params: ParamsResourceBackendservicesAddsignedurlkey, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendservicesAddsignedurlkey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Adds a key for validating requests with signed URLs for this backend service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.addSignedUrlKey({
    *     // Name of the BackendService resource to which the Signed URL Key should be added. The name should conform to RFC1035.
    *     backendService: 'placeholder-value',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "keyName": "my_keyName",
    *       //   "keyValue": "my_keyValue"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def addSignedUrlKey(params: ParamsResourceBackendservicesAddsignedurlkey, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendservicesAddsignedurlkey,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def aggregatedList(): GaxiosPromise[SchemaBackendServiceAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaBackendServiceAggregatedList]): Unit = js.native
  def aggregatedList(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBackendServiceAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceBackendservicesAggregatedlist): GaxiosPromise[SchemaBackendServiceAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceBackendservicesAggregatedlist,
    callback: BodyResponseCallback[SchemaBackendServiceAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceBackendservicesAggregatedlist,
    options: BodyResponseCallback[Readable | SchemaBackendServiceAggregatedList],
    callback: BodyResponseCallback[Readable | SchemaBackendServiceAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceBackendservicesAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaBackendServiceAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceBackendservicesAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendServiceAggregatedList]
  ): Unit = js.native
  /**
    * Retrieves the list of all BackendService resources, regional and global, available to the specified project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.aggregatedList({
    *     // A filter expression that filters resources listed in the response. Most Compute resources support two types of filter expressions: expressions that support regular expressions and expressions that follow API improvement proposal AIP-160. If you want to use AIP-160, your expression must specify the field name, an operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The operator must be either `=`, `!=`, `\>`, `<`, `<=`, `\>=` or `:`. For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`. The `:` operator can be used with string fields to match substrings. For non-string fields it is equivalent to the `=` operator. The `:*` comparison can be used to test whether a key has been defined. For example, to find all objects with `owner` label use: ``` labels.owner:* ``` You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels. To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true) ``` If you want to use a regular expression, use the `eq` (equal) or `ne` (not equal) operator against a single un-parenthesized expression with or without quotes or against multiple parenthesized expressions. Examples: `fieldname eq unquoted literal` `fieldname eq 'single quoted literal'` `fieldname eq "double quoted literal"` `(fieldname1 eq literal) (fieldname2 ne "literal")` The literal value is interpreted as a regular expression using Google RE2 library syntax. The literal value must match the entire field. For example, to filter for instances that do not end with name "instance", you would use `name ne .*instance`.
    *     filter: 'placeholder-value',
    *     // Indicates whether every visible scope for each scope type (zone, region, global) should be included in the response. For new resource types added after this field, the flag has no effect as new resource types will always include every visible scope for each scope type in response. For resource types which predate this field, if this flag is omitted or false, only scopes of the scope types where the resource type is expected to be found will be included.
    *     includeAllScopes: 'placeholder-value',
    *     // The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
    *     maxResults: 'placeholder-value',
    *     // Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name. You can also sort results in descending order based on the creation timestamp using `orderBy="creationTimestamp desc"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first. Currently, only sorting by `name` or `creationTimestamp desc` is supported.
    *     orderBy: 'placeholder-value',
    *     // Specifies a page token to use. Set `pageToken` to the `nextPageToken` returned by a previous list request to get the next page of results.
    *     pageToken: 'placeholder-value',
    *     // Name of the project scoping this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // Opt-in for partial success behavior which provides partial results in case of failure. The default value is false.
    *     returnPartialSuccess: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "items": {},
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "selfLink": "my_selfLink",
    *   //   "unreachables": [],
    *   //   "warning": {}
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
  def aggregatedList(params: ParamsResourceBackendservicesAggregatedlist, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def aggregatedList(
    params: ParamsResourceBackendservicesAggregatedlist,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackendservicesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackendservicesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceBackendservicesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceBackendservicesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceBackendservicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes the specified BackendService resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.delete({
    *     // Name of the BackendService resource to delete.
    *     backendService: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def delete(params: ParamsResourceBackendservicesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceBackendservicesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteSignedUrlKey(): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteSignedUrlKey(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(params: ParamsResourceBackendservicesDeletesignedurlkey): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendservicesDeletesignedurlkey,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendservicesDeletesignedurlkey,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def deleteSignedUrlKey(params: ParamsResourceBackendservicesDeletesignedurlkey, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendservicesDeletesignedurlkey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a key for validating requests with signed URLs for this backend service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.deleteSignedUrlKey({
    *     // Name of the BackendService resource to which the Signed URL Key should be added. The name should conform to RFC1035.
    *     backendService: 'placeholder-value',
    *     // The name of the Signed URL Key to delete.
    *     keyName: 'placeholder-value',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def deleteSignedUrlKey(params: ParamsResourceBackendservicesDeletesignedurlkey, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendservicesDeletesignedurlkey,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaBackendService] = js.native
  def get(callback: BodyResponseCallback[SchemaBackendService]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBackendService] = js.native
  def get(params: ParamsResourceBackendservicesGet): GaxiosPromise[SchemaBackendService] = js.native
  def get(params: ParamsResourceBackendservicesGet, callback: BodyResponseCallback[SchemaBackendService]): Unit = js.native
  def get(
    params: ParamsResourceBackendservicesGet,
    options: BodyResponseCallback[Readable | SchemaBackendService],
    callback: BodyResponseCallback[Readable | SchemaBackendService]
  ): Unit = js.native
  def get(params: ParamsResourceBackendservicesGet, options: MethodOptions): GaxiosPromise[SchemaBackendService] = js.native
  def get(
    params: ParamsResourceBackendservicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendService]
  ): Unit = js.native
  /**
    * Returns the specified BackendService resource. Gets a list of available backend services.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.get({
    *     // Name of the BackendService resource to return.
    *     backendService: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "affinityCookieTtlSec": 0,
    *   //   "backends": [],
    *   //   "cdnPolicy": {},
    *   //   "circuitBreakers": {},
    *   //   "compressionMode": "my_compressionMode",
    *   //   "connectionDraining": {},
    *   //   "connectionTrackingPolicy": {},
    *   //   "consistentHash": {},
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "customRequestHeaders": [],
    *   //   "customResponseHeaders": [],
    *   //   "description": "my_description",
    *   //   "edgeSecurityPolicy": "my_edgeSecurityPolicy",
    *   //   "enableCDN": false,
    *   //   "failoverPolicy": {},
    *   //   "fingerprint": "my_fingerprint",
    *   //   "healthChecks": [],
    *   //   "iap": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "loadBalancingScheme": "my_loadBalancingScheme",
    *   //   "localityLbPolicies": [],
    *   //   "localityLbPolicy": "my_localityLbPolicy",
    *   //   "logConfig": {},
    *   //   "maxStreamDuration": {},
    *   //   "name": "my_name",
    *   //   "network": "my_network",
    *   //   "outlierDetection": {},
    *   //   "port": 0,
    *   //   "portName": "my_portName",
    *   //   "protocol": "my_protocol",
    *   //   "region": "my_region",
    *   //   "securityPolicy": "my_securityPolicy",
    *   //   "securitySettings": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "serviceBindings": [],
    *   //   "serviceLbPolicy": "my_serviceLbPolicy",
    *   //   "sessionAffinity": "my_sessionAffinity",
    *   //   "subsetting": {},
    *   //   "timeoutSec": 0,
    *   //   "vpcNetworkScope": "my_vpcNetworkScope"
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
  def get(params: ParamsResourceBackendservicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBackendservicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getHealth(): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(callback: BodyResponseCallback[SchemaBackendServiceGroupHealth]): Unit = js.native
  def getHealth(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(params: ParamsResourceBackendservicesGethealth): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(
    params: ParamsResourceBackendservicesGethealth,
    callback: BodyResponseCallback[SchemaBackendServiceGroupHealth]
  ): Unit = js.native
  def getHealth(
    params: ParamsResourceBackendservicesGethealth,
    options: BodyResponseCallback[Readable | SchemaBackendServiceGroupHealth],
    callback: BodyResponseCallback[Readable | SchemaBackendServiceGroupHealth]
  ): Unit = js.native
  def getHealth(params: ParamsResourceBackendservicesGethealth, options: MethodOptions): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(
    params: ParamsResourceBackendservicesGethealth,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendServiceGroupHealth]
  ): Unit = js.native
  /**
    * Gets the most recent health check results for this BackendService. Example request body: { "group": "/zones/us-east1-b/instanceGroups/lb-backend-example" \}
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.getHealth({
    *     // Name of the BackendService resource to which the queried instance belongs.
    *     backendService: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "group": "my_group"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "healthStatus": [],
    *   //   "kind": "my_kind"
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
  def getHealth(params: ParamsResourceBackendservicesGethealth, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getHealth(
    params: ParamsResourceBackendservicesGethealth,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceBackendservicesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceBackendservicesGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceBackendservicesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceBackendservicesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceBackendservicesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.getIamPolicy({
    *     // Requested IAM Policy version.
    *     optionsRequestedPolicyVersion: 'placeholder-value',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // Name or id of the resource for this request.
    *     resource: '[a-z](?:[-a-z0-9_]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "rules": [],
    *   //   "version": 0
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
  def getIamPolicy(params: ParamsResourceBackendservicesGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceBackendservicesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackendservicesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackendservicesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceBackendservicesInsert,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceBackendservicesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceBackendservicesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a BackendService resource in the specified project using the data included in the request. For more information, see Backend services overview .
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.insert({
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "affinityCookieTtlSec": 0,
    *       //   "backends": [],
    *       //   "cdnPolicy": {},
    *       //   "circuitBreakers": {},
    *       //   "compressionMode": "my_compressionMode",
    *       //   "connectionDraining": {},
    *       //   "connectionTrackingPolicy": {},
    *       //   "consistentHash": {},
    *       //   "creationTimestamp": "my_creationTimestamp",
    *       //   "customRequestHeaders": [],
    *       //   "customResponseHeaders": [],
    *       //   "description": "my_description",
    *       //   "edgeSecurityPolicy": "my_edgeSecurityPolicy",
    *       //   "enableCDN": false,
    *       //   "failoverPolicy": {},
    *       //   "fingerprint": "my_fingerprint",
    *       //   "healthChecks": [],
    *       //   "iap": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "loadBalancingScheme": "my_loadBalancingScheme",
    *       //   "localityLbPolicies": [],
    *       //   "localityLbPolicy": "my_localityLbPolicy",
    *       //   "logConfig": {},
    *       //   "maxStreamDuration": {},
    *       //   "name": "my_name",
    *       //   "network": "my_network",
    *       //   "outlierDetection": {},
    *       //   "port": 0,
    *       //   "portName": "my_portName",
    *       //   "protocol": "my_protocol",
    *       //   "region": "my_region",
    *       //   "securityPolicy": "my_securityPolicy",
    *       //   "securitySettings": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "selfLinkWithId": "my_selfLinkWithId",
    *       //   "serviceBindings": [],
    *       //   "serviceLbPolicy": "my_serviceLbPolicy",
    *       //   "sessionAffinity": "my_sessionAffinity",
    *       //   "subsetting": {},
    *       //   "timeoutSec": 0,
    *       //   "vpcNetworkScope": "my_vpcNetworkScope"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def insert(params: ParamsResourceBackendservicesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceBackendservicesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(callback: BodyResponseCallback[SchemaBackendServiceList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(params: ParamsResourceBackendservicesList): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(
    params: ParamsResourceBackendservicesList,
    callback: BodyResponseCallback[SchemaBackendServiceList]
  ): Unit = js.native
  def list(
    params: ParamsResourceBackendservicesList,
    options: BodyResponseCallback[Readable | SchemaBackendServiceList],
    callback: BodyResponseCallback[Readable | SchemaBackendServiceList]
  ): Unit = js.native
  def list(params: ParamsResourceBackendservicesList, options: MethodOptions): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(
    params: ParamsResourceBackendservicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendServiceList]
  ): Unit = js.native
  /**
    * Retrieves the list of BackendService resources available to the specified project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.list({
    *     // A filter expression that filters resources listed in the response. Most Compute resources support two types of filter expressions: expressions that support regular expressions and expressions that follow API improvement proposal AIP-160. If you want to use AIP-160, your expression must specify the field name, an operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The operator must be either `=`, `!=`, `\>`, `<`, `<=`, `\>=` or `:`. For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`. The `:` operator can be used with string fields to match substrings. For non-string fields it is equivalent to the `=` operator. The `:*` comparison can be used to test whether a key has been defined. For example, to find all objects with `owner` label use: ``` labels.owner:* ``` You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels. To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true) ``` If you want to use a regular expression, use the `eq` (equal) or `ne` (not equal) operator against a single un-parenthesized expression with or without quotes or against multiple parenthesized expressions. Examples: `fieldname eq unquoted literal` `fieldname eq 'single quoted literal'` `fieldname eq "double quoted literal"` `(fieldname1 eq literal) (fieldname2 ne "literal")` The literal value is interpreted as a regular expression using Google RE2 library syntax. The literal value must match the entire field. For example, to filter for instances that do not end with name "instance", you would use `name ne .*instance`.
    *     filter: 'placeholder-value',
    *     // The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
    *     maxResults: 'placeholder-value',
    *     // Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name. You can also sort results in descending order based on the creation timestamp using `orderBy="creationTimestamp desc"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first. Currently, only sorting by `name` or `creationTimestamp desc` is supported.
    *     orderBy: 'placeholder-value',
    *     // Specifies a page token to use. Set `pageToken` to the `nextPageToken` returned by a previous list request to get the next page of results.
    *     pageToken: 'placeholder-value',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // Opt-in for partial success behavior which provides partial results in case of failure. The default value is false.
    *     returnPartialSuccess: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "selfLink": "my_selfLink",
    *   //   "warning": {}
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
  def list(params: ParamsResourceBackendservicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBackendservicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceBackendservicesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceBackendservicesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceBackendservicesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceBackendservicesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceBackendservicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Patches the specified BackendService resource with the data included in the request. For more information, see Backend services overview. This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.patch({
    *     // Name of the BackendService resource to patch.
    *     backendService: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "affinityCookieTtlSec": 0,
    *       //   "backends": [],
    *       //   "cdnPolicy": {},
    *       //   "circuitBreakers": {},
    *       //   "compressionMode": "my_compressionMode",
    *       //   "connectionDraining": {},
    *       //   "connectionTrackingPolicy": {},
    *       //   "consistentHash": {},
    *       //   "creationTimestamp": "my_creationTimestamp",
    *       //   "customRequestHeaders": [],
    *       //   "customResponseHeaders": [],
    *       //   "description": "my_description",
    *       //   "edgeSecurityPolicy": "my_edgeSecurityPolicy",
    *       //   "enableCDN": false,
    *       //   "failoverPolicy": {},
    *       //   "fingerprint": "my_fingerprint",
    *       //   "healthChecks": [],
    *       //   "iap": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "loadBalancingScheme": "my_loadBalancingScheme",
    *       //   "localityLbPolicies": [],
    *       //   "localityLbPolicy": "my_localityLbPolicy",
    *       //   "logConfig": {},
    *       //   "maxStreamDuration": {},
    *       //   "name": "my_name",
    *       //   "network": "my_network",
    *       //   "outlierDetection": {},
    *       //   "port": 0,
    *       //   "portName": "my_portName",
    *       //   "protocol": "my_protocol",
    *       //   "region": "my_region",
    *       //   "securityPolicy": "my_securityPolicy",
    *       //   "securitySettings": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "selfLinkWithId": "my_selfLinkWithId",
    *       //   "serviceBindings": [],
    *       //   "serviceLbPolicy": "my_serviceLbPolicy",
    *       //   "sessionAffinity": "my_sessionAffinity",
    *       //   "subsetting": {},
    *       //   "timeoutSec": 0,
    *       //   "vpcNetworkScope": "my_vpcNetworkScope"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def patch(params: ParamsResourceBackendservicesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBackendservicesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setEdgeSecurityPolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setEdgeSecurityPolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setEdgeSecurityPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setEdgeSecurityPolicy(params: ParamsResourceBackendservicesSetedgesecuritypolicy): GaxiosPromise[SchemaOperation] = js.native
  def setEdgeSecurityPolicy(
    params: ParamsResourceBackendservicesSetedgesecuritypolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setEdgeSecurityPolicy(
    params: ParamsResourceBackendservicesSetedgesecuritypolicy,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setEdgeSecurityPolicy(params: ParamsResourceBackendservicesSetedgesecuritypolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setEdgeSecurityPolicy(
    params: ParamsResourceBackendservicesSetedgesecuritypolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets the edge security policy for the specified backend service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.setEdgeSecurityPolicy({
    *     // Name of the BackendService resource to which the edge security policy should be set. The name should conform to RFC1035.
    *     backendService: 'placeholder-value',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "securityPolicy": "my_securityPolicy"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def setEdgeSecurityPolicy(params: ParamsResourceBackendservicesSetedgesecuritypolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setEdgeSecurityPolicy(
    params: ParamsResourceBackendservicesSetedgesecuritypolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceBackendservicesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceBackendservicesSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceBackendservicesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceBackendservicesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceBackendservicesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.setIamPolicy({
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // Name or id of the resource for this request.
    *     resource: '[a-z](?:[-a-z0-9_]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bindings": [],
    *       //   "etag": "my_etag",
    *       //   "policy": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "rules": [],
    *   //   "version": 0
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
  def setIamPolicy(params: ParamsResourceBackendservicesSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceBackendservicesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setSecurityPolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setSecurityPolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setSecurityPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSecurityPolicy(params: ParamsResourceBackendservicesSetsecuritypolicy): GaxiosPromise[SchemaOperation] = js.native
  def setSecurityPolicy(
    params: ParamsResourceBackendservicesSetsecuritypolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSecurityPolicy(
    params: ParamsResourceBackendservicesSetsecuritypolicy,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setSecurityPolicy(params: ParamsResourceBackendservicesSetsecuritypolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSecurityPolicy(
    params: ParamsResourceBackendservicesSetsecuritypolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Sets the Google Cloud Armor security policy for the specified backend service. For more information, see Google Cloud Armor Overview
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.setSecurityPolicy({
    *     // Name of the BackendService resource to which the security policy should be set. The name should conform to RFC1035.
    *     backendService: 'placeholder-value',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "securityPolicy": "my_securityPolicy"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def setSecurityPolicy(params: ParamsResourceBackendservicesSetsecuritypolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setSecurityPolicy(
    params: ParamsResourceBackendservicesSetsecuritypolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceBackendservicesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBackendservicesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceBackendservicesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceBackendservicesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBackendservicesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.testIamPermissions({
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // Name or id of the resource for this request.
    *     resource: '[a-z](?:[-a-z0-9_]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "permissions": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(params: ParamsResourceBackendservicesTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceBackendservicesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceBackendservicesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceBackendservicesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceBackendservicesUpdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceBackendservicesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceBackendservicesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the specified BackendService resource with the data included in the request. For more information, see Backend services overview.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/compute.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const compute = google.compute('alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await compute.backendServices.update({
    *     // Name of the BackendService resource to update.
    *     backendService: '[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?|[1-9][0-9]{0,19}',
    *     // Project ID for this request.
    *     project:
    *       '(?:(?:[-a-z0-9]{1,63}.)*(?:[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?):)?(?:[0-9]{1,19}|(?:[a-z0-9](?:[-a-z0-9]{0,61}[a-z0-9])?))',
    *     // An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "affinityCookieTtlSec": 0,
    *       //   "backends": [],
    *       //   "cdnPolicy": {},
    *       //   "circuitBreakers": {},
    *       //   "compressionMode": "my_compressionMode",
    *       //   "connectionDraining": {},
    *       //   "connectionTrackingPolicy": {},
    *       //   "consistentHash": {},
    *       //   "creationTimestamp": "my_creationTimestamp",
    *       //   "customRequestHeaders": [],
    *       //   "customResponseHeaders": [],
    *       //   "description": "my_description",
    *       //   "edgeSecurityPolicy": "my_edgeSecurityPolicy",
    *       //   "enableCDN": false,
    *       //   "failoverPolicy": {},
    *       //   "fingerprint": "my_fingerprint",
    *       //   "healthChecks": [],
    *       //   "iap": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "loadBalancingScheme": "my_loadBalancingScheme",
    *       //   "localityLbPolicies": [],
    *       //   "localityLbPolicy": "my_localityLbPolicy",
    *       //   "logConfig": {},
    *       //   "maxStreamDuration": {},
    *       //   "name": "my_name",
    *       //   "network": "my_network",
    *       //   "outlierDetection": {},
    *       //   "port": 0,
    *       //   "portName": "my_portName",
    *       //   "protocol": "my_protocol",
    *       //   "region": "my_region",
    *       //   "securityPolicy": "my_securityPolicy",
    *       //   "securitySettings": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "selfLinkWithId": "my_selfLinkWithId",
    *       //   "serviceBindings": [],
    *       //   "serviceLbPolicy": "my_serviceLbPolicy",
    *       //   "sessionAffinity": "my_sessionAffinity",
    *       //   "subsetting": {},
    *       //   "timeoutSec": 0,
    *       //   "vpcNetworkScope": "my_vpcNetworkScope"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientOperationId": "my_clientOperationId",
    *   //   "creationTimestamp": "my_creationTimestamp",
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "httpErrorMessage": "my_httpErrorMessage",
    *   //   "httpErrorStatusCode": 0,
    *   //   "id": "my_id",
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "operationGroupId": "my_operationGroupId",
    *   //   "operationType": "my_operationType",
    *   //   "progress": 0,
    *   //   "region": "my_region",
    *   //   "selfLink": "my_selfLink",
    *   //   "selfLinkWithId": "my_selfLinkWithId",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "user": "my_user",
    *   //   "warnings": [],
    *   //   "zone": "my_zone"
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
  def update(params: ParamsResourceBackendservicesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceBackendservicesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
