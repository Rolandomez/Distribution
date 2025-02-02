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
  * Fetches audiences. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *  var audienceSelector = AdsApp.display()
  *      .audiences()
  *      .withCondition("Impressions > 100")
  *      .forDateRange("LAST_MONTH")
  *      .orderBy("Clicks DESC");
  *
  *  var audienceIterator = audienceSelector.get();
  *  while (audienceIterator.hasNext()) {
  *    var audience = audienceIterator.next();
  *  }
  */
@js.native
trait AudienceSelector
  extends StObject
     with Selector[AudienceIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
