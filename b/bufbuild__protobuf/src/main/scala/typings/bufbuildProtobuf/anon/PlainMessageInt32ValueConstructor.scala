package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.Int32Value
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb.Int32Value> */
trait PlainMessageInt32ValueConstructor extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageInt32ValueConstructor: PlainField[js.Function0[Int32Value]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessage[Int32Value]], Any]]
  
  @JSName("equals")
  var equals_FPlainMessageInt32ValueConstructor: PlainField[
    js.Function1[/* other */ js.UndefOr[Int32Value | PlainMessage[Int32Value] | Null], Boolean]
  ]
  
  var fieldWrapper: PlainField[js.UndefOr[Any]]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      typings.bufbuildProtobuf.mod.Int32Value
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* json */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.Int32Value
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[
      /* jsonString */ String, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.Int32Value
    ]
  ]
  
  var getType: PlainField[js.Function0[MessageType[Int32Value]]]
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
  
  var value: PlainField[Double]
}
object PlainMessageInt32ValueConstructor {
  
  inline def apply(
    clone_ : () => Int32Value,
    constructor: /* data */ js.UndefOr[PartialMessage[Int32Value]] => Any,
    equals_ : /* other */ js.UndefOr[Int32Value | PlainMessage[Int32Value] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.Int32Value,
    fromJson: (/* json */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.Int32Value,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.Int32Value,
    getType: () => MessageType[Int32Value],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String,
    value: PlainField[Double]
  ): PlainMessageInt32ValueConstructor = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageInt32ValueConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageInt32ValueConstructor] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => Int32Value): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[Int32Value]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: /* other */ js.UndefOr[Int32Value | PlainMessage[Int32Value] | Null] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFieldWrapper(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fieldWrapper", value.asInstanceOf[js.Any])
    
    inline def setFieldWrapperUndefined: Self = StObject.set(x, "fieldWrapper", js.undefined)
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.Int32Value
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* json */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.Int32Value
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.Int32Value
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[Int32Value]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setValue(value: PlainField[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
