package typings.jqueryTotalStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* @description Set the value of a key to a string
* @example $.totalStorage('the_key', 'the_value');
* @description Set the value of a key to a number
* @example $.totalStorage('the_key', 800.2);
* @description Set the value of a key to a complex Array
* @example    var myArray = new Array();
*       myArray.push({name:'Jared', company:'Upstatement', zip:63124});
*       myArray.push({name:'McGruff', company:'Police', zip:60652};
*       $.totalStorage('people', myArray);
*       //to return:
*       $.totalStorage('people');
*
*/
@js.native
trait JQueryTotalStorage extends StObject {
  
  /**
    * @description Set or get a key's value
    * @param key Key to set.
    * @param value Value to set for key. If ommited, current value for key is returned.
    * @param options Not implemented.
    */
  def apply(key: String): Any = js.native
  def apply(key: String, value: Any): Any = js.native
  def apply(key: String, value: Any, options: JQueryTotalStorageOptions): Any = js.native
  def apply(key: String, value: Unit, options: JQueryTotalStorageOptions): Any = js.native
  
  /**
    * @description Delete item by key
    * @param key Key of item to delete
    */
  def deleteItem(key: String): Boolean = js.native
  
  /**
    * @description Get all set values
    */
  def getAll(): js.Array[Any] = js.native
  
  /**
    * @description Get a key's value
    * @param key Key to get.
    */
  def getItem(key: String): Any = js.native
  
  /**
    * @description Set a key's value
    * @param key Key to set.
    * @param value Value to set for key.
    */
  def setItem(key: String, value: Any): Any = js.native
}
