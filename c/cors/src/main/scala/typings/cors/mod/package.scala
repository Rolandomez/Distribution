package typings.cors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CorsOptionsDelegate = js.Function2[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* callback */ js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* options */ js.UndefOr[typings.cors.mod.CorsOptions], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type CustomOrigin = js.Function2[
    /* requestOrigin */ js.UndefOr[java.lang.String], 
    /* callback */ js.Function2[
      /* err */ typings.std.Error | scala.Null, 
      /* allow */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
