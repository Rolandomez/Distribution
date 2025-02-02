package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inkAnalysisLineCollection.toJSON()`. */
trait InkAnalysisLineCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InkAnalysisLineData]] = js.undefined
}
object InkAnalysisLineCollectionData {
  
  inline def apply(): InkAnalysisLineCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InkAnalysisLineCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[InkAnalysisLineData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InkAnalysisLineData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
