package typings.mockAwsS3.mod

import typings.awsSdk.clientsS3Mod.ClientConfiguration
import typings.awsSdk.libS3ManagedUploadMod.ManagedUpload.ManagedUploadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-aws-s3", "S3")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class S3 ()
  extends typings.awsSdk.mod.S3 {
  def this(options: ClientConfiguration) = this()
}
object S3 {
  
  @JSImport("mock-aws-s3", "S3.ManagedUpload")
  @js.native
  open class ManagedUpload protected ()
    extends typings.awsSdk.mod.S3.ManagedUpload {
    /**
      * Creates a managed upload object with a set of configuration options.
      */
    def this(options: ManagedUploadOptions) = this()
  }
  /* static members */
  object ManagedUpload {
    
    @JSImport("mock-aws-s3", "S3.ManagedUpload")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default value: 10000
      */
    @JSImport("mock-aws-s3", "S3.ManagedUpload.maxTotalParts")
    @js.native
    def maxTotalParts: Double = js.native
    inline def maxTotalParts_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxTotalParts")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the minimum number of bytes for an individual part upload.
      * Note: Minimum allowed size is 5 MB.
      * 1024 * 5
      */
    @JSImport("mock-aws-s3", "S3.ManagedUpload.minPartSize")
    @js.native
    def minPartSize: Double = js.native
    inline def minPartSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPartSize")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mock-aws-s3", "S3.PresignedPost")
  @js.native
  open class PresignedPost ()
    extends typings.awsSdk.mod.S3.PresignedPost
}
