package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemoteworkersV1test2Blob extends StObject {
  
  /**
    * The contents of the blob.
    */
  var contents: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The digest of the blob. This should be verified by the receiver.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.undefined
}
object SchemaGoogleDevtoolsRemoteworkersV1test2Blob {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2Blob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2Blob]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteworkersV1test2Blob](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsNull: Self = StObject.set(x, "contents", null)
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setDigest(value: SchemaGoogleDevtoolsRemoteworkersV1test2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
  }
}
