package typings.firebaseAuth.distNodeIndexDotnodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/node/index.node", "EmailAuthCredential")
@js.native
/** @internal */
/* private */ open class EmailAuthCredential ()
  extends typings.firebaseAuth.distNodeMod.EmailAuthCredential
/* static members */
object EmailAuthCredential {
  
  @JSImport("@firebase/auth/dist/node/index.node", "EmailAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromEmailAndCode(email: String, oobCode: String): typings.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential]
  inline def _fromEmailAndCode(email: String, oobCode: String, tenantId: String): typings.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential]
  
  /** @internal */
  inline def _fromEmailAndPassword(email: String, password: String): typings.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndPassword")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential]
  
  inline def fromJSON(json: String): typings.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
  /**
    * Static method to deserialize a JSON representation of an object into an {@link  AuthCredential}.
    *
    * @param json - Either `object` or the stringified representation of the object. When string is
    * provided, `JSON.parse` would be called first.
    *
    * @returns If the JSON input does not represent an {@link AuthCredential}, null is returned.
    */
  inline def fromJSON(json: js.Object): typings.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distNodeSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
}
