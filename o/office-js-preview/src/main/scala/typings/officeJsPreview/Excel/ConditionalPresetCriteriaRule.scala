package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.AboveAverage
import typings.officeJsPreview.officeJsPreviewStrings.BelowAverage
import typings.officeJsPreview.officeJsPreviewStrings.Blanks
import typings.officeJsPreview.officeJsPreviewStrings.DuplicateValues
import typings.officeJsPreview.officeJsPreviewStrings.EqualOrAboveAverage
import typings.officeJsPreview.officeJsPreviewStrings.EqualOrBelowAverage
import typings.officeJsPreview.officeJsPreviewStrings.Errors
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.LastMonth
import typings.officeJsPreview.officeJsPreviewStrings.LastSevenDays
import typings.officeJsPreview.officeJsPreviewStrings.LastWeek
import typings.officeJsPreview.officeJsPreviewStrings.NextMonth
import typings.officeJsPreview.officeJsPreviewStrings.NextWeek
import typings.officeJsPreview.officeJsPreviewStrings.NonBlanks
import typings.officeJsPreview.officeJsPreviewStrings.NonErrors
import typings.officeJsPreview.officeJsPreviewStrings.OneStdDevAboveAverage
import typings.officeJsPreview.officeJsPreviewStrings.OneStdDevBelowAverage
import typings.officeJsPreview.officeJsPreviewStrings.ThisMonth
import typings.officeJsPreview.officeJsPreviewStrings.ThisWeek
import typings.officeJsPreview.officeJsPreviewStrings.ThreeStdDevAboveAverage
import typings.officeJsPreview.officeJsPreviewStrings.ThreeStdDevBelowAverage
import typings.officeJsPreview.officeJsPreviewStrings.Today
import typings.officeJsPreview.officeJsPreviewStrings.Tomorrow
import typings.officeJsPreview.officeJsPreviewStrings.TwoStdDevAboveAverage
import typings.officeJsPreview.officeJsPreviewStrings.TwoStdDevBelowAverage
import typings.officeJsPreview.officeJsPreviewStrings.UniqueValues
import typings.officeJsPreview.officeJsPreviewStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Preset Criteria Conditional Format Rule
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalPresetCriteriaRule extends js.Object {
  
  /**
    *
    * The criterion of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues = js.native
}
object ConditionalPresetCriteriaRule {
  
  @scala.inline
  def apply(
    criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
  ): ConditionalPresetCriteriaRule = {
    val __obj = js.Dynamic.literal(criterion = criterion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalPresetCriteriaRule]
  }
  
  @scala.inline
  implicit class ConditionalPresetCriteriaRuleOps[Self <: ConditionalPresetCriteriaRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCriterion(
      value: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
    ): Self = this.set("criterion", value.asInstanceOf[js.Any])
  }
}
