package typings.recompose

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.recompose.mod.ObservableConfig
import typings.recompose.mod.Subscribable
import typings.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#componentfromstream
object componentFromStreamMod {
  
  @JSImport("recompose/componentFromStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[ReactNode]]): ComponentType[TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propsToReactNode.asInstanceOf[js.Any]).asInstanceOf[ComponentType[TProps]]
  
  inline def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[Any], Subscribable[ReactNode]], 
    ComponentType[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFromStreamWithConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* propsToReactNode */ mapper[Subscribable[Any], Subscribable[ReactNode]], 
    ComponentType[Any]
  ]]
}
