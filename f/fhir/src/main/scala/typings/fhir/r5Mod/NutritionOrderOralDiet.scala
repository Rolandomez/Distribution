package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionOrderOralDiet
  extends StObject
     with BackboneElement {
  
  var _instruction: js.UndefOr[Element] = js.undefined
  
  /**
    * The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
    */
  var fluidConsistencyType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Free text dosage instructions can be used for cases where the instructions are too complex to code.
    */
  var instruction: js.UndefOr[String] = js.undefined
  
  /**
    * Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet.
    */
  var nutrient: js.UndefOr[js.Array[NutritionOrderOralDietNutrient]] = js.undefined
  
  /**
    * Schedule information for an oral diet.
    */
  var schedule: js.UndefOr[NutritionOrderOralDietSchedule] = js.undefined
  
  /**
    * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
    */
  var texture: js.UndefOr[js.Array[NutritionOrderOralDietTexture]] = js.undefined
  
  /**
    * The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object NutritionOrderOralDiet {
  
  inline def apply(): NutritionOrderOralDiet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderOralDiet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionOrderOralDiet] (val x: Self) extends AnyVal {
    
    inline def setFluidConsistencyType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "fluidConsistencyType", value.asInstanceOf[js.Any])
    
    inline def setFluidConsistencyTypeUndefined: Self = StObject.set(x, "fluidConsistencyType", js.undefined)
    
    inline def setFluidConsistencyTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "fluidConsistencyType", js.Array(value*))
    
    inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
    
    inline def setNutrient(value: js.Array[NutritionOrderOralDietNutrient]): Self = StObject.set(x, "nutrient", value.asInstanceOf[js.Any])
    
    inline def setNutrientUndefined: Self = StObject.set(x, "nutrient", js.undefined)
    
    inline def setNutrientVarargs(value: NutritionOrderOralDietNutrient*): Self = StObject.set(x, "nutrient", js.Array(value*))
    
    inline def setSchedule(value: NutritionOrderOralDietSchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setTexture(value: js.Array[NutritionOrderOralDietTexture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
    
    inline def setTextureVarargs(value: NutritionOrderOralDietTexture*): Self = StObject.set(x, "texture", js.Array(value*))
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_instruction(value: Element): Self = StObject.set(x, "_instruction", value.asInstanceOf[js.Any])
    
    inline def set_instructionUndefined: Self = StObject.set(x, "_instruction", js.undefined)
  }
}
