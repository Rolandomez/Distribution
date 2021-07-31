package typings.googleapis.anon

import typings.googleapis.datatransferV1Mod.adminDatatransferV1.Admin
import typings.googleapis.datatransferV1Mod.adminDatatransferV1.Options
import typings.googleapis.googleapisStrings.datatransfer_v1
import typings.googleapis.googleapisStrings.directory_v1
import typings.googleapis.googleapisStrings.reports_v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn4 extends StObject {
  
  def apply(options: Options): Admin = js.native
  def apply(options: typings.googleapis.directoryV1Mod.adminDirectoryV1.Options): typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin = js.native
  def apply(options: typings.googleapis.reportsV1Mod.adminReportsV1.Options): typings.googleapis.reportsV1Mod.adminReportsV1.Admin = js.native
  def apply(version: datatransfer_v1): Admin = js.native
  def apply(version: directory_v1): typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin = js.native
  def apply(version: reports_v1): typings.googleapis.reportsV1Mod.adminReportsV1.Admin = js.native
}
