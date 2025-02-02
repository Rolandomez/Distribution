package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataOutput
  extends StObject
     with ItemAwareElement {
  
  /**
    * @default false
    */
  var isCollection: Boolean
  
  var name: String
  
  var outputSetRef: js.Array[InputSet]
  
  var outputSetWithOptional: js.Array[InputSet]
  
  var outputSetWithWhileExecuting: js.Array[InputSet]
}
object DataOutput {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataState: DataState,
    id: String,
    isCollection: Boolean,
    itemSubjectRef: ItemDefinition,
    name: String,
    outputSetRef: js.Array[InputSet],
    outputSetWithOptional: js.Array[InputSet],
    outputSetWithWhileExecuting: js.Array[InputSet]
  ): DataOutput = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCollection = isCollection.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputSetRef = outputSetRef.asInstanceOf[js.Any], outputSetWithOptional = outputSetWithOptional.asInstanceOf[js.Any], outputSetWithWhileExecuting = outputSetWithWhileExecuting.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataOutput] (val x: Self) extends AnyVal {
    
    inline def setIsCollection(value: Boolean): Self = StObject.set(x, "isCollection", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputSetRef(value: js.Array[InputSet]): Self = StObject.set(x, "outputSetRef", value.asInstanceOf[js.Any])
    
    inline def setOutputSetRefVarargs(value: InputSet*): Self = StObject.set(x, "outputSetRef", js.Array(value*))
    
    inline def setOutputSetWithOptional(value: js.Array[InputSet]): Self = StObject.set(x, "outputSetWithOptional", value.asInstanceOf[js.Any])
    
    inline def setOutputSetWithOptionalVarargs(value: InputSet*): Self = StObject.set(x, "outputSetWithOptional", js.Array(value*))
    
    inline def setOutputSetWithWhileExecuting(value: js.Array[InputSet]): Self = StObject.set(x, "outputSetWithWhileExecuting", value.asInstanceOf[js.Any])
    
    inline def setOutputSetWithWhileExecutingVarargs(value: InputSet*): Self = StObject.set(x, "outputSetWithWhileExecuting", js.Array(value*))
  }
}
