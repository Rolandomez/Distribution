package typings.webpackMerge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigurationMergeConfigFunction = js.Function1[
    /* customizeOptions */ typings.webpackMerge.mod.CustomizeOptions, 
    typings.webpackMerge.mod.ConfigurationMergeFunction
  ]
  type ConfigurationMergeFunction = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ /* repeated */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
  ]
  type CustomizeArrayFunction = js.Function3[
    /* a */ js.Array[js.Any], 
    /* b */ js.Array[js.Any], 
    /* key */ java.lang.String, 
    js.UndefOr[js.Array[js.Any] | scala.Null]
  ]
  type CustomizeObjectFunction = js.Function3[
    /* a */ js.Object, 
    /* b */ js.Object, 
    /* key */ java.lang.String, 
    js.UndefOr[js.Object | scala.Null]
  ]
  type MergeFunction = typings.webpackMerge.mod.ConfigurationMergeFunction | typings.webpackMerge.mod.ConfigurationMergeConfigFunction
  type MultipleConfiguration = org.scalablytyped.runtime.StringDictionary[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
  ]
  type MultipleConfigurationMergeFunction = js.Function1[
    /* repeated */ typings.webpackMerge.mod.MultipleConfiguration, 
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
    ]
  ]
  type UniqueFunction = js.Function3[
    /* field */ java.lang.String, 
    /* fields */ js.Array[java.lang.String], 
    /* keyFn */ js.Function1[/* field */ js.Any, java.lang.String], 
    typings.webpackMerge.mod.CustomizeArrayFunction
  ]
}
