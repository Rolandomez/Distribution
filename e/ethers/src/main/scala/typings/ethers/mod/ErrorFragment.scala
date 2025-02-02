package typings.ethers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ErrorFragment")
@js.native
open class ErrorFragment protected ()
  extends typings.ethers.typesEthersMod.ErrorFragment {
  /**
    *  @private
    */
  def this(guard: Any, name: String, inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]) = this()
}
/* static members */
object ErrorFragment {
  
  @JSImport("ethers", "ErrorFragment")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.ErrorFragment]
  
  inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.ErrorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.ErrorFragment */ Boolean]
}
