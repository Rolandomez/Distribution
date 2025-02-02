package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorForDateRange
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithIds
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded audiences. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var campaign = AdsApp.campaigns().get().next();
  *      var excludedAudienceSelector = campaign.targeting().excludedAudiences();
  *
  *      var excludedAudienceIterator = excludedAudienceSelector.get();
  *      while (excludedAudienceIterator.hasNext()) {
  *        var excludedAudience = excludedAudienceIterator.next();
  *      }
  */
@js.native
trait SearchCampaignExcludedAudienceSelector
  extends StObject
     with Selector[SearchCampaignExcludedAudienceIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
