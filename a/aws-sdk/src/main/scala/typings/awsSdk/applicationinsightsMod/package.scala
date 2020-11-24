package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object applicationinsightsMod {
  
  type AffectedResource = java.lang.String
  
  type AmazonResourceName = java.lang.String
  
  type ApplicationComponentList = js.Array[typings.awsSdk.applicationinsightsMod.ApplicationComponent]
  
  type ApplicationInfoList = js.Array[typings.awsSdk.applicationinsightsMod.ApplicationInfo]
  
  type CWEMonitorEnabled = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.applicationinsightsMod.ClientApiVersions
  
  type CloudWatchEventDetailType = java.lang.String
  
  type CloudWatchEventId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EC2
    - typings.awsSdk.awsSdkStrings.CODE_DEPLOY
    - typings.awsSdk.awsSdkStrings.HEALTH
    - java.lang.String
  */
  type CloudWatchEventSource = typings.awsSdk.applicationinsightsMod._CloudWatchEventSource | java.lang.String
  
  type CodeDeployApplication = java.lang.String
  
  type CodeDeployDeploymentGroup = java.lang.String
  
  type CodeDeployDeploymentId = java.lang.String
  
  type CodeDeployInstanceGroupId = java.lang.String
  
  type CodeDeployState = java.lang.String
  
  type ComponentConfiguration = java.lang.String
  
  type ComponentName = java.lang.String
  
  type ConfigurationEventDetail = java.lang.String
  
  type ConfigurationEventList = js.Array[typings.awsSdk.applicationinsightsMod.ConfigurationEvent]
  
  type ConfigurationEventMonitoredResourceARN = java.lang.String
  
  type ConfigurationEventResourceName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CLOUDWATCH_ALARM
    - typings.awsSdk.awsSdkStrings.CLOUDFORMATION
    - typings.awsSdk.awsSdkStrings.SSM_ASSOCIATION
    - java.lang.String
  */
  type ConfigurationEventResourceType = typings.awsSdk.applicationinsightsMod._ConfigurationEventResourceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INFO
    - typings.awsSdk.awsSdkStrings.WARN
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ConfigurationEventStatus = typings.awsSdk.applicationinsightsMod._ConfigurationEventStatus | java.lang.String
  
  type ConfigurationEventTime = typings.std.Date
  
  type Ec2State = java.lang.String
  
  type EndTime = typings.std.Date
  
  type Feedback = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.applicationinsightsMod.FeedbackValue]
  
  type FeedbackKey = typings.awsSdk.awsSdkStrings.INSIGHTS_FEEDBACK | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOT_SPECIFIED
    - typings.awsSdk.awsSdkStrings.USEFUL
    - typings.awsSdk.awsSdkStrings.NOT_USEFUL
    - java.lang.String
  */
  type FeedbackValue = typings.awsSdk.applicationinsightsMod._FeedbackValue | java.lang.String
  
  type HealthEventArn = java.lang.String
  
  type HealthEventDescription = java.lang.String
  
  type HealthEventTypeCategory = java.lang.String
  
  type HealthEventTypeCode = java.lang.String
  
  type HealthService = java.lang.String
  
  type Insights = java.lang.String
  
  type LifeCycle = java.lang.String
  
  type LineTime = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.WARN
    - typings.awsSdk.awsSdkStrings.INFO
    - java.lang.String
  */
  type LogFilter = typings.awsSdk.applicationinsightsMod._LogFilter | java.lang.String
  
  type LogGroup = java.lang.String
  
  type LogPatternList = js.Array[typings.awsSdk.applicationinsightsMod.LogPattern]
  
  type LogPatternName = java.lang.String
  
  type LogPatternRank = scala.Double
  
  type LogPatternRegex = java.lang.String
  
  type LogPatternSetList = js.Array[typings.awsSdk.applicationinsightsMod.LogPatternSetName]
  
  type LogPatternSetName = java.lang.String
  
  type LogText = java.lang.String
  
  type MaxEntities = scala.Double
  
  type MetricName = java.lang.String
  
  type MetricNamespace = java.lang.String
  
  type Monitor = scala.Boolean
  
  type NewComponentName = java.lang.String
  
  type ObservationId = java.lang.String
  
  type ObservationList = js.Array[typings.awsSdk.applicationinsightsMod.Observation]
  
  type OpsCenterEnabled = scala.Boolean
  
  type OpsItemSNSTopicArn = java.lang.String
  
  type PaginationToken = java.lang.String
  
  type ProblemId = java.lang.String
  
  type ProblemList = js.Array[typings.awsSdk.applicationinsightsMod.Problem]
  
  type Remarks = java.lang.String
  
  type RemoveSNSTopic = scala.Boolean
  
  type ResourceARN = java.lang.String
  
  type ResourceGroupName = java.lang.String
  
  type ResourceList = js.Array[typings.awsSdk.applicationinsightsMod.ResourceARN]
  
  type ResourceType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Low_
    - typings.awsSdk.awsSdkStrings.Medium_
    - typings.awsSdk.awsSdkStrings.High_
    - java.lang.String
  */
  type SeverityLevel = typings.awsSdk.applicationinsightsMod._SeverityLevel | java.lang.String
  
  type SourceARN = java.lang.String
  
  type SourceType = java.lang.String
  
  type StartTime = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IGNORE
    - typings.awsSdk.awsSdkStrings.RESOLVED
    - typings.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type Status = typings.awsSdk.applicationinsightsMod._Status | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.applicationinsightsMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.applicationinsightsMod.Tag]
  
  type TagValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEFAULT
    - typings.awsSdk.awsSdkStrings.DOT_NET_CORE
    - typings.awsSdk.awsSdkStrings.DOT_NET_WORKER
    - typings.awsSdk.awsSdkStrings.DOT_NET_WEB
    - typings.awsSdk.awsSdkStrings.SQL_SERVER
    - java.lang.String
  */
  type Tier = typings.awsSdk.applicationinsightsMod._Tier | java.lang.String
  
  type Title = java.lang.String
  
  type Unit = java.lang.String
  
  type Value = scala.Double
  
  type XRayErrorPercent = scala.Double
  
  type XRayFaultPercent = scala.Double
  
  type XRayNodeName = java.lang.String
  
  type XRayNodeType = java.lang.String
  
  type XRayRequestAverageLatency = scala.Double
  
  type XRayRequestCount = scala.Double
  
  type XRayThrottlePercent = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-11-25`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.applicationinsightsMod._apiVersion | java.lang.String
}
