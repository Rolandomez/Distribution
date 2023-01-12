package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for establishing connections via a factory which is identified by its name. To complete the information needed for establishing a connection
  * an interaction handler is used.
  */
trait XCompletedConnection
  extends StObject
     with XInterface {
  
  /**
    * attempts to establish a database connection. If information is missing, such as a user's password, they are completed by user interaction.
    * @param handler will be asked when more information is needed
    * @returns the {@link Connection} object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def connectWithCompletion(handler: XInteractionHandler): XConnection
}
object XCompletedConnection {
  
  inline def apply(
    acquire: () => Unit,
    connectWithCompletion: XInteractionHandler => XConnection,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XCompletedConnection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCompletedConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XCompletedConnection] (val x: Self) extends AnyVal {
    
    inline def setConnectWithCompletion(value: XInteractionHandler => XConnection): Self = StObject.set(x, "connectWithCompletion", js.Any.fromFunction1(value))
  }
}
