package typings.csvParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function3[
    /* err */ js.UndefOr[typings.std.Error], 
    /* records */ js.UndefOr[js.Any], 
    /* info */ typings.csvParse.mod.Info, 
    scala.Unit
  ]
  
  type CastingDateFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typings.csvParse.mod.CastingContext, 
    typings.std.Date
  ]
  
  type CastingFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typings.csvParse.mod.CastingContext, 
    js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typings.csvParse.csvParseBooleans.`false`
    - typings.csvParse.anon.Name
  */
  type ColumnOption = js.UndefOr[typings.csvParse.mod._ColumnOption | java.lang.String | scala.Null]
}
