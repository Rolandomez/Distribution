package typings.gulpSvgSprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SvgSprite = js.Function1[
    /* options */ js.UndefOr[typings.svgSprite.mod.Config], 
    typings.node.NodeJS.ReadWriteStream
  ]
}
