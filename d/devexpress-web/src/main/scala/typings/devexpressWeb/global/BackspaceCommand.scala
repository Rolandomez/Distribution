package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to move the cursor backwards and erase the character in that space.
  */
@JSGlobal("BackspaceCommand")
@js.native
class BackspaceCommand ()
  extends StObject
     with typings.devexpressWeb.BackspaceCommand {
  
  /**
    * Executes the BackspaceCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
