package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for collecting and executing a set of SQL statements. */
trait XBatchExecution
  extends StObject
     with XInterface {
  
  /**
    * adds a SQL command to the current batch of commands for the statement object.
    * @param sql the SQL statement which should be appended to the batch.
    * @throws SQLException if a database access error occurs.
    */
  def addBatch(sql: String): Unit
  
  /**
    * makes the set of commands in the current batch empty.
    * @throws SQLException if a database access error occurs.
    */
  def clearBatch(): Unit
  
  /**
    * submits a batch of commands to the database for execution.
    * @returns an array of update counts containing one element for each command in the batch. The array is ordered according to the order in which commands wer
    * @throws SQLException if a database access error occurs.
    */
  def executeBatch(): SafeArray[Double]
}
object XBatchExecution {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addBatch: String => Unit,
    clearBatch: () => Unit,
    executeBatch: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBatchExecution = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addBatch = js.Any.fromFunction1(addBatch), clearBatch = js.Any.fromFunction0(clearBatch), executeBatch = js.Any.fromFunction0(executeBatch), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBatchExecution]
  }
  
  @scala.inline
  implicit class XBatchExecutionMutableBuilder[Self <: XBatchExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddBatch(value: String => Unit): Self = StObject.set(x, "addBatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearBatch(value: () => Unit): Self = StObject.set(x, "clearBatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecuteBatch(value: () => SafeArray[Double]): Self = StObject.set(x, "executeBatch", js.Any.fromFunction0(value))
  }
}
