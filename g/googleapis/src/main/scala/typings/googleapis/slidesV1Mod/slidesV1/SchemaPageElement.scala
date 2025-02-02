package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPageElement extends StObject {
  
  /**
    * The description of the page element. Combined with title to display alt text. The field is not supported for Group elements.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A collection of page elements joined as a single unit.
    */
  var elementGroup: js.UndefOr[SchemaGroup] = js.undefined
  
  /**
    * An image page element.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * A line page element.
    */
  var line: js.UndefOr[SchemaLine] = js.undefined
  
  /**
    * The object ID for this page element. Object IDs used by google.apps.slides.v1.Page and google.apps.slides.v1.PageElement share the same namespace.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A generic shape.
    */
  var shape: js.UndefOr[SchemaShape] = js.undefined
  
  /**
    * A linked chart embedded from Google Sheets. Unlinked charts are represented as images.
    */
  var sheetsChart: js.UndefOr[SchemaSheetsChart] = js.undefined
  
  /**
    * The size of the page element.
    */
  var size: js.UndefOr[SchemaSize] = js.undefined
  
  /**
    * A table page element.
    */
  var table: js.UndefOr[SchemaTable] = js.undefined
  
  /**
    * The title of the page element. Combined with description to display alt text. The field is not supported for Group elements.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The transform of the page element. The visual appearance of the page element is determined by its absolute transform. To compute the absolute transform, preconcatenate a page element's transform with the transforms of all of its parent groups. If the page element is not in a group, its absolute transform is the same as the value in this field. The initial transform for the newly created Group is always the identity transform.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.undefined
  
  /**
    * A video page element.
    */
  var video: js.UndefOr[SchemaVideo] = js.undefined
  
  /**
    * A word art page element.
    */
  var wordArt: js.UndefOr[SchemaWordArt] = js.undefined
}
object SchemaPageElement {
  
  inline def apply(): SchemaPageElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageElement]
  }
  
  extension [Self <: SchemaPageElement](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setElementGroup(value: SchemaGroup): Self = StObject.set(x, "elementGroup", value.asInstanceOf[js.Any])
    
    inline def setElementGroupUndefined: Self = StObject.set(x, "elementGroup", js.undefined)
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLine(value: SchemaLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setShape(value: SchemaShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSheetsChart(value: SchemaSheetsChart): Self = StObject.set(x, "sheetsChart", value.asInstanceOf[js.Any])
    
    inline def setSheetsChartUndefined: Self = StObject.set(x, "sheetsChart", js.undefined)
    
    inline def setSize(value: SchemaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTable(value: SchemaTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransform(value: SchemaAffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setVideo(value: SchemaVideo): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setWordArt(value: SchemaWordArt): Self = StObject.set(x, "wordArt", value.asInstanceOf[js.Any])
    
    inline def setWordArtUndefined: Self = StObject.set(x, "wordArt", js.undefined)
  }
}
