package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides handling of array formulas in a cell range. */
trait XArrayFormulaRange
  extends StObject
     with XInterface {
  
  /** returns the array formula of the range or an empty string, if the range does not contain an array formula. */
  var ArrayFormula: String
  
  /** returns the array formula of the range or an empty string, if the range does not contain an array formula. */
  def getArrayFormula(): String
  
  /**
    * applies the array formula to the entire cell range.
    * @param aFormula the formula that will be applied as array formula. Passing an empty string erases an existing array formula.
    */
  def setArrayFormula(aFormula: String): Unit
}
object XArrayFormulaRange {
  
  inline def apply(
    ArrayFormula: String,
    acquire: () => Unit,
    getArrayFormula: () => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    setArrayFormula: String => Unit
  ): XArrayFormulaRange = {
    val __obj = js.Dynamic.literal(ArrayFormula = ArrayFormula.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getArrayFormula = js.Any.fromFunction0(getArrayFormula), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setArrayFormula = js.Any.fromFunction1(setArrayFormula))
    __obj.asInstanceOf[XArrayFormulaRange]
  }
  
  extension [Self <: XArrayFormulaRange](x: Self) {
    
    inline def setArrayFormula(value: String): Self = StObject.set(x, "ArrayFormula", value.asInstanceOf[js.Any])
    
    inline def setGetArrayFormula(value: () => String): Self = StObject.set(x, "getArrayFormula", js.Any.fromFunction0(value))
    
    inline def setSetArrayFormula(value: String => Unit): Self = StObject.set(x, "setArrayFormula", js.Any.fromFunction1(value))
  }
}
