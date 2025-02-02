package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moreThanOrEqualMod {
  
  @JSImport("typeorm/browser/find-options/operator/MoreThanOrEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MoreThanOrEqual[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("MoreThanOrEqual")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  inline def MoreThanOrEqual[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("MoreThanOrEqual")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
