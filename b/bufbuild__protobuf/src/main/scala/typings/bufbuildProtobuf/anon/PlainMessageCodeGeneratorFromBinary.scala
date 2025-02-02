package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfo
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb.CodeGeneratorResponse_File> */
trait PlainMessageCodeGeneratorFromBinary extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageCodeGeneratorFromBinary: PlainField[js.Function0[CodeGeneratorResponseFile]]
  
  var constructor: PlainField[
    js.Function1[/* data */ js.UndefOr[PartialMessage[CodeGeneratorResponseFile]], Any]
  ]
  
  var content: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  @JSName("equals")
  var equals_FPlainMessageCodeGeneratorFromBinary: PlainField[
    js.Function1[
      /* other */ js.UndefOr[CodeGeneratorResponseFile | PlainMessage[CodeGeneratorResponseFile] | Null], 
      Boolean
    ]
  ]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      typings.bufbuildProtobuf.mod.CodeGeneratorResponseFile
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* jsonValue */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.CodeGeneratorResponseFile
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[
      /* jsonString */ String, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.CodeGeneratorResponseFile
    ]
  ]
  
  var generatedCodeInfo: js.UndefOr[PlainField[js.UndefOr[GeneratedCodeInfo]]] = js.undefined
  
  var getType: PlainField[js.Function0[MessageType[CodeGeneratorResponseFile]]]
  
  var insertionPoint: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var name: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
}
object PlainMessageCodeGeneratorFromBinary {
  
  inline def apply(
    clone_ : () => CodeGeneratorResponseFile,
    constructor: /* data */ js.UndefOr[PartialMessage[CodeGeneratorResponseFile]] => Any,
    equals_ : /* other */ js.UndefOr[CodeGeneratorResponseFile | PlainMessage[CodeGeneratorResponseFile] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.CodeGeneratorResponseFile,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.CodeGeneratorResponseFile,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.CodeGeneratorResponseFile,
    getType: () => MessageType[CodeGeneratorResponseFile],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String
  ): PlainMessageCodeGeneratorFromBinary = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString))
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageCodeGeneratorFromBinary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageCodeGeneratorFromBinary] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => CodeGeneratorResponseFile): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[CodeGeneratorResponseFile]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setContent(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[CodeGeneratorResponseFile | PlainMessage[CodeGeneratorResponseFile] | Null] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.CodeGeneratorResponseFile
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.CodeGeneratorResponseFile
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.CodeGeneratorResponseFile
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGeneratedCodeInfo(value: PlainField[js.UndefOr[GeneratedCodeInfo]]): Self = StObject.set(x, "generatedCodeInfo", value.asInstanceOf[js.Any])
    
    inline def setGeneratedCodeInfoUndefined: Self = StObject.set(x, "generatedCodeInfo", js.undefined)
    
    inline def setGetType(value: () => MessageType[CodeGeneratorResponseFile]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setInsertionPoint(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
    
    inline def setInsertionPointUndefined: Self = StObject.set(x, "insertionPoint", js.undefined)
    
    inline def setName(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
