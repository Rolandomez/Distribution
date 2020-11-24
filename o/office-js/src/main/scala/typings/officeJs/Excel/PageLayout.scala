package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.PageLayoutData
import typings.officeJs.Excel.Interfaces.PageLayoutLoadOptions
import typings.officeJs.Excel.Interfaces.PageLayoutUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.A3
import typings.officeJs.officeJsStrings.A4
import typings.officeJs.officeJsStrings.A4Small
import typings.officeJs.officeJsStrings.A5
import typings.officeJs.officeJsStrings.AsDisplayed
import typings.officeJs.officeJsStrings.B4
import typings.officeJs.officeJsStrings.B5
import typings.officeJs.officeJsStrings.Blank
import typings.officeJs.officeJsStrings.Centimeters
import typings.officeJs.officeJsStrings.Csheet
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.DownThenOver
import typings.officeJs.officeJsStrings.Dsheet
import typings.officeJs.officeJsStrings.EndSheet
import typings.officeJs.officeJsStrings.Envelope10
import typings.officeJs.officeJsStrings.Envelope11
import typings.officeJs.officeJsStrings.Envelope12
import typings.officeJs.officeJsStrings.Envelope14
import typings.officeJs.officeJsStrings.Envelope9
import typings.officeJs.officeJsStrings.EnvelopeB4
import typings.officeJs.officeJsStrings.EnvelopeB5
import typings.officeJs.officeJsStrings.EnvelopeB6
import typings.officeJs.officeJsStrings.EnvelopeC3
import typings.officeJs.officeJsStrings.EnvelopeC4
import typings.officeJs.officeJsStrings.EnvelopeC5
import typings.officeJs.officeJsStrings.EnvelopeC6
import typings.officeJs.officeJsStrings.EnvelopeC65
import typings.officeJs.officeJsStrings.EnvelopeDL
import typings.officeJs.officeJsStrings.EnvelopeItaly
import typings.officeJs.officeJsStrings.EnvelopeMonarch
import typings.officeJs.officeJsStrings.EnvelopePersonal
import typings.officeJs.officeJsStrings.Esheet
import typings.officeJs.officeJsStrings.Executive
import typings.officeJs.officeJsStrings.FanfoldLegalGerman
import typings.officeJs.officeJsStrings.FanfoldStdGerman
import typings.officeJs.officeJsStrings.FanfoldUS
import typings.officeJs.officeJsStrings.Folio
import typings.officeJs.officeJsStrings.InPlace
import typings.officeJs.officeJsStrings.Inches
import typings.officeJs.officeJsStrings.Landscape
import typings.officeJs.officeJsStrings.Ledger
import typings.officeJs.officeJsStrings.Legal
import typings.officeJs.officeJsStrings.Letter
import typings.officeJs.officeJsStrings.LetterSmall
import typings.officeJs.officeJsStrings.NoComments
import typings.officeJs.officeJsStrings.NotAvailable
import typings.officeJs.officeJsStrings.Note
import typings.officeJs.officeJsStrings.OverThenDown
import typings.officeJs.officeJsStrings.Paper10x14
import typings.officeJs.officeJsStrings.Paper11x17
import typings.officeJs.officeJsStrings.Points
import typings.officeJs.officeJsStrings.Portrait
import typings.officeJs.officeJsStrings.Quatro
import typings.officeJs.officeJsStrings.Statement
import typings.officeJs.officeJsStrings.Tabloid
import typings.officeJs.officeJsStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents layout and print settings that are not dependent any printer-specific implementation. These settings include margins, orientation, page numbering, title rows, and print area.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait PageLayout extends ClientObject {
  
  /**
    *
    * The worksheet's black and white print option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: Boolean = js.native
  
  /**
    *
    * The worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: Double = js.native
  
  /**
    *
    * The worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: Boolean = js.native
  
  /**
    *
    * The worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: Boolean = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageLayout: RequestContext = js.native
  
  /**
    *
    * The worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: Boolean = js.native
  
  /**
    *
    * The worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: Double | _empty = js.native
  
  /**
    *
    * The worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: Double = js.native
  
  /**
    * Gets the RangeAreas object, comprising one or more rectangular ranges, that represents the print area for the worksheet. If there is no print area, an ItemNotFound error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintArea(): RangeAreas = js.native
  
  /**
    * Gets the RangeAreas object, comprising one or more rectangular ranges, that represents the print area for the worksheet. If there is no print area, a null object will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintAreaOrNullObject(): RangeAreas = js.native
  
  /**
    * Gets the range object representing the title columns.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleColumns(): Range = js.native
  
  /**
    * Gets the range object representing the title columns. If not set, this will return a null object.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleColumnsOrNullObject(): Range = js.native
  
  /**
    * Gets the range object representing the title rows.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleRows(): Range = js.native
  
  /**
    * Gets the range object representing the title rows. If not set, this will return a null object.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleRowsOrNullObject(): Range = js.native
  
  /**
    *
    * The worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: Double = js.native
  
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  val headersFooters: HeaderFooterGroup = js.native
  
  /**
    *
    * The worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageLayout = js.native
  def load(options: PageLayoutLoadOptions): PageLayout = js.native
  def load(propertyNamesAndPaths: Expand): PageLayout = js.native
  def load(propertyNames: String): PageLayout = js.native
  def load(propertyNames: js.Array[String]): PageLayout = js.native
  
  /**
    *
    * The worksheet's orientation of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: PageOrientation | Portrait | Landscape = js.native
  
  /**
    *
    * The worksheet's paper size of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman = js.native
  
  /**
    *
    * Specifies if the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printComments: PrintComments | NoComments | EndSheet | InPlace = js.native
  
  /**
    *
    * The worksheet's print errors option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable = js.native
  
  /**
    *
    * Specifies if the worksheet's gridlines will be printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: Boolean = js.native
  
  /**
    *
    * Specifies if the worksheet's headings will be printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: Boolean = js.native
  
  /**
    *
    * The worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: PrintOrder | DownThenOver | OverThenDown = js.native
  
  /**
    *
    * The worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: Double = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.PageLayout): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PageLayoutUpdateData): Unit = js.native
  def set(properties: PageLayoutUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PageLayout): Unit = js.native
  
  def setPrintArea(printArea: String): Unit = js.native
  /**
    * Sets the worksheet's print area.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param printArea The range, or RangeAreas of the content to print.
    */
  def setPrintArea(printArea: Range): Unit = js.native
  def setPrintArea(printArea: RangeAreas): Unit = js.native
  
  /**
    * Sets the worksheet's page margins with units.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param unit Measurement unit for the margins provided.
    * @param marginOptions Margin values to set, margins not provided will remain unchanged.
    */
  def setPrintMargins(unit: PrintMarginUnit, marginOptions: PageLayoutMarginOptions): Unit = js.native
  @JSName("setPrintMargins")
  def setPrintMargins_Centimeters(unit: Centimeters, marginOptions: PageLayoutMarginOptions): Unit = js.native
  @JSName("setPrintMargins")
  def setPrintMargins_Inches(unit: Inches, marginOptions: PageLayoutMarginOptions): Unit = js.native
  /**
    * Sets the worksheet's page margins with units.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param unit Measurement unit for the margins provided.
    * @param marginOptions Margin values to set, margins not provided will remain unchanged.
    */
  @JSName("setPrintMargins")
  def setPrintMargins_Points(unit: Points, marginOptions: PageLayoutMarginOptions): Unit = js.native
  
  def setPrintTitleColumns(printTitleColumns: String): Unit = js.native
  /**
    * Sets the columns that contain the cells to be repeated at the left of each page of the worksheet for printing.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param printTitleColumns The columns to be repeated to the left of each page, range must span the entire column to be valid.
    */
  def setPrintTitleColumns(printTitleColumns: Range): Unit = js.native
  
  def setPrintTitleRows(printTitleRows: String): Unit = js.native
  /**
    * Sets the rows that contain the cells to be repeated at the top of each page of the worksheet for printing.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param printTitleRows The rows to be repeated at the top of each page, range must span the entire row to be valid.
    */
  def setPrintTitleRows(printTitleRows: Range): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PageLayout object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PageLayoutData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PageLayoutData = js.native
  
  /**
    *
    * The worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: Double = js.native
  
  /**
    *
    * The worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * [Api set: ExcelApi 1.9]
    */
  var zoom: PageLayoutZoomOptions = js.native
}
