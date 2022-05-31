package typings.jupyterlabCodemirror

import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabNbformat.mod.ILanguageInfoMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimetypeMod {
  
  @JSImport("@jupyterlab/codemirror/lib/mimetype", "CodeMirrorMimeTypeService")
  @js.native
  class CodeMirrorMimeTypeService ()
    extends StObject
       with IEditorMimeTypeService {
    
    /**
      * Get a mime type for the given file path.
      *
      * @param filePath - The full path to the file.
      *
      * @returns A valid mimetype.
      *
      * #### Notes
      * If a mime type cannot be found returns the defaul mime type `text/plain`, never `null`.
      */
    /* CompleteClass */
    override def getMimeTypeByFilePath(filePath: String): String = js.native
    
    /**
      * Get a mime type for the given language info.
      *
      * @param info - The language information.
      *
      * @returns A valid mimetype.
      *
      * #### Notes
      * If a mime type cannot be found returns the defaul mime type `text/plain`, never `null`.
      */
    /* CompleteClass */
    override def getMimeTypeByLanguage(info: ILanguageInfoMetadata): String = js.native
  }
}
