package typings.jsforce.connectionMod

import typings.jsforce.anon.Call
import typings.jsforce.anon.Clear
import typings.jsforce.describeResultMod.BatchDescribeSObjectOptions
import typings.jsforce.describeResultMod.DescribeGlobalResult
import typings.jsforce.describeResultMod.DescribeSObjectOptions
import typings.jsforce.describeResultMod.DescribeSObjectResult
import typings.jsforce.httpApiMod.HttpApiOptions
import typings.jsforce.queryMod.ExecuteOptions
import typings.jsforce.queryMod.Query
import typings.jsforce.queryMod.QueryResult
import typings.jsforce.recordMod.Record
import typings.jsforce.recordResultMod.RecordResult
import typings.jsforce.salesforceObjectMod.SObject
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/connection", "BaseConnection")
@js.native
abstract class BaseConnection () extends EventEmitter {
  
  def _baseUrl(): String = js.native
  
  def batchDescribe(options: BatchDescribeSObjectOptions): js.Promise[js.Array[DescribeSObjectResult]] = js.native
  def batchDescribe(
    options: BatchDescribeSObjectOptions,
    callback: js.Function2[/* err */ Error, /* result */ js.Array[DescribeSObjectResult], Unit]
  ): js.Promise[js.Array[DescribeSObjectResult]] = js.native
  
