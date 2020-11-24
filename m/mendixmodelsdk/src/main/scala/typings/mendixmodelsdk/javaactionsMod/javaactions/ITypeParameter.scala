package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@js.native
trait ITypeParameter
  extends IElement
     with IByNameReferrable {
  
  val containerAsJavaAction: IJavaAction = js.native
  
  @JSName("model")
  val model_ITypeParameter: IModel = js.native
  
  val name: String = js.native
}
