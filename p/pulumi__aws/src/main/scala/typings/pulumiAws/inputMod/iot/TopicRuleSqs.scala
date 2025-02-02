package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleSqs extends StObject {
  
  /**
    * The URL of the Amazon SQS queue.
    */
  var queueUrl: Input[String]
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String]
  
  /**
    * Specifies whether to use Base64 encoding.
    */
  var useBase64: Input[Boolean]
}
object TopicRuleSqs {
  
  inline def apply(queueUrl: Input[String], roleArn: Input[String], useBase64: Input[Boolean]): TopicRuleSqs = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], useBase64 = useBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleSqs]
  }
  
  extension [Self <: TopicRuleSqs](x: Self) {
    
    inline def setQueueUrl(value: Input[String]): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setUseBase64(value: Input[Boolean]): Self = StObject.set(x, "useBase64", value.asInstanceOf[js.Any])
  }
}
