package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Customize Numbered List dialog.
  */
trait OpenCustomNumberingListDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenCustomNumberingListDialogCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param abstractNumberingListIndex An integer value specifying index of abstract numbering list.
    */
  def execute(abstractNumberingListIndex: Double): Boolean
}
object OpenCustomNumberingListDialogCommand {
  
  inline def apply(execute: Double => Boolean, getState: () => SimpleCommandState): OpenCustomNumberingListDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenCustomNumberingListDialogCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenCustomNumberingListDialogCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: Double => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
