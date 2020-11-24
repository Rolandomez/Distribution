package typings.bigJs.mod

import typings.bigJs.bigJsNumbers.`0`
import typings.bigJs.bigJsNumbers.`1`
import typings.bigJs.bigJsNumbers.`2`
import typings.bigJs.bigJsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.bigJs.bigJsNumbers.`0`
  - typings.bigJs.bigJsNumbers.`1`
  - typings.bigJs.bigJsNumbers.`2`
  - typings.bigJs.bigJsNumbers.`3`
*/
trait RoundingMode extends js.Object
object RoundingMode {
  
  /**
    * Rounds towards zero.
    * I.e. truncate, no rounding.
    */
  @scala.inline
  def RoundDown: `0` = 0.asInstanceOf[`0`]
  
  /**
    * Rounds towards nearest neighbour.
    * If equidistant, rounds towards even neighbour.
    */
  @scala.inline
  def RoundHalfEven: `2` = 2.asInstanceOf[`2`]
  
  /**
    * Rounds towards nearest neighbour.
    * If equidistant, rounds away from zero.
    */
  @scala.inline
  def RoundHalfUp: `1` = 1.asInstanceOf[`1`]
  
  /**
    * Rounds away from zero.
    */
  @scala.inline
  def RoundUp: `3` = 3.asInstanceOf[`3`]
}
