package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoNotUseMeFolder extends StObject {
  
  def AddToFavorites(): Unit = js.native
  def AddToFavorites(fNoUI: js.Any): Unit = js.native
  def AddToFavorites(fNoUI: js.Any, Name: js.Any): Unit = js.native
  def AddToFavorites(fNoUI: Unit, Name: js.Any): Unit = js.native
  
  def AddToPFFavorites(): Unit = js.native
  
  var AddressBookName: String = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  def CopyTo(DestinationFolder: Folder): Folder = js.native
  
  val CurrentView: View = js.native
  
  var CustomViewsOnly: Boolean = js.native
  
  val DefaultItemType: OlItemType = js.native
  
  val DefaultMessageClass: String = js.native
  
  def Delete(): Unit = js.native
  
  var Description: String = js.native
  
  def Display(): Unit = js.native
  
  val EntryID: String = js.native
  
  val FolderPath: String = js.native
  
  val Folders: typings.activexOutlook.Outlook.Folders = js.native
  
  val FullFolderPath: String = js.native
  
  def GetCalendarExporter(): CalendarSharing = js.native
  
  def GetCustomIcon(): StdPicture = js.native
  
  def GetExplorer(): Explorer = js.native
  def GetExplorer(DisplayMode: js.Any): Explorer = js.native
  
  def GetStorage(StorageIdentifier: String, StorageIdentifierType: OlStorageIdentifierType): StorageItem = js.native
  
  def GetTable(): Table = js.native
  def GetTable(Filter: js.Any): Table = js.native
  def GetTable(Filter: js.Any, TableContents: js.Any): Table = js.native
  def GetTable(Filter: Unit, TableContents: js.Any): Table = js.native
  
  var InAppFolderSyncObject: Boolean = js.native
  
  val IsSharePointFolder: Boolean = js.native
  
  val Items: typings.activexOutlook.Outlook.Items = js.native
  
  val MAPIOBJECT: js.Any = js.native
  
  def MoveTo(DestinationFolder: Folder): Unit = js.native
  
  var Name: String = js.native
  
  @JSName("Outlook.DoNotUseMeFolder_typekey")
  var OutlookDotDoNotUseMeFolder_typekey: DoNotUseMeFolder = js.native
  
  val Parent: js.Any = js.native
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  val Session: NameSpace = js.native
  
  def SetCustomIcon(Picture: StdPicture): Unit = js.native
  
  var ShowAsOutlookAB: Boolean = js.native
  
  var ShowItemCount: OlShowItemCount = js.native
  
  val Store: typings.activexOutlook.Outlook.Store = js.native
  
  val StoreID: String = js.native
  
  val UnReadItemCount: Double = js.native
  
  val UserDefinedProperties: typings.activexOutlook.Outlook.UserDefinedProperties = js.native
  
  val UserPermissions: js.Any = js.native
  
  val Views: typings.activexOutlook.Outlook.Views = js.native
  
  var WebViewAllowNavigation: Boolean = js.native
  
  var WebViewOn: Boolean = js.native
  
  var WebViewURL: String = js.native
}
