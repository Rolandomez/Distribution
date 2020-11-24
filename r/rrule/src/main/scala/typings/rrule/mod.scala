package typings.rrule

import typings.rrule.anon.PartialOptions
import typings.rrule.anon.PartialRRuleStrOptions
import typings.rrule.i18nMod.Language
import typings.rrule.weekdayMod.WeekdayStr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrule", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def rrulestr(s: String): typings.rrule.rruleMod.default | typings.rrule.rrulesetMod.default = js.native
  def rrulestr(s: String, options: PartialRRuleStrOptions): typings.rrule.rruleMod.default | typings.rrule.rrulesetMod.default = js.native
  
  @js.native
  object Frequency extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rrule.typesMod.Frequency with Double] = js.native
    
    /* 3 */ val DAILY: typings.rrule.typesMod.Frequency.DAILY with Double = js.native
    
    /* 4 */ val HOURLY: typings.rrule.typesMod.Frequency.HOURLY with Double = js.native
    
    /* 5 */ val MINUTELY: typings.rrule.typesMod.Frequency.MINUTELY with Double = js.native
    
    /* 1 */ val MONTHLY: typings.rrule.typesMod.Frequency.MONTHLY with Double = js.native
    
    /* 6 */ val SECONDLY: typings.rrule.typesMod.Frequency.SECONDLY with Double = js.native
    
    /* 2 */ val WEEKLY: typings.rrule.typesMod.Frequency.WEEKLY with Double = js.native
    
    /* 0 */ val YEARLY: typings.rrule.typesMod.Frequency.YEARLY with Double = js.native
  }
  
  @js.native
  class RRule ()
    extends typings.rrule.rruleMod.default {
    def this(options: PartialOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  /* static members */
  @js.native
  object RRule extends js.Object {
    
    val DAILY: String | Double = js.native
    
    val FR: typings.rrule.weekdayMod.Weekday = js.native
    
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    val HOURLY: String | Double = js.native
    
    val MINUTELY: String | Double = js.native
    
    val MO: typings.rrule.weekdayMod.Weekday = js.native
    
    val MONTHLY: String | Double = js.native
    
    val SA: typings.rrule.weekdayMod.Weekday = js.native
    
    val SECONDLY: String | Double = js.native
    
    val SU: typings.rrule.weekdayMod.Weekday = js.native
    
    val TH: typings.rrule.weekdayMod.Weekday = js.native
    
    val TU: typings.rrule.weekdayMod.Weekday = js.native
    
    val WE: typings.rrule.weekdayMod.Weekday = js.native
    
    val WEEKLY: String | Double = js.native
    
    val YEARLY: String | Double = js.native
    
    def fromString(str: String): typings.rrule.rruleMod.RRule = js.native
    
    def fromText(text: String): typings.rrule.rruleMod.RRule = js.native
    def fromText(text: String, language: Language): typings.rrule.rruleMod.RRule = js.native
    
    def optionsToString(options: PartialOptions): String = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ PartialOptions, String] = js.native
    
    def parseString(rfcString: String): PartialOptions = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    
    def parseText(text: String): PartialOptions | Null = js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
  }
  
  @js.native
  /**
    *
    * @param {Boolean?} noCache
    *  The same stratagy as RRule on cache, default to false
    * @constructor
    */
  class RRuleSet ()
    extends typings.rrule.rrulesetMod.default {
    def this(noCache: Boolean) = this()
  }
  
  @js.native
  class Weekday protected ()
    extends typings.rrule.weekdayMod.Weekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
  }
  /* static members */
  @js.native
  object Weekday extends js.Object {
    
    def fromStr(str: WeekdayStr): typings.rrule.weekdayMod.Weekday = js.native
  }
  
  @js.native
  class default ()
    extends typings.rrule.rruleMod.default {
    def this(options: PartialOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    val DAILY: String | Double = js.native
    
    val FR: typings.rrule.weekdayMod.Weekday = js.native
    
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    val HOURLY: String | Double = js.native
    
    val MINUTELY: String | Double = js.native
    
    val MO: typings.rrule.weekdayMod.Weekday = js.native
    
    val MONTHLY: String | Double = js.native
    
    val SA: typings.rrule.weekdayMod.Weekday = js.native
    
    val SECONDLY: String | Double = js.native
    
    val SU: typings.rrule.weekdayMod.Weekday = js.native
    
    val TH: typings.rrule.weekdayMod.Weekday = js.native
    
    val TU: typings.rrule.weekdayMod.Weekday = js.native
    
    val WE: typings.rrule.weekdayMod.Weekday = js.native
    
    val WEEKLY: String | Double = js.native
    
    val YEARLY: String | Double = js.native
    
    def fromString(str: String): typings.rrule.rruleMod.RRule = js.native
    
    def fromText(text: String): typings.rrule.rruleMod.RRule = js.native
    def fromText(text: String, language: Language): typings.rrule.rruleMod.RRule = js.native
    
    def optionsToString(options: PartialOptions): String = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ PartialOptions, String] = js.native
    
    def parseString(rfcString: String): PartialOptions = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    
    def parseText(text: String): PartialOptions | Null = js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
  }
}
