package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CSSStyleRule represents a single CSS style rule. It implements the CSSRule interface with a type value of 1 (CSSRule.STYLE_RULE).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule)
  */
trait CSSStyleRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/selectorText) */
  /* standard dom */
  var selectorText: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/style) */
  /* standard dom */
  val style: CSSStyleDeclaration
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/styleMap) */
  /* standard dom */
  val styleMap: StylePropertyMap
}
object CSSStyleRule {
  
  inline def apply(
    cssText: java.lang.String,
    selectorText: java.lang.String,
    style: CSSStyleDeclaration,
    styleMap: StylePropertyMap,
    `type`: Double
  ): CSSStyleRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, FONT_FACE_RULE = 5, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, cssText = cssText.asInstanceOf[js.Any], selectorText = selectorText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], styleMap = styleMap.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSStyleRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSStyleRule] (val x: Self) extends AnyVal {
    
    inline def setSelectorText(value: java.lang.String): Self = StObject.set(x, "selectorText", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleMap(value: StylePropertyMap): Self = StObject.set(x, "styleMap", value.asInstanceOf[js.Any])
  }
}
