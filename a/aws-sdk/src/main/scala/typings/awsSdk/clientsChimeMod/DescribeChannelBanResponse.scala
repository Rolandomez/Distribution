package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelBanResponse extends StObject {
  
  /**
    * The details of the ban.
    */
  var ChannelBan: js.UndefOr[typings.awsSdk.clientsChimeMod.ChannelBan] = js.undefined
}
object DescribeChannelBanResponse {
  
  inline def apply(): DescribeChannelBanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelBanResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeChannelBanResponse] (val x: Self) extends AnyVal {
    
    inline def setChannelBan(value: ChannelBan): Self = StObject.set(x, "ChannelBan", value.asInstanceOf[js.Any])
    
    inline def setChannelBanUndefined: Self = StObject.set(x, "ChannelBan", js.undefined)
  }
}
