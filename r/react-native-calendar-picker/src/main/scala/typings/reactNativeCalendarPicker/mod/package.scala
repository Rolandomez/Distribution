package typings.reactNativeCalendarPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomDatesStylesFunc = js.Function1[
    /* date */ typings.moment.mod.Moment, 
    typings.reactNativeCalendarPicker.anon.ContainerStyle
  ]
  type CustomDayHeaderStylesFunc = js.Function1[
    /* date */ typings.reactNativeCalendarPicker.mod.CustomDayHeaderStylesFuncDateArg, 
    typings.reactNativeCalendarPicker.anon.Style
  ]
  type DateChangedCallback = js.Function2[
    /* date */ typings.moment.mod.Moment, 
    /* type */ js.UndefOr[
      typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.START_DATE | typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.END_DATE
    ], 
    scala.Unit
  ]
  type DisabledDatesFunc = js.Function1[/* date */ typings.moment.mod.Moment, scala.Boolean]
  type MomentParsable = typings.moment.mod.MomentInput
  type SwipeCallback = js.Function1[
    /* swipeDirection */ typings.reactNativeCalendarPicker.mod.SwipeDirection, 
    scala.Unit
  ]
}
