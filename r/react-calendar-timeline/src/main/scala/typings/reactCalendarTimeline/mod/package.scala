package typings.reactCalendarTimeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Id = scala.Double | java.lang.String
  
  type ReactCalendarTimeline[CustomItem /* <: typings.reactCalendarTimeline.mod.TimelineItemBase[_] */, CustomGroup /* <: typings.reactCalendarTimeline.mod.TimelineGroupBase */] = typings.react.mod.Component[
    typings.reactCalendarTimeline.mod.ReactCalendarTimelineProps[CustomItem, CustomGroup], 
    js.Object, 
    js.Any
  ]
  
  type TimelineGroup[CustomGroupFields] = typings.reactCalendarTimeline.mod.TimelineGroupBase with CustomGroupFields
  
  type TimelineHeaderProps = typings.reactCalendarTimeline.mod.TimelineHeadersProps
  
  type TimelineItem[CustomItemFields, DateType] = typings.reactCalendarTimeline.mod.TimelineItemBase[DateType] with CustomItemFields
}
