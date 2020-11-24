package typings.expressRedisCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExpirationConfig = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  type ExpirationPolicy = js.Function2[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* res */ typings.express.mod.Response_[js.Any], 
    scala.Double
  ]
  
  type ExpireOption = scala.Double | typings.expressRedisCache.mod.ExpirationConfig
}
