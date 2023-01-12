package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideDBFunctionBuilder extends StObject {
  
  /**
    * Adds the values of two or more integer fields.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myAddingFunction = functionBuilder.add();
    * myAddingFunction = functionBuilder.field('order');
    * myAddingFunction = functionBuilder.field('priority');
    * myAddingFunction = functionBuilder.build();
    */
  def add(): GlideDBFunctionBuilder
  
  /**
    * Builds the database function defined by the GlideDBFunctionBuilder object.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myAddingFunction = functionBuilder.add();
    * myAddingFunction = functionBuilder.field('order');
    * myAddingFunction = functionBuilder.field('priority');
    * myAddingFunction = functionBuilder.build();
    * gs.print(myAddingFunction);
    */
  def build(): String
  
  /**
    * Concatenates the values of two or more fields.
    * Use the `field(String field)` method to define fields on which the operation is performed.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myConcatFunction = functionBuilder.concat();
    * myConcatFunction = functionBuilder.field('short_description');
    * myConcatFunction = functionBuilder.field('caller_id.name');
    * myConcatFunction = functionBuilder.build();
    */
  def concat(): GlideDBFunctionBuilder
  
  /**
    * Defines a constant value to use in the function. If used with the `dayofweek()` method, the
    * string defines whether to use Sunday or Monday as the first day of the week.
    *
    * @param constant A constant value used in a function.
    *
    * When used with the `dayofweek()` method, the value defines whether the week starts on a Sunday or
    * Monday.
    *
    * - 1: Week begins on Sunday.
    * - 2: Week begins on Monday.
    *
    * This definition enables the `dayofweek()` method to return the correct day of the week from a
    * given date. If a value other than 1 or 2 is provided, the `dayofweek()` method uses Sunday as
    * the first day of the week.
    */
  def constant(constant: String): GlideDBFunctionBuilder
  
  /**
    * Determines the duration using a given start date/time and end date/time.
    * Use the `field(String field)` method to define start and end date/time fields.
    */
  def datediff(): GlideDBFunctionBuilder
  
  /**
    * Returns an integer representing the day of the week for a given date.
    *
    * @returns If the first day of the week is set to Sunday in the constant(String
    * constant) method, return values are associated with the following days
    * of the week:
    *
    * - 1: Sunday
    * - 2: Monday
    * - 3: Tuesday
    * - 4: Wednesday
    * - 5: Thursday
    * - 6: Friday
    * - 7: Saturday
    *
    * If the first day of the week is set to Monday:
    *
    * - 1: Monday
    * - 2: Tuesday
    * - 3: Wednesday
    * - 4: Thursday
    * - 5: Friday
    * - 6: Saturday
    * - 7: Sunday
    *
    * If a value other than 1 or 2 is provided in the `constant(String constant)` method, the
    * `dayofweek()` method uses Sunday as the first day of the week.
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var dayOfWeekFunction = functionBuilder.dayofweek();
    * dayOfWeekFunction = functionBuilder.field('opened_at');
    * dayOfWeekFunction = functionBuilder.constant('2');
    * dayOfWeekFunction = functionBuilder.build();
    *
    * var gr = new GlideRecord('incident');
    * gr.addFunction(dayOfWeekFunction);
    * gr.query();
    * while(gr.next())
    *   gs.log(gr.getValue(dayOfWeekFunction));
    *
    */
  def dayofweek(): GlideDBFunctionBuilder
  
  /**
    * Divides the value of one integer field by another.
    * Use the `field(String field)` method to define fields on which the operation is performed.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myDivideFunction = functionBuilder.divide();
    * myDivideFunction = functionBuilder.field('order');
    * myDivideFunction = functionBuilder.field('priority');
    * myDivideFunction = functionBuilder.build();
    */
  def divide(): GlideDBFunctionBuilder
  
  /**
    * Defines a field on which a SQL operation is performed.
    *
    * @param field The field on which you are performing the SQL operation.
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myAddingFunction = functionBuilder.add();
    * myAddingFunction = functionBuilder.field('order');
    * myAddingFunction = functionBuilder.field('priority');
    * myAddingFunction = functionBuilder.build();
    */
  def field(field: String): GlideDBFunctionBuilder
  
  /**
    * Determines the number of code units in a field.
    * Use the `field(String field)` method to define fields on which the operation is performed.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myLengthFunction = functionBuilder.length();
    * myLengthFunction = functionBuilder.field('short_description');
    * myLengthFunction = functionBuilder.build();
    *
    */
  def length(): GlideDBFunctionBuilder
  
  /**
    * Multiplies the values of two integer fields.
    * Use the `field(String field)` method to define fields on which the operation is performed.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var myMultiplyFunction = functionBuilder.multiply();
    * myMultiplyFunction = functionBuilder.field('order');
    * myMultiplyFunction = functionBuilder.field('priority');
    * myMultiplyFunction = functionBuilder.build();
    */
  def multiply(): GlideDBFunctionBuilder
  
  /**
    * Subtracts the value of one integer field from another.
    * Use the `field(String field)` method to define fields on which the operation is performed.
    *
    * @example
    *
    * var functionBuilder = new GlideDBFunctionBuilder();
    * var mySubtractFunction = functionBuilder.subtract();
    * mySubtractFunction = functionBuilder.field('order');
    * mySubtractFunction = functionBuilder.field('priority');
    * mySubtractFunction = functionBuilder.build();
    */
  def subtract(): GlideDBFunctionBuilder
}
object GlideDBFunctionBuilder {
  
