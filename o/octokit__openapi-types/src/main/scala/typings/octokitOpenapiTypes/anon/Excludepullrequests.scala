package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Excludepullrequests extends StObject {
  
  var exclude_pull_requests: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['exclude-pull-requests'] */ js.Any
  ] = js.undefined
}
object Excludepullrequests {
  
  inline def apply(): Excludepullrequests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Excludepullrequests]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Excludepullrequests] (val x: Self) extends AnyVal {
    
    inline def setExclude_pull_requests(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['exclude-pull-requests'] */ js.Any
    ): Self = StObject.set(x, "exclude_pull_requests", value.asInstanceOf[js.Any])
    
    inline def setExclude_pull_requestsUndefined: Self = StObject.set(x, "exclude_pull_requests", js.undefined)
  }
}
