package typings.openui5.sapMUploadUploadSetMod

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sap/m/upload/UploadSet", JSImport.Default)
@js.native
/**
  * Constructor for a new UploadSet.
  *
  * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
  * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
  * of the syntax of the settings object.
  */
open class default () extends UploadSet {
  def this(/**
    * Initial settings for the new control.
    */
  mSettings: UploadSetSettings) = this()
  def this(/**
    * id for the new control, generated automatically if no id is given.
    */
  sId: String) = this()
  def this(
    /**
    * id for the new control, generated automatically if no id is given.
    */
  sId: String,
    /**
    * Initial settings for the new control.
    */
  mSettings: UploadSetSettings
  ) = this()
  def this(
    /**
    * id for the new control, generated automatically if no id is given.
    */
  sId: Unit,
    /**
    * Initial settings for the new control.
    */
  mSettings: UploadSetSettings
  ) = this()
}
/* static members */
object default {
  
  @JSImport("sap/m/upload/UploadSet", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new subclass of class sap.m.upload.UploadSet with name `sClassName` and enriches it with the
    * information contained in `oClassInfo`.
    *
    * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
    *
    * @returns Created class / constructor function
    */
  inline def extend[T /* <: Record[String, Any] */](/**
    * Name of the class being created
    */
  sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def extend[T /* <: Record[String, Any] */](
    /**
    * Name of the class being created
    */
  sClassName: String,
    /**
    * Object literal with information about the class
    */
  oClassInfo: Unit,
    /**
    * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
    * used by this class
    */
  FNMetaImpl: js.Function
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def extend[T /* <: Record[String, Any] */](
    /**
    * Name of the class being created
    */
  sClassName: String,
    /**
    * Object literal with information about the class
    */
  oClassInfo: ClassInfo[T, UploadSet]
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def extend[T /* <: Record[String, Any] */](
    /**
    * Name of the class being created
    */
  sClassName: String,
    /**
    * Object literal with information about the class
    */
  oClassInfo: ClassInfo[T, UploadSet],
    /**
    * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
    * used by this class
    */
  FNMetaImpl: js.Function
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Returns a metadata object for class sap.m.upload.UploadSet.
    *
    * @returns Metadata object describing this class
    */
  inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
}