  inline def apply(
    add: () => GlideDBFunctionBuilder,
    build: () => String,
    concat: () => GlideDBFunctionBuilder,
    constant: String => GlideDBFunctionBuilder,
    datediff: () => GlideDBFunctionBuilder,
    dayofweek: () => GlideDBFunctionBuilder,
    divide: () => GlideDBFunctionBuilder,
    field: String => GlideDBFunctionBuilder,
    length: () => GlideDBFunctionBuilder,
    multiply: () => GlideDBFunctionBuilder,
    subtract: () => GlideDBFunctionBuilder
  ): GlideDBFunctionBuilder = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction0(add), build = js.Any.fromFunction0(build), concat = js.Any.fromFunction0(concat), constant = js.Any.fromFunction1(constant), datediff = js.Any.fromFunction0(datediff), dayofweek = js.Any.fromFunction0(dayofweek), divide = js.Any.fromFunction0(divide), field = js.Any.fromFunction1(field), length = js.Any.fromFunction0(length), multiply = js.Any.fromFunction0(multiply), subtract = js.Any.fromFunction0(subtract))
    __obj.asInstanceOf[GlideDBFunctionBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlideDBFunctionBuilder] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: () => GlideDBFunctionBuilder): Self = StObject.set(x, "add", js.Any.fromFunction0(value))
    
    inline def setBuild(value: () => String): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setConcat(value: () => GlideDBFunctionBuilder): Self = StObject.set(x, "concat", js.Any.fromFunction0(value))
    
    inline def setConstant(value: String => GlideDBFunctionBuilder): Self = StObject.set(x, "constant", js.Any.fromFunction1(value))
    
    inline def setDatediff(value: () => GlideDBFunctionBuilder): Self = StObject.set(x, "datediff", js.Any.fromFunction0(value))
    
    inline def setDayofweek(value: () => GlideDBFunctionBuilder): Self = StObject.set(x, "dayofweek", js.Any.fromFunction0(value))
    
    inline def setDivide(value: () => GlideDBFunctionBuilder): Self = StObject.set(x, "divide", js.Any.fromFunction0(value))
    
    inline def setField(value: String => GlideDBFunctionBuilder): Self = StObject.set(x, "field", js.Any.fromFunction1(value))
    
    inline def setLength(value: () => GlideDBFunctionBuilder): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    inline def setMultiply(value: () => GlideDBFunctionBuilder): Self = StObject.set(x, "multiply", js.Any.fromFunction0(value))
    
    inline def setSubtract(value: () => GlideDBFunctionBuilder): Self = StObject.set(x, "subtract", js.Any.fromFunction0(value))
  }
}
