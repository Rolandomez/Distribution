package typings.requestPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Options = typings.requestPromise.mod.OptionsWithUri | typings.requestPromise.mod.OptionsWithUrl
  
  type OptionsWithUri = typings.request.mod.UriOptions with typings.requestPromise.mod.RequestPromiseOptions
  
  type OptionsWithUrl = typings.request.mod.UrlOptions with typings.requestPromise.mod.RequestPromiseOptions
  
  type RequestPromiseAPI[T] = typings.request.mod.RequestAPI[
    typings.requestPromise.mod.RequestPromise[T], 
    typings.requestPromise.mod.RequestPromiseOptions, 
    typings.request.mod.RequiredUriUrl
  ]
}
