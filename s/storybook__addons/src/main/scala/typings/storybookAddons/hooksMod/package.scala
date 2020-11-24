package typings.storybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object hooksMod {
  
  type AbstractFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type Decorator = js.Function2[
    /* getStory */ typings.storybookAddons.typesMod.StoryGetter, 
    /* context */ typings.storybookAddons.typesMod.StoryContext, 
    js.Any
  ]
  
  type EventMap = org.scalablytyped.runtime.StringDictionary[typings.storybookAddons.hooksMod.Listener]
  
  type Listener = js.Function1[/* repeated */ js.Any, scala.Unit]
}
