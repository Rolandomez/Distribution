package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChangelogsList
  extends StObject
     with StandardParameters {
  
  /**
    * Select only change logs with the specified action.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Select only change logs with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only change logs whose change time is before the specified maxChangeTime.The time should be formatted as an RFC3339 date/time string. For example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is "2015-07-18T22:54:00-04:00". In other words, the year, month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
    */
  var maxChangeTime: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Select only change logs whose change time is after the specified minChangeTime.The time should be formatted as an RFC3339 date/time string. For example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is "2015-07-18T22:54:00-04:00". In other words, the year, month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
    */
  var minChangeTime: js.UndefOr[String] = js.undefined
  
  /**
    * Select only change logs with these object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only change logs with the specified object type.
    */
  var objectType: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Select only change logs whose object ID, user name, old or new values match the search string.
    */
  var searchString: js.UndefOr[String] = js.undefined
  
  /**
    * Select only change logs with these user profile IDs.
    */
  var userProfileIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceChangelogsList {
  
  inline def apply(): ParamsResourceChangelogsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangelogsList]
  }
  
  extension [Self <: ParamsResourceChangelogsList](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setMaxChangeTime(value: String): Self = StObject.set(x, "maxChangeTime", value.asInstanceOf[js.Any])
    
    inline def setMaxChangeTimeUndefined: Self = StObject.set(x, "maxChangeTime", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMinChangeTime(value: String): Self = StObject.set(x, "minChangeTime", value.asInstanceOf[js.Any])
    
    inline def setMinChangeTimeUndefined: Self = StObject.set(x, "minChangeTime", js.undefined)
    
    inline def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    inline def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value*))
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    inline def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
    inline def setUserProfileIds(value: js.Array[String]): Self = StObject.set(x, "userProfileIds", value.asInstanceOf[js.Any])
    
    inline def setUserProfileIdsUndefined: Self = StObject.set(x, "userProfileIds", js.undefined)
    
    inline def setUserProfileIdsVarargs(value: String*): Self = StObject.set(x, "userProfileIds", js.Array(value*))
  }
}
