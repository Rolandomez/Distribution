package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullTypeParameterSymbol")
@js.native
open class PullTypeParameterSymbol protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullTypeParameterSymbol {
  def this(name: String) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
