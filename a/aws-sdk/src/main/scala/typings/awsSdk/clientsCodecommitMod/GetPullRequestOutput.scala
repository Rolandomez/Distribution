package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPullRequestOutput extends StObject {
  
  /**
    * Information about the specified pull request.
    */
  var pullRequest: PullRequest
}
object GetPullRequestOutput {
  
  inline def apply(pullRequest: PullRequest): GetPullRequestOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPullRequestOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPullRequestOutput] (val x: Self) extends AnyVal {
    
    inline def setPullRequest(value: PullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
  }
}
