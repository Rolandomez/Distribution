package typings.ncp.mod

import typings.ncp.anon.OptionserrsPathLike
import typings.ncp.anon.Optionserrsundefined
import typings.ncp.anon.OptionsstopOnErrtrue
import typings.node.fsMod.WriteStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ncp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(
    source: String,
    destination: String,
    callback: js.Function1[/* err */ js.Array[Error] | Null, Unit]
  ): Unit = js.native
  def apply(
    source: String,
    destination: String,
    options: OptionserrsPathLike,
    callback: js.Function1[/* err */ WriteStream | Null, Unit]
  ): Unit = js.native
  def apply(
    source: String,
    destination: String,
    options: Optionserrsundefined,
    callback: js.Function1[/* err */ js.Array[Error] | Null, Unit]
  ): Unit = js.native
  def apply(
    source: String,
    destination: String,
    options: OptionsstopOnErrtrue,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  def apply(
    source: String,
    destination: String,
    options: Options,
    callback: js.Function1[/* err */ Error | js.Array[Error] | WriteStream | Null, Unit]
  ): Unit = js.native
  
  /**
    * **NOTE:** This function provides design-time support for util.promisify.
    *
    * It does not exist at runtime.
    */
  def __promisify__(source: String, destination: String): js.Promise[Unit] = js.native
  def __promisify__(source: String, destination: String, options: Options): js.Promise[Unit] = js.native
  
  var ncp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ncp */ js.Any = js.native
}
