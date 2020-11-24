package typings.gulpCoffeeify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Aliases = js.Array[typings.gulpCoffeeify.anon.Base]
  
  type Coffeeify = js.Function1[
    /* option */ js.UndefOr[typings.gulpCoffeeify.mod.Option], 
    typings.node.NodeJS.ReadWriteStream
  ]
  
  type Transforms = js.Array[typings.gulpCoffeeify.anon.Ext]
}
