package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditEndEditingEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditEndEditingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridBatchEditEndEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditEndEditingEventArgs class with the specified settings.
    * @param visibleIndex An integer value that specifies the visible index of the record. This value is assigned to the ASPxClientVerticalGridBatchEditEndEditingEventArgs.visibleIndex property.
    * @param recordValues A hashtable that stores information about editable cells. This value is assigned to the ASPxClientVerticalGridBatchEditEndEditingEventArgs.recordValues property.
    */
  def this(visibleIndex: Double, recordValues: js.Any) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  /* CompleteClass */
  var recordValues: js.Any = js.native
  
  /**
    * Gets the visible index of the record whose cells have been edited.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
