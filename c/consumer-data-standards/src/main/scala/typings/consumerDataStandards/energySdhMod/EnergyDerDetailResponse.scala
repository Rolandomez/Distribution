package typings.consumerDataStandards.energySdhMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AcConnections
import typings.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyDerDetailResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: AcConnections
  
  var links: Self
  
  var meta: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object EnergyDerDetailResponse {
  
  inline def apply(data: AcConnections, links: Self): EnergyDerDetailResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyDerDetailResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyDerDetailResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: AcConnections): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typings.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
