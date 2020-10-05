package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object formItemMod {
  type ChildrenType = typings.antd.formItemMod.RenderChildren | typings.react.mod.ReactNode
  type RenderChildren = js.Function1[
    /* form */ typings.rcFieldForm.interfaceMod.FormInstance, 
    typings.react.mod.ReactNode
  ]
}
