package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeLimitE
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "LimitExceededException")
@js.native
open class LimitExceededException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeLimitE) = this()
  
  @JSName("$fault")
  val $fault_LimitExceededException: client = js.native
  
  @JSName("name")
  val name_LimitExceededException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.LimitExceededException = js.native
}
