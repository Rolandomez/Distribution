package typings.gherkin

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.IEnvelope
import typings.gherkin.distSrcDialectMod.Dialect
import typings.gherkin.distSrcIgherkinoptionsMod.IGherkinOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("gherkin", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def dialects(): StringDictionary[Dialect] = ^.asInstanceOf[js.Dynamic].applyDynamic("dialects")().asInstanceOf[StringDictionary[Dialect]]
    @JSImport("gherkin", "default.dialects")
    @js.native
    def dialects_Fdefault: js.Function0[StringDictionary[Dialect]] = js.native
    
    inline def dialects_Fdefault_=(x: js.Function0[StringDictionary[Dialect]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dialects")(x.asInstanceOf[js.Any])
    
    @JSImport("gherkin", "default.fromPaths")
    @js.native
    def fromPaths: js.Function2[/* paths */ js.Array[String], /* options */ js.UndefOr[IGherkinOptions], Readable] = js.native
    inline def fromPaths(paths: js.Array[String]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPaths")(paths.asInstanceOf[js.Any]).asInstanceOf[Readable]
    inline def fromPaths(paths: js.Array[String], options: IGherkinOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPaths")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
    inline def fromPaths_=(x: js.Function2[/* paths */ js.Array[String], /* options */ js.UndefOr[IGherkinOptions], Readable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromPaths")(x.asInstanceOf[js.Any])
    
    @JSImport("gherkin", "default.fromSources")
    @js.native
    def fromSources: js.Function2[
        /* envelopes */ js.Array[IEnvelope], 
        /* options */ js.UndefOr[IGherkinOptions], 
        Readable
      ] = js.native
    inline def fromSources(envelopes: js.Array[IEnvelope]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSources")(envelopes.asInstanceOf[js.Any]).asInstanceOf[Readable]
    inline def fromSources(envelopes: js.Array[IEnvelope], options: IGherkinOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSources")(envelopes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
    inline def fromSources_=(
      x: js.Function2[
          /* envelopes */ js.Array[IEnvelope], 
          /* options */ js.UndefOr[IGherkinOptions], 
          Readable
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromSources")(x.asInstanceOf[js.Any])
    
    @JSImport("gherkin", "default.fromStream")
    @js.native
    def fromStream: js.Function2[
        /* stream */ Readable, 
        /* options */ js.UndefOr[IGherkinOptions], 
        typings.gherkin.distSrcStreamParserMessageStreamMod.default
      ] = js.native
    inline def fromStream(stream: Readable): typings.gherkin.distSrcStreamParserMessageStreamMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[typings.gherkin.distSrcStreamParserMessageStreamMod.default]
    inline def fromStream(stream: Readable, options: IGherkinOptions): typings.gherkin.distSrcStreamParserMessageStreamMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.gherkin.distSrcStreamParserMessageStreamMod.default]
    inline def fromStream_=(
      x: js.Function2[
          /* stream */ Readable, 
          /* options */ js.UndefOr[IGherkinOptions], 
          typings.gherkin.distSrcStreamParserMessageStreamMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromStream")(x.asInstanceOf[js.Any])
  }
}
