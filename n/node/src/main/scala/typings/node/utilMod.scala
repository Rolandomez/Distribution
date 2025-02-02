package typings.node

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.Dict
import typings.node.NodeJS.ErrnoException
import typings.node.anon.Fatal
import typings.node.anon.Index
import typings.node.anon.Kind
import typings.node.anon.Positionals
import typings.node.anon.Stream
import typings.node.anon.ToString
import typings.node.anon.Values
import typings.node.nodeStrings.boolean
import typings.node.nodeStrings.get
import typings.node.nodeStrings.set
import typings.node.nodeStrings.string
import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("util", "MIMEParams")
  @js.native
  open class MIMEParams () extends StObject {
    
    /**
      * Remove all name-value pairs whose name is `name`.
      */
    def delete(name: String): Unit = js.native
    
    /**
      * Returns an iterator over each of the name-value pairs in the parameters.
      */
    def entries(): IterableIterator[js.Tuple2[/* name */ String, /* value */ String]] = js.native
    
    /**
      * Returns the value of the first name-value pair whose name is `name`.
      * If there are no such pairs, `null` is returned.
      */
    def get(name: String): String | Null = js.native
    
    /**
      * Returns `true` if there is at least one name-value pair whose name is `name`.
      */
    def has(name: String): Boolean = js.native
    
    /**
      * Returns an iterator over each of the name-value pairs in the parameters.
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[/* name */ String, /* value */ String]]] = js.native
    
    /**
      * Returns an iterator over the names of each name-value pair.
      */
    def keys(): IterableIterator[String] = js.native
    
    /**
      * Sets the value in the `MIMEParams` object associated with `name` to `value`.
      * If there are any pre-existing name-value pairs whose names are `name`,
      * set the first such pair's value to `value`.
      */
    def set(name: String, value: String): Unit = js.native
    
    /**
      * Returns an iterator over the values of each name-value pair.
      */
    def values(): IterableIterator[String] = js.native
  }
  
  @JSImport("util", "MIMEType")
  @js.native
  open class MIMEType protected () extends StObject {
    /**
      * Creates a new MIMEType object by parsing the input.
      *
      * A `TypeError` will be thrown if the `input` is not a valid MIME.
      * Note that an effort will be made to coerce the given values into strings.
      * @param input The input MIME to parse.
      */
    def this(input: String) = this()
    def this(input: ToString) = this()
    
    /**
      * Gets the essence of the MIME.
      *
      * Use `mime.type` or `mime.subtype` to alter the MIME.
      */
    val essence: String = js.native
    
    /**
      * Gets the `MIMEParams` object representing the parameters of the MIME.
      */
    val params: MIMEParams = js.native
    
    /**
      * Gets and sets the subtype portion of the MIME.
      */
    var subtype: String = js.native
    
    /**
      * Gets and sets the type portion of the MIME.
      */
    var `type`: String = js.native
  }
  
  @JSImport("util", "TextDecoder")
  @js.native
  open class TextDecoder () extends StObject {
    def this(encoding: String) = this()
    def this(encoding: String, options: Fatal) = this()
    def this(encoding: Unit, options: Fatal) = this()
    
    /**
      * Decodes the `input` and returns a string. If `options.stream` is `true`, any
      * incomplete byte sequences occurring at the end of the `input` are buffered
      * internally and emitted after the next call to `textDecoder.decode()`.
      *
      * If `textDecoder.fatal` is `true`, decoding errors that occur will result in a`TypeError` being thrown.
      * @param input An `ArrayBuffer`, `DataView`, or `TypedArray` instance containing the encoded data.
      */
    def decode(): String = js.native
    def decode(input: js.typedarray.ArrayBuffer): String = js.native
    def decode(input: js.typedarray.ArrayBuffer, options: Stream): String = js.native
    def decode(input: Null, options: Stream): String = js.native
    def decode(input: Unit, options: Stream): String = js.native
    def decode(input: ArrayBufferView): String = js.native
    def decode(input: ArrayBufferView, options: Stream): String = js.native
    
    /**
      * The encoding supported by the `TextDecoder` instance.
      */
    val encoding: String = js.native
    
    /**
      * The value will be `true` if decoding errors result in a `TypeError` being
      * thrown.
      */
    val fatal: Boolean = js.native
    
    /**
      * The value will be `true` if the decoding result will include the byte order
      * mark.
      */
    val ignoreBOM: Boolean = js.native
  }
  
  @JSImport("util", "TextEncoder")
  @js.native
  open class TextEncoder () extends StObject {
    
    /**
      * UTF-8 encodes the `input` string and returns a `Uint8Array` containing the
      * encoded bytes.
      * @param [input='an empty string'] The text to encode.
      */
    def encode(): js.typedarray.Uint8Array = js.native
    def encode(input: String): js.typedarray.Uint8Array = js.native
    
    /**
      * UTF-8 encodes the `src` string to the `dest` Uint8Array and returns an object
      * containing the read Unicode code units and written UTF-8 bytes.
      *
      * ```js
      * const encoder = new TextEncoder();
      * const src = 'this is some data';
      * const dest = new Uint8Array(10);
      * const { read, written } = encoder.encodeInto(src, dest);
      * ```
      * @param src The text to encode.
      * @param dest The array to hold the encode result.
      */
    def encodeInto(src: String, dest: js.typedarray.Uint8Array): EncodeIntoResult = js.native
    
    /**
      * The encoding supported by the `TextEncoder` instance. Always set to `'utf-8'`.
      */
    val encoding: String = js.native
  }
  
  inline def aborted(signal: AbortSignal, resource: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("aborted")(signal.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def callbackify(fn: js.Function0[js.Promise[Unit]]): js.Function1[/* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit]]
  inline def callbackify[T1](fn: js.Function1[/* arg1 */ T1, js.Promise[Unit]]): js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit]]
  inline def callbackify[T1, T2](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ]]
  inline def callbackify[T1, T2, T3](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ]]
  inline def callbackify[T1, T2, T3, T4](fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]]): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ]]
  inline def callbackify[T1, T2, T3, T4, T5](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      js.Promise[Unit]
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ]]
  inline def callbackify[T1, T2, T3, T4, T5, T6](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      js.Promise[Unit]
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ]]
  
  inline def callbackify_T1T2T3T4T5T6TResult[T1, T2, T3, T4, T5, T6, TResult](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      js.Promise[TResult]
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ]]
  
  inline def callbackify_T1T2T3T4T5TResult[T1, T2, T3, T4, T5, TResult](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      js.Promise[TResult]
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ]]
  
  inline def callbackify_T1T2T3T4TResult[T1, T2, T3, T4, TResult](fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[TResult]]): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ]]
  
  inline def callbackify_T1T2T3TResult[T1, T2, T3, TResult](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[TResult]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ]]
  
  inline def callbackify_T1T2TResult[T1, T2, TResult](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[TResult]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ]]
  
  inline def callbackify_T1TResult[T1, TResult](fn: js.Function1[/* arg1 */ T1, js.Promise[TResult]]): js.Function2[
    /* arg1 */ T1, 
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* arg1 */ T1, 
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ]]
  
  inline def callbackify_TResult[TResult](fn: js.Function0[js.Promise[TResult]]): js.Function1[
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ]]
  
  @JSImport("util", "debug")
  @js.native
  val debug: js.Function2[
    /* section */ String, 
    /* callback */ js.UndefOr[js.Function1[/* fn */ DebugLoggerFunction, Unit]], 
    DebugLogger
  ] = js.native
  
  inline def debuglog(section: String): DebugLogger = ^.asInstanceOf[js.Dynamic].applyDynamic("debuglog")(section.asInstanceOf[js.Any]).asInstanceOf[DebugLogger]
  inline def debuglog(section: String, callback: js.Function1[/* fn */ DebugLoggerFunction, Unit]): DebugLogger = (^.asInstanceOf[js.Dynamic].applyDynamic("debuglog")(section.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[DebugLogger]
  
  inline def deprecate[T /* <: js.Function */](fn: T, msg: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(fn.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def deprecate[T /* <: js.Function */](fn: T, msg: String, code: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(fn.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def format(format: Any, param: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(format.asInstanceOf[js.Any]).`++`(param.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  inline def format(format: Unit, param: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(format.asInstanceOf[js.Any]).`++`(param.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def formatWithOptions(inspectOptions: InspectOptions, format: Any, param: Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWithOptions")((scala.List(inspectOptions.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(param.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[String]
  inline def formatWithOptions(inspectOptions: InspectOptions, format: Unit, param: Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWithOptions")((scala.List(inspectOptions.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(param.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[String]
  
  inline def getSystemErrorMap(): Map[Double, js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemErrorMap")().asInstanceOf[Map[Double, js.Tuple2[String, String]]]
  
  inline def getSystemErrorName(err: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemErrorName")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object global {
    
    /**
      * `TextDecoder` class is a global reference for `require('util').TextDecoder`
      * https://nodejs.org/api/globals.html#textdecoder
      * @since v11.0.0
      */
    @JSGlobal("TextDecoder")
    @js.native
    def TextDecoder: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   TextDecoder :infer TextDecoder} ? TextDecoder : new (encoding : string | undefined, options : {  fatal :boolean | undefined,   ignoreBOM :boolean | undefined} | undefined): node.util.TextDecoder */ js.Any = js.native
    inline def TextDecoder_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   TextDecoder :infer TextDecoder} ? TextDecoder : new (encoding : string | undefined, options : {  fatal :boolean | undefined,   ignoreBOM :boolean | undefined} | undefined): node.util.TextDecoder */ js.Any
    ): Unit = js.Dynamic.global.updateDynamic("TextDecoder")(x.asInstanceOf[js.Any])
    
    /**
      * `TextEncoder` class is a global reference for `require('util').TextEncoder`
      * https://nodejs.org/api/globals.html#textencoder
      * @since v11.0.0
      */
    @JSGlobal("TextEncoder")
    @js.native
    def TextEncoder: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   TextEncoder :infer TextEncoder} ? TextEncoder : new (): node.util.TextEncoder */ js.Any = js.native
    inline def TextEncoder_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   TextEncoder :infer TextEncoder} ? TextEncoder : new (): node.util.TextEncoder */ js.Any
    ): Unit = js.Dynamic.global.updateDynamic("TextEncoder")(x.asInstanceOf[js.Any])
  }
  
  inline def inherits(constructor: Any, superConstructor: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(constructor.asInstanceOf[js.Any], superConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object inspect {
    
    inline def apply(`object`: Any): String = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(`object`: Any, options: InspectOptions): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(`object`: Any, showHidden: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(`object`: Any, showHidden: Boolean, depth: Double): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(`object`: Any, showHidden: Boolean, depth: Double, color: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(`object`: Any, showHidden: Boolean, depth: Null, color: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(`object`: Any, showHidden: Boolean, depth: Unit, color: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(`object`: Any, showHidden: Unit, depth: Double): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(`object`: Any, showHidden: Unit, depth: Double, color: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(`object`: Any, showHidden: Unit, depth: Null, color: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(`object`: Any, showHidden: Unit, depth: Unit, color: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("util", "inspect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("util", "inspect.colors")
    @js.native
    def colors: Dict[js.Tuple2[Double, Double]] = js.native
    inline def colors_=(x: Dict[js.Tuple2[Double, Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    /**
      * That can be used to declare custom inspect functions.
      */
    @JSImport("util", "inspect.custom")
    @js.native
    val custom: js.Symbol = js.native
    
    @JSImport("util", "inspect.defaultOptions")
    @js.native
    def defaultOptions: InspectOptions = js.native
    inline def defaultOptions_=(x: InspectOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Allows changing inspect settings from the repl.
      */
    @JSImport("util", "inspect.replDefaults")
    @js.native
    def replDefaults: InspectOptions = js.native
    inline def replDefaults_=(x: InspectOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replDefaults")(x.asInstanceOf[js.Any])
    
    /* Inlined {[ K in node.util.Style ]: string} */
    object styles {
      
      @JSImport("util", "inspect.styles")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("util", "inspect.styles.bigint")
      @js.native
      def bigint: String = js.native
      inline def bigint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigint")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.boolean")
      @js.native
      def boolean: String = js.native
      inline def boolean_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.date")
      @js.native
      def date: String = js.native
      inline def date_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.module")
      @js.native
      def module: String = js.native
      inline def module_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("module")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.null")
      @js.native
      val `null`: String = js.native
      
      @JSImport("util", "inspect.styles.number")
      @js.native
      def number: String = js.native
      inline def number_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.regexp")
      @js.native
      def regexp: String = js.native
      inline def regexp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.special")
      @js.native
      def special: String = js.native
      inline def special_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("special")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.string")
      @js.native
      def string: String = js.native
      inline def string_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.symbol")
      @js.native
      def symbol: String = js.native
      inline def symbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.undefined")
      @js.native
      def undefined: String = js.native
      inline def undefined_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def isArray(`object`: Any): /* is std.Array<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<unknown> */ Boolean]
  
  inline def isBoolean(`object`: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isBuffer(`object`: Any): /* is node.buffer.<global>.Buffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is node.buffer.<global>.Buffer */ Boolean]
  
  inline def isDate(`object`: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isDeepStrictEqual(val1: Any, val2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepStrictEqual")(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isError(`object`: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  inline def isFunction(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(`object`: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNullOrUndefined(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(`object`: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrimitive(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(`object`: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(`object`: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isSymbol(`object`: Any): /* is symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is symbol */ Boolean]
  
  inline def isUndefined(`object`: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def log(string: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(string.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseArgs[T /* <: ParseArgsConfig */](): ParsedResults[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[ParsedResults[T]]
  inline def parseArgs[T /* <: ParseArgsConfig */](config: T): ParsedResults[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(config.asInstanceOf[js.Any]).asInstanceOf[ParsedResults[T]]
  
  object promisify {
    
    inline def apply(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def apply(fn: js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], Unit]): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
    inline def apply[T1](
      fn: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], Unit]
    ): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ T1, js.Promise[Unit]]]
    inline def apply[TCustom /* <: js.Function */](fn: CustomPromisify[TCustom]): TCustom = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[TCustom]
    inline def apply[T1, T2](
      fn: js.Function3[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
          Unit
        ]
    ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]]]
    inline def apply[T1, T2, T3](
      fn: js.Function4[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
          Unit
        ]
    ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]]]
    inline def apply[T1, T2, T3, T4](
      fn: js.Function5[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* arg4 */ T4, 
          /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
          Unit
        ]
    ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]]]
    inline def apply[T1, T2, T3, T4, T5](
      fn: js.Function6[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* arg4 */ T4, 
          /* arg5 */ T5, 
          /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
          Unit
        ]
    ): js.Function5[
        /* arg1 */ T1, 
        /* arg2 */ T2, 
        /* arg3 */ T3, 
        /* arg4 */ T4, 
        /* arg5 */ T5, 
        js.Promise[Unit]
      ] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
        /* arg1 */ T1, 
        /* arg2 */ T2, 
        /* arg3 */ T3, 
        /* arg4 */ T4, 
        /* arg5 */ T5, 
        js.Promise[Unit]
      ]]
    
    @JSImport("util", "promisify")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * That can be used to declare custom promisified variants of functions.
      */
    @JSImport("util", "promisify.custom")
    @js.native
    val custom: js.Symbol = js.native
  }
  
  inline def stripVTControlCharacters(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripVTControlCharacters")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toUSVString(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUSVString")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transferableAbortController(): AbortController = ^.asInstanceOf[js.Dynamic].applyDynamic("transferableAbortController")().asInstanceOf[AbortController]
  
  inline def transferableAbortSignal(signal: AbortSignal): AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("transferableAbortSignal")(signal.asInstanceOf[js.Any]).asInstanceOf[AbortSignal]
  
  type CustomInspectFunction = js.Function2[/* depth */ Double, /* options */ InspectOptionsStylized, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.utilMod.CustomPromisifySymbol[TCustom]
    - typings.node.utilMod.CustomPromisifyLegacy[TCustom]
  */
  trait CustomPromisify[TCustom /* <: js.Function */] extends StObject
  
  @js.native
  trait CustomPromisifyLegacy[TCustom /* <: js.Function */]
    extends js.Function
       with CustomPromisify[TCustom] {
    
    var __promisify__ : TCustom = js.native
  }
  
  @js.native
  trait CustomPromisifySymbol[TCustom /* <: js.Function */]
    extends js.Function
       with CustomPromisify[TCustom]
  
  @js.native
  trait DebugLogger
    extends StObject
       with DebugLoggerFunction {
    
    var enabled: Boolean = js.native
  }
  
  @js.native
  trait DebugLoggerFunction extends StObject {
    
    def apply(msg: String, param: Any*): Unit = js.native
  }
  
  trait EncodeIntoResult extends StObject {
    
    /**
      * The read Unicode code units of input.
      */
    var read: Double
    
    /**
      * The written UTF-8 bytes of output.
      */
    var written: Double
  }
  object EncodeIntoResult {
    
    inline def apply(read: Double, written: Double): EncodeIntoResult = {
      val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodeIntoResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncodeIntoResult] (val x: Self) extends AnyVal {
      
      inline def setRead(value: Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setWritten(value: Double): Self = StObject.set(x, "written", value.asInstanceOf[js.Any])
    }
  }
  
  type ExtractOptionValue[T /* <: ParseArgsConfig */, O /* <: ParseArgsOptionConfig */] = IfDefaultsTrue[
    /* import warning: importer.ImportType#apply Failed type conversion: T['strict'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: O['type'] extends 'string' ? string : O['type'] extends 'boolean' ? boolean : string | boolean */ js.Any, 
    String | Boolean
  ]
  
  // we put the `extends false` condition first here because `undefined` compares like `any` when `strictNullChecks: false`
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends false ? IfFalse : T extends true ? IfTrue : IfFalse
    }}}
    */
  type IfDefaultsFalse[T, IfTrue, IfFalse] = IfFalse
  
  /*
    IfDefaultsTrue and IfDefaultsFalse are helpers to handle default values for missing boolean properties.
    TypeScript does not have exact types for objects: https://github.com/microsoft/TypeScript/issues/12936
    This means it is impossible to distinguish between "field X is definitely not present" and "field X may or may not be present".
    But we expect users to generally provide their config inline or `as const`, which means TS will always know whether a given field is present.
    So this helper treats "not definitely present" (i.e., not `extends boolean`) as being "definitely not present", i.e. it should have its default value.
    This is technically incorrect but is a much nicer UX for the common case.
    The IfDefaultsTrue version is for things which default to true; the IfDefaultsFalse version is for things which default to false.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends true ? IfTrue : T extends false ? IfFalse : IfTrue
    }}}
    */
  type IfDefaultsTrue[T, IfTrue, IfFalse] = IfTrue
  
  trait InspectOptions extends StObject {
    
    /**
      * The length at which input values are split across multiple lines.
      * Set to `Infinity` to format the input as a single line
      * (in combination with `compact` set to `true` or any number >= `1`).
      * @default 80
      */
    var breakLength: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, the output is styled with ANSI color codes. Colors are customizable.
      */
    var colors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting this to `false` causes each object key
      * to be displayed on a new line. It will also add new lines to text that is
      * longer than `breakLength`. If set to a number, the most `n` inner elements
      * are united on a single line as long as all properties fit into
      * `breakLength`. Short array elements are also grouped together. Note that no
      * text will be reduced below 16 characters, no matter the `breakLength` size.
      * For more information, see the example below.
      * @default true
      */
    var compact: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * If `false`, `[util.inspect.custom](depth, opts, inspect)` functions are not invoked.
      * @default true
      */
    var customInspect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the number of times to recurse while formatting object.
      * This is useful for inspecting large objects.
      * To recurse up to the maximum call stack size pass `Infinity` or `null`.
      * @default 2
      */
    var depth: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * If set to `true`, getters are going to be
      * inspected as well. If set to `'get'` only getters without setter are going
      * to be inspected. If set to `'set'` only getters having a corresponding
      * setter are going to be inspected. This might cause side effects depending on
      * the getter function.
      * @default false
      */
    var getters: js.UndefOr[get | set | Boolean] = js.undefined
    
    /**
      * Specifies the maximum number of `Array`, `TypedArray`, `WeakMap`, and `WeakSet` elements
      * to include when formatting. Set to `null` or `Infinity` to show all elements.
      * Set to `0` or negative to show no elements.
      * @default 100
      */
    var maxArrayLength: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Specifies the maximum number of characters to
      * include when formatting. Set to `null` or `Infinity` to show all elements.
      * Set to `0` or negative to show no characters.
      * @default 10000
      */
    var maxStringLength: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * If set to `true`, an underscore is used to separate every three digits in all bigints and numbers.
      * @default false
      */
    var numericSeparator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, object's non-enumerable symbols and properties are included in the formatted result.
      * `WeakMap` and `WeakSet` entries are also included as well as user defined prototype properties (excluding method properties).
      * @default false
      */
    var showHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, `Proxy` inspection includes the target and handler objects.
      * @default false
      */
    var showProxy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `true` or a function, all properties of an object, and `Set` and `Map`
      * entries are sorted in the resulting string.
      * If set to `true` the default sort is used.
      * If set to a function, it is used as a compare function.
      */
    var sorted: js.UndefOr[Boolean | (js.Function2[/* a */ String, /* b */ String, Double])] = js.undefined
  }
  object InspectOptions {
    
    inline def apply(): InspectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InspectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InspectOptions] (val x: Self) extends AnyVal {
      
      inline def setBreakLength(value: Double): Self = StObject.set(x, "breakLength", value.asInstanceOf[js.Any])
      
      inline def setBreakLengthUndefined: Self = StObject.set(x, "breakLength", js.undefined)
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setCompact(value: Boolean | Double): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setCustomInspect(value: Boolean): Self = StObject.set(x, "customInspect", value.asInstanceOf[js.Any])
      
      inline def setCustomInspectUndefined: Self = StObject.set(x, "customInspect", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthNull: Self = StObject.set(x, "depth", null)
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setGetters(value: get | set | Boolean): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
      
      inline def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
      
      inline def setMaxArrayLength(value: Double): Self = StObject.set(x, "maxArrayLength", value.asInstanceOf[js.Any])
      
      inline def setMaxArrayLengthNull: Self = StObject.set(x, "maxArrayLength", null)
      
      inline def setMaxArrayLengthUndefined: Self = StObject.set(x, "maxArrayLength", js.undefined)
      
      inline def setMaxStringLength(value: Double): Self = StObject.set(x, "maxStringLength", value.asInstanceOf[js.Any])
      
      inline def setMaxStringLengthNull: Self = StObject.set(x, "maxStringLength", null)
      
      inline def setMaxStringLengthUndefined: Self = StObject.set(x, "maxStringLength", js.undefined)
      
      inline def setNumericSeparator(value: Boolean): Self = StObject.set(x, "numericSeparator", value.asInstanceOf[js.Any])
      
      inline def setNumericSeparatorUndefined: Self = StObject.set(x, "numericSeparator", js.undefined)
      
      inline def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
      
      inline def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
      
      inline def setShowProxy(value: Boolean): Self = StObject.set(x, "showProxy", value.asInstanceOf[js.Any])
      
      inline def setShowProxyUndefined: Self = StObject.set(x, "showProxy", js.undefined)
      
      inline def setSorted(value: Boolean | (js.Function2[/* a */ String, /* b */ String, Double])): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedFunction2(value: (/* a */ String, /* b */ String) => Double): Self = StObject.set(x, "sorted", js.Any.fromFunction2(value))
      
      inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    }
  }
  
  trait InspectOptionsStylized
    extends StObject
       with InspectOptions {
    
    def stylize(text: String, styleType: Style): String
  }
  object InspectOptionsStylized {
    
    inline def apply(stylize: (String, Style) => String): InspectOptionsStylized = {
      val __obj = js.Dynamic.literal(stylize = js.Any.fromFunction2(stylize))
      __obj.asInstanceOf[InspectOptionsStylized]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InspectOptionsStylized] (val x: Self) extends AnyVal {
      
      inline def setStylize(value: (String, Style) => String): Self = StObject.set(x, "stylize", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.anon.InlineValue
    - typings.node.anon.Name
  */
  trait OptionToken
    extends StObject
       with Token
  object OptionToken {
    
    inline def InlineValue(index: Double, inlineValue: Boolean, name: String, rawName: String, value: String): typings.node.anon.InlineValue = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.node.anon.InlineValue]
    }
    
    inline def Name(index: Double, inlineValue: Unit, name: String, rawName: String, value: Unit): typings.node.anon.Name = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.node.anon.Name]
    }
  }
  
  trait ParseArgsConfig extends StObject {
    
    /**
      * Whether this command accepts positional arguments.
      */
    var allowPositionals: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of argument strings.
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Used to describe arguments known to the parser.
      */
    var options: js.UndefOr[ParseArgsOptionsConfig] = js.undefined
    
    /**
      * Should an error be thrown when unknown arguments are encountered,
      * or when arguments are passed that do not match the `type` configured in `options`.
      * @default true
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return the parsed tokens. This is useful for extending the built-in behavior,
      * from adding additional checks through to reprocessing the tokens in different ways.
      * @default false
      */
    var tokens: js.UndefOr[Boolean] = js.undefined
  }
  object ParseArgsConfig {
    
    inline def apply(): ParseArgsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseArgsConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseArgsConfig] (val x: Self) extends AnyVal {
      
      inline def setAllowPositionals(value: Boolean): Self = StObject.set(x, "allowPositionals", value.asInstanceOf[js.Any])
      
      inline def setAllowPositionalsUndefined: Self = StObject.set(x, "allowPositionals", js.undefined)
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setOptions(value: ParseArgsOptionsConfig): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  trait ParseArgsOptionConfig extends StObject {
    
    /**
      * The default option value when it is not set by args.
      * It must be of the same type as the the `type` property.
      * When `multiple` is `true`, it must be an array.
      * @since v18.11.0
      */
    var default: js.UndefOr[String | Boolean | (js.Array[Boolean | String])] = js.undefined
    
    /**
      * Whether this option can be provided multiple times.
      * If `true`, all values will be collected in an array.
      * If `false`, values for the option are last-wins.
      * @default false.
      */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A single character alias for the option.
      */
    var short: js.UndefOr[String] = js.undefined
    
    /**
      * Type of argument.
      */
    var `type`: string | boolean
  }
  object ParseArgsOptionConfig {
    
    inline def apply(`type`: string | boolean): ParseArgsOptionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseArgsOptionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseArgsOptionConfig] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String | Boolean | (js.Array[Boolean | String])): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: (Boolean | String)*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      inline def setType(value: string | boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ParseArgsOptionsConfig = StringDictionary[ParseArgsOptionConfig]
  
  type ParsedOptionToken[T /* <: ParseArgsConfig */] = IfDefaultsTrue[
    /* import warning: importer.ImportType#apply Failed type conversion: T['strict'] */ js.Any, 
    TokenForOptions[
      T, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof T['options'] */ js.Any
    ], 
    OptionToken
  ]
  
  type ParsedPositionalToken[T /* <: ParseArgsConfig */] = IfDefaultsTrue[
    /* import warning: importer.ImportType#apply Failed type conversion: T['strict'] */ js.Any, 
    IfDefaultsFalse[
      /* import warning: importer.ImportType#apply Failed type conversion: T['allowPositionals'] */ js.Any, 
      Index, 
      scala.Nothing
    ], 
    IfDefaultsTrue[
      /* import warning: importer.ImportType#apply Failed type conversion: T['allowPositionals'] */ js.Any, 
      Index, 
      scala.Nothing
    ]
  ]
  
  type ParsedPositionals[T /* <: ParseArgsConfig */] = IfDefaultsTrue[
    /* import warning: importer.ImportType#apply Failed type conversion: T['strict'] */ js.Any, 
    IfDefaultsFalse[
      /* import warning: importer.ImportType#apply Failed type conversion: T['allowPositionals'] */ js.Any, 
      js.Array[String], 
      js.Array[Any]
    ], 
    IfDefaultsTrue[
      /* import warning: importer.ImportType#apply Failed type conversion: T['allowPositionals'] */ js.Any, 
      js.Array[String], 
      js.Array[Any]
    ]
  ]
  
  // If ParseArgsConfig extends T, then the user passed config constructed elsewhere.
  // So we can't rely on the `"not definitely present" implies "definitely not present"` assumption mentioned above.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    node.util.ParseArgsConfig extends T ? {  values :{[longOption: string] : undefined | string | boolean | std.Array<string | boolean>},   positionals :std.Array<string>,   tokens :std.Array<node.util.Token> | undefined} : node.util.PreciseParsedResults<T>
    }}}
    */
  type ParsedResults[T /* <: ParseArgsConfig */] = Values[T]
  
  type ParsedTokens[T /* <: ParseArgsConfig */] = js.Array[ParsedOptionToken[T] | ParsedPositionalToken[T] | Kind]
  
  type ParsedValues[T /* <: ParseArgsConfig */] = (IfDefaultsTrue[
    /* import warning: importer.ImportType#apply Failed type conversion: T['strict'] */ js.Any, 
    Any, 
    StringDictionary[js.UndefOr[String | Boolean]]
  ]) & (/* import warning: importer.ImportType#apply Failed type conversion: T['options'] extends node.util.ParseArgsOptionsConfig ? {-readonly [ LongOption in keyof T['options'] ]: node.util.IfDefaultsFalse<T['options'][LongOption]['multiple'], undefined | std.Array<node.util.ExtractOptionValue<T, T['options'][LongOption]>>, undefined | node.util.ExtractOptionValue<T, T['options'][LongOption]>>} : {} */ js.Any)
  
  type PreciseParsedResults[T /* <: ParseArgsConfig */] = IfDefaultsFalse[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tokens'] */ js.Any, 
    Positionals[T], 
    Values[T]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O['type'] extends 'string' ? {  kind :'option',   index :number,   name :K,   rawName :string,   value :string,   inlineValue :boolean} : O['type'] extends 'boolean' ? {  kind :'option',   index :number,   name :K,   rawName :string,   value :undefined,   inlineValue :undefined} : node.util.OptionToken & {  name :K}
    }}}
    */
  type PreciseTokenForOptions[K /* <: String */, O /* <: ParseArgsOptionConfig */] = OptionToken & (/* import warning: importer.ImportType#apply Failed type conversion: {  name :K} */ js.Any)
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeStrings.special
    - typings.node.nodeStrings.number
    - typings.node.nodeStrings.bigint
    - typings.node.nodeStrings.boolean
    - typings.node.nodeStrings.undefined
    - typings.node.nodeStrings.`null`
    - typings.node.nodeStrings.string
    - typings.node.nodeStrings.symbol
    - typings.node.nodeStrings.date
    - typings.node.nodeStrings.regexp
    - typings.node.nodeStrings.module
  */
  trait Style extends StObject
  object Style {
    
    inline def bigint: typings.node.nodeStrings.bigint = "bigint".asInstanceOf[typings.node.nodeStrings.bigint]
    
    inline def boolean: typings.node.nodeStrings.boolean = "boolean".asInstanceOf[typings.node.nodeStrings.boolean]
    
    inline def date: typings.node.nodeStrings.date = "date".asInstanceOf[typings.node.nodeStrings.date]
    
    inline def module: typings.node.nodeStrings.module = "module".asInstanceOf[typings.node.nodeStrings.module]
    
    inline def `null`: typings.node.nodeStrings.`null` = "null".asInstanceOf[typings.node.nodeStrings.`null`]
    
    inline def number: typings.node.nodeStrings.number = "number".asInstanceOf[typings.node.nodeStrings.number]
    
    inline def regexp: typings.node.nodeStrings.regexp = "regexp".asInstanceOf[typings.node.nodeStrings.regexp]
    
    inline def special: typings.node.nodeStrings.special = "special".asInstanceOf[typings.node.nodeStrings.special]
    
    inline def string: typings.node.nodeStrings.string = "string".asInstanceOf[typings.node.nodeStrings.string]
    
    inline def symbol: typings.node.nodeStrings.symbol = "symbol".asInstanceOf[typings.node.nodeStrings.symbol]
    
    inline def undefined: typings.node.nodeStrings.undefined = "undefined".asInstanceOf[typings.node.nodeStrings.undefined]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.utilMod.OptionToken
    - typings.node.anon.Index
    - typings.node.anon.Kind
  */
  trait Token extends StObject
  object Token {
    
    inline def Index(index: Double, value: String): typings.node.anon.Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], kind = "positional", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.node.anon.Index]
    }
    
    inline def InlineValue(index: Double, inlineValue: Boolean, name: String, rawName: String, value: String): typings.node.anon.InlineValue = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.node.anon.InlineValue]
    }
    
    inline def Kind(index: Double): typings.node.anon.Kind = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], kind = "option-terminator")
      __obj.asInstanceOf[typings.node.anon.Kind]
    }
    
    inline def Name(index: Double, inlineValue: Unit, name: String, rawName: String, value: Unit): typings.node.anon.Name = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.node.anon.Name]
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    K extends unknown ? T['options'] extends node.util.ParseArgsOptionsConfig ? node.util.PreciseTokenForOptions<K & string, T['options'][K]> : node.util.OptionToken : never
    }}}
    */
  type TokenForOptions[T /* <: ParseArgsConfig */, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['options'] */ js.Any */] = OptionToken
}
