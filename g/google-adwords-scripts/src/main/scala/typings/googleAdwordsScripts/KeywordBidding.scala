package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeywordBidding
  extends StObject
     with AdWordsBidding
     with canSetBiddingStrategy {
  
  def clearStrategy(): Unit = js.native
  
  def getCpc(): Double = js.native
  
  def getCpm(): Double = js.native
  
  def setCpc(cpc: Double): Unit = js.native
  
  def setCpm(cpm: Double): Unit = js.native
}
