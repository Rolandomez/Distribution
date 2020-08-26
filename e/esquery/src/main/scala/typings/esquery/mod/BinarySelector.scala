package typings.esquery.mod

import typings.esquery.esqueryStrings.adjacent
import typings.esquery.esqueryStrings.child
import typings.esquery.esqueryStrings.descendant
import typings.esquery.esqueryStrings.sibling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.esquery.mod.Descendant
  - typings.esquery.mod.Child
  - typings.esquery.mod.Sibling
  - typings.esquery.mod.Adjacent
*/
trait BinarySelector extends SubjectSelector

object BinarySelector {
  @scala.inline
  def Descendant(left: SubjectSelector, right: SubjectSelector, `type`: descendant): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
  @scala.inline
  def Child(left: SubjectSelector, right: SubjectSelector, `type`: child): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
  @scala.inline
  def Sibling(left: SubjectSelector, right: SubjectSelector, `type`: sibling): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
  @scala.inline
  def Adjacent(left: SubjectSelector, right: SubjectSelector, `type`: adjacent): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
}