  def create[T](records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](
    records: js.Array[Record[T]],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](
    records: js.Array[Record[T]],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](
    records: Record[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](
    records: Record[T],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](`type`: String, records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](
    `type`: String,
    records: js.Array[Record[T]],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](`type`: String, records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](
    `type`: String,
    records: js.Array[Record[T]],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](`type`: String, records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](
    `type`: String,
    records: Record[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](`type`: String, records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def create[T](
    `type`: String,
    records: Record[T],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  
  def del[T](`type`: String, ids: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def del[T](
    `type`: String,
    ids: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def del[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def del[T](
    `type`: String,
    ids: String,
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def del[T](`type`: String, ids: js.Array[String]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def del[T](
    `type`: String,
    ids: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def del[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def del[T](
    `type`: String,
    ids: js.Array[String],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  
  def delete[T](`type`: String, ids: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def delete[T](
    `type`: String,
    ids: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def delete[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def delete[T](
    `type`: String,
    ids: String,
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def delete[T](`type`: String, ids: js.Array[String]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def delete[T](
    `type`: String,
    ids: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def delete[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def delete[T](
    `type`: String,
    ids: js.Array[String],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  
  def describe(`type`: String): js.Promise[DescribeSObjectResult] = js.native
  def describe(`type`: String, callback: js.Function2[/* err */ Error, /* result */ DescribeSObjectResult, Unit]): js.Promise[DescribeSObjectResult] = js.native
  def describe(`type`: DescribeSObjectOptions): js.Promise[DescribeSObjectResult] = js.native
  def describe(
    `type`: DescribeSObjectOptions,
    callback: js.Function2[/* err */ Error, /* result */ DescribeSObjectResult, Unit]
  ): js.Promise[DescribeSObjectResult] = js.native
  
  /** Returns a value from the cache if it exists, otherwise calls Connection.describe */
  @JSName("describe$")
  def describe$(`type`: String): DescribeSObjectResult = js.native
  @JSName("describe$")
  def describe$(`type`: String, callback: js.Function2[/* err */ Error, /* result */ DescribeSObjectResult, Unit]): DescribeSObjectResult = js.native
  @JSName("describe$")
  def describe$(`type`: DescribeSObjectOptions): DescribeSObjectResult = js.native
  @JSName("describe$")
  def describe$(
    `type`: DescribeSObjectOptions,
    callback: js.Function2[/* err */ Error, /* result */ DescribeSObjectResult, Unit]
  ): DescribeSObjectResult = js.native
  @JSName("describe$")
  var describe$_Original: Call = js.native
  
  def describeGlobal[T](): js.Promise[DescribeGlobalResult] = js.native
  def describeGlobal[T](callback: js.Function2[/* err */ Error, /* result */ DescribeGlobalResult, Unit]): js.Promise[DescribeGlobalResult] = js.native
  
  /** Returns a value from the cache if it exists, otherwise calls Connection.describeGlobal */
  @JSName("describeGlobal$")
  def describeGlobal$(): DescribeGlobalResult = js.native
  @JSName("describeGlobal$")
  def describeGlobal$(callback: js.Function2[/* err */ Error, /* result */ DescribeGlobalResult, Unit]): DescribeGlobalResult = js.native
  @JSName("describeGlobal$")
  var describeGlobal$_Original: Clear = js.native
  
  def destroy[T](`type`: String, ids: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def destroy[T](
    `type`: String,
    ids: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def destroy[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def destroy[T](
    `type`: String,
    ids: String,
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def destroy[T](`type`: String, ids: js.Array[String]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def destroy[T](
    `type`: String,
    ids: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def destroy[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def destroy[T](
    `type`: String,
    ids: js.Array[String],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  
  def insert[T](`type`: String, records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def insert[T](
    `type`: String,
    records: js.Array[Record[T]],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def insert[T](`type`: String, records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def insert[T](
    `type`: String,
    records: js.Array[Record[T]],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def insert[T](`type`: String, records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def insert[T](
    `type`: String,
    records: Record[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def insert[T](`type`: String, records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def insert[T](
    `type`: String,
    records: Record[T],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  
  def query[T](soql: String): Query[QueryResult[T]] = js.native
  def query[T](
    soql: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ QueryResult[T], Unit]
  ): Query[QueryResult[T]] = js.native
  def query[T](soql: String, options: ExecuteOptions): Query[QueryResult[T]] = js.native
  def query[T](
    soql: String,
    options: ExecuteOptions,
    callback: js.Function2[/* err */ Error, /* result */ QueryResult[T], Unit]
  ): Query[QueryResult[T]] = js.native
  
  def queryMore[T](locator: String): js.Promise[QueryResult[T]] = js.native
  def queryMore[T](
    locator: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ QueryResult[T], Unit]
  ): js.Promise[QueryResult[T]] = js.native
  def queryMore[T](locator: String, options: ExecuteOptions): js.Promise[QueryResult[T]] = js.native
  def queryMore[T](
    locator: String,
    options: ExecuteOptions,
    callback: js.Function2[/* err */ Error, /* result */ QueryResult[T], Unit]
  ): js.Promise[QueryResult[T]] = js.native
  
  def recent(): js.Promise[js.Array[RecordResult]] = js.native
  def recent(callback: js.Function2[/* err */ Error, /* result */ js.Array[RecordResult], Unit]): js.Promise[js.Array[RecordResult]] = js.native
  def recent(param: String): js.Promise[js.Array[RecordResult]] = js.native
  def recent(param: String, callback: js.Function2[/* err */ Error, /* result */ js.Array[RecordResult], Unit]): js.Promise[js.Array[RecordResult]] = js.native
  def recent(param: Double): js.Promise[js.Array[RecordResult]] = js.native
  def recent(param: Double, callback: js.Function2[/* err */ Error, /* result */ js.Array[RecordResult], Unit]): js.Promise[js.Array[RecordResult]] = js.native
  def recent(`type`: String, limit: Double): js.Promise[js.Array[RecordResult]] = js.native
  def recent(
    `type`: String,
    limit: Double,
    callback: js.Function2[/* err */ Error, /* result */ js.Array[RecordResult], Unit]
  ): js.Promise[js.Array[RecordResult]] = js.native
  
  def request[T](info: String): js.Promise[T] = js.native
  def request[T](
    info: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* Object */ T, Unit]
  ): js.Promise[T] = js.native
  def request[T](info: String, options: HttpApiOptions): js.Promise[T] = js.native
  def request[T](
    info: String,
    options: HttpApiOptions,
    callback: js.Function2[/* err */ Error, /* Object */ T, Unit]
  ): js.Promise[T] = js.native
  def request[T](info: RequestInfo): js.Promise[T] = js.native
  def request[T](
    info: RequestInfo,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* Object */ T, Unit]
  ): js.Promise[T] = js.native
  def request[T](info: RequestInfo, options: HttpApiOptions): js.Promise[T] = js.native
  def request[T](
    info: RequestInfo,
    options: HttpApiOptions,
    callback: js.Function2[/* err */ Error, /* Object */ T, Unit]
  ): js.Promise[T] = js.native
  
  def retrieve[T](`type`: String, ids: String): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
  def retrieve[T](
    `type`: String,
    ids: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
  ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
  def retrieve[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
  def retrieve[T](
    `type`: String,
    ids: String,
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
  ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
  def retrieve[T](`type`: String, ids: js.Array[String]): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
  def retrieve[T](
    `type`: String,
    ids: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
  ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
  def retrieve[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
  def retrieve[T](
    `type`: String,
    ids: js.Array[String],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
  ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
  
  // we want any object to be accepted if the user doesn't decide to give an explicit type
  def sobject[T](resource: String): SObject[T] = js.native
  
  def update[T](records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](
    records: js.Array[Record[T]],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](
    records: js.Array[Record[T]],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](
    records: Record[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](
    records: Record[T],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](`type`: String, records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](
    `type`: String,
    records: js.Array[Record[T]],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](`type`: String, records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](
    `type`: String,
    records: js.Array[Record[T]],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](`type`: String, records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](
    `type`: String,
    records: Record[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](`type`: String, records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def update[T](
    `type`: String,
    records: Record[T],
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  
  def upsert[T](records: js.Array[Record[T]], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](
    records: js.Array[Record[T]],
    extIdField: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](records: js.Array[Record[T]], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](
    records: js.Array[Record[T]],
    extIdField: String,
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](records: Record[T], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](
    records: Record[T],
    extIdField: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](records: Record[T], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](
    records: Record[T],
    extIdField: String,
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](`type`: String, records: js.Array[Record[T]], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](
    `type`: String,
    records: js.Array[Record[T]],
    extIdField: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](`type`: String, records: js.Array[Record[T]], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](
    `type`: String,
    records: js.Array[Record[T]],
    extIdField: String,
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](`type`: String, records: Record[T], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](
    `type`: String,
    records: Record[T],
    extIdField: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](`type`: String, records: Record[T], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  def upsert[T](
    `type`: String,
    records: Record[T],
    extIdField: String,
    options: RestApiOptions,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
  ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
}
