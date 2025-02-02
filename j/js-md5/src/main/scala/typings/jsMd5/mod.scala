package typings.jsMd5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("js-md5", JSImport.Namespace)
  @js.native
  val ^ : md5 = js.native
  
  trait Md5_ extends StObject {
    
    def array(): js.Array[Double]
    
    def arrayBuffer(): js.typedarray.ArrayBuffer
    
    def base64(): String
    
    def buffer(): js.typedarray.ArrayBuffer
    
    def digest(): js.Array[Double]
    
    def hex(): String
    
    def update(message: message): Md5_
  }
  object Md5_ {
    
    inline def apply(
      array: () => js.Array[Double],
      arrayBuffer: () => js.typedarray.ArrayBuffer,
      base64: () => String,
      buffer: () => js.typedarray.ArrayBuffer,
      digest: () => js.Array[Double],
      hex: () => String,
      update: message => Md5_
    ): Md5_ = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), base64 = js.Any.fromFunction0(base64), buffer = js.Any.fromFunction0(buffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Md5_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Md5_] (val x: Self) extends AnyVal {
      
      inline def setArray(value: () => js.Array[Double]): Self = StObject.set(x, "array", js.Any.fromFunction0(value))
      
      inline def setArrayBuffer(value: () => js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setBase64(value: () => String): Self = StObject.set(x, "base64", js.Any.fromFunction0(value))
      
      inline def setBuffer(value: () => js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", js.Any.fromFunction0(value))
      
      inline def setDigest(value: () => js.Array[Double]): Self = StObject.set(x, "digest", js.Any.fromFunction0(value))
      
      inline def setHex(value: () => String): Self = StObject.set(x, "hex", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: message => Md5_): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  type _To = md5
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: md5 = ^
  
  @js.native
  trait md5 extends StObject {
    
    def apply(message: message): String = js.native
    
    def array(message: message): js.Array[Double] = js.native
    
    def arrayBuffer(message: message): js.typedarray.ArrayBuffer = js.native
    
    def base64(message: message): String = js.native
    
    def buffer(message: message): js.typedarray.ArrayBuffer = js.native
    
    def create(): Md5_ = js.native
    
    def digest(message: message): js.Array[Double] = js.native
    
    def hex(message: message): String = js.native
    
    def update(message: message): Md5_ = js.native
  }
  
  type message = String | js.Array[Any] | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer
}
