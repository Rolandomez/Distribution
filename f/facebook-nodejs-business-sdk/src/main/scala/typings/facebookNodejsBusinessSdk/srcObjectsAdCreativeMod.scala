package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.facebookNodejsBusinessSdkBooleans.`false`
import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAdCreativeMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ad-creative", JSImport.Default)
  @js.native
  open class default () extends AdCreative
  
  @js.native
  trait AdCreative extends AbstractCrudObject {
    
    def createAdLabel(fields: js.Array[String]): js.Promise[AdCreative] = js.native
    def createAdLabel(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[AdCreative] = js.native
    def createAdLabel(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdCreative] = js.native
    def createAdLabel(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[AdCreative] = js.native
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[AdCreative] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdCreative] = js.native
    
    def getCreativeInsights(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getCreativeInsights(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getCreativeInsights(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getCreativeInsights(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getCreativeInsights")
    def getCreativeInsights_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getCreativeInsights")
    def getCreativeInsights_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getCreativeInsights")
    def getCreativeInsights_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getCreativeInsights")
    def getCreativeInsights_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getPreViews(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getPreViews(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getPreViews(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getPreViews(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getPreViews")
    def getPreViews_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getPreViews")
    def getPreViews_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getPreViews")
    def getPreViews_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getPreViews")
    def getPreViews_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[AdCreative] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdCreative] = js.native
  }
}
