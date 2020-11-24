package typings.mongoose.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.mongoose.anon.TypeofArray
import typings.mongoose.anon.TypeofBoolean
import typings.mongoose.anon.TypeofBuffer
import typings.mongoose.anon.TypeofDate
import typings.mongoose.anon.TypeofDecimal128
import typings.mongoose.anon.TypeofDocumentArray
import typings.mongoose.anon.TypeofMixed
import typings.mongoose.anon.TypeofNumber
import typings.mongoose.anon.TypeofObjectId
import typings.mongoose.anon.TypeofString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongoose", "SchemaTypes")
@js.native
object SchemaTypes extends js.Object {
  
  /*
    * section schema/array.js
    * http://mongoosejs.com/docs/api.html#schema-array-js
    */
  var Array: TypeofArray = js.native
  
  /*
    * section schema/boolean.js
    * http://mongoosejs.com/docs/api.html#schema-boolean-js
    */
  var Boolean: TypeofBoolean = js.native
  
  /*
    * section schema/buffer.js
    * http://mongoosejs.com/docs/api.html#schema-buffer-js
    */
  var Buffer: TypeofBuffer = js.native
  
  /*
    * section schema/date.js
    * http://mongoosejs.com/docs/api.html#schema-date-js
    */
  var Date: TypeofDate = js.native
  
  /*
    * section schema/decimal128.js
    * http://mongoosejs.com/docs/api.html#schema-decimal128-js
    */
  var Decimal128: TypeofDecimal128 = js.native
  
  /*
    * section schema/documentarray.js
    * http://mongoosejs.com/docs/api.html#schema-documentarray-js
    */
  var DocumentArray: TypeofDocumentArray = js.native
  
  /*
    * section schema/mixed.js
    * http://mongoosejs.com/docs/api.html#schema-mixed-js
    */
  var Mixed: TypeofMixed = js.native
  
  /*
    * section schema/number.js
    * http://mongoosejs.com/docs/api.html#schema-number-js
    */
  var Number: TypeofNumber = js.native
  
  /*
    * section schema/objectid.js
    * http://mongoosejs.com/docs/api.html#schema-objectid-js
    */
  var ObjectId: TypeofObjectId = js.native
  
  /*
    * section schema/string.js
    * http://mongoosejs.com/docs/api.html#schema-string-js
    */
  var String: TypeofString = js.native
  
  /*
    * section schema/embedded.js
    * http://mongoosejs.com/docs/api.html#schema-embedded-js
    */
  @js.native
  class Embedded protected () extends SchemaType {
    /** Sub-schema schematype constructor */
    def this(schema: Schema[_], key: String) = this()
    def this(schema: Schema[_], key: String, options: js.Any) = this()
  }
  /*
    * section schema/embedded.js
    * http://mongoosejs.com/docs/api.html#schema-embedded-js
    */
  @js.native
  object Embedded
    extends TopLevel[
          Instantiable3[
            /* schema */ Schema[js.Any], 
            /* key */ String, 
            /* options */ js.UndefOr[js.Any], 
            typings.mongoose.mod.Schema.Types.Embedded
          ]
        ]
  
  /**
    * section schema/map.js
    * https://mongoosejs.com/docs/schematypes.html#maps
    */
  @js.native
  class Map protected () extends SchemaType {
    /** Sub-schema schematype constructor */
    def this(key: String) = this()
    def this(key: String, options: js.Any) = this()
  }
  /**
    * section schema/map.js
    * https://mongoosejs.com/docs/schematypes.html#maps
    */
  @js.native
  object Map
    extends TopLevel[
          Instantiable2[
            /* key */ String, 
            /* options */ js.UndefOr[js.Any], 
            typings.mongoose.mod.Schema.Types.Map
          ]
        ]
}
