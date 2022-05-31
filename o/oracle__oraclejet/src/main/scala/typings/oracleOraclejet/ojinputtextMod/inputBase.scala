package typings.oracleOraclejet.ojinputtextMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.anon.Regexp
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.ojinputtextMod.inputBase.ojAnimateEnd
import typings.oracleOraclejet.ojinputtextMod.inputBase.ojAnimateStart
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.asyncValidators
import typings.oracleOraclejet.oracleOraclejetStrings.asyncValidatorsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.autocomplete
import typings.oracleOraclejet.oracleOraclejetStrings.autocompleteChanged
import typings.oracleOraclejet.oracleOraclejetStrings.autofocus
import typings.oracleOraclejet.oracleOraclejetStrings.autofocusChanged
import typings.oracleOraclejet.oracleOraclejetStrings.invalid
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.placeholder
import typings.oracleOraclejet.oracleOraclejetStrings.placeholderChanged
import typings.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typings.oracleOraclejet.oracleOraclejetStrings.readonly_
import typings.oracleOraclejet.oracleOraclejetStrings.required
import typings.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.validators
import typings.oracleOraclejet.oracleOraclejetStrings.validatorsChanged
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait inputBase[V, SP /* <: inputBaseSettableProperties[V, SV, V] */, SV, RV]
  extends StObject
     with editableValue[V, SP, SV, RV] {
  
  def addEventListener(
    `type`: autocompleteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | String], js.Any]
  ): Unit = js.native
  def addEventListener(
    `type`: autocompleteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | String], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[AsyncValidator[V]]], 
      js.Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[AsyncValidator[V]]], 
      js.Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autofocusChanged(
    `type`: autofocusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autofocusChanged(
    `type`: autofocusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[RV], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[RV], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: requiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: requiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Array[Validator[V] | RegisteredValidator]) | Null], 
      js.Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Array[Validator[V] | RegisteredValidator]) | Null], 
      js.Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  
  var asyncValidators: js.Array[AsyncValidator[V]] = js.native
  
  var autocomplete: on | off | String = js.native
  
  @JSName("getProperty")
  def getProperty_asyncValidators(property: asyncValidators): js.Array[AsyncValidator[V]] = js.native
  @JSName("getProperty")
  def getProperty_autocomplete(property: autocomplete): on | off | String = js.native
  @JSName("getProperty")
  def getProperty_autofocus(property: autofocus): Boolean = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: typings.oracleOraclejet.oracleOraclejetStrings.rawValue): RV = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_validators(property: validators): (js.Array[Validator[V] | RegisteredValidator]) | Null = js.native
  
  var onAsyncValidatorsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[AsyncValidator[V]]], js.Any]) | Null = js.native
  
  var onAutocompleteChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off | String], js.Any]) | Null = js.native
  
  var onAutofocusChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], js.Any]) | Null = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_inputBase: (js.Function1[/* event */ ojAnimateEnd, js.Any]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_inputBase: (js.Function1[/* event */ ojAnimateStart, js.Any]) | Null = js.native
  
  var onPlaceholderChanged: (js.Function1[/* event */ JetElementCustomEvent[String], js.Any]) | Null = js.native
  
  var onRawValueChanged: (js.Function1[/* event */ JetElementCustomEvent[RV], js.Any]) | Null = js.native
  
  var onReadonlyChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], js.Any]) | Null = js.native
  
  var onRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], js.Any]) | Null = js.native
  
  var onValidatorsChanged: (js.Function1[
    /* event */ JetElementCustomEvent[(js.Array[Validator[V] | RegisteredValidator]) | Null], 
    js.Any
  ]) | Null = js.native
  
  var placeholder: String = js.native
  
  val rawValue: RV = js.native
  
  var readonly: Boolean = js.native
  
  var required: Boolean = js.native
  
  def setProperties(properties: inputBaseSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  
  def setProperty(property: autocomplete, value: off): Unit = js.native
  def setProperty(property: autocomplete, value: on): Unit = js.native
  @JSName("setProperty")
  def setProperty_asyncValidators(property: asyncValidators, value: js.Array[AsyncValidator[V]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_autocomplete(property: autocomplete, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_autofocus(property: autofocus, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typings.oracleOraclejet.oracleOraclejetStrings.rawValue, value: RV): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Regexp): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators, value: js.Array[Validator[V] | RegisteredValidator]): Unit = js.native
  
  @JSName("translations")
  var translations_inputBase: Regexp = js.native
  
  def validate(): js.Promise[typings.oracleOraclejet.oracleOraclejetStrings.valid | invalid] = js.native
  
  var validators: (js.Array[Validator[V] | RegisteredValidator]) | Null = js.native
}
object inputBase {
  
  type ojAnimateEnd = CustomEvent[Action]
  
  type ojAnimateStart = CustomEvent[Element]
}
