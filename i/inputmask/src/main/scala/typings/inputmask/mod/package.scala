package typings.inputmask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DefinitionValidator = js.Function5[
    /* chrs */ java.lang.String, 
    /* buffer */ js.Array[java.lang.String], 
    /* pos */ scala.Double, 
    /* strict */ scala.Boolean, 
    /* opts */ typings.inputmask.mod.Options, 
    scala.Boolean | typings.inputmask.anon.C
  ]
  
  type Range = typings.inputmask.anon.End | (js.Tuple2[java.lang.String, java.lang.String])
}
