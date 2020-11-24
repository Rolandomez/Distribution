package typings.apolloProtobufjs.lightMod

import typings.apolloProtobufjs.mod.IParseOptions
import typings.apolloProtobufjs.mod.IParserResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "parse")
@js.native
object parse extends js.Object {
  
  def apply(source: String): IParserResult = js.native
  def apply(source: String, options: IParseOptions): IParserResult = js.native
  def apply(source: String, root: typings.apolloProtobufjs.mod.Root): IParserResult = js.native
  def apply(source: String, root: typings.apolloProtobufjs.mod.Root, options: IParseOptions): IParserResult = js.native
}
