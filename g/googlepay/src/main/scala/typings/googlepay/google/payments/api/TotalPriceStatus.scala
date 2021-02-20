package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of the total price used.
  *
  * Options:
  *
  * - `NOT_CURRENTLY_KNOWN`:
  *   The total price is not known currently.
  *
  * - `ESTIMATED`:
  *   The total price provided is an estimated price. The final price may
  *   change depending on the selected shipping address or billing address,
  *   if requested.
  *
  * - `FINAL`:
  *   The total price is the final total price of the transaction, and will
  *   not change based on selections made by the buyer.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN
  - typings.googlepay.googlepayStrings.ESTIMATED
  - typings.googlepay.googlepayStrings.FINAL
*/
trait TotalPriceStatus extends StObject
object TotalPriceStatus {
  
  @scala.inline
  def ESTIMATED: typings.googlepay.googlepayStrings.ESTIMATED = "ESTIMATED".asInstanceOf[typings.googlepay.googlepayStrings.ESTIMATED]
  
  @scala.inline
  def FINAL: typings.googlepay.googlepayStrings.FINAL = "FINAL".asInstanceOf[typings.googlepay.googlepayStrings.FINAL]
  
  @scala.inline
  def NOT_CURRENTLY_KNOWN: typings.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN = "NOT_CURRENTLY_KNOWN".asInstanceOf[typings.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN]
}
