package typings.stripe.mod.paymentMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.paymentMethods.IPaymentMethod['type'] */
/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.card
  - typings.stripe.stripeStrings.card_present
*/
trait IPaymentMethodType extends js.Object
object IPaymentMethodType {
  
  @scala.inline
  def card: typings.stripe.stripeStrings.card = "card".asInstanceOf[typings.stripe.stripeStrings.card]
  
  @scala.inline
  def card_present: typings.stripe.stripeStrings.card_present = "card_present".asInstanceOf[typings.stripe.stripeStrings.card_present]
}
