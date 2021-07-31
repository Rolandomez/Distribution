package typings.sharepoint.global.SP

import typings.sharepoint.SP.SiteHealth.SiteHealthStatusType
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SiteHealth {
  
  @JSGlobal("SP.SiteHealth.SiteHealthResult")
  @js.native
  class SiteHealthResult ()
    extends StObject
       with typings.sharepoint.SP.SiteHealth.SiteHealthResult {
    
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def get_messageAsText(): String = js.native
    
    /* CompleteClass */
    override def get_ruleHelpLink(): String = js.native
    
    /* CompleteClass */
    override def get_ruleId(): typings.sharepoint.SP.Guid = js.native
    
    /* CompleteClass */
    override def get_ruleIsRepairable(): Boolean = js.native
    
    /* CompleteClass */
    override def get_ruleName(): String = js.native
    
    /* CompleteClass */
    override def get_status(): SiteHealthStatusType = js.native
    
    /* CompleteClass */
    override def get_timeStamp(): Date = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_status(value: SiteHealthStatusType): Unit = js.native
    
    /* CompleteClass */
    override def set_timeStamp(value: Date): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.SiteHealth.SiteHealthStatusType")
  @js.native
  object SiteHealthStatusType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.SiteHealth.SiteHealthStatusType & Double] = js.native
    
    /* 2 */ val failedError: typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedError & Double = js.native
    
    /* 1 */ val failedWarning: typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedWarning & Double = js.native
    
    /* 0 */ val passed: typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.passed & Double = js.native
  }
  
  @JSGlobal("SP.SiteHealth.SiteHealthSummary")
  @js.native
  class SiteHealthSummary ()
    extends StObject
       with typings.sharepoint.SP.SiteHealth.SiteHealthSummary
}
