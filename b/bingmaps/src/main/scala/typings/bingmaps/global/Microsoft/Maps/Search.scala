package typings.bingmaps.global.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an easy method for geocoding address and searching for points of interest from JavaScript.
  * @requires The Microsoft.Maps.Search module.
  */
object Search {
  
  @JSGlobal("Microsoft.Maps.Search.MatchCode")
  @js.native
  object MatchCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Search.MatchCode with Double] = js.native
    
    /* 2 */ val ambiguous: typings.bingmaps.Microsoft.Maps.Search.MatchCode.ambiguous with Double = js.native
    
    /* 1 */ val good: typings.bingmaps.Microsoft.Maps.Search.MatchCode.good with Double = js.native
    
    /* 4 */ val modified: typings.bingmaps.Microsoft.Maps.Search.MatchCode.modified with Double = js.native
    
    /* 0 */ val none: typings.bingmaps.Microsoft.Maps.Search.MatchCode.none with Double = js.native
    
    /* 3 */ val upHierarchy: typings.bingmaps.Microsoft.Maps.Search.MatchCode.upHierarchy with Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Search.MatchConfidence")
  @js.native
  object MatchConfidence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Search.MatchConfidence with Double] = js.native
    
    /* 0 */ val high: typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.high with Double = js.native
    
    /* 2 */ val low: typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.low with Double = js.native
    
    /* 1 */ val medium: typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.medium with Double = js.native
    
    /* 3 */ val unknown: typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.unknown with Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Search.SearchManager")
  @js.native
  class SearchManager protected ()
    extends typings.bingmaps.Microsoft.Maps.Search.SearchManager {
    /**
      * @constructor
      * @requires The Microsoft.Maps.Search module.
      * @param map A Map object
      */
    def this(map: typings.bingmaps.Microsoft.Maps.Map) = this()
  }
}
