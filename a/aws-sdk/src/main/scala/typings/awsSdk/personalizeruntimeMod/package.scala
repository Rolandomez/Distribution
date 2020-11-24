package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object personalizeruntimeMod {
  
  type Arn = java.lang.String
  
  type AttributeName = java.lang.String
  
  type AttributeValue = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.personalizeruntimeMod.ClientApiVersions
  
  type Context = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.personalizeruntimeMod.AttributeValue]
  
  type FilterAttributeName = java.lang.String
  
  type FilterAttributeValue = java.lang.String
  
  type FilterValues = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.personalizeruntimeMod.FilterAttributeValue]
  
  type InputList = js.Array[typings.awsSdk.personalizeruntimeMod.ItemID]
  
  type ItemID = java.lang.String
  
  type ItemList = js.Array[typings.awsSdk.personalizeruntimeMod.PredictedItem]
  
  type NumResults = scala.Double
  
  type RecommendationID = java.lang.String
  
  type Score = scala.Double
  
  type UserID = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-05-22`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.personalizeruntimeMod._apiVersion | java.lang.String
}
