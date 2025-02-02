package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TreeWalker")
@js.native
/* standard dom */
open class TreeWalker ()
  extends StObject
     with typings.std.TreeWalker {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/currentNode) */
  /* standard dom */
  /* CompleteClass */
  var currentNode: typings.std.Node = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/filter) */
  /* standard dom */
  /* CompleteClass */
  override val filter: typings.std.NodeFilter | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/firstChild) */
  /* standard dom */
  /* CompleteClass */
  override def firstChild(): typings.std.Node | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/lastChild) */
  /* standard dom */
  /* CompleteClass */
  override def lastChild(): typings.std.Node | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextNode) */
  /* standard dom */
  /* CompleteClass */
  override def nextNode(): typings.std.Node | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextSibling) */
  /* standard dom */
  /* CompleteClass */
  override def nextSibling(): typings.std.Node | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/parentNode) */
  /* standard dom */
  /* CompleteClass */
  override def parentNode(): typings.std.Node | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousNode) */
  /* standard dom */
  /* CompleteClass */
  override def previousNode(): typings.std.Node | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousSibling) */
  /* standard dom */
  /* CompleteClass */
  override def previousSibling(): typings.std.Node | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/root) */
  /* standard dom */
  /* CompleteClass */
  override val root: typings.std.Node = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/whatToShow) */
  /* standard dom */
  /* CompleteClass */
  override val whatToShow: Double = js.native
}
