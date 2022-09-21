package typings.officeJsPreview.OneNote

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OneNote.Interfaces.NoteTagData
import typings.officeJsPreview.OneNote.Interfaces.NoteTagLoadOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Address
import typings.officeJsPreview.officeJsPreviewStrings.Completed
import typings.officeJsPreview.officeJsPreviewStrings.Contact
import typings.officeJsPreview.officeJsPreviewStrings.Critical
import typings.officeJsPreview.officeJsPreviewStrings.Disabled
import typings.officeJsPreview.officeJsPreviewStrings.Idea
import typings.officeJsPreview.officeJsPreviewStrings.Important
import typings.officeJsPreview.officeJsPreviewStrings.Normal
import typings.officeJsPreview.officeJsPreviewStrings.OutlookTask
import typings.officeJsPreview.officeJsPreviewStrings.PhoneNumber
import typings.officeJsPreview.officeJsPreviewStrings.Question
import typings.officeJsPreview.officeJsPreviewStrings.TaskNotSyncedYet
import typings.officeJsPreview.officeJsPreviewStrings.TaskRemoved
import typings.officeJsPreview.officeJsPreviewStrings.ToDo
import typings.officeJsPreview.officeJsPreviewStrings.ToDoPriority1
import typings.officeJsPreview.officeJsPreviewStrings.ToDoPriority2
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.Website
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A container for the NoteTag in a paragraph.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait NoteTag
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NoteTag: RequestContext = js.native
  
  /**
    * Gets the Id of the NoteTag object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NoteTag = js.native
  def load(options: NoteTagLoadOptions): NoteTag = js.native
  def load(propertyNamesAndPaths: Expand): NoteTag = js.native
  def load(propertyNames: String): NoteTag = js.native
  def load(propertyNames: js.Array[String]): NoteTag = js.native
  
  /**
    * Gets the status of the NoteTag object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val status: NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.NoteTag object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.NoteTagData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): NoteTagData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): NoteTag = js.native
  
  /**
    * Gets the type of the NoteTag object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val `type`: NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2 = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): NoteTag = js.native
}
