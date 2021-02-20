package typings.sharedb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sharedb.mod.middleware.ApplyContext
import typings.sharedb.mod.middleware.CommitContext
import typings.sharedb.mod.middleware.ConnectContext
import typings.sharedb.mod.middleware.DocContext
import typings.sharedb.mod.middleware.OpContext
import typings.sharedb.mod.middleware.QueryContext
import typings.sharedb.mod.middleware.ReadSnapshotsContext
import typings.sharedb.mod.middleware.ReceiveContext
import typings.sharedb.mod.middleware.ReplyContext
import typings.sharedb.mod.middleware.SubmitContext
import typings.sharedb.sharedbStrings.afterSubmit
import typings.sharedb.sharedbStrings.apply
import typings.sharedb.sharedbStrings.commit
import typings.sharedb.sharedbStrings.connect
import typings.sharedb.sharedbStrings.doc
import typings.sharedb.sharedbStrings.op
import typings.sharedb.sharedbStrings.query
import typings.sharedb.sharedbStrings.readSnapshots
import typings.sharedb.sharedbStrings.receive
import typings.sharedb.sharedbStrings.reply
import typings.sharedb.sharedbStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait sharedb extends StObject {
  
  /**
    * Registers a projection that can be used from clients just like a normal collection.
    *
    * @param name name of the projection
    * @param collection name of the backing collection
    * @param fields field whitelist for the projection
    */
  def addProjection(name: String, collection: String, fields: ProjectionFields): Unit = js.native
  
  def close(): Unit = js.native
  def close(callback: BasicCallback): Unit = js.native
  
  def connect(): Connection = js.native
  def connect(connection: js.UndefOr[scala.Nothing], req: js.Any): Connection = js.native
  def connect(connection: js.Any): Connection = js.native
  def connect(connection: js.Any, req: js.Any): Connection = js.native
  
  var db: DB = js.native
  
  var extraDbs: StringDictionary[ExtraDB] = js.native
  
  def listen(stream: js.Any): Unit = js.native
  
  var pubsub: PubSub = js.native
  
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_afterSubmit(
    action: afterSubmit,
    fn: js.Function2[
      /* context */ SubmitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_apply(
    action: apply,
    fn: js.Function2[
      /* context */ ApplyContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_commit(
    action: commit,
    fn: js.Function2[
      /* context */ CommitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_connect(
    action: connect,
    fn: js.Function2[
      /* context */ ConnectContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_doc(
    action: doc,
    fn: js.Function2[
      /* context */ DocContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_op(
    action: op,
    fn: js.Function2[
      /* context */ OpContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_query(
    action: query,
    fn: js.Function2[
      /* context */ QueryContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_readSnapshots(
    action: readSnapshots,
    fn: js.Function2[
      /* context */ ReadSnapshotsContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_receive(
    action: receive,
    fn: js.Function2[
      /* context */ ReceiveContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_reply(
    action: reply,
    fn: js.Function2[
      /* context */ ReplyContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_submit(
    action: submit,
    fn: js.Function2[
      /* context */ SubmitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
}
