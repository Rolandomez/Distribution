package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsZrangeMod.ZRangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedZRANGE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, min: Double, max: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: Double, max: Double, options: ZRangeOptions): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: Double, max: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: Double, max: RedisCommandArgument, options: ZRangeOptions): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: RedisCommandArgument, max: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: RedisCommandArgument, max: Double, options: ZRangeOptions): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: RedisCommandArgument, max: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    min: RedisCommandArgument,
    max: RedisCommandArgument,
    options: ZRangeOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(): js.Array[RedisCommandArgument] = js.native
}
