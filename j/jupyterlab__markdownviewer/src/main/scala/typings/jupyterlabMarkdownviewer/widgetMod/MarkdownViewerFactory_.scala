package typings.jupyterlabMarkdownviewer.widgetMod

import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewerFactory")
@js.native
class MarkdownViewerFactory_ protected () extends ABCWidgetFactory[MarkdownDocument, IModel] {
  /**
    * Construct a new markdown viewer widget factory.
    */
  def this(options: IOptions) = this()
  
  var _fileType: js.Any = js.native
  
  var _rendermime: js.Any = js.native
}
