package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerReleaseidQueryLabelName extends StObject {
  
  var path: OwnerReleaseid
  
  var query: LabelName
}
object PathOwnerReleaseidQueryLabelName {
  
  inline def apply(path: OwnerReleaseid, query: LabelName): PathOwnerReleaseidQueryLabelName = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerReleaseidQueryLabelName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerReleaseidQueryLabelName] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: LabelName): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
