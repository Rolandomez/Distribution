package typings.firebaseFirestore.distLiteFirestoreSrcIndexDotrnMod

import typings.firebaseFirestore.distLiteFirestoreSrcCoreFilterMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/index.rn", "QueryFieldFilterConstraint")
@js.native
open class QueryFieldFilterConstraint protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcApiMod.QueryFieldFilterConstraint {
  /**
    * @internal
    */
  /* protected */ def this(
    _field: typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath,
    _op: Operator,
    _value: Any
  ) = this()
}
/* static members */
object QueryFieldFilterConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/index.rn", "QueryFieldFilterConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    _field: typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath,
    _op: Operator,
    _value: Any
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(_field.asInstanceOf[js.Any], _op.asInstanceOf[js.Any], _value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint]
}
